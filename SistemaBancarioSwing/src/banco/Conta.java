package banco;

import java.util.Date;

public class Conta {
    
    //atributos
    private String numeroConta;
    private String tipoConta;
    private String validade;
    private Date dataCriacao;
    private double saldo;

    //métodos
    public void cadastrar()
    {
        
    }
    
    public void alterar()
    {
        
    }
    
    public void excluir()
    {
        
    }
    
    public void pesquisar()
    {
        
    }
    
    //métodos especiais
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

    
}
