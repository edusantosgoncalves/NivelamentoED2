package questao03;

import java.util.Scanner;
import java.util.Stack;

/* É possível inverter palavras individuais em uma String usando pilha?
 Se sim, explique os passos para faze-la. Caso contrário explique os motivos que
 impossibilitam esse algoritmo de funcionar. */

    public class Q3 {
    public static void inverteFrase(String frase) {
        Stack<Character> pilha = new Stack<>();

        char[] fraseInvertida = new char[frase.length()];
        int count = 0;

        for (int i = 0; i < frase.length(); i++) {
            for (; i < frase.length() && frase.charAt(i) != ' '; i++) {
                pilha.push(frase.charAt(i));
            }

            while (!pilha.isEmpty()) {
                if (frase.charAt(count) != ' ') {
                    fraseInvertida[count] = pilha.pop();
                } else {
                    fraseInvertida[count] = ' ';
                }
                count++;
            }
        }
        System.out.println(fraseInvertida);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase;

        System.out.println("Frase a ser invertida: ");
        frase = scan.nextLine();

        inverteFrase(frase);
    }
}