package l3e3conversaodetemperaturas;

import java.util.Scanner;

public class Converte {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double entradaTemperatura = teclado.nextDouble();
        teclado.nextLine();
        
        Temperatura temperatura = new Temperatura(entradaTemperatura);
        
        temperatura.converterCelsius2Fahrenheit(entradaTemperatura);
        System.out.println("temperatura: " + temperatura.toString() +" graus fahrenheit");
        
        temperatura.converterFahrenheit2Celsius(entradaTemperatura);
        System.out.println("temperatura: " + temperatura.toString() + " graus celsius");
        
    }
    
}