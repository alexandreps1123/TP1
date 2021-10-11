package locadoraveiculo;

import java.util.ArrayList;

public class Motorista {
    
    //atributos
    private int idMotorista;
    private String nome;
    private String telefone;
    private String cnh;
    
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
    public Motorista() {
        this.chamado = new ArrayList();
    }

    public Motorista(int idMotorista, String nome, String telefone, String cnh) {
        this.idMotorista = idMotorista;
        this.nome = nome;
        this.telefone = telefone;
        this.cnh = cnh;
        this.chamado = new ArrayList();
    }
    
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

    public ArrayList<Chamado> getChamado() {
        return chamado;
    }

    public void setChamado(ArrayList<Chamado> chamado) {
        this.chamado = chamado;
    }
    
    
    
}
