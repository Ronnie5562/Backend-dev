from django.db import models
from datetime import datetime

# Create your models here.
class Task(models.Model):
    taskTitle = models.CharField(max_length=50)
    taskDesc = models.TextField()
    time = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        dateobj = datetime.fromisoformat(str(self.time))
        return f"{self.taskTitle} - Started: {dateobj.strftime('%B %d, %Y %I:%M:%S %p')}"