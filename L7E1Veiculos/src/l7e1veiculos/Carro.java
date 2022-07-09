package l7e1veiculos;

public class Carro extends Veiculo {
    
    //atributos
    private String cor;
    
    //contrutores

    public Carro() {
    }

    public Carro(String placa, int numeroPortas, float preco, String cor) {
        super(placa, numeroPortas, preco);
        this.cor = cor;
    }
    
    //metodos especiais

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado = super.toString();
        resultado = resultado + " Cor: " + cor;
        return resultado;
    }
    
}
