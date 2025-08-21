import java.util.Scanner;
public class Expressao {
    String exp;

    public Expressao(String exp){
        this.exp = exp;
    }

    public int Verificacao(String exp) {
        Pilha pilha = new Pilha();

        for (int a = 0; a < exp.length(); a++) {

            char c = exp.charAt(a);

            if (c == '(' || c == '{' || c == '[') {
                pilha.insere(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pilha.vazia()) {
                    return 0;
                }

                char topo = pilha.Remove();

                if ((c == ')' && topo != '(') ||
                        (c == '}' && topo != '{') ||
                        (c == ']' && topo != '[')) {
                    return 0;
                }
            }

        }

        if (pilha.vazia()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // String s1 = "(1+5)*(56+12)";

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a expressão: ");
        String exp = sc.nextLine();

        Expressao calculo = new Expressao(exp);
        if(calculo.Verificacao(exp) == 1 ){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }

}