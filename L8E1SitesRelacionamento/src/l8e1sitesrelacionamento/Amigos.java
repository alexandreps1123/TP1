package l8e1sitesrelacionamento;

public class Amigos extends Contato {

    //atributos
    protected int grau;
    
    //construtor
    public Amigos(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
        setAmigo(this);
    }

    public int getGrau() {
        return grau;
    }
    
    @Override
    public String imprimirContato() {
        
        String imprimir = imprimirBasico();
        
        if (getGrau() == 1) {
            imprimir += "Grau: Melhor amigo";
        } else if (getGrau() == 2) {
            imprimir += "Grau: Amigo";
        } else if (getGrau() == 3) {
            imprimir += "Grau: Conhecido";
        }
        
        return imprimir;
    }
    
}
