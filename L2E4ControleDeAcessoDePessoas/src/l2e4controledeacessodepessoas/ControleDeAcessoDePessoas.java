package l2e4controledeacessodepessoas;

import java.util.Scanner;

public class ControleDeAcessoDePessoas {

    public static void main(String[] args) {
        
        char teste;
        int quantHomem = 0;
        int quantMulher = 0;
        float VALOR_INGRESSO_HOMEM = 12.50f;
        float VALOR_INGRESSO_MULHER = 7.40f;
        
        Scanner teclado = new Scanner(System.in);
        
        do{
            teste = teclado.next().charAt(0);
            teclado.nextLine();
        
            if (teste == 'h'){
                quantHomem++;
            }
            else if (teste == 'm') {
                quantMulher++;
            }
                
        }while(teste != 'q');
        
        float parcialHomem = quantHomem * VALOR_INGRESSO_HOMEM;
        float parcialMulher = quantMulher * VALOR_INGRESSO_MULHER;
        float total = parcialHomem + parcialMulher;
        
        System.out.printf("%d %d\n%.2f %.2f %.2f\n", quantHomem, quantMulher, parcialHomem, parcialMulher, total);
          
    }
    
}