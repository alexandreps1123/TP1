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
        ContaBancaria.nomeBanco = "Banco do Programador";
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNome("João");
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNome("Maria");
        
        ContaBancaria.escopoDeClasse = "acesso ao escopo de classe";
        conta1.escopoDeInstancia = "acesso ao escopo de instancia pela conta1";
        conta2.escopoDeInstancia = "acesso ao escopo de instancia pela conta2";
        
        System.out.println(ContaBancaria.nomeBanco);
        System.out.println(ContaBancaria.escopoDeClasse);
        System.out.println(conta1.escopoDeInstancia);
        System.out.println(conta2.escopoDeInstancia);
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta2.getNome(), conta2.getSaldo());
                
        conta1.depositar(1000.00);
        conta2.retirar(1000.00);
        
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("Saldo da conta do(a) %s é %.2f\n", conta2.getNome(), conta2.getSaldo());
        
    }
    
}
