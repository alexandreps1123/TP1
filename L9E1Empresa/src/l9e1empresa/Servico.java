package l9e1empresa;

public class Servico implements Classificavel {

    //atributos
    private double preco;
    private String data;
    private String tipoServico;

    //construtor
    public Servico(double preco, String data, String tipoServico) {
        this.preco = preco;
        this.data = data;
        this.tipoServico = tipoServico;
    }

    @Override
    public boolean menorElemento(Classificavel object) {
        
        Servico compara = (Servico) object;
        
        return this.preco < compara.preco;
    }

    @Override
    public String toString() {
        return tipoServico + " " + preco + " " + data;
    }

}
