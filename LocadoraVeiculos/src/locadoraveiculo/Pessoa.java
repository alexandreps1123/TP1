package locadoraveiculo;

import java.util.Date;

public class Pessoa {
    //atributos
    protected String nomeCompleto;
    protected String cpf;
    protected Date dataNascimento;
    protected String email;
    protected String telefone;
    
    //construtores
    public Pessoa() {
        
    }
    
    public Pessoa(String nomeCompleto, String cpf, Date dataNascimento, 
            String email, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    //metodos especiais
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
