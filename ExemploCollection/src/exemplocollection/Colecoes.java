package exemplocollection;

import java.util.*;

public class Colecoes {

    public static void main(String args[]) {
        
        //Collections
        /*
            Esta classe Collenctions contem alguns algoritmos básicos que manipulam coleções
            Métodos estáticos
        */
        
        List<String> nomes = new LinkedList<>();
        
        nomes.add("Ana");
        nomes.add("Geovana");
        nomes.add("Ranna");
        nomes.add("Erdnaxela");
        
        System.out.println(nomes);
        
        Collections.sort(nomes);
        System.out.println(nomes);
        
        Collections.sort(nomes, Collections.reverseOrder());
        System.out.println(nomes);
        
        Collections.shuffle(nomes);
        System.out.println(nomes);
        
    }
}
