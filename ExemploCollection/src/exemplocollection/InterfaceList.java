package exemplocollection;

import java.util.*;

public class InterfaceList {

    public static void main(String[] args) {

        //Interface List (listas)
        //Usa-se Integer para se trabalhar com a referência, classe empacotadora
        
        //Autoboxing - as conversoes sao feitas automaticatimente de acordo com a classe empacotadora
        Stack<Integer> pilha = new Stack<Integer>();
        Vector<Integer> vetor = new Vector<Integer>();
        ArrayList<String> lista1 = new ArrayList<String>();
        LinkedList<String> lista2 = new LinkedList<String>();
        
        //Principais diferenças
        /*
        Stack - LIFO -  push();     - Inserir no top
                        pop();      - Remover do top
                        empty();  - Verificar se está vazia
        
        Vector -    Comportamento semelhante ao ArrayList, mas as operações
                são sincronizadas por padrão. Coleções não sincronizadas oferecem
                melhor desempenho.
        
        ArrayList - Implementa a lista internamente como um array, porém as operçãoes
                de inserção e remoção são diferentes da de um array.
        
        LinkedList - Tem operações mais rápidas de remoção e inserção mas desempenho
                ruim para acesso sequencial da lista.
        */
        
        //LinkedList
        System.out.println("LinkedList");
        lista2.add("Ana");
        lista2.add("Joana");
        lista2.add("Jurema");
        lista2.add("Ana");
        
        System.out.println(lista2);
        System.out.println(lista2.size());
        System.out.println(lista2.remove("Ana"));
        System.out.println(lista2.remove("Ranna"));
        System.out.println(lista2);
        System.out.println(lista2.remove(1));
        System.out.println(lista2);
        
        
    }
    
}
