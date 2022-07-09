package exemplocollection;

import java.util.*;

public class InterfaceSet {

    public static void main(String args[]) {
        
        /*
        Interface Set (conjuntos)
            nao permite objetos duplicados, pode inserir um elemento sem precisar definir a posição. 
        O tamanho do conjunto pode varia dinamicamente
        
        HashSet  -  é mais rapida para operacoes de modificação de 
                    conjunto e não estabelece nenhuma ordem entre os objetos
        
        TreeSet -   Preserva a ordem natural dos objetos e perda de desempenho
                    nas operações de remoção e inserção.
        */
        
        TreeSet<Integer> numeros = new TreeSet<>();
        HashSet<String> cidade = new HashSet<>();
        
        cidade.add("Luziânia");
        cidade.add("Ipatinga");
        cidade.add("Brasília");
        cidade.add("Luziânia");
        
        System.out.println(cidade.size());
        System.out.println(cidade);
        System.out.println(cidade.remove("Ipatinga"));
        System.out.println(cidade.contains("São Paulo"));
        System.out.println(cidade.contains("Luziânia"));
        System.out.println(cidade);
        
        for (String cid:cidade){
            System.out.println(cid);
        }
        
    }
}
