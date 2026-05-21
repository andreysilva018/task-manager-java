# Task Manager Java

Sistema desktop de gerenciamento de tarefas desenvolvido em **Java**, utilizando **Swing** para interface gráfica, **MySQL** para persistência de dados e organização em camadas com **Model**, **Repository**, **Service** e **View**.

O projeto tem como objetivo aplicar conceitos de **Programação Orientada a Objetos**, manipulação de banco de dados com **JDBC**, separação de responsabilidades e controle de fluxo de tarefas por status.

---

## Funcionalidades

- Cadastro de tarefas
- Listagem de tarefas por status
- Atualização de título e descrição
- Exclusão lógica de tarefas
- Alteração de status da tarefa
- Estorno de status
- Separação visual entre:
  - Pendentes
  - Em andamento
  - Concluídas

---

## Status das tarefas

As tarefas podem assumir três estados:

```java
PENDENTE
EM_ANDAMENTO
CONCLUIDA
```

Fluxo principal:
```
PENDENTE -> EM_ANDAMENTO -> CONCLUIDA
```
Também é possível estornar o status:
```
CONCLUIDA -> EM_ANDAMENTO -> PENDENTE
```

Tecnologias utilizadas:
- Java
- Java Swing
- Maven
- MySQL
- JDBC
- Programação Orientada a Objetos
- Git e GitHub

Estrutura do projeto:
```
task-manager-java/
│
├── task-manager/
│   ├── pom.xml
│   └── src/
│       └── main/
│           └── java/
│               ├── Model/
│               │   ├── Tarefas.java
│               │   └── Utilitarios.java
│               │
│               ├── Repository/
│               │   └── TarefaRepository.java
│               │
│               ├── Service/
│               │   └── TarefaService.java
│               │
│               ├── View/
│               │   └── frmTela.java
│               │
│               ├── connection/
│               │   └── ConnectionFactory.java
│               │
│               └── Main.java

```

Conceitos aplicados:
Este projeto aplica conceitos importantes de desenvolvimento Java, como:

- Criação de interface gráfica com Swing
- Uso de eventos em botões e listas
- Manipulação de listas com JList
- Uso de Enum para controle de status
- Encapsulamento com classes Model
- Camada Service para regras de negócio
- Camada Repository para acesso ao banco de dados
- Conexão com banco MySQL usando JDBC
- Uso de Maven para gerenciamento do projeto
- Organização do código em pacotes

Banco de dados:
O projeto utiliza MySQL com o banco:
```
listatarefas
```
A tabela utilizada pelo sistema é:
```
tb_tarefas
```
Exemplo de criação da tabela:
```
CREATE DATABASE listatarefas;

USE listatarefas;

CREATE TABLE tb_tarefas (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    TITULO VARCHAR(100) NOT NULL,
    DESCRICAO TEXT NOT NULL,
    STATUS VARCHAR(20) NOT NULL,
    ATIVO BOOLEAN NOT NULL
);
```

Configuração da conexão
A conexão com o banco está configurada na classe:
```
connection/ConnectionFactory.java
```
Configuração padrão:
```
DriverManager.getConnection(
    "jdbc:mysql://127.0.0.1/listatarefas",
    "root",
    ""
);
```
Caso seu MySQL tenha senha, altere o terceiro parâmetro:
```
""
```
Para a senha do seu banco.
Exemplo:
```
DriverManager.getConnection(
    "jdbc:mysql://127.0.0.1/listatarefas",
    "root",
    "sua_senha"
);
```

Como executar o projeto
Pré-requisitos:
Antes de executar, é necessário ter instalado:

- JDK 22 ou superior
- MySQL Server
- Maven
- NetBeans, IntelliJ IDEA ou outra IDE Java

Passo a passo:
1. Clone o repositório:
```
git clone https://github.com/andreysilva018/task-manager-java.git
```
2. Acesse a pasta do projeto:
```
cd task-manager-java/task-manager
```
3. Crie o banco de dados no MySQL:
```
CREATE DATABASE listatarefas;
```
5. Crie a tabela tb_tarefas:
```
USE listatarefas;

CREATE TABLE tb_tarefas (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    TITULO VARCHAR(100) NOT NULL,
    DESCRICAO TEXT NOT NULL,
    STATUS VARCHAR(20) NOT NULL,
    ATIVO BOOLEAN NOT NULL
);
```
6. Verifique as configurações de conexão em:
```
src/main/java/connection/ConnectionFactory.java
```
7. Execute a classe principal:
```
Main.java
```
Principais telas

O sistema possui uma interface desktop com abas para:

- Cadastro de tarefas:

Permite cadastrar, atualizar e excluir tarefas.

- Lista de tarefas

Exibe as tarefas separadas por status:

- Pendentes
- Em andamento
- Concluídas

Também permite alterar o status da tarefa através dos botões:

- Atender
- Concluir
- Estornar
- Editar

##Aprendizados do projeto
Durante o desenvolvimento deste sistema, foram praticados conhecimentos como:

- Estruturação de projeto Java
- Desenvolvimento de interface desktop
- Integração com banco de dados
- Criação de CRUD
- Separação de responsabilidades
- Uso de boas práticas básicas de organização
- Trabalho com versionamento no GitHub
