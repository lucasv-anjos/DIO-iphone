import java.util.Scanner;

public interface navegadorInternet 
{
    default void exibirPagina(String url) 
    {
        System.out.println("Exibindo a página: " + url);
    }

    default void exibirPagina() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a URL da página para exibir: ");
        String url = scanner.nextLine();
        System.out.println("Exibindo a página: " + url);
    }

    default void adicionarNovaAba()
    {
        System.out.println("Nova aba adicionada.");
    }

    default void atualizarPagina() 
    {
        System.out.println("Página sendo atualizada...");
    }
}
