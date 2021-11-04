package exemploheranca2;

public class Computador extends Equipamento {
    
    //atributos
    private String memoria;
    private String processador;
    
    //construtor
    public Computador() {
        
    }
    
    public Computador(int codigo, String nome, String marca, double custo, String memoria, String processador) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.memoria = memoria;
        this.processador = processador; 
    }
    
    //metodos especiais
    public String getMemoria() {
        return memoria;
    }

    public String getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComputador: " + "\nMemoria = " + memoria + "\nProcessador = " + processador + "\n";
    }
    
}
