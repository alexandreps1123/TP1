package lista2exercicio2;

import java.util.Scanner;

public class Lista2Exercicio2 {
    
    static boolean validacaoEntrada(int tipoLoteamento, int areaImovel)   {
        
        if (tipoLoteamento != 1 && tipoLoteamento != 2)   {
            return false;
        } else if(areaImovel <= 0){
            return false;
        }
        
        return true;   
    }
    
    static float calcularIPTULoteamento1(int areaImovel)  {
        float CONST_A = 1.0f;
        float CONST_B = 1.2f;
        
        if (areaImovel < 200)   {
            return areaImovel*CONST_A;
        }else   {
            return areaImovel*CONST_B;
        }

    }
    
    static float calcularIPTULoteamento2(int areaImovel)  {
        float CONST_C = 1.1f;
        float CONST_D = 1.3f;
        
        if (areaImovel < 200)   {
            return areaImovel*CONST_C;
        }else   {
            return areaImovel*CONST_D;
        }
    }
            
     

    public static void main(String[] args) {
        
        float totalIPTU;
        
        Scanner teclado = new Scanner(System.in);
        
        int tipoLoteamento = teclado.nextInt();
        int areaImovel = teclado.nextInt();
        
        boolean resultado = validacaoEntrada(tipoLoteamento, areaImovel);
        
        if (resultado == true && tipoLoteamento == 1)  {
            
            totalIPTU = calcularIPTULoteamento1(areaImovel);            
            System.out.printf("%.2f\n", totalIPTU);
            
        }else if (resultado == true && tipoLoteamento == 2)  {
            
            totalIPTU = calcularIPTULoteamento2(areaImovel);    
            System.out.printf("%.2f\n", totalIPTU);
            
        }else{   
            System.out.println("Entrada inválida!");
        }
    }
}
