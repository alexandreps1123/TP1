package lista2exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Lista2Exercicio3 {
    
    static float custoEnergia(float consumoEnergiaEletrica) {
        float TAXA_NIVEL_1 = 0.02f;
        float TAXA_NIVEL_2 = 0.05f;
        float TAXA_NIVEL_3 = 0.10f;
        float TAXA_NIVEL_4 = 0.35f;
        int MAX_NIVEL_1 = 500;
        int MAX_NIVEL_2 = 1000;
        
        if (consumoEnergiaEletrica <= 500)   {
            return consumoEnergiaEletrica*TAXA_NIVEL_1;
        } else if(consumoEnergiaEletrica > 500 && consumoEnergiaEletrica <= 1000){
            return (MAX_NIVEL_1*TAXA_NIVEL_3)+((consumoEnergiaEletrica-MAX_NIVEL_1)*TAXA_NIVEL_2);
        } else{
            return (MAX_NIVEL_2*TAXA_NIVEL_4)+((consumoEnergiaEletrica-MAX_NIVEL_2)*TAXA_NIVEL_3);
        }
             
    }

    public static void main(String[] args) {
        
        float TAXA_BASICO_SERVICO = 5.00f;
        
        Scanner teclado = new Scanner(System.in);
        
        float consumoEnergiaEletrica = teclado.nextFloat();
        
        float custoEnergiaConsumida = custoEnergia(consumoEnergiaEletrica);
        float total = custoEnergiaConsumida+TAXA_BASICO_SERVICO;
        
        System.out.printf(String.format(Locale.US, "%.2f ", custoEnergiaConsumida));
        System.out.printf(String.format(Locale.US,"%.2f ", TAXA_BASICO_SERVICO));
        System.out.printf(String.format(Locale.US,"%.2f\n", total));
        
    }
    
}
