package locadoraveiculo;

import java.util.ArrayList;

public class Veiculo {
    
    //atributos
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

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
    public Veiculo() {
        this.chamado = new ArrayList();
    }

    public Veiculo(String placa, String marca, String modelo, String cor, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.chamado = new ArrayList();
    }
    
    //metodos especiais
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Chamado> getChamado() {
        return chamado;
    }

    public void setChamado(ArrayList<Chamado> chamado) {
        this.chamado = chamado;
    }
    
    
    
}
