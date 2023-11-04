import requests

endpoint = "http://localhost:8000/api/"

response = requests.post(endpoint, params={"abc": 123}, json={"title" : "Hello There!!!"})

print(response.json())