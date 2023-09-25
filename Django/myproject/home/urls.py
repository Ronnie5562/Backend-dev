from django.contrib import admin
from django.urls import path, include
from home import views
urlpatterns = [
    path("boy", views.home, name='home'),
    path("paths", views.paths, name='paths'),
    path("boy/ronald", views.ronald, name='ronald'),
]