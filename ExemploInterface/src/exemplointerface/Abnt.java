package exemplointerface;

public interface Abnt {
    
    //implicitamente atributos sao static final
    //e os atributos devem ser constantes
    //int ID = 10;
    
    //implicitamente os metodos sao public abstract
    //nao pode ser private, protected e static
    void criarSumario();
    
    void definirEspacamento();
    
    void referenciar();
    
}
