# 📋 Gerenciador de Tarefas com Java e PostgreSQL

Aplicação desenvolvida em Java com persistência de dados em PostgreSQL, permitindo o cadastro e gerenciamento de tarefas através do terminal.

O projeto foi criado com o objetivo de praticar conceitos fundamentais de desenvolvimento back-end, incluindo conexão com banco de dados utilizando JDBC, organização de código em camadas e operações de persistência de dados.

---

## 🚀 Funcionalidades

- Cadastro de tarefas
- Armazenamento de dados em banco PostgreSQL
- Conexão com banco utilizando JDBC
- Estrutura organizada em pacotes
- Execução via terminal
- Persistência de dados em banco relacional

---

## 🛠️ Tecnologias Utilizadas

- Java
- PostgreSQL
- JDBC
- Git
- GitHub
- IntelliJ IDEA

---

## 📁 Estrutura do Projeto

```text
src
├── connection
│   └── ConnectionFactory.java
├── dao
│   └── TaskDAO.java
├── model
│   └── Task.java
└── Main.java
```

---

## ⚙️ Como Funciona

1. O usuário executa a aplicação.
2. Um menu é exibido no terminal.
3. O usuário informa os dados da tarefa.
4. A aplicação cria um objeto da entidade Task.
5. O DAO realiza a comunicação com o banco de dados.
6. A tarefa é salva na tabela do PostgreSQL.

---

## 🗄️ Banco de Dados

O projeto utiliza PostgreSQL para armazenamento das informações.

Estrutura da tabela:

```sql
CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100),
    description TEXT,
    completed BOOLEAN
);
```

---

## 📊 Fluxo da Aplicação

```text
Usuário
    ↓
Menu no Terminal
    ↓
Cadastro da Tarefa
    ↓
Objeto Task
    ↓
TaskDAO
    ↓
PostgreSQL
```

---

## 🎯 Objetivo

Demonstrar a integração entre Java e PostgreSQL utilizando JDBC, aplicando conceitos de persistência de dados, organização de código e desenvolvimento de aplicações back-end.
