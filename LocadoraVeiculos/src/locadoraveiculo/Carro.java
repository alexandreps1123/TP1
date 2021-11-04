package locadoraveiculo;

public class Carro extends Veiculo {
    //atributos
    private byte qtdPortas;
    private String combustivel;
    
    //construtores
    public Carro(String placa, String marca, String modelo, String cor, 
            double valorDiaria, boolean estaDisponivel, byte qtdPortas, String combustivel) {
        super(placa, marca, modelo, cor, valorDiaria, estaDisponivel);
        this.qtdPortas = qtdPortas;
        this.combustivel = combustivel;
    }
    
    //metodo cadastrar moto
    public static Carro cadastrarMoto(String placa, String marca, String modelo,
            String cor, double valorDiaria, boolean estaDisponivel, byte qtdPortas, String combustivel)  {
        
        Carro carro = new Carro(placa, marca, modelo, cor, valorDiaria, estaDisponivel, qtdPortas, combustivel);
        
        return carro;
        
    }
    
    //metodo editar carro
    public static void editarCarro(Carro carro, String placa, String marca, String modelo,
            String cor, double valorDiaria, boolean estaDisponivel, byte qtdPortas, String combustivel)   {
             
        carro.setPlaca(placa);
        carro.setMarca(marca);
        carro.setModelo(modelo);
        carro.setCor(cor);
        carro.setValorDiaria(valorDiaria);
        carro.setEstaDisponivel(estaDisponivel);
        carro.setQtdPortas(qtdPortas);
        carro.setCombustivel(combustivel);
                
    }

    //metodos especiais
    public byte getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(byte qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
}
