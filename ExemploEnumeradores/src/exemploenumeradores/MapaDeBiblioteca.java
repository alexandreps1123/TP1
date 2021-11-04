package exemploenumeradores;

public class MapaDeBiblioteca extends Mapa implements ItemDeBiblioteca, ItemRaroDeBiblioteca {

    //atributos
    private boolean isEmprestado;
    
    //contrutor
    public MapaDeBiblioteca(String titulo) {
        super(titulo);
        this.isEmprestado = false;
    }

    @Override
    public boolean isEmprestimo() {
        return this.isEmprestado;
    }

    @Override
    public void modificarEmprestimo(Estado estado) {
        if (estado == Estado.EMPRESTA) { 
            this.isEmprestado = true;
            System.out.println("O livro " + getTitulo() + " foi emprestado, ");
            System.out.println("e deverá ser devolvido em " + ItemRaroDeBiblioteca.maxDiasEmprestimo + " dias. \n");
        
        } else if (estado == Estado.DEVOLVE) {
            this.isEmprestado = false;
            System.out.println("O livro " + getTitulo() + " foi devolvido.\n");
            
        }
    }

    @Override
    public String cuidadosEspeciais() {
        return "Não tirar copia!";
    }

    @Override
    public String toString() {
        String mapa = super.toString();
        if (this.isEmprestado) {
            mapa += "Este mapa está emprestado.\n";
        } else {
            mapa += "Este mapa está disponível para empréstimo.\n";
        }
        mapa += "Cuidados especiais: " + cuidadosEspeciais() + "\n";
        
        return mapa;
        
    }
    
}
