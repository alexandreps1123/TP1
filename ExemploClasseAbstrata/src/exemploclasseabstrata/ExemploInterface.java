package exemploclasseabstrata;

public class ExemploInterface {

    public static void main(String[] args) {
    
        //ContaBancaria conta1 = new ContaBancaria("Ana");
        
        ContaSimples conta2 = new ContaSimples("José");
        ContaEspecial conta3 = new ContaEspecial("Ana", 1000);
        
        conta2.depositar(2000);
        conta2.retirar(500);
        conta2.imprimirExtrato();
        
        conta3.depositar(1000);
        conta3.retirar(2000);
        conta3.imprimirExtrato();
        
    }
    
}
