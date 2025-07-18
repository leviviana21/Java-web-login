# Java-web-login

Este projeto foi desenvolvido como parte do curso Técnico em Informática para Internet, integrado ao Ensino Médio no IFSP. O sistema realiza a conexão entre uma aplicação Java e um servidor de banco de dados para gerenciamento de login de usuários.

**Tecnologias utilizadas** 

- Java SE (JDK)
- Servlets para o controle das requisições HTTP
- JDBC para conexão com banco de dados
- MySQL como sistema de gerenciamento de banco de dados
- PreparedStatement para execução segura de comandos SQL

**Funcionalidades principais**

- Estabelecimento da conexão com o banco via Connection
- Manipulação de dados via métodos doGet e doPost em Servlets
- Consulta, inserção e validação de usuários no banco de dados

**Como executar**

- Configure seu banco de dados MySQL com a estrutura necessária para o login.
- Atualize as configurações de conexão no código Java (usuário, senha, URL do banco).
- Compile e execute o projeto em um servidor compatível com Servlets, como Apache Tomcat.
- Acesse a aplicação pelo navegador para realizar login.
