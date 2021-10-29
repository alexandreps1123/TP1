package l8e1sitesrelacionamento;

public abstract class Contato {
    
    //atributos
    protected String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;
    
    //referencia a objetos associados
    private Amigos amigo;
    private Familia familia;
    private ColegasDeTrabalho colegasDeTrabalho;
    
    //construtor
    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }
    
    //metodos
    public String imprimirBasico()  {
        
        String imprimir = "Nome: " + this.nome + "\n";
        imprimir += "Apelido: "+ this.apelido + "\n";
        imprimir += "Email: "+ this.email + "\n";
        imprimir += "Aniversário: "+ this.aniversario + "\n";
        
        return imprimir;
    }
    
    public abstract String imprimirContato();
    
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public Amigos getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigos amigo) {
        this.amigo = amigo;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public ColegasDeTrabalho getColegasDeTrabalho() {
        return colegasDeTrabalho;
    }

    public void setColegasDeTrabalho(ColegasDeTrabalho colegasDeTrabalho) {
        this.colegasDeTrabalho = colegasDeTrabalho;
    }

}
