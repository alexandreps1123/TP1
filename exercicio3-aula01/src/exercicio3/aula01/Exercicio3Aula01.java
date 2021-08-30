/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3.aula01;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class Exercicio3Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean x = true;
        Scanner ler = new Scanner(System.in);
        
        int v[] = new int[3];
        for (int i = 0; i<3; i++)
                v[i] = ler.nextInt();
        for (int i = 0; i<3; i++)
        {
            for (int j=2; j<= (int)v[i]/2;j++)
            {
                if (v[i]%j==0)
                {
                    x=false;
                    break;
                }
            }
        }
        if (x)
            System.out.println("Mensagem 1");
        else
            System.out.println("Mensagem 2");
    }
        // TODO code application logic here
}
    

