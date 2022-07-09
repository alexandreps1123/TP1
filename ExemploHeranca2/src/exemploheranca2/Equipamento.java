package exemploheranca2;

public class Equipamento {

    //atributos
    protected int codigo;
    protected String nome;
    protected String marca;
    protected double custo;
    
    //construtores
    public Equipamento() {
        
    }
    
    public Equipamento(int codigo, String nome, String marca, double custo) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
    }
   
    //metodos especiais
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getCusto() {
        return custo;
    }
    
    @Override
    public String toString() {
        return "Equipamento: " + "\nCódigo = " + 
                codigo + "\nNome = " + nome + "\nMarca = " + 
                marca + "\nCusto = " + custo + "\n";
    }
    
}
