# 📋 API de Tarefas - Spring Boot

Este é um projeto de API REST simples para gerenciamento de tarefas (To-do List), desenvolvido em Java com Spring Boot. Ele permite criar, listar e deletar tarefas usando endpoints HTTP.

---

## 🚀 Tecnologias utilizadas

- initializr
- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database (banco em memória)
- Postman

---

## ⚙️ Como executar o projeto

### 1. Pré-requisitos
- Java 17 ou superior
- Maven
- Eclipse ou IntelliJ (opcional)
- Postman

### 2. Clonar o repositório

bash
git clone https://github.com/seu-usuario/tarefas-api.git
cd tarefas-api

bash
### 3. Rodar o Projeto
./mvnw spring-boot:run
Ou, se estiver usando o Eclipse, apenas Execute como > Spring Boot App

📫 Endpoints disponíveis
Método	Endpoint	Ação
GET	/tarefas	Listar todas as tarefas
POST	/tarefas	Criar nova tarefa
DELETE	/tarefas/{id}	Deletar tarefa por ID

📝 Exemplo de JSON para POST:
json
Copiar
Editar
{
  "descricao": "Estudar Java",
  "concluida": false
}
🗃️ Estrutura do projeto (Classes)
Tarefa.java: classe modelo da entidade

TarefaRepository.java: interface com Spring Data JPA

TarefaController.java: expõe os endpoints da API

💡 Objetivo
Este projeto foi criado para fins de aprendizado, com foco na prática de API REST usando Spring Boot, JPA e boas práticas com Maven e Git.

📄 Licença
Este projeto é de uso livre para fins de estudo.

