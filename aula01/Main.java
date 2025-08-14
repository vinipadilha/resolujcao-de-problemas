import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("1 - Sair");
            System.out.println("2 - Iniciar Pedido");
            System.out.print("Escolha uma opção: ");

            int opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                System.out.println("Saindo do sistema...");
                break;
            }
            else if (opcao == 2) {
                System.out.print("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.println("Olá " + nome + "! Vamos fazer seu pedido...");

                

            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}