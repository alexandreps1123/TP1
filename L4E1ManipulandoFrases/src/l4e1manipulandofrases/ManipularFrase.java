package l4e1manipulandofrases;

import java.util.Scanner;

public class ManipularFrase 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in, "UTF-8");
        String entrada1 = new String();
        String entrada2 = new String();
        
        entrada1 = teclado.nextLine();
        entrada2 = teclado.nextLine();
        
        Frase frase1 = new Frase(entrada1);
        Frase frase2 = new Frase(entrada2);
        
        System.out.println(frase1.contarPalavras());
        System.out.println(frase2.contarVogais());
    }
    
}
