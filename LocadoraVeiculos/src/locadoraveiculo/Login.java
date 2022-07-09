package locadoraveiculo;

public class Login {
    //atributo
    private String login;
    private String senha;
    
    //contrutores
    public Login() {
        
    }
    
    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
       
    //metodos especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }  
    
}
