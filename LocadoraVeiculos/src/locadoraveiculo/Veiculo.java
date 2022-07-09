package locadoraveiculo;

public class Veiculo {   
    //atributos
    protected String placa;
    protected String marca;
    protected String modelo;
    protected String cor;
    protected double valorDiaria;
    protected boolean estaDisponivel;
    
    //contrutores
    public Veiculo() {
        
    }
    
    public Veiculo(String placa, String marca, String modelo, String cor, 
            double valorDiaria, boolean estaDisponivel) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valorDiaria = valorDiaria;
        this.estaDisponivel = estaDisponivel;
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

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean getEstaDisponivel() {
        return estaDisponivel;
    }

    public void setEstaDisponivel(boolean estaDisponivel) {
        this.estaDisponivel = estaDisponivel;
    }
    
}
