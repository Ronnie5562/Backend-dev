from django.shortcuts import render, HttpResponse

# Create your views here.
def home(request):
    return HttpResponse("<h1>This is the data written by Ronald<h1>")

def paths(request):
    return HttpResponse("<h1>This is the path routed by Ronald<h1>")

def ronald(request):
    return HttpResponse("""
        <h1>Ronald Abimbola<h1>
        <ul>
            <li>Ronnie</li>
            <li>Rollybobo</li>
            <li>Starboy</li>
        </ul>
        <p>Copyright &copy; 2023</p>                    
    """)