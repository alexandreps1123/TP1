package exemploheranca;

public class PessoaJuridica extends Pessoa {
    
    //metodos
    private String cnpj;
    private String dataFundacao;
    
    //contrutores
    public PessoaJuridica() {
        
    }
    
    public PessoaJuridica(String nome, String endereco, String cnpj, String dataFundacao) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.dataFundacao = dataFundacao;                
    }
    
    //metodos
    public String mostrar() {
        String resultado;
        resultado = super.mostrar();
        resultado = resultado + "CNPJ: " + cnpj + "\n";
        resultado = resultado + "Data de fundação: " + dataFundacao + "\n";
        return resultado;
    }
    
    //metodos especiais
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
    
}
