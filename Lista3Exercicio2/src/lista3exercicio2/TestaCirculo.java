package lista3exercicio2;

import java.util.Scanner;

public class TestaCirculo {

    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner(System.in);
        
        String vetorEntrada0 = teclado.nextLine();
        String vetorEntrada1 = teclado.nextLine();
        String vetorEntrada2 = teclado.nextLine();
        int raioObjeto0 = teclado.nextInt();
        teclado.nextLine();
        int raioObjeto1 = teclado.nextInt();
        teclado.nextLine();
        int raioObjeto2 = teclado.nextInt();
        teclado.nextLine();
        
        String[] splitedVetorEntrada0 = new String[3];
        String[] splitedVetorEntrada1 = new String[3];
        String[] splitedVetorEntrada2 = new String[3];
        
        splitedVetorEntrada0 = vetorEntrada0.split(" ");
        splitedVetorEntrada1 = vetorEntrada1.split(" ");
        splitedVetorEntrada2 = vetorEntrada2.split(" ");

        Circulo[] circulo1 = new Circulo[3];
        circulo1[0] = new Circulo(Integer.parseInt(splitedVetorEntrada0[0]), 
                                    Integer.parseInt(splitedVetorEntrada0[1]), 
                                    Integer.parseInt(splitedVetorEntrada0[2]));
        
        circulo1[1] = new Circulo(Integer.parseInt(splitedVetorEntrada1[0]), 
                                    Integer.parseInt(splitedVetorEntrada1[1]), 
                                    Integer.parseInt(splitedVetorEntrada1[2]));
        
        circulo1[2] = new Circulo(Integer.parseInt(splitedVetorEntrada2[0]), 
                                    Integer.parseInt(splitedVetorEntrada2[1]), 
                                    Integer.parseInt(splitedVetorEntrada2[2]));
        
        Circulo[] circulo2 = new Circulo[3];
        circulo2 = circulo1;
        
        Circulo[] circulo3 = new Circulo[3];
        try{
            circulo3[0] = (Circulo) circulo1[0].clone();
            circulo3[1] = (Circulo) circulo1[1].clone();
            circulo3[2] = (Circulo) circulo1[2].clone();
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        
        //set novo raio para circulo1
        circulo1[0].setRaio(raioObjeto0);
        circulo1[1].setRaio(raioObjeto1);
        circulo1[2].setRaio(raioObjeto2);
        
        //circulo1
        System.out.println("vetor1:");
        System.out.println(circulo1[0]);
        System.out.println(circulo1[1]);
        System.out.println(circulo1[2]);
        
        //circulo2
        System.out.println("vetor2:");
        System.out.println(circulo2[0]);
        System.out.println(circulo2[1]);
        System.out.println(circulo2[2]);
        
        //circulo3
        System.out.println("vetor3:");
        System.out.println(circulo3[0]);
        System.out.println(circulo3[1]);
        System.out.println(circulo3[2]);
        
    }
    
}
