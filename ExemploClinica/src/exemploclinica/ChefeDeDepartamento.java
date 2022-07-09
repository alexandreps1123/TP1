package exemploclinica;

public class ChefeDeDepartamento extends Funcionario {

    //atributos
    private String departamento;
    private String dataDaPromocaoAChefe;
    
    //contrutores

    public ChefeDeDepartamento(String nome, int rg, String dataNascimento, 
            String dataAdmissao, float salario,
            String departamento, String dataDaPromocaoAChefe) {
        super(nome, rg, dataNascimento, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataDaPromocaoAChefe = dataDaPromocaoAChefe;
    }
    
    //metodos especiais

    public String getDepartamento() {
        return departamento;
    }

    public String getDataDaPromocaoAChefe() {
        return dataDaPromocaoAChefe;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = super.toString();
        resultado = resultado + "Departamento: " + departamento + "\n";
        resultado = resultado + "Data da Promocao: " + dataDaPromocaoAChefe + "\n";
        return resultado;
    }
    
}
