```toml
name = 'canceled notification'
method = 'DELETE'
url = 'http://localhost:8080/notifications/1'
sortWeight = 3000000
id = '08364026-43eb-4bfb-941d-6ca4674f01bb'

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
