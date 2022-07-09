package exemploclinica;

public class Paciente extends Pessoa {
    
    //atributos
    private String planoDeSaude;
    
    //contrutores
    public Paciente(String nome, int rg, String dataNascimento, String planoDeSaude) {
        super(nome, rg, dataNascimento);
        this.planoDeSaude = planoDeSaude;
    }
    
    //metodos especiais

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = "Funcionario: \n";
        resultado = resultado + "Nome: " + getNome() + "\n";
        resultado = resultado + "RG: " + getRg() + "\n";
        resultado = resultado + "Data de Nascimento: " + getDataNascimento()+ "\n";
        resultado = resultado + "Plano de Saude: " + planoDeSaude + "\n";
        return resultado;
    }
    
}
