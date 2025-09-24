public class Fila {
    private int primeiro;
    private int ultimo;
    private int dados[];
    private int capacidade;
    private int quantidade;

    public Fila(int capacidade){
        this.capacidade = capacidade;
        this.primeiro = 0;
        this.ultimo = -1;
        this.quantidade = 0;
        this.dados = new int[capacidade]
    }

    public boolean vazia(){
        return quantidade == 0;
    }

    public boolean cheia(){
        return quantidade == capacidade;
    }

}
