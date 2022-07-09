package exemplointerface;

public class Artigo implements Abnt{
    
    //atributos
    private String conclusao;
    
    //metodos
    public void criarResumo() {
        
    }

    @Override
    public void criarSumario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void definirEspacamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void referenciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
