/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeparseint;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class TesteParseInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String input = teclado.nextLine();
        
        try
        {
            int a = parseInt(input);
            System.out.println(a);
        } catch (NumberFormatException e) {
            
        }
            
        
    }
    
}
