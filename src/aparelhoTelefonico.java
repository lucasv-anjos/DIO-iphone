import java.util.Scanner;

public interface aparelhoTelefonico 
{
    default void ligar() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para ligar: ");
        int numero = scanner.nextInt();
        System.out.println("Ligação feita para o número: " + numero);
    }

    default void ligar(int numero) 
    {
        System.out.println("Ligando para o número: " + numero);
    }

    default void atender() 
    {
        System.out.println("Atendendo a chamada...");
    }

    default void iniciarCorreioVoz() 
    {
        System.out.println("Iniciando correio de voz...");
    }
}
