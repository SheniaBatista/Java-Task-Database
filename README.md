# DataBase Task (Conexão com Banco de Dados)

## 📌 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de aprender como conectar uma aplicação Java a um banco de dados.

A aplicação é executada no terminal e permite criar tarefas que são armazenadas em um banco de dados PostgreSQL.

---

# 🛠 Tecnologias utilizadas

* Java
* PostgreSQL
* JDBC
* Git
* GitHub
* IntelliJ IDEA

---

# 🧱 Estrutura do projeto

src
├ connection
│ └ ConnectionFactory.java
├ dao
│ └ TaskDAO.java
├ model
│ └ Task.java
└ Main.java

---

# ⚙ Como funciona a aplicação

A aplicação funciona através de um menu simples no terminal.

Quando o usuário escolhe criar uma tarefa, o sistema:

1. Recebe o título e a descrição da tarefa
2. Cria um objeto Task
3. O TaskDAO envia os dados para o banco
4. O PostgreSQL salva a tarefa na tabela `tasks`

---

# 🗄 Banco de dados

Banco utilizado: PostgreSQL

Tabela utilizada:

CREATE TABLE tasks (
id SERIAL PRIMARY KEY,
title VARCHAR(100),
description TEXT,
completed BOOLEAN
);

---

# 🔌 Conexão com banco de dados

A conexão é feita através da classe `ConnectionFactory`.

Exemplo da URL de conexão:

jdbc:postgresql://localhost:5432/taskdb

---

# ▶ Como executar o projeto

1 - Clonar o repositório

git clone https://github.com/SheniaBatista/java-task-manager

2 - Abrir o projeto no IntelliJ IDEA

3 - Configurar o banco PostgreSQL

4 - Executar a classe Main.java

---


# 📚 Aprendizados

Durante este projeto eu aprendi:

* Como conectar Java com PostgreSQL
* Criação de tabela no postgreSQL
* Como utilizar JDBC
* Como organizar um projeto Java em pacotes
* Como utilizar Git e GitHub para versionamento
