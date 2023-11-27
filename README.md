<h1 align="center">
  TODO List
</h1>


API para gerenciar tarefas (CRUD) que faz parte [desse 
desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) 
para pessoas desenvolvedoras backend júnior, que se candidatam para a 
Simplify.

O projeto foi elaborado [nesse vídeo](https://youtu.be/IjProDV001o).

## Tecnologias

- [Docker](https://www.docker.com/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring 
MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação (Docker):
```
$ docker-compose up --build
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em 
[localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

**Nota Importante:** Devido à lenta inicialização do MySQL, o container pode demorar a inicializar. Na minha máquina, levou cerca de 4 minutos e 30 segundos do docker-compose up --build até o Spring estar pronto. Mensagens de erro relacionadas a JPA, Hibernate e MySQL são esperadas, visto que o app Spring fica reinicializando até conseguir conectar no MySQL. Cada vez que falha, a aplicação reinicia. Certifique-se de aguardar até que o processo de inicialização esteja concluído.

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta 
[httpie](https://httpie.io):

- Criar Tarefa 
```
$ http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Listar Tarefas
```
$ http GET :8080/todos

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Atualizar Tarefa
```
$ http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" 
prioridade=2

[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```

- Remover Tarefa
```
http DELETE :8080/todos/1

[ ]
```
