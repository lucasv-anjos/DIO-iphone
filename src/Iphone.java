
import java.util.Scanner;

public class Iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical 
{
    public static void main(String[] args) 
    {
        System.out.println("--- Iphone ligado ---");
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar == true)
        {
            System.out.println("\n======= Menu =======");
            System.out.println("1. Ligar");
            System.out.println("2. Exibir Página");
            System.out.println("3. Adicionar Nova Aba");
            System.out.println("4. Atualizar Página");
            System.out.println("5. Iniciar Correio de Voz");
            System.out.println("6. Atender");
            System.out.println("7. Sair");

            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) 
            {
                case 1:
                    iphone.ligar();
                    break;
                case 2:
                    iphone.exibirPagina();
                    break;
                case 3:
                    iphone.adicionarNovaAba();
                    break;
                case 4:
                    iphone.atualizarPagina();
                    break;
                case 5:
                    iphone.iniciarCorreioVoz();
                    break;
                case 6:
                    iphone.atender();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
     }
}
