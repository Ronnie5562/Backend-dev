from django.http import JsonResponse
import json

from products.models import Product


def api_home(request, *args, **kwargs):

    model_data = Product.object.all().order_by("?").first()
    data = {}
    
    if model_data:
        data["title"] = model_data.title
        data["content"] = model_data.content
        data["price"] = model_data.price
        

    return JsonResponse(data)