package exemploheranca2;

public class Projetor extends Equipamento {

    //atributos
    private String resolucao;
    
    //contrutores
    public Projetor() {
        
    }
    
    public Projetor(int codigo, String nome, String marca, double custo, String resolucao) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.resolucao = resolucao;
    }

    //metodos especiais
    public String getResolucao() {
        return resolucao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProjetor: " + "\nresolucao = " + resolucao + "\n";
    }
    
}
