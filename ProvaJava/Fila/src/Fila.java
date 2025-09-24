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
        this.dados = new int[capacidade];
    }

    public boolean vazia(){
        return quantidade == 0;
    }

    public boolean cheia(){
        return quantidade == capacidade;
    }

    public void Insere(int valor){
        if(cheia()){
            System.out.println("Pilha Cheia!");
        } else {
            ultimo = (ultimo + 1) % capacidade;
            dados[ultimo] = valor;
            quantidade++;
            System.out.println("Inserido: " + valor);
        }
    }

    public int remove(){
        if(vazia()){
            System.out.println("Pilha Vazia!");
            return -1;
        }else{
            int valor = dados[primeiro];
            primeiro = (primeiro + 1) % capacidade;
            quantidade--;
            return valor;
        }
    }



}
