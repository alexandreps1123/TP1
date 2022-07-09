package l7e2empresa;

public class Funcionario {
    
    //atributos
    private String nome;
    private String dataNascimento;
    private float salario;
    
    //contrutores

    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    
    //metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = "Nome: " + nome + "\n";
        resultado = resultado + "Data de Nascimento: " + dataNascimento + "\n";
        resultado = resultado + "Salário: R$" + salario + "\n";
        return resultado;
    }
        
}
