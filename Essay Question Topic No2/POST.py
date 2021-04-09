import requests

payload = {'title': 'recommendation' ,'body': 'motorcycle', 'userId': '12'}
r = requests.post('https://jsonplaceholder.typicode.com/posts', data=payload)

print(r.text)
