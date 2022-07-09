package exemploclinica;

public class Funcionario extends Pessoa {
    
    //atributos
    private String dataAdmissao;
    private float salario;
    
    //contrutores
    public Funcionario(String nome, int rg, String dataNascimento, String dataAdmissao, float salario) {
        super(nome, rg, dataNascimento);
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    //metodos especiais

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = "Funcionario: \n";
        resultado = resultado + "Nome: " + getNome() + "\n";
        resultado = resultado + "RG: " + getRg() + "\n";
        resultado = resultado + "Data de Nascimento: " + getDataNascimento()+ "\n";
        resultado = resultado + "Data de Admissao: " + dataAdmissao + "\n";
        resultado = resultado + "Salario: " + salario + "\n";
        return resultado;
    }
    
}
