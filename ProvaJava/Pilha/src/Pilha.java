public class Pilha {
    private int topo;
    private int[] dados;
    private int capacidade;


    public boolean cheia(){
        return topo == capacidade - 1;
    }

    public boolean vazia(){
        return topo == -1;
    }
}
