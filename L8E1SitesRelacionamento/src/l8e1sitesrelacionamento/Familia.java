package l8e1sitesrelacionamento;

public class Familia extends Contato {
    
    //atributos
    protected String parentesco;

    //construtor
    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
        setFamilia(this);
    }

    public String getParentesco() {
        return parentesco;
    }
    
    @Override
    public String imprimirContato() {
        
        String imprimir = imprimirBasico();
        imprimir += "Parentesco: " + getParentesco();
        
        return imprimir;
    }
    
}
