package cap3exercicio02;

public class ContaBancaria {
    
    //Atributos
    private String nome;
    private double saldo;
    
    //Metodos    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void retirar(double valor){
        if (valor > saldo)
            System.out.println("Saldo insuficiente");
        else
            saldo -= valor;
    }
}
