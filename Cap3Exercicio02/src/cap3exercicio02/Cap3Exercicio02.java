/*
 * Gerenciar Conta Bancaria
 */
package cap3exercicio02;

/**
 *
 * @author alexandre
 */
public class Cap3Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria conta1 = new ContaBancaria();
        conta1.nome = "João";
        conta1.saldo = 5500.00;
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.nome = "Maria";
        conta2.saldo = 10000.00;
        
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta1.nome, conta1.saldo);
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta2.nome, conta2.saldo);
                
        conta1.depositar(1000.00);
        conta2.retirar(1000.00);
        
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta1.nome, conta1.saldo);
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta2.nome, conta2.saldo);
        
    }
    
}
