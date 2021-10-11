package l5e1locadoraveiculo;

import java.util.Scanner;

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
        
        Scanner teclado = new Scanner(System.in);
        
        Veiculo veiculo = new Veiculo();
        Motorista motorista = new Motorista();
        Cliente cliente = new Cliente();
        Chamado chamado = new Chamado();
        
        String[] inputVeiculo = new String[5];
        String[] inputMotorista = new String[4];
        String[] inputCliente = new String[5];
        String[] inputChamado = new String[10];
        
        String entrada = teclado.nextLine();
        entrada = entrada.trim();
        inputVeiculo = entrada.split(" ");
        
        entrada = teclado.nextLine();
        entrada = entrada.trim();
        inputMotorista = entrada.split(" ");
        
        entrada = teclado.nextLine();
        entrada = entrada.trim();
        inputCliente = entrada.split(" ");
        
        entrada = teclado.nextLine();
        entrada = entrada.trim();
        inputChamado = entrada.split(" ");
        
        //set veiculo info
        veiculo.setPlaca(inputVeiculo[0]);
        veiculo.setMarca(inputVeiculo[1]);
        veiculo.setModelo(inputVeiculo[2]);
        veiculo.setCor(inputVeiculo[3]);
        veiculo.setAno(Integer.parseInt(inputVeiculo[4]));
        
        //set motorista info
        motorista.setIdMotorista(Integer.parseInt(inputMotorista[0]));
        motorista.setNome(inputMotorista[1]);
        motorista.setTelefone(inputMotorista[2]);
        motorista.setCnh(inputMotorista[3]);
        
        //set cliente info
        cliente.setIdCliente(Integer.parseInt(inputCliente[0]));
        cliente.setNome(inputCliente[1]);
        cliente.setTelefone(inputCliente[2]);
        cliente.setRg(inputCliente[3]);
        cliente.setCpf(inputCliente[4]);
         
        //set chamado info
        chamado.setIdChamado(Integer.parseInt(inputChamado[0]));
        chamado.setData(inputChamado[1]);
        chamado.setTipo(inputChamado[2]);
        chamado.setOrigem(inputChamado[3]);
        chamado.setDestino(inputChamado[4]);
        chamado.setHorarioPartida(Float.parseFloat(inputChamado[5]));
        chamado.setHorarioRetorno(Float.parseFloat(inputChamado[6]));
        chamado.setKmInicial(Double.parseDouble(inputChamado[7]));
        chamado.setKmFinal(Double.parseDouble(inputChamado[8]));
        chamado.setValorTotal(Double.parseDouble(inputChamado[9]));
        
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
    
}
