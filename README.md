<h1 align="center">
    To-do List
</h1>

<p align="center">
    <img src="https://img.shields.io/badge/Tipo-Desafio-blue" />
</p>

<p>API para gerenciar tarefas (CRUD)</p>

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [PostgreSQL](https://www.postgresql.org/)

## Práticas adotas

- SOLID, DRY, YAGNI, KISS
- API Rest
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a Open API 3

## Como Executar

- Clonar repositório git
- Construir o projeto:

```
$ ./mvnw clean package
```

- Executar a aplicação

```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io/cli):

- POST /todos

```
HTTP POST :8080/todos name="Todo 1 Title" description="Todo description" completed=true priority=1

[
    {
        "completed": true,
        "description": "Todo description",
        "id": 7,
        "name": "Todo 1 Title",
        "priority": 1
    }
]
```

- GET /todos

```
HTTP GET :8080/todos

[
    {
        "completed": true,
        "description": "Todo description",
        "id": 7,
        "name": "Todo 1 Title",
        "priority": 1
    }
]
```

- PUT /todos

```
HTTP PUT :8080/todos id=7 name="Todo 1 updated title" description="This is my updated task" priority=3 completed=false

[
    {
        "completed": false,
        "description": "This is my updated task",
        "id": 7,
        "name": "Todo 1 updated title",
        "priority": 3
    }
]
```

- DELETE /todos/{id}

```
HTTP DELETE :8080/todos/7

[]
```
