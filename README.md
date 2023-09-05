# DSCommerce

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](https://github.com/hakkinenT/java-spring-boot-dscommerce/blob/main/LICENSE) 
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

## Sobre o projeto
O projeto DSCommerce é um projeto desenvolvido durante o Curso **Java Spring Professional**, ministrado pelo Professor [Nelio Alves](https://github.com/acenelio) da [DevSuperior](https://devsuperior.com.br).

Este projeto consiste em uma API REST de um Comércio Eletrônico, onde é possível gerenciar Produtos, Pedidos e Clientes.

## Modelo Conceitual
![Modelo de domínio DSCommerce](https://github.com/hakkinenT/assets/blob/master/java-spring-projects/dscommerce/dscommerce.png)


## Funcionalidades

- Cadastrar usuário no sistema
- Logar usuário no sistema
- Gerenciar Pedidos
- Gerenciar Produtos
- Gerenciar usuários
- Gerenciar categorias


## Tecnologias Utilizadas

- Java
- Spring boot
- JPA / Hibernate
- PostgreSQL
- H2

## Aprendizados

Neste projeto foi possível aprender sobre Bean Validation, usado para fazer validações dos dados de entrada da API, sobre o Spring Security, usado para permitir a autenticação dos usuários, além de gerenciar a autorização para o uso das rotas da API pelo usuário. E, por fim, foi possível aprender mais sobre a criação e utilização de exceções customizadas.


## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/hakkinenT/java-spring-boot-dscommerce.git
```

Entre no diretório do projeto

```bash
  cd java-spring-boot-dscommerce
```

Rode a aplicação

```bash
  ./mvnw spring-boot:run
```


## Rodando os testes

Para rodar os testes, rode o seguinte comando

```bash
  mvn test
```


## Autores

- [@hakkinenT](https://github.com/hakkinenT)
