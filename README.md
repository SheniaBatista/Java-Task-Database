# Database Task (Conexão com Banco de Dados)

## 📌 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de aprender como conectar uma aplicação Java a um banco de dados.

A aplicação roda no terminal e permite criar tarefas que são armazenadas em um banco de dados PostgreSQL.

O foco principal foi aprender:

* Conectar Java com banco de dados
* Utilizar JDBC
* Organizar um projeto Java em pacotes
* Utilizar Git e GitHub para versionamento

---

# 🛠 Tecnologias utilizadas

* Java
* PostgreSQL
* JDBC
* Git
* GitHub
* IntelliJ IDEA

---

# 🔷 Estrutura do projeto

```
src
 ├ connection
 │  └ ConnectionFactory.java
 ├ dao
 │  └ TaskDAO.java
 ├ model
 │  └ Task.java
 └ Main.java
```

---

# ⚙ Como funciona a aplicação

A aplicação funciona através de um menu simples no terminal. Quando o usuário escolhe criar uma tarefa, o sistema executa os seguintes passos:

1. O usuário roda o projeto, digita 1 e insere o título e a descrição da tarefa
2. O sistema cria um objeto `Task`
3. A classe `TaskDAO` envia os dados para o banco
4. O PostgreSQL salva a tarefa na tabela `tasks`

---

# 🗄 Banco de dados

Banco utilizado: PostgreSQL

Tabela utilizada no banco:

```
CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100),
    description TEXT,
    completed BOOLEAN
);
```

---


# ▶ Como executar o projeto

1 - Clonar o repositório

```
git clone https://github.com/SheniaBatista/java-task-manager
```

2 - Abrir o projeto no IntelliJ IDEA

3 - Configurar o banco PostgreSQL local

4 - Criar o banco `taskdb`

5 - Executar a classe `Main.java`

---

