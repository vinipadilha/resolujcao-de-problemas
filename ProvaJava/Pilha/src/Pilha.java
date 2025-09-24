public class Pilha {
    private int topo;
    private int[] dados;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }


    public void insere(int valor){
        if (cheia()){
            System.out.println("Pilha Cheia!");
        } else {
            topo++;
            dados[topo] = valor;
            System.out.println("Inserido: " + valor);
        }
    }

    public int remove(){
        if (Vazia()){
            System.out.println("Pilha Vazia!");
            return -1;
        } else {
            int valor = dados[topo];
            topo --;
            return valor;
        }
    }

    public boolean cheia(){
        return topo == capacidade - 1;
    }

    public boolean Vazia(){
        return topo == -1;
    }

    public void imprime() {
        if (Vazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Elementos da pilha (do topo para a base):");
            for (int i = topo; i >= 0; i--) {
                System.out.println(dados[i]);
            }
        }
    }
}
