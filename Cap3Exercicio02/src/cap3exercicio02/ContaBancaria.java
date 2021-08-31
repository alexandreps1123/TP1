package cap3exercicio02;

public class ContaBancaria {
    
    //Atributos
    private String nome;
    private double saldo;
    public static String nomeBanco;
    
    //Uso do modificador static
    public String escopoDeInstancia;
    public static String escopoDeClasse;
    
    //Metodos construtores
    public ContaBancaria(){
        nomeBanco="Banco da Classe";
    }
    
    public ContaBancaria(String nome){
        this.nome = nome;
    }
    
    public ContaBancaria(String nome, double saldo){
        this.nome = nome;
        if (saldo > 0.0)
            this.saldo = saldo;
    }
    
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
            System.out.println("Saldo insuficiente "+this.nome);
        else
            saldo -= valor;
    }
    
    //Formatação dos atributos
    public String myToString(){
        String conta = "";
        conta = conta + "Nome: " + nome + "\n";
        conta = conta + "Saldo: " + saldo + "\n";
        return conta;
    }
}
