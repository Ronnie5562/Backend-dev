from django.shortcuts import render, HttpResponse
from blog.models import Blog

# Create your views here.
def home(request):
    return render(request, 'index.html')

def blog(request):
    blogs = Blog.objects.all()
    context = {"blogs": blogs}
    return render(request, 'bloghome.html', context=context)

def blogpost(request, slug):
    blog = Blog.objects.filter(slug=slug).first()
    context = {"blog": blog}
    return render(request, 'blogpost.html', context=context)

# def blogposts(request):
#     return HttpResponse(f"This is a page for all my blog posts")

def search(request):
    return render(request, 'search.html')

def contact(request):
    return render(request, 'contact.html')