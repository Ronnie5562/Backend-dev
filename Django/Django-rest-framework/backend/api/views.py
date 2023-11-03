# from django.http import JsonResponse
# import json

# from products.models import Product


# def api_home(request, *args, **kwargs):

#     model_data = Product.objects.all().order_by("?").first()
#     data = {}

#     if model_data:
#         data["id"] = model_data.id
#         data["title"] = model_data.title
#         data["content"] = model_data.content
#         data["price"] = model_data.price

#     return JsonResponse(data)

##

# from django.forms.models import model_to_dict
# from django.http import JsonResponse
# import json

# from products.models import Product


# def api_home(request, *args, **kwargs):

#     model_data = Product.objects.all().order_by("?").first()
#     data = {}

#     if model_data:
#         data = model_to_dict(model_data, fields=["id", "title", "price"])

#     return JsonResponse(data)


# Using django-rest-framework

from rest_framework.decorators import api_view
from rest_framework.response import Response
from django.forms.models import model_to_dict


from products.models import Product
from products.serializers import ProductSerializer


@api_view(["GET"])
def api_home(request, *args, **kwargs):
    """
    DRF API View
    """

    instance = Product.objects.all().order_by("?").first()
    data = {}

    if instance:
        # data = model_to_dict(instance, fields=["id", "title", "price"])
        data = ProductSerializer(instance).data

    return Response(data)
