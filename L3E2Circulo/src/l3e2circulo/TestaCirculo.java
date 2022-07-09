package l3e2circulo;

import java.util.Scanner;

public class TestaCirculo {

    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner(System.in);
        
        //entrada1
        int x1 = teclado.nextInt();
        int y1 = teclado.nextInt();
        int raio1 = teclado.nextInt();
        teclado.nextLine();
        
        //entrada2
        int x2 = teclado.nextInt();
        int y2 = teclado.nextInt();
        int raio2 = teclado.nextInt();
        teclado.nextLine();
        
        //entrada3
        int x3 = teclado.nextInt();
        int y3 = teclado.nextInt();
        int raio3 = teclado.nextInt();
        teclado.nextLine();
        
        int raioVetor1 = teclado.nextInt();
        teclado.nextLine();
        int raioVetor2 = teclado.nextInt();
        teclado.nextLine();
        int raioVetor3 = teclado.nextInt();
        teclado.nextLine();

        Circulo[] circulo1 = new Circulo[3];
        circulo1[0] = new Circulo(x1, y1, raio1);
        
        circulo1[1] = new Circulo(x2, y2, raio2);
        
        circulo1[2] = new Circulo(x3, y3, raio3);
        
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
        circulo1[0].setRaio(raioVetor1);
        circulo1[1].setRaio(raioVetor2);
        circulo1[2].setRaio(raioVetor3);
        
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