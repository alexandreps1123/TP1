package l9e1empresa;

public class Cliente implements Classificavel {

    //atributos
    private String cpf;
    private String nome;
    private String endereco;

    //construtor
    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public boolean menorElemento(Classificavel object) {
        
        Cliente compara = (Cliente) object;
        
        if (this.nome.compareTo(compara.nome) < 0) { 
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return cpf + " " + nome + " " + endereco;
    }
    
}
