package exemplocollection;

import java.util.*;

public class InterfaceMap {

    public static void main(String args[]) {
        
        //Interface Map (Mapas - arrays associativos)
        /*
        Map - são conjuntos de pares de objetos: chave, valor.
            não é permitido chaves repetidas. valores podem repetir.
        
        HashMap - usa estrutura interna para melhorar operações básicas.
                como adição e recuperação de objetos nos mapas.
        
        TreeMap - usa uma estrutura que garante que a ordem dos objetos estarão em sua ordem natural
                Com um desempenho menor comparado ao HashMap.
        */
        
        HashMap<String, String> mapa = new HashMap<>();
        TreeMap<Integer, String> menu = new TreeMap<>();
        
        
        //Tree Map
        menu.put(5, "Frango");
        menu.put(25, "Galinha");
        menu.put(9, "Toicinho");
        menu.put(15, "Feijoada");
        menu.put(15, "Cachorro Quente");
        menu.put(19, "Feijoada");
        
        System.out.println(menu.size());
        System.out.println(menu);
        System.out.println(menu.keySet());
        System.out.println(menu.values());
        System.out.println(menu.containsKey(10));
        System.out.println(menu.containsValue("Feijoada"));
        System.out.println(menu.remove(9));
        System.out.println(menu);
        
    }
}
