package cap3exercicio02;

public class ContaBancaria {
    
    //Atributos
    public String nome;
    public double saldo;
    
    //Metodos
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void retirar(double valor){
        saldo -= valor;
    }
}
