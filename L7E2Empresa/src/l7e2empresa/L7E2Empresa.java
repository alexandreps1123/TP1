package l7e2empresa;

import java.util.Scanner;

public class L7E2Empresa {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionario[] = new Funcionario[4];
                
        String entrada = new String();
        String splitEntrada[] = new String[5];
        
        String nomeEmpresa = teclado.next();
        String cidade = teclado.next();
        String mes = teclado.next();
        teclado.nextLine();
        
        //entrada dos dados do chefe
        entrada = teclado.nextLine();
        splitEntrada = entrada.split(" ");
        Chefe chefe = new Chefe(splitEntrada[0], splitEntrada[1], 
                Float.parseFloat(splitEntrada[2]), splitEntrada[3]);
        
        //entrada dos dados do vendedor
        entrada = teclado.nextLine();
        splitEntrada = entrada.split(" ");
        Vendedor vendedor = new Vendedor(splitEntrada[0], splitEntrada[1], 
                Float.parseFloat(splitEntrada[2]), Float.parseFloat(splitEntrada[3]), 
                Integer.parseInt(splitEntrada[4]));
        
        //entrada dos dados do operario
        entrada = teclado.nextLine();
        splitEntrada = entrada.split(" ");
        Operario operario = new Operario(splitEntrada[0], splitEntrada[1], 
                Float.parseFloat(splitEntrada[2]), Float.parseFloat(splitEntrada[3]), 
                Integer.parseInt(splitEntrada[4]));
        
        //entrada dos dados do horista
        entrada = teclado.nextLine();
        splitEntrada = entrada.split(" ");
        Horista horista = new Horista(splitEntrada[0], splitEntrada[1], 
                Float.parseFloat(splitEntrada[2]), Float.parseFloat(splitEntrada[3]), 
                Integer.parseInt(splitEntrada[4]));
        
        funcionario[0] = chefe;
        funcionario[1] = vendedor;
        funcionario[2] = operario;
        funcionario[3] = horista;
        
        FolhaPagamento.mostrarPagamentos(nomeEmpresa, cidade, mes, funcionario);
        
    }
    
}
