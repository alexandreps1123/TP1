package lista3exercicio1;

public class Conta {
    
    //Atributos
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;
    
    //Construtor
    public Conta(int numeroConta, String nomeCliente, double saldo, int senha){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public double getSaldo(int senha){
        if (this.senha == senha)
            return saldo;
        else
            return -1.0;
    }
    
    public boolean sacar(double valor, int senha){
        if (valor > 0.0 && this.senha == senha && this.saldo > valor){
            this.saldo -= valor;
            return true;
        }
        else
            return false;
    }
    
    public boolean depositar(double valor, int senha){
        if(valor > 0.0 && this.senha == senha){
            this.saldo += valor;
            return true;
        }
        else
            return false;
    }
    
    public boolean transferir(double valor, int senha, Conta conta2){
        if (valor > 0.0 && this.senha == senha && this.saldo > valor){
            this.saldo -= valor;
            conta2.saldo += valor;
            return true;
        }
        else
            return false;
    }
}
