package banco;

public class Cliente {

    //artibutos
    private int codigoCliente;
    private long cpfCliente;
    private String nomeCliente;
    private double salario;
    private String profissao;

    //métodos
        public void cadastrar()
        {

        }

        public void alterar()
        {

        }

        public void excluir()
        {

        }

        public void pesquisar()
        {

        }
    
    //métodos especiais
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public long getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(long cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    

    
}
