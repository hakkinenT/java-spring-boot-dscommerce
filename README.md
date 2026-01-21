# DSCommerce

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](https://github.com/hakkinenT/java-spring-boot-dscommerce/blob/main/LICENSE) 
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

API REST para um sistema de comércio eletrônico, desenvolvida com **Java e Spring Boot**, aplicando boas práticas de backend, arquitetura em camadas e segurança com autenticação e autorização baseada em JWT.

## 🚀 Funcionalidades
- Cadastro e consulta de produtos
- Gerenciamento de categorias
- Criação e consulta de pedidos
- Autenticação e autorização de usuários
- Controle de acesso por perfil
- Tratamento global de exceções
- Uso de DTOs para comunicação entre camadas

## 🛠️ Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- JWT
- PostgreSQL
- Docker
- Maven

## 🏗️ Arquitetura
O projeto segue uma arquitetura em camadas:

- **Controller**: Camada de entrada da API (REST)
- **Service**: Regras de negócio
- **Repository**: Persistência de dados
- **DTOs**: Transferência de dados entre camadas

## ▶️ Como executar o projeto

### Pré-requisitos
- Java 17+
- Maven
- PostgreSQL (ou Docker)

### Passos
1. Clone o repositório:
```bash
git clone https://github.com/hakkinenT/java-spring-boot-dscommerce.git

```
2. Acesse o diretório do projeto:

```bash
cd java-spring-boot-dscommerce
```

3. Execute a aplicação:
```bash
mvn spring-boot:run
```

4. A aplicação estará disponível em:
```arduino
http://localhost:8080
```

## 🔐 Autenticação e Autorização

A API utiliza JWT (JSON Web Token) para autenticação.

Após realizar o login, o token retornado deve ser enviado no header das requisições protegidas:

```http
Authorization: Bearer <token>
```

## 📌 Endpoints

### 🔓 Públicos

| Método | Rota              | Descrição                  |
|--------|-------------------|----------------------------|
| POST   | /oauth2/token       | Autenticação e geração do token       |
| GET    | /products         | Lista produtos             |
| GET    | /products/{id}    | Busca produto por ID       |
| GET    | /categories       | Lista categorias           |

### 🔒 Protegidos (JWT)

| Método | Rota              | Descrição                         |
|--------|-------------------|-----------------------------------|
| GET    | /users/me         | Retorna o usuário autenticado                    |
| POST   | /orders           | Cria um novo pedido                       |
| GET    | /orders/{id}      | Consulta pedido por ID                   |
| POST   | /products         | Cria produto                      |
| PUT    | /products/{id}    | Atualiza produto                  |
| DELETE | /products/{id}    | Remove produto                    |

## 📦 Testando a API com Postman

O projeto disponibiliza arquivos do Postman para facilitar o teste da API:

- 📁 Collection: contém todas as requisições da API

- 🌍 Environment: contém variáveis de ambiente, como URL base e token

Como utilizar:

1. Abra o Postman

2. Importe a collection (.json)

3. Importe o environment (.json)

4. Selecione o environment no Postman

5. Execute a requisição de login para obter o token

6. As requisições protegidas utilizarão automaticamente o token salvo no environment


## 📌 Objetivo do Projeto

Projeto desenvolvido com foco em aprendizado prático de Spring Boot profissional, segurança, boas práticas de desenvolvimento e estruturação de APIs REST escaláveis e bem organizadas.

## Aprendizados

Neste projeto foi possível aprender sobre Bean Validation, usado para fazer validações dos dados de entrada da API, sobre o Spring Security, usado para permitir a autenticação dos usuários, além de gerenciar a autorização para o uso das rotas da API pelo usuário. E, por fim, foi possível aprender mais sobre a criação e utilização de exceções customizadas.

## Autores

- [@hakkinenT](https://github.com/hakkinenT)
