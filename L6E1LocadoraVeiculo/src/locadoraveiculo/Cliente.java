package locadoraveiculo;

import java.util.ArrayList;

public class Cliente {

    //atributos
    private int idCliente;
    private String rg;
    private String cpf;
    private String nome;
    private String telefone;
    
    //referencia a objetos associados
    private ArrayList<Chamado> chamado;
    
    //métodos
    public void cadastrar()
    {

    }

    public void alterar()
    {

    }

    public void excluir()
    {

    }

    public void pesquisar()
    {

    }
    
    public void inserirChamado(Chamado chamado)    {
        this.chamado.add(chamado);
    }

    //contrutores

    public Cliente() {
        this.chamado = new ArrayList();
    }

    public Cliente(int idCliente, String rg, String cpf, String nome, String telefone) {
        this.idCliente = idCliente;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.chamado = new ArrayList();
    }
    
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

    public String getCpf() {
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

    public ArrayList<Chamado> getChamado() {
        return chamado;
    }

    public void setChamado(ArrayList<Chamado> chamado) {
        this.chamado = chamado;
    }
    
    
}

