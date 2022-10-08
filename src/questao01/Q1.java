package questao01;

/* Crie um programa para gerar os primeiros 100 números da seguinte sequência:
1, 7, 2, 9, 8, 9, 11, 17, 17, 20. Use um array dinâmico. */

import java.util.ArrayList;

public class Q1 {
    public static void sequencia(ArrayList<Integer> arr) {
        // 4 variáveis são inicializadas com esses valores
        int first = arr.get(0);
        int second = arr.get(1);
        int third = arr.get(2);
        int fourth = arr.get(3);

        // loop para calcular o valor dos elementos das posições a partir de arr.get(4)
        // a lógica tá certa (?) mas a impressão está errada
        for (int i = 4; i < 15; i++) {
            arr.add(i, first + second);
            arr.add(i + 1, second + third);
            arr.add(i + 2, third + fourth);
            first = arr.get(i);
            second = arr.get(i+1);
            third = arr.get(i+2);
            arr.add(i + 3, fourth + first);
            fourth = arr.get(i+3);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // inserir os 4 valores iniciais nas primeiras 4 posições da array
        arr.add(1);
        arr.add(7);
        arr.add(2);
        arr.add(9);

        // chama método
        sequencia(arr);

        // impressão
        System.out.println(arr);
    }
}
