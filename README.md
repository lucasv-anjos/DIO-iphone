```mermaid
classDiagram
    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica()
        +selecionarMusica(String nomeMusica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar()
        +ligar(int numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class Iphone {
        +main(String[] args)
        +ligar()
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
        +iniciarCorreioVoz()
        +atender()
    }

    NavegadorInternet <|.. Iphone
    ReprodutorMusical <|.. Iphone
    AparelhoTelefonico <|.. Iphone
