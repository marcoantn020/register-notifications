```toml
name = 'buscar notification'
method = 'GET'
url = 'http://localhost:8080/notifications/2'
sortWeight = 2000000
id = '3f60164b-768b-4459-bab3-a5fa74517637'

[body]
type = 'JSON'
raw = '''
{
  "dateTime": "2024-06-29T14:56:00",
  "destination": "Teste@test.com",
  "message": "Seja bem vindo!",
  "channel": "EMAIL"
}'''
```
