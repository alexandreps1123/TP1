package exemploclasseabstrata;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaEspecial extends ContaBancaria{
    
    //atributos
    protected double adicional;
    
    //contrutores
    public ContaEspecial(String nome, double adicional) {
        super(nome);
        this.adicional = adicional;
    }
    
    //metodos
    @Override
    public void retirar(double valor) {
        if (valor <= this.saldo + this.adicional){
            this.saldo = this.saldo - valor;
        }
    }
    
    @Override
    public void imprimirExtrato() {
        
        System.out.println("-----Extrato da Conta Especial-----");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date) + "\n");
        
    }
    
    //métodos especiais

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
}
