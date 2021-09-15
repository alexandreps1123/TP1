package l4e2criptografia;

import java.util.Scanner;

public class Frase 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in, "UTF-8");
        String entrada1 = new String();
        String entrada2 = new String();
        String entrada3 = new String();
        
        Criptografia frase1 = new Criptografia();
        Criptografia frase2 = new Criptografia();
        
        entrada1 = teclado.nextLine();
        entrada2 = teclado.nextLine();
        entrada3 = teclado.nextLine();
        
        frase1.setFrase(entrada1);
        frase2.setFrase(entrada2);
        frase1.setFrase(entrada3);
        
        System.out.println(frase2.getFrase());
        System.out.println(frase1.criptografarFrase());
        
    }
    
}
