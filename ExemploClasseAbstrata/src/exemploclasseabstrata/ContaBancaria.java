package exemploclasseabstrata;

public abstract class ContaBancaria {
    
    //atributos
    protected String nome;
    protected double saldo;
    
    //contrutores
    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }
    
    //metodos
    public abstract void retirar(double valor);
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public abstract void imprimirExtrato();
    
    //metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
