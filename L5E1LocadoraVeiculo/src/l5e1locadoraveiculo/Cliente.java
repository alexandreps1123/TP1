package l5e1locadoraveiculo;

public class Cliente {
    //atributos
    private int idCliente;
    private String rg;
    private String cpf;
    private String nome;
    private String telefone;
    
    //referencia a objetos associados
    private Chamado []chamado;
    
    //metodos especiais
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpg() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
    public Chamado[] getChamado() {
        return chamado;
    }

    public void setChamado(Chamado[] chamado) {
        this.chamado = chamado;
    }
    
}
