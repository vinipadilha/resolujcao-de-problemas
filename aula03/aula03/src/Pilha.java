import java.util.Scanner;

public class Pilha{
        private int capacidade;
        private int topo;
        private char dados[];

        public Pilha(){
            capacidade = 10;
            dados =  new char[capacidade];
            topo = -1;
        }

        public void insere(char caracter){
            topo++;
            dados[topo] = caracter;
        }

        public char Remove(){
            char caracter;
            caracter = dados[topo];
            topo--;
            return caracter;
        }

        public boolean cheia(){
            return (topo == 9);
        }

        public boolean vazia(){
            return ( topo == -1);
        }

        public void imprime() {
            if (vazia()) {
                System.out.println("Pilha vazia!");
                return;
            }
            System.out.println("Elementos da pilha:");
            for (int i = topo; i >= 0; i--) {
                System.out.println(dados[i]);
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Insira a expressão: ");
            String expressao = sc.nextLine();

            Pilha pilha = new Pilha();

            pilha.imprime();

            System.out.println("Removido: " + pilha.Remove());

            pilha.imprime();
        }



}
