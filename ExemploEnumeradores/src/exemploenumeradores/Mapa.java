package exemploenumeradores;

public class Mapa {

    //atributos
    private String titulo;
    
    //construtores
    public Mapa(String titulo) {
        this.titulo = titulo;
    }
    
    //metodos
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getLocalizacao() {
        
        return "MapaCentro";
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
               "Localizacao: " + getLocalizacao() + "\n";
    }
    
}
