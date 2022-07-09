package exemploenumeradores;

public class Livro {
    
    private String titulo;
    private String autor;
    private short numeroPaginas;
    private short anoEdicao;
    
    public Livro(String titulo, String autor, short numeroPaginas, short anoEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoEdicao = anoEdicao;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro:" + "\ntitulo=" + titulo + 
                "\nautor=" + autor + 
                "\nnumeroPaginas=" + numeroPaginas + 
                "\nanoEdicao=" + anoEdicao + "\n";
    }
    
    
}
