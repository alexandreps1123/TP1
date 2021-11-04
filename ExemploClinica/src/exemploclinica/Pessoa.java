package exemploclinica;

public class Pessoa {
    
    //atributos
    private String nome;
    private int rg;
    private String dataNascimento;
    
    //contrutores
    
    public Pessoa(String nome, int rg, String dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public int getRg() {
        return rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = "Pessoa: \n";
        resultado = resultado + "Nome: " + nome + "\n";
        resultado = resultado + "RG: " + rg + "\n";
        resultado = resultado + "Data de Nascimento: " + dataNascimento + "\n";
        return resultado;
    }
    
}
