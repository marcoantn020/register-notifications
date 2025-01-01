```toml
name = 'create notification'
method = 'POST'
url = 'http://localhost:8080/notifications'
sortWeight = 1000000
id = '2d670b9b-bf07-4202-b521-33c88e2333b9'

[body]
type = 'JSON'
raw = '''
{
  "dateTime": "2024-12-25T08:40:00",
  "destination": "Teste@test.com",
  "message": "Seja bem vindo!",
  "channel": "EMAIL"
}'''
```
