package l8e1sitesrelacionamento;

public class ColegasDeTrabalho extends Contato {

    //atributos
    protected String tipo;
    
    //construtor

    public ColegasDeTrabalho( String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
        setColegasDeTrabalho(this);
    }

    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String imprimirContato() {
        
        String imprimir = imprimirBasico();
        imprimir += "Relacionamento de trabalho: " + getTipo();
        
        return imprimir;
    }
    
}
