package l2e1pesoideal;

import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {

    static boolean verificarEntrada(char sexo, float altura){
        
        if (sexo != 'm' && sexo != 'f') {
            return false;
        }
        else if (altura < 0)  {
            return false;
        }
        
        return true;
    }
    
    static float calcularPesoIdeal(char sexo, float altura) {
        float pesoIdeal;
        final float CONST_A = 72.7f;
        final float CONST_B = 58.0f;
        final float CONST_C = 62.1f;
        final float CONST_D = 44.7f;
                
        
        if (sexo == 'm') {
            pesoIdeal = CONST_A * altura - CONST_B;
            
        } else {
            pesoIdeal = CONST_C * altura - CONST_D;
        }
        
        return  pesoIdeal;
    }
    
    
    public static void main(String[] args) {
        
        float altura;
        char sexo;
        
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        
        altura = teclado.nextFloat();
        teclado.nextLine();
        sexo = teclado.next().charAt(0);
        teclado.nextLine();
        
        boolean validacao = verificarEntrada(sexo, altura);
        
        if (validacao == true) {
            float pesoIdeal = calcularPesoIdeal(sexo, altura);
            System.out.println(String.format(Locale.US, "%.1f kg\n", pesoIdeal));
        } else  {
            System.out.println("Entrada inválida!");
        }
        
    }
    
}