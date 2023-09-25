from django.shortcuts import render, HttpResponse
from home.models import Task

# Create your views here.
def home(request):
    context = {'success': False, 'name': "Ronald"}
    if request.method == "POST":
        title = request.POST["title"]
        desc = request.POST["desc"]
        # print(title, desc)
        ins = Task(taskTitle=title, taskDesc=desc)
        ins.save()
        context = {'success': True, 'name': "Ronald"}
    return render(request, 'index.html', context)

def tasks(request):
    allTasks = Task.objects.all()
    # [print(f'{item.taskTitle} : {item.taskDesc}') for item in allTasks]
    context = {'tasks': allTasks}
    return render(request, 'tasks.html', context)