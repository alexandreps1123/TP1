package locadoraveiculo;

public class Moto extends Veiculo {
    //atributos
    private int qtdCilindradas;
    
    //construtores
    public Moto(String placa, String marca, String modelo, String cor, 
            double valorDiaria, boolean estaDisponivel, int qtdCilindradas) {
        super(placa, marca, modelo, cor, valorDiaria, estaDisponivel);
        this.qtdCilindradas = qtdCilindradas;
    }
    
    //metodo cadastrar moto
    public static Moto cadastrarMoto(String placa, String marca, String modelo,
            String cor, double valorDiaria, boolean estaDisponivel,
            int qtdCilindradas)  {
        
        Moto moto = new Moto(placa, marca, modelo, cor, valorDiaria, estaDisponivel, qtdCilindradas);
        
        return moto;
        
    }
    
    //metodo editar moto
    public static void editarMoto(Moto moto, String placa, String marca, String modelo,
            String cor, double valorDiaria, boolean estaDisponivel,
            int qtdCilindradas)   {
             
        moto.setPlaca(placa);
        moto.setMarca(marca);
        moto.setModelo(modelo);
        moto.setCor(cor);
        moto.setValorDiaria(valorDiaria);
        moto.setEstaDisponivel(estaDisponivel);
        moto.setQtdCilindradas(qtdCilindradas);
                
    }
    
    //metodos especiais
    public int getQtdCilindradas() {
        return qtdCilindradas;
    }

    public void setQtdCilindradas(int qtdCilindradas) {
        this.qtdCilindradas = qtdCilindradas;
    }

}
