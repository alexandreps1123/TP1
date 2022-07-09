package l7e2empresa;

public class Vendedor extends Funcionario {
    
    //atributos
    private float comissaoVenda;
    private int quantidadeVendas;
    
    //contrutores

    public Vendedor() {
    }

    public Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int quantidadeVendas) {
        super(nome, dataNascimento, salario + comissaoVenda * quantidadeVendas);
        this.comissaoVenda = comissaoVenda;
        this.quantidadeVendas = quantidadeVendas;
    }
    
    //metodos especiais

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = super.toString();
        resultado = resultado + "Cargo: vendedor\n";
        resultado = resultado + "Comissão por Venda: R$" + comissaoVenda + "\n";
        resultado = resultado + "Número de vendas: " + quantidadeVendas;
        return resultado;
    }
    
}
