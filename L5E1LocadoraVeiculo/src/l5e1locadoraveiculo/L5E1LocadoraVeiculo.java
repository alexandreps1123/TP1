package l5e1locadoraveiculo;

public class L5E1LocadoraVeiculo {
    
    static void teste(){
        Veiculo veiculo = new Veiculo();
        Motorista motorista = new Motorista();
        Cliente cliente = new Cliente();
        Chamado chamado = new Chamado();
        
        veiculo.setPlaca("BRA5E20");
        veiculo.setMarca("Chevrolet");
        veiculo.setModelo("Onix");
        veiculo.setCor("branco");
        veiculo.setAno(2014);
        
        motorista.setIdMotorista(11111);
        motorista.setNome("João");
        motorista.setTelefone("1111-1111");
        motorista.setCnh("10101010");
        
        cliente.setIdCliente(999999);
        cliente.setNome("Victor");
        cliente.setTelefone("5555-5555");
        cliente.setRg("22222222");
        cliente.setCpf("333333333333");
         
        chamado.setIdChamado(10);
        chamado.setData("02/08/2021");
        chamado.setTipo("corrida");
        chamado.setOrigem("AsaNorte");
        chamado.setDestino("AsaSul");
        chamado.setHorarioPartida((float) 13.30);
        chamado.setHorarioRetorno((float) 13.50);
        chamado.setKmInicial(85000);
        chamado.setKmFinal(85010);
        chamado.setValorTotal(10.00);
        
        chamado.setCliente(cliente);
        chamado.setMotorista(motorista);
        chamado.setVeiculo(veiculo);
        
        //mostrar dados relacionados ao chamado criado
        System.out.println(chamado.getIdChamado());
        System.out.println(chamado.getDestino());
        System.out.println(chamado.getVeiculo().getPlaca());
        System.out.println(chamado.getCliente().getRg());
        System.out.println(chamado.getMotorista().getNome());
    }

    public static void main(String[] args) {
        teste();
    }
    
}
