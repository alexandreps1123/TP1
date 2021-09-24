package l5e1locadoraveiculo;

public class Motorista {
    //atributos
    private int idMotorista;
    private String nome;
    private String telefone;
    private String cnh;
    
    //referencia a objetos associados
    private Chamado []chamado;
    
    //metodos especiais
    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    public Chamado[] getChamado() {
        return chamado;
    }

    public void setChamado(Chamado[] chamado) {
        this.chamado = chamado;
    }
    
}
