public class Pilha {
    private int topo;
    private int[] dados;
    private int capacidade;


    public void Insere(int valor){
        if (cheia()){
            System.out.println("Pilha Cheia!");
        } else {
            topo = topo ++;
            dados[topo] = valor;
        }
    }

    public boolean cheia(){
        return topo == capacidade - 1;
    }

    public boolean Vazia(){
        return topo == -1;
    }
}
