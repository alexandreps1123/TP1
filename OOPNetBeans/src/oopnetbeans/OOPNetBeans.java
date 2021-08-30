package oopnetbeans;

public class OOPNetBeans {

    public static void main(String[] args) {
        // TODO code application logic here
        Usuario newUser = new Usuario();
        Login login = new Login();
        
        login.idade = 10;
        newUser.idade = 100;
        
        System.out.println(login.idade);
        System.out.println(newUser.idade);
        
        Usuario.concatenaString(newUser.firstName, newUser.lastName);
        
        login.printLogin();
        
        System.out.println("mensagem!");
    }
    
}
