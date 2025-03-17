# Avanade decola tech 2025

Java RESTful API criada para a AVANADE

## Diagrama de Classes - Banco de Usuário


```mermaid
classDiagram
    class Usuario {
        - string nome
        - Conta conta
        - Funcionalidade[] funcionalidades
        - Cartao cartao
        - Noticia[] noticias
    }

    class Conta {
        - string numero
        - string agencia
        - float saldo
        - float limite
    }

    class Funcionalidade {
        - string icone
        - string descricao
    }

    class Cartao {
        - string numero
        - float limite
    }

    class Noticia {
        - string icone
        - string descricao
    }

    Usuario --> Conta
    Usuario --> Funcionalidade : possui
    Usuario --> Cartao
    Usuario --> Noticia : possui

