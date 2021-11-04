package exemploheranca;

public class Motorista extends PessoaFisica {
    
    //atributos
    private double salario;
    private double horaExtra;
    
    //construtores
    public Motorista()  {
        
    }
    
    public Motorista(String nome, String endereco, String cpf, String rg, double salario, double horaExtra)  {
        super(nome, endereco, cpf, rg);
        this.salario = salario;
        this.horaExtra = horaExtra;
    }
    
    //metodos
    public String mostrar() {
        String resultado = "Dados do Motorista:\n";
        resultado = resultado + super.mostrar();
        resultado = resultado + "Salário: " + salario + "\n";
        resultado = resultado + "Hora Extra: " + horaExtra + "\n";
        return resultado;
    }
    
    //metodos especiais
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }
    
}
