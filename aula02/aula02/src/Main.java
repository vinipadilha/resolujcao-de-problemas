public class Main {
    public static void main(String[] args) {

        int i1 = 5;

        int[] numeros = new int[i1];

        numeros[0] = 10;
        numeros[1] = 5;
        numeros[2] = 5;
        numeros[3] = 5;
        numeros[4] = 15;

        int total = 0;
        for (int i = 0; i < i1; i++) {
            System.out.println("i = " + numeros[i]);
            total += numeros[i];

        }
        System.out.println("A média dos elementos é: " + total / i1);
    }
}