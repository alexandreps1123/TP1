package l3e1banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        
        String[] splitedString = new String[4];
        Scanner teclado = new Scanner(System.in);    
        
        //conta1
        String entrada1 = teclado.nextLine();
        
        splitedString = entrada1.split(" ");
        
        int numeroConta = Integer.parseInt(splitedString[0]);
        int senha = Integer.parseInt(splitedString[1]);
        String nome = splitedString[2];
        double valorInicial = Double.parseDouble(splitedString[3]);
        
        Conta conta1 = new Conta(numeroConta, nome, valorInicial, senha);
        
        //conta2
        String entrada2 = teclado.nextLine();
        
        splitedString = entrada2.split(" ");
        
        numeroConta = Integer.parseInt(splitedString[0]);
        senha = Integer.parseInt(splitedString[1]);
        nome = splitedString[2];
        valorInicial = Double.parseDouble(splitedString[3]);
        
        Conta conta2 = new Conta(numeroConta, nome, valorInicial, senha);
        
        //opcoes de acesso
        int opcaoDeAcesso;
        int senhaConta1;
        double saldoConta1;
        double valorSaque;
        double valorDeposito;
        double valorTransferencia;
        String nomeConta2;
        
        
        do  {
            
            opcaoDeAcesso = teclado.nextInt();
            teclado.nextLine();
            
            if (opcaoDeAcesso == 1) {
                
                senhaConta1 = teclado.nextInt();
                teclado.nextLine();
                
                saldoConta1 = conta1.getSaldo(senhaConta1);
                
                if (saldoConta1 >= 0.0)
                    System.out.printf("%.2f\n",saldoConta1);
                else
                    System.out.println("senha incorreta");
                
            }
            else if (opcaoDeAcesso == 2)    {
                
                valorSaque = teclado.nextDouble();
                senhaConta1 = teclado.nextInt();
                teclado.nextLine();
                                
                if (conta1.sacar(valorSaque, senhaConta1) == true)
                    System.out.println("saque realizado");
                else
                    System.out.println("saque não realizado");
                    
            }
            else if (opcaoDeAcesso == 3)    {
                
                valorDeposito = teclado.nextDouble();
                senhaConta1 = teclado.nextInt();
                teclado.nextLine();
                                
                if(conta1.depositar(valorDeposito, senhaConta1) == true)
                    System.out.println("depósito realizado");
                else
                    System.out.println("depósito não realizado");
                
            }
            else if (opcaoDeAcesso == 4)    {
                
                nomeConta2 = teclado.nextLine();
                
                if (nomeConta2.equals(conta2.getNomeCliente())) {
                    
                    valorTransferencia = teclado.nextDouble();
                    senhaConta1 = teclado.nextInt();
                                        
                    if(conta1.transferir(valorTransferencia, senhaConta1, conta2) == true)
                        System.out.println("transferência realizada");
                    else
                        System.out.println("transferência não realizada");
                       
                }
                else
                    System.out.println("nenhum usuário encontrado");
            }
            
        }while (opcaoDeAcesso != 5);
        
    }
}