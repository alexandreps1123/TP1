package locadoraveiculo;

import java.util.Date;

public class Funcionario extends Pessoa {
    //atributos
    private String login;
    private String senhaFuncionario;
    private boolean estaAtivo;
    
    //construtores
    public Funcionario(String nomeCompleto, String cpf, Date dataNascimento, 
            String email, String telefone, String login, String senhaFuncionario, 
            boolean estaAtivo) {
        super(nomeCompleto, cpf, dataNascimento, email, telefone);
        this.login = login;
        this.senhaFuncionario = senhaFuncionario;
        this.estaAtivo = estaAtivo;
    }
    
    //metodo cadastrar funcionario
    public static Funcionario cadastrarFuncionario(String nomeCompleto, String cpf,
            String dataNascimento, String email, String telefone,
            String login, String senha, boolean estaAtivo)  {
        
        Funcionario funcionario = new Funcionario(nomeCompleto, cpf, 
                Cliente.dataFormatada(dataNascimento), email, telefone, login, senha, estaAtivo);
        
        return funcionario;
        
    }
    
    //metodo editar funcionario
    public static void editarFuncionario(Funcionario funcionario, String nomeCompleto, String cpf,
            String dataNascimento, String email, String telefone,
            String login, String senha, boolean estaAtivo)   {
        
        funcionario.setNomeCompleto(nomeCompleto);
        funcionario.setCpf(cpf);
        funcionario.setDataNascimento(Cliente.dataFormatada(dataNascimento));
        funcionario.setEmail(email);
        funcionario.setTelefone(telefone);
        funcionario.setLogin(login);
        funcionario.setSenhaFuncionario(senha);
        funcionario.setEstaAtivo(estaAtivo);
                
    }

    //metodos especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public boolean getEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
    
    
}
