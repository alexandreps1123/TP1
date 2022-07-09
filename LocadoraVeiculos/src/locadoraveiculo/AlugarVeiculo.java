package locadoraveiculo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AlugarVeiculo {
    
    //atributos
    private Date dataRetirada;
    private Date dataDevolucao;
    private byte quantidadeDias;
    
    //referencia a objetos associados
    private Cliente cliente;
    private Moto moto;
    private Carro carro;
    
    //contrutores
    public AlugarVeiculo() {
    }
    
    public AlugarVeiculo(Date dataRetirada, Date dataDevolucao) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.quantidadeDias = calcularQuantidadeDias(dataRetirada, dataDevolucao);

    }
    
    //método para calcular a quantidade de dias
    private static byte calcularQuantidadeDias(Date dataRetirada, Date dataDevolucao) {

        long diff = (dataDevolucao.getTime() - dataRetirada.getTime());

        TimeUnit time = TimeUnit.DAYS; 
        long diferenca = time.convert(diff, TimeUnit.MILLISECONDS);
        
        byte byteDiferenca = Byte.parseByte(String.valueOf(diferenca));
        
        return byteDiferenca;
        
    }
    
    //metodo para cadastrar o aluguel de uma moto
    public static AlugarVeiculo cadastrarAluguelMoto(String dataRetirada, String dataDevolucao, Cliente cliente, Moto moto) {
        
        AlugarVeiculo aluguelMoto = new AlugarVeiculo(Cliente.dataFormatada(dataRetirada),
                Cliente.dataFormatada(dataDevolucao));
        
        aluguelMoto.setCliente(cliente);
        aluguelMoto.setMoto(moto);
        
        return aluguelMoto;
    }
    
    //metodo para editar o aluguel de uma moto
    public static void editarAluguelMoto(AlugarVeiculo veiculoAlugado, String dataRetirada, 
            String dataDevolucao, Cliente cliente, Moto moto) {
        
        veiculoAlugado.setCliente(cliente);
        veiculoAlugado.setMoto(moto);
        veiculoAlugado.setDataDevolucao(Cliente.dataFormatada(dataDevolucao));
        veiculoAlugado.setDataRetirada(Cliente.dataFormatada(dataRetirada));
        veiculoAlugado.setQuantidadeDias(calcularQuantidadeDias(Cliente.dataFormatada(dataDevolucao),
                Cliente.dataFormatada(dataRetirada)));

    }
    
    //metodo para cadastrar o aluguel de uma carro
    public static AlugarVeiculo cadastrarAluguelCarro(String dataRetirada, String dataDevolucao, Cliente cliente, Carro carro) {
        
        AlugarVeiculo aluguelMoto = new AlugarVeiculo(Cliente.dataFormatada(dataRetirada),
                Cliente.dataFormatada(dataDevolucao));
        
        aluguelMoto.setCliente(cliente);
        aluguelMoto.setCarro(carro);
        
        return aluguelMoto;
    }
    
    //metodo para editar o aluguel de uma carro
    public static void editarAluguelCarro(AlugarVeiculo veiculoAlugado, String dataRetirada, 
            String dataDevolucao, Cliente cliente, Carro carro) {
        
        veiculoAlugado.setCliente(cliente);
        veiculoAlugado.setCarro(carro);
        veiculoAlugado.setDataDevolucao(Cliente.dataFormatada(dataDevolucao));
        veiculoAlugado.setDataRetirada(Cliente.dataFormatada(dataRetirada));
        veiculoAlugado.setQuantidadeDias(calcularQuantidadeDias(Cliente.dataFormatada(dataDevolucao),
                Cliente.dataFormatada(dataRetirada)));

    }

    //metodos especiais
    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public byte getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(byte quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }
    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

}
