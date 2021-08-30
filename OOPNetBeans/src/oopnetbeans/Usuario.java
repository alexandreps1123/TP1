package oopnetbeans;

public class Usuario {
    String firstName;
    String lastName;
    int idade;

    public Usuario()    {
        firstName = "Primeiro Nome";
        lastName = "Sobrenome";
        idade = 0;
    }
    
    static void concatenaString(String palavra1, String palavra2)    {
        System.out.println(palavra1+" "+palavra2);
    }
    
}
