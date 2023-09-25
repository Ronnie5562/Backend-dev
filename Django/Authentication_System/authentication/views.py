from django.shortcuts import render, redirect
from django.http import HttpResponse
from django.contrib.auth.models import User
from django.contrib import messages
from django.core.mail import EmailMessage, send_mail
from Authentication_System import settings
from django.contrib.sites.shortcuts import get_current_site
from django.template.loader import render_to_string
from django.utils.http import urlsafe_base64_decode, urlsafe_base64_encode
from django.utils.encoding import force_bytes, force_str
from django.contrib.auth import authenticate, login, logout
from . tokens import generate_token


# Create your views here.

def home(request):
    return render(request, "authentication/index.html")

def signup(request):
    if request.method == "POST":
        query_dict = request.POST
        username = query_dict["username"]
        fname = query_dict["fname"]
        lname = query_dict["lname"]
        email = query_dict["email"]
        pass1 = query_dict["pass1"]
        pass2 = query_dict["pass2"]
        
        if User.objects.filter(username=username):
            messages.error(request, "Username already exists! Please try some other username")
            return redirect('home')
            
        if User.objects.filter(email=email):
            messages.error(request, "Email already registered!")
            return redirect('home')
        
        if len(username) > 10:
            messages.error(request, "Username must be under 10 characters")
            return redirect('home')
        
        if not username.isalnum():
            messages.error(request, "Username must be alpha numeric")
            return redirect('home')
        
        if pass1 != pass2:
            messages.error(request, "Passwords did not match")
            return redirect('home')
        
        myUser = User.objects.create_user(username, email, pass1)
        myUser.first_name = fname
        myUser.last_name = lname
        myUser.is_active = False
        
        myUser.save()
        
        messages.success(request, "Your Account has been succeccfully created. We have sent you a confirmation email, please confirm your email in order to activate your account.")
        
        # Welcome Email
        
        subject = "Welcome to Ronald Authentication system"
        message = f"Hello {myUser.first_name} !! \nWelcome to Ronald Authentication System. \nThank you for visiting our website. \nWe have also sent you a confimation email, please confirm your emai address to activate your accout. \n\nBest Regards, \nRonald."
        from_email = settings.EMAIL_HOST_USER
        to_list = [myUser.email]
        send_mail(subject, message, from_email, to_list, fail_silently=True)
        
        
        # Account confirmation Email
        current_site = get_current_site(request)
        email_confirmation_subject = "Confirm Your Email @ Ronald - Django Login!!"
        email_confirmation_message = render_to_string('email_confirmation.html', {
            'name': myUser.first_name,
            'domain': current_site.domain,
            'uid': urlsafe_base64_encode(force_bytes(myUser.pk)),
            'token': generate_token.make_token(myUser)
        })
        
        email = EmailMessage(
            email_confirmation_subject,
            email_confirmation_message,
            settings.EMAIL_HOST_USER,
            [myUser.email],
        )
        email.fail_silently = True
        email.send()
        
        return redirect("signin")
        
    return render(request, "authentication/signup.html")


def activate(request,uidb64,token):
    try:
        uid = force_str(urlsafe_base64_decode(uidb64))
        myuser = User.objects.get(pk=uid)
    except (TypeError,ValueError,OverflowError,User.DoesNotExist):
        myuser = None

    if myuser is not None and generate_token.check_token(myuser,token):
        myuser.is_active = True
        # user.profile.signup_confirmation = True
        myuser.save()
        login(request,myuser)
        messages.success(request, "Your Account has been activated!!")
        return redirect('signin')
    else:
        return render(request,'activation_failed.html')


def signin(request):
    if request.method == "POST":
        username = request.POST["username"]
        pass1 = request.POST["pass1"]
        
        user = authenticate(username=username, password=pass1)
        
        if user is not None:
            login(request, user)
            fname = user.first_name
            return render(request, "authentication/index.html", {"fname": fname})
        
        else:
            messages.error(request, "Wrong Credentials")
            return redirect('home')
        
    return render(request, "authentication/signin.html")


def signout(request):
    logout(request)
    messages.success(request, "Logged Out Successfully")
    return redirect("home")