package exemplocollection;

import java.util.*;

public class BuscaBinaria {

    public static void main(String args[]) {
        
        String[] cores = {"vermelho", "branco", "rosa", "preto", "marrom"};
        
        List<String> lista = new ArrayList<>(Arrays.asList(cores));
        
        System.out.println(lista);
        Collections.sort(lista);
        
        busca(lista, "vermelho");
        busca(lista, "branco");
        busca(lista, "verde");
        busca(lista, "azul");
        
        
    }
    
    private static void busca(List<String> lista, String chave) {
        
        int resultado = 0;
        resultado = Collections.binarySearch(lista, chave);
        
        if (resultado >= 0) {
            System.out.println("Elemento encontrado: " + resultado);
        } else {
            System.out.println("Elemento não encontrado: " + resultado);
        }
        
    }
    
}
