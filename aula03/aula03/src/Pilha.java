 public class Pilha{
        private int capacidade;
        private int topo;
        private int dados[];

        public Pilha(){
            capacidade = 10;
            dados =  new int[capacidade];
            topo = -1;
        }

        public void insere(int num){
            topo++;
            dados[topo] = num;
        }
        public int Remove(){
            int num;
            num = dados[topo];
            topo--;
            return num;
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
            Pilha pilha = new Pilha();

            pilha.insere(10);
            pilha.insere(20);
            pilha.insere(30);

            pilha.imprime();

            System.out.println("Removido: " + pilha.Remove());

            pilha.imprime();
        }
}
