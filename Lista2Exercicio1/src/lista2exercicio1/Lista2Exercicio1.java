package lista2exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Lista2Exercicio1 {

    static boolean verificarEntrada(char sexo, float altura){
        
        if (sexo != 'm' && sexo != 'f') {
            return false;
        } else if (altura < 0)  {
            return false;
        }
        
        return true;
    }
    
    static float calcularPesoIdeal(char sexo, float altura) {
        float pesoIdeal;
        float constA = 72.7f;
        float constB = 58.0f;
        float constC = 62.1f;
        float constD = 44.7f;
                
        
        if (sexo == 'm') {
            pesoIdeal = constA*altura - constB;
            
        } else {
            pesoIdeal = constC*altura - constD;
        }
        
        return  pesoIdeal;
    }
    

    
    public static void main(String[] args) {
        
        float altura;
        char sexo;
        
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        
        altura = teclado.nextFloat();
        sexo = teclado.next(".").charAt(0);
        
        boolean validacao = verificarEntrada(sexo, altura);
        
        if (validacao == true) {
            float pesoIdeal = calcularPesoIdeal(sexo, altura);
            System.out.println(String.format(Locale.US, "%.1f kg\n", pesoIdeal));
        } else  {
            System.out.println("Entrada inválida!");
        }
        
    }
    
}
