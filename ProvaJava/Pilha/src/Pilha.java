public class Pilha {
    private int topo;
    private int[] dados;
    private int capacidade;


    public void Insere(int valor){
        if (cheia()){
            System.out.println("Pilha Cheia!");
        } else {
            topo++;
            dados[topo] = valor;
            System.out.println("Inserido: " + valor);
        }
    }

    public int Remove(){
        if (Vazia()){
            System.out.println("Pilha Vazia!");
            return -1;
        } else {
            int valor = dados[topo];
            topo = topo --;
            return valor;
        }
    }

    public boolean cheia(){
        return topo == capacidade - 1;
    }

    public boolean Vazia(){
        return topo == -1;
    }
}
