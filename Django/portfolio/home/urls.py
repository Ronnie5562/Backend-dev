from django.contrib import admin
from django.urls import path, include
from home import views


admin.site.site_header = "Developer Ronald"
admin.site.site_title = "Ronald's Dashboard"
admin.site.index_title = "Welcome to this portal"

urlpatterns = [
    path("", views.home, name="home"),
    path("about", views.about, name="about"),
    path("projects", views.projects, name="project"),
    path("contact", views.contact, name="contact"),
]
