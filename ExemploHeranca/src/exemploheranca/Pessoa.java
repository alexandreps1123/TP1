package exemploheranca;

public class Pessoa {
    
    //atributos
    private String nome;
    private String endereco;
    
    //contrutores
    public Pessoa() {
        
    }
    
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    //metodos
    public String mostrar() {
        String resultado;
        resultado = "Nome: " + nome + "\n";
        resultado = resultado + "Endereço: " + endereco + "\n";
        return resultado;
    }
    
    //metodos especiais
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
