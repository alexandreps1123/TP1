package l7e1veiculos;

import java.util.Scanner;

public class L7E1Veiculos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String entrada1 = new String();
        String entrada2 = new String();
        String entrada3 = new String();
        
        String splitEntrada[] = new String[4];
        
        entrada1 = teclado.nextLine();
        entrada2 = teclado.nextLine();
        entrada3 = teclado.nextLine();
        
        splitEntrada = entrada1.split(" ");
        
        //instaciacao de veiculo
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(splitEntrada[0]);
        veiculo.setNumeroPortas(Integer.parseInt(splitEntrada[1]));
        veiculo.setPreco(Float.parseFloat(splitEntrada[2]));    
        
        splitEntrada = entrada2.split(" ");
        //instaciacao de carro
        Carro carro = new Carro(splitEntrada[0], 
                Integer.parseInt(splitEntrada[1]), 
                Float.parseFloat(splitEntrada[2]), 
                splitEntrada[3]);
        
        splitEntrada = entrada3.split(" ");
        //instaciacao de moto
        Moto moto = new Moto(splitEntrada[0], 
                Integer.parseInt(splitEntrada[1]), 
                Float.parseFloat(splitEntrada[2]), 
                Integer.parseInt(splitEntrada[3]));
        
        System.out.println(veiculo);
        System.out.println(carro);
        System.out.println(moto);
    }
    
}
