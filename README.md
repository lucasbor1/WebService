# 🔧 Projeto Faculdade UML

Este projeto foi desenvolvido como parte de uma atividade acadêmica, com o objetivo de implementar uma API REST completa, utilizando o framework Spring Boot. A aplicação realiza operações de CRUD e segue os critérios de aceite estabelecidos.

---

## 🚀 Tecnologias Utilizadas

### Dependências principais do projeto:
- **Spring Boot Starter Web**: Para criação de APIs REST.
- **Spring Boot Starter Data JPA**: Para manipulação e persistência de dados com JPA/Hibernate.
- **Spring Boot Starter Validation**: Para validação de dados com anotações como `@NotBlank` e `@Valid`.
- **Spring Boot DevTools**: Para facilitar o desenvolvimento com hot-reload.
- **SpringDoc OpenAPI**: Para documentação interativa da API no formato OpenAPI/Swagger.
- **H2 Database**: Banco de dados em memória para persistência de dados em ambiente de desenvolvimento.
- **Lombok**: Para reduzir o boilerplate no código, como getters, setters e construtores automáticos.
- **Spring Boot Starter Test**: Para testes unitários e de integração.

---

## 🕐 Funcionalidades Implementadas

### Camada Resource
- Documentação OpenAPI disponível em `/swagger-ui.html`.
- Métodos HTTP:
  - **GET**: Consultar dados.
  - **POST**: Inserir novos registros.
  - **PUT**: Atualizar registros existentes.
  - **DELETE**: Excluir registros.
- Recurso de logging para todas as operações das camadas.

### Camada Service
- Lógica de negócio alinhada com os métodos da camada Resource.
- Métodos marcados como `@Transactional` para operações de persistência.

### Camada Repository
- Repositórios herdados de `JpaRepository<T, ID>`, permitindo operações CRUD diretamente no banco de dados.

---

## 🎯 Como executar o projeto

### Pré-requisitos:
- **Java 17+**: Certifique-se de que o JDK está instalado.
- **Maven**: Para gerenciar as dependências.

### Passos:
1. Clone o repositório:
   ```bash
   https://github.com/lucasbor1/WebService.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd Projeto-faculdade-uml
   ```

3. Execute o comando Maven para rodar o projeto:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse o Swagger UI para interagir com a API:
   ```
   http://localhost:8080/swagger-ui.html
   ```


