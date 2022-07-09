package formas;

import java.util.Scanner;

public class Formas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();
        String[] splitComprimentoELargura = new String[2];
        int comprimento;
        int largura;
        
        //retangulo1
        String entrada1 = teclado.nextLine();
        splitComprimentoELargura = entrada1.split(" ");
        comprimento = Integer.parseInt(splitComprimentoELargura[0]);
        largura     = Integer.parseInt(splitComprimentoELargura[1]);
        
        retangulo1.setComprimento(comprimento);
        retangulo1.setLargura(largura);
        
        retangulo1.perimetroRetangulo();
        retangulo1.areaRetangulo();
        
        //retangulo2
        entrada1 = teclado.nextLine();
        splitComprimentoELargura = entrada1.split(" ");
        comprimento = Integer.parseInt(splitComprimentoELargura[0]);
        largura     = Integer.parseInt(splitComprimentoELargura[1]);
        
        retangulo2.setComprimento(comprimento);
        retangulo2.setLargura(largura);
        
        System.out.println(retangulo1);
        System.out.println(retangulo2);
        
        retangulo2.perimetroRetangulo();
        retangulo2.areaRetangulo();
        
        
        
    }
    
}
