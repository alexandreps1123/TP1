package exemploheranca;

public class ExemploHeranca {

    public static void main(String[] args) {
        
        Motorista motorista1 = new Motorista();
        motorista1.setNome("Alexandre");
        motorista1.setEndereco("Rua alfazema");
        motorista1.setCpf("12345678900");
        motorista1.setRg("1234567");
        motorista1.setSalario(1200.00);
        motorista1.setHoraExtra(12);
        
        Motorista motorista2 = new Motorista("Outro", "Motorista", "Safado", "Cadastrado", 69, 123);
        
        System.out.println(motorista1.mostrar());
        System.out.println(motorista2.mostrar());
        
    }
    
}
