package l7e1veiculos;

public class Veiculo {
    
    //atributos
    protected String placa;
    protected int numeroPortas;
    protected float preco;
    
    //contrutores

    public Veiculo() {
    }

    public Veiculo(String placa, int numeroPortas, float preco) {
        this.placa = placa;
        this.numeroPortas = numeroPortas;
        this.preco = preco;
    }
    
    //metodos especiais

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado = "Placa: " + placa;
        resultado = resultado + " Número de portas: " + numeroPortas;
        resultado = resultado + " Preço: R$" + preco;
        return resultado;
    }
    
}
