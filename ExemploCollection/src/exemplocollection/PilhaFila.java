package exemplocollection;

import java.util.LinkedList;

public class PilhaFila {

    public static void main(String args[]) {
        
        //Fila (FIFO)
        LinkedList<Integer> fila = new LinkedList<Integer>();
        
        fila.add(10);
        fila.add(15);
        fila.add(20);
        fila.add(25);
        
        System.out.println(fila);
        //pollFirst() remove e retorna o primeiro elemento
        System.out.println(fila.pollFirst());
        System.out.println(fila.pollFirst());
        
        //peekFirst() retorna o primeiro elemento, sem remover
        System.out.println(fila.peekFirst());
        System.out.println(fila);
        
        System.out.println("");
        
        //Pilha (LIFO)
        LinkedList<Integer> pilha = new LinkedList<>();
        
        pilha.add(35);
        pilha.add(10);
        pilha.add(5);
        pilha.add(15);
        
        System.out.println(pilha);
        System.out.println(pilha.pollLast());
        System.out.println(pilha.pollLast());
        System.out.println(pilha.peekLast());
        System.out.println(pilha);
        
        
    }
}
