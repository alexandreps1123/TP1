package exemploheranca2;

public class LousaDigital extends Equipamento {

    //atributos
    private String tamanho;
    private String recursos;
    
    //construtores
    public LousaDigital() {
        
    }
    
    public LousaDigital(int codigo, String nome, String marca, double custo, String tamanho, String recursos) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.tamanho = tamanho;
        this.recursos = recursos;
    }
    
    //metodos especiais
    public String getTamanho() {
        return tamanho;
    }

    public String getRecursos() {
        return recursos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLousa Digital: " + "\nTamanho = " + 
                tamanho + "\nRecursos = " + recursos + "\n";
    }
    
}
