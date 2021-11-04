package l9e1empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class L9E1Empresa {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numProduto = input.nextInt();
        int numCliente = input.nextInt();
        int numServico = input.nextInt();
        input.nextLine();
        
        Classificavel[] listaProdutos = new Classificavel[numProduto];
        Classificavel[] listaClientes = new Classificavel[numCliente];
        Classificavel[] listaServicos = new Classificavel[numServico];
        
        Classificador ordenarVetores = new Classificador();
        
        //produto
        for (int i = 0; i < listaProdutos.length; i++) {
            String codigo = input.next();
            String nome = input.next();
            String preco = input.next();
            input.nextLine();
        
            Produto produto = new Produto(Integer.parseInt(codigo), nome, Double.parseDouble(preco));
            
            listaProdutos[i] = produto;
        }
        
        ordenarVetores.ordenar(listaProdutos);
        
        //cliente
        for (int i = 0; i < listaClientes.length; i++) {
            String cpf = input.next();
            String nome = input.next();
            String endereco = input.next();
            input.nextLine();
        
            Cliente cliente = new Cliente(cpf, nome, endereco);
            
            listaClientes[i] = cliente;
        }
        
        ordenarVetores.ordenar(listaClientes);
        
        //servico
        for (int i = 0; i < listaServicos.length; i++) {
            String tipoServico = input.next();
            String preco = input.next();
            String data = input.next();
            input.nextLine();
        
            Servico servico = new Servico(Double.parseDouble(preco), data, tipoServico);
            
            listaServicos[i] = servico;
        }
        
        ordenarVetores.ordenar(listaServicos);
        
        imprimir(listaProdutos);
        imprimir(listaClientes);
        imprimir(listaServicos);
        
    }
    
    public static void imprimir(Classificavel[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
