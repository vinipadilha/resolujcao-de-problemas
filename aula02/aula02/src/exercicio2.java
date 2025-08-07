public class exercicio2 {
    public static void main(String[] Args){
        int i1 = 5;
        int[] numeros = new int[i1];

        numeros[0] = 10;
        numeros[1] = 5;
        numeros[2] = 5;
        numeros[3] = 5;
        numeros[4] = 15;

        int moda = 0;
        int num = 0;
        int maiorContagem = 0;

        for (int i = 0; i < i1; i++) {
            num = numeros[i];
            int contagem = 0;

            for (int y = 0; y < i1; y++){
                if (num == numeros[y]){
                    contagem ++;

                }
            }
            if (contagem > maiorContagem){
                maiorContagem = contagem;
                moda = num;
            }
        }
        System.out.println("A moda é " + moda + " e repete " + maiorContagem + " vezes");

    }
}
