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
        ContaBancaria conta2 = new ContaBancaria("Maria");
        ContaBancaria conta3 = new ContaBancaria("Camel", 100.00);

        conta1.setNome("João");
        System.out.println("Saldo "+conta1.getNome()+" : "+conta1.getSaldo());
        
        ContaBancaria.nomeBanco = "Banco do Programador";
        ContaBancaria.escopoDeClasse = "acesso ao escopo de classe";
        
        conta1.escopoDeInstancia = "acesso ao escopo de instancia pela conta1";
        conta2.escopoDeInstancia = "acesso ao escopo de instancia pela conta2";
        
        System.out.println(ContaBancaria.nomeBanco);
        System.out.println(ContaBancaria.escopoDeClasse);
        
        System.out.println(conta1.escopoDeInstancia);
        System.out.println(conta2.escopoDeInstancia);
                        
        conta1.depositar(1000.00);
        System.out.println(conta1.myToString());
        
        conta2.retirar(1000.00);
        System.out.println(conta2.myToString());
        
        conta3.depositar(10.00);
        System.out.println(conta3.toString());
    }
    
}
