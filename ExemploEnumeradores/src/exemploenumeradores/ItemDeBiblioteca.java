package exemploenumeradores;

public interface ItemDeBiblioteca {

    int maxDiasEmprestimo = 14;
    
    boolean isEmprestimo();
    
    void modificarEmprestimo(Estado estado);
    
    String getLocalizacao();
    
}
