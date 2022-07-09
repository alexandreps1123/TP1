package exemplointerface;

public class Livro implements Abnt{

    //atributos
    private int codigo;

    //metodos
    public void elaborarCapa() {
        
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
