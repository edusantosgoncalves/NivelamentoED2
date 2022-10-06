package questao08;

import java.util.*;

/* A Daenerys é farmacêutica e recebe dez caixas de remédios nos lotes 35, 33, 42, 10, 14, 19, 27, 44, 26, 31 impressos neles.
Ela sempre arruma as caixas manualmente e fica frustrada toda vez. Ela pensou que teria muitos problemas no futuro para
 organizar as caixas se o número de caixas de remédios fosse grande. Ela precisa automatizar esse processo. Como você é
 um bom programador, a Daenerys solicitou sua ajuda. Escreva um algoritmo de ordenação rápido ótimo para organizar os
 caixas em ordem crescente de números de lote e mostrar cada etapa do algoritmo em detalhes usando a sequência acima de
  números de lote. */

public class Q8 {

    public static void main(String[] args) {
        /*PriorityQueue<Integer> pq
                = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);
        System.out.println("The highest value in the heap:"
                + pq.peek());
        //pq.poll(); // POP
        //pq.remove(3); //POP x
        System.out.println("Impressao:");
        Iterator<Integer> itr = pq.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
*/
        LinkedList<Integer> li = new LinkedList<>();

        li.add(35);
        li.add(33);
        li.add(42);
        li.add(10);
        li.add(14);
        li.add(19);
        li.add(27);
        li.add(44);
        li.add(26);
        li.add(31);

        System.out.println("LinkedList before sorting: " + li.toString());

        Collections.sort(li); // sorting the elements of the linked list

        System.out.println("LinkedList after sorting in ascending order: " + li.toString());
    }
}
