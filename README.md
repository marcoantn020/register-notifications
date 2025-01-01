**Requisitos**

- **Deve ter um endpoint que receba uma solicitação de agendamento de envio de comunicação (1):**
    - Este endpoint precisa ter no mínimo os seguintes campos:
        - Data/Hora para o envio
        - Destinatário
        - Mensagem a ser entregue
    - As possíveis comunicações que podem ser enviadas são: email, SMS, push e WhatsApp.
    - Neste momento, precisamos deste canal de entrada para realizar o envio, ou seja, esse endpoint (1). O envio em si não será desenvolvido nesta etapa: você não precisa se preocupar com isso.
    - Para esta sprint ficou decidido que a solicitação do agendamento do envio da comunicação será salva no banco de dados. Portanto, assim que receber a solicitação do agendamento do envio (1), ela deverá ser salva no banco de dados.
    - Pense com carinho nessa estrutura do banco. Apesar de não ser você quem vai realizar o envio, a estrutura já precisa estar pronta para que o seu coleguinha não precise alterar nada quando for desenvolver esta funcionalidade. A preocupação no momento do envio será de enviar e alterar o status do registro no banco de dados.

- **Deve ter um endpoint para consultar o status do agendamento de envio de comunicação (2):**
    - O agendamento será feito no endpoint (1) e a consulta será feita por este outro endpoint.

- **Deve ter um endpoint para remover um agendamento de envio de comunicação.**

**Observações e Orientações Gerais**

- Temos preferência por desenvolvimento na linguagem Java, Python ou Node, mas pode ser usada qualquer linguagem; depois, apenas nos explique o porquê da sua escolha.
- Utilize um dos bancos de dados abaixo:
    - MySQL
    - PostgreSQL
- As APIs deverão seguir o modelo RESTful com formato JSON.
- Siga o que considera como boas práticas de programação.
- A criação do banco e das tabelas fica a seu critério de como será feita, seja via script, aplicação, etc.

### Requisitos
- docker e docker-compose
- java versão 17
  abra o terminal dentro do projeto
```
cd docker
docker-compose up -d
```
execute o projeto usando a idea, ou pelos comandos
```
gradle build
gradle run
```
acesse o swagger

[Swagger - register notification](http://localhost:8080/swagger-ui/index.html)