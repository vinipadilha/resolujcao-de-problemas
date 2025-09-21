public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);

        pilha.imprime();

        System.out.println("Removido: " + pilha.remove());
        pilha.imprime();

        pilha.insere(40);
        pilha.insere(50);
        pilha.insere(60); // aqui enche a pilha
        pilha.insere(70); // vai dar erro

        pilha.imprime();
    }
}