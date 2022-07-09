package exemploenumeradores;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    //atributos
    private boolean isEmprestimo;
    private String localizacao;

    //construtor
    public LivroDeBiblioteca(String titulo, String autor, short numeroPaginas, 
            short anoEdicao, String localizacao) {
        
        super(titulo, autor, numeroPaginas, anoEdicao);
        this.isEmprestimo = false;
        this.localizacao = localizacao;
        
    }
    
    //metodos implementados pela interface ItemDeBiblioteca
    @Override
    public boolean isEmprestimo() {
        return this.isEmprestimo;
    }

    @Override
    public void modificarEmprestimo(Estado estado) {
        
        if (estado == Estado.EMPRESTA) {
            
            this.isEmprestimo = true;
            System.out.println("O livro " + getTitulo() + " foi emprestado, ");
            System.out.println("e deverá ser devolvido em " + maxDiasEmprestimo + " dias. \n");
        
        } else if (estado == Estado.DEVOLVE) {
            
            this.isEmprestimo = false;
            System.out.println("O livro " + getTitulo() + " foi devolvido.\n");
            
        }
     
    }

    @Override
    public String getLocalizacao() {
        return this.localizacao;
    }

    @Override
    public String toString() {
        
        String livro = super.toString();
        livro += "Localização: " + this.localizacao + "\n";
         if (this.isEmprestimo) {
            livro += "Este livro está emprestado. \n";
        } else {
            livro += "Este livro está disponível para emprestimo. \n";
        }
         
        return livro;        
    }

}
