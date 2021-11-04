package exemploclasseabstrata;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaSimples extends ContaBancaria{
    
    //contrutores
    public ContaSimples(String nome) {
        super(nome);
    }
    
    //metodos
    @Override
    public void retirar(double valor) {
        if (valor <= this.saldo){
            this.saldo -= valor;
        }
    }
    
    @Override
    public void imprimirExtrato() {
        
        System.out.println("-----Extrato da Conta Simples-----");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date) + "\n");
        
    }
}
