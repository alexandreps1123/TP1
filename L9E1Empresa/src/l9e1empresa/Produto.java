package l9e1empresa;

public class Produto extends Classificador implements Classificavel {

    //atributos
    private int codigo;
    private String nome;
    private double preco;
    
    //construtor
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean menorElemento(Classificavel object) {
        
        Produto compara = (Produto) object;
        
        return this.codigo < compara.codigo;
    }

    @Override
    public String toString() {
        return codigo + " " + nome + " " + preco;
    }
    
    
    
}
