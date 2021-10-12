package l7e2empresa;

public class Chefe extends Funcionario {
    
    //atributos
    private String departamento;
    
    //contrutores

    public Chefe() {
    }

    public Chefe(String nome, String dataNascimento, 
            float salario, String departamento) {
        super(nome, dataNascimento, salario);
        this.departamento = departamento;
    }
    
    //metodos especiais

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
        String resultado;
        resultado = super.toString();
        resultado = resultado + "Departamento: " + departamento + "\n";
        resultado = resultado + "Cargo: chefe";
        return resultado;
    }
    
}
