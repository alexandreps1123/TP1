package l7e1veiculos;

public class Moto extends Veiculo {
    
    //atributos
    private int qtdDeCilindradas;
    
    //contrutores

    public Moto() {
    }

    public Moto(String placa, int numeroPortas, float preco, int qtdDeCilindradas) {
        super(placa, numeroPortas, preco);
        this.qtdDeCilindradas = qtdDeCilindradas;
    }
    
    //metodos especiais

    public int getQtdDeCilindradas() {
        return qtdDeCilindradas;
    }

    public void setQtdDeCilindradas(int qtdDeCilindradas) {
        this.qtdDeCilindradas = qtdDeCilindradas;
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado = super.toString();
        resultado = resultado + " Quantidade de cilindradas: " + qtdDeCilindradas;
        return resultado;
    }
    
}
