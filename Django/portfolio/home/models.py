from django.db import models

# Create your models here.

class Contact(models.Model):
    name = models.CharField(max_length=30)
    email = models.EmailField()
    phone = models.CharField(max_length=11)
    city = models.CharField(max_length=30)
    desc = models.TextField()
    
    def __str__(self):
        return f"{self.name} - {self.email}"