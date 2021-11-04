package locadoraveiculo;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pagamento {
    
    //atributos
    private String formaDePagamento;
    private boolean estaAssegurado;
    private float desconto;
    private double valorTotal;
    
    //referencia a objetos associados
    private Cliente cliente;
    
    //contrutores
    public Pagamento() {
        
    }
    
    public Pagamento(String formaDePagamento, boolean estaAssegurado, float desconto, double valorTotal) {
        this.formaDePagamento = formaDePagamento;
        this.estaAssegurado = estaAssegurado;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
    }
    
    //metodo cadastrar cliente
    public static Pagamento cadastrarPagamento(String formaPagamento, boolean seguro, AlugarVeiculo veiculo)  {
             
        double valorTotal = calcularValorTotal(seguro, veiculo);
        
        float desconto = calcularDesconto(valorTotal, veiculo);
        
        Pagamento pagamento = new Pagamento(formaPagamento, seguro, desconto, valorTotal);
        
        pagamento.setCliente(veiculo.getCliente());
        
        return pagamento;
        
    }
    
    private static double calcularValorTotal(boolean seguro, AlugarVeiculo veiculo){
        
        double dias = (double) veiculo.getQuantidadeDias();
        double valorDiariaCarro = veiculo.getCarro().getValorDiaria();
        double valorDiariaMoto = veiculo.getMoto().getValorDiaria();
        
        double valorTotal = 0;
        double subTotal = 0;
        final double valorSeguro = 500.00;
        final double desconto = 0.97;
        
        Date hoje = new Date();
        
        long diff = (hoje.getTime() - veiculo.getCliente().getDataPrimeiroCnh().getTime());

        TimeUnit time = TimeUnit.DAYS; 
        long tempoCarteira = time.convert(diff, TimeUnit.MILLISECONDS);
        
        diff = (hoje.getTime() - veiculo.getCliente().getDataNascimento().getTime());
        long idadeCliente = time.convert(diff, TimeUnit.MILLISECONDS);
        
        if (tempoCarteira > 2190 && idadeCliente > 8760)    {
            if (valorDiariaCarro != 0)  {
                if (seguro == true) {

                    subTotal = valorDiariaCarro*dias + valorSeguro;
                    valorTotal = subTotal*desconto;
                } else {
                    
                    subTotal = valorDiariaCarro*dias;
                    valorTotal = subTotal*desconto;
                }

            } else {
                if (seguro == true) {

                    subTotal = valorDiariaMoto*dias + valorSeguro;
                    valorTotal = subTotal*desconto;

                } else {
                    subTotal = valorDiariaMoto*dias;
                    valorTotal = subTotal*desconto;
                }
            }
        } else {
            if (valorDiariaCarro != 0)  {
                if (seguro == true) {

                    
                    valorTotal = valorDiariaCarro*dias + valorSeguro;
                    
                } else {
                    valorTotal = valorDiariaCarro*dias;
                }

            } else {
                if (seguro == true) {

                    valorTotal = valorDiariaMoto*dias + valorSeguro;

                } else {
                    valorTotal = valorDiariaMoto*dias;
                }
            }
        }
        
        return valorTotal;
    }
    
    private static float calcularDesconto(double valorTotal, AlugarVeiculo veiculo){
        
        float desconto = 0f;
        
        Date hoje = new Date();
        
        long diff = (hoje.getTime() - veiculo.getCliente().getDataPrimeiroCnh().getTime());

        TimeUnit time = TimeUnit.DAYS; 
        long tempoCarteira = time.convert(diff, TimeUnit.MILLISECONDS);
        
        diff = (hoje.getTime() - veiculo.getCliente().getDataNascimento().getTime());
        long idadeCliente = time.convert(diff, TimeUnit.MILLISECONDS);
        
        if (tempoCarteira > 2190 && idadeCliente > 8760)    {
            desconto = ( (float) valorTotal) * (0.97f);
        }
        
        return desconto;
    }
    
    //metodos especiais
    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public boolean getEstaAssegurado() {
        return estaAssegurado;
    }

    public void setEstaAssegurado(boolean estaAssegurado) {
        this.estaAssegurado = estaAssegurado;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
