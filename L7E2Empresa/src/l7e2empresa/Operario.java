package l7e2empresa;

public class Operario extends Funcionario {
    
    //atributos
    private float valorProducao;
    private int quantidadeProduzida;
    
    //contrutores

    public Operario() {
    }

    public Operario(String nome, String dataNascimento, float salario, 
            float valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, salario + valorProducao * quantidadeProduzida);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }
    
    //metodos especiais

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }
 
    @Override
    public String toString() {
        String resultado;
        resultado = super.toString();
        resultado = resultado + "Cargo: Operário\n";
        resultado = resultado + "Valor por Produção: R$" + valorProducao + "\n";
        resultado = resultado + "Quantidade produzida: " + quantidadeProduzida;
        return resultado;
    }
    
}
