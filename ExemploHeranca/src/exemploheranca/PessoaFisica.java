package exemploheranca;

public class PessoaFisica extends Pessoa {
    
    //atributos
    protected String cpf;
    protected String rg;
    
    //construtores
    public PessoaFisica() {
        
    }
    
    public PessoaFisica(String nome, String endereco, String cpf, String rg) {
        super(nome, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }
    
    //metodos
    public String mostrar() {
        String resultado;
        resultado = super.mostrar();
        resultado = resultado + "CPF: " + cpf + "\n";
        resultado = resultado + "RG: " + rg + "\n";
        return resultado;
    }
    
    //metodos especiais
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
