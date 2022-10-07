package questao01;

/* Crie um programa para gerar os primeiros 100 números da seguinte sequência:
1, 7, 2, 9, 8, 9, 11, 17, 17, 20. Use um array dinâmico. */

public class Q1 {
    public static void main(String[] args) {
        int tam = 100;
        int[] arr = new int[tam];

        // inserir os 4 valores iniciais nas primeiras 4 posições
        arr[0] = 1;
        arr[1] = 7;
        arr[2] = 2;
        arr[3] = 9;

        // 4 variáveis são inicializadas com esses valores
        int first = arr[0];
        int second = arr[1];
        int third = arr[2];
        int fourth = arr[3];

        // loop para calcular o valor dos elementos das posições a partir de arr[4]
        for (int i = 4; i < 15; i++) {
            // System.out.println(first + " " + second + " " + third + " " + fourth);
            arr[i] = first + second; // arr[4] = 1 + 7 = 8
            arr[i + 1] = second + third; // arr[5] = 7 + 2 = 9
            arr[i + 2] = third + fourth; // arr[6] = 2 + 9 = 11
            first = arr[i];
            second = arr[i+1];
            third = arr[i+2];
            arr[i + 3] = fourth + first; // 9 + 8 = 17
            fourth = arr[i+3];
            // System.out.println(first + " " + second + " " + third + " " + fourth);

        }

        // dps do arr[3] só imprime direito o primeiro número a cada 4 =_=
        for (int i = 0; i < 15; i++) {
            // System.out.print(arr[i] + " ");
            System.out.println("arr["+i+"]: "+ arr[i]);
        }
    }
}
