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
        conta1.setNome("João");
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNome("Maria");
        
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta2.getNome(), conta2.getSaldo());
                
        conta1.depositar(1000.00);
        conta2.retirar(1000.00);
        
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta2.getNome(), conta2.getSaldo());
        
    }
    
}
