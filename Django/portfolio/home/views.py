from django.shortcuts import render, HttpResponse
from home.models import Contact

# Create your views here.

def home(request):
    context = {"name": "Abimbola Ronald", "school": "The African Leadership University", "course": "Software Engineering"}
    return render(request, 'home.html', context=context)

def about(request):
    return render(request, 'about.html')

def projects(request):
    return render(request, 'projects.html')

def contact(request):
    if request.method == "POST":
        name = request.POST["name"]
        email = request.POST["email"]
        phone = request.POST["phone"]
        city = request.POST["city"]
        desc = request.POST["desc"]
        
        # print(name, email, phone, city, desc)
        ins = Contact(name=name, email=email, phone=phone, city=city, desc=desc)
        ins.save()
        print("The data has been added to the db")
    return render(request, 'contact.html')
