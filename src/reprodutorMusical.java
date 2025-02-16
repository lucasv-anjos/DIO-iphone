import java.util.Scanner;

public interface reprodutorMusical 
{
    default void tocar() 
    {
        System.out.println("Tocando música...");
    }

    default void pausar() 
    {
        System.out.println("Música pausada.");
    }

    default void selecionarMusica() 
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("escreva o nome da música: ");
        String nomeMusica = Scanner.nextLine();
        System.out.println("Ligação feita para o número: " + nomeMusica);
    }

    default void selecionarMusica(String nomeMusica) 
    {
        System.out.println("Selecionando a música: " + nomeMusica);
    }
}
