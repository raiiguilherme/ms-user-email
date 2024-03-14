# MICROSSERVICES DE USUARIO E EMAIL

### FUNCIONAMENTO:

Criação de dois microsserviços; User e Email.
Ao realizar uma requisição (POST) simulando um cadastro de um novo usuario em um site qualquer, o User (API) cria uma mensagem na fila do RabbitMQ, mensagem essa que sera ouvida pelo microsserviço de Email,
ficando responsavel por enviar um email de boas vindas utilizando de um serviço de disparos de email (Nesse exemplo, fiz a utilização do MailTrap), e também salvando esse email em um banco de dados.

### TECNOLOGIAS UTILIZADAS:
* Java
* SpringBoot
* RabbitMQ
* CloudAMQP
* Mailtrap
* Insomnia para disparo de requisições
* SpringWeb, SpringData
* Java Mail Sender

#### ALGUMAS DICAS PARA A UTILIZAÇÃO NA SUA MAQUINA
(Tudo isso no application.properties)
* Realizar a configuração do banco de dados;
* Realizar a configuração do seu serviço de email;



