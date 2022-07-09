package exemploclinica;

public class ExemploClinica {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 123456, "01/12/1992");
        
        Funcionario funcionario = new Funcionario("Funcionario", 123456, "01/02/1993", "01/03/2001", 231);
        
        ChefeDeDepartamento chefe = new ChefeDeDepartamento("chefeao", 123456, 
                "01/12/1998", "01/03/1999", 12345, "departamento", "01/01/2000");
        
        System.out.println(pessoa);
        System.out.println(funcionario);
        System.out.println(chefe);
        
        System.out.println("Emprestimo para chefe: " + calcularEmprestimo(chefe));
        System.out.println("Emprestimo para funcionario: " + calcularEmprestimo(funcionario));
        
    }
    
    //exemplo de overload (sobrecarga)
    public static float calcularEmprestimo(Pessoa pessoa)   {
        return 1000f;
    }
    
    public static float calcularEmprestimo(Funcionario funcionario)   {
        float emprestimo = 0f;
        
        if (funcionario instanceof ChefeDeDepartamento)   {
            emprestimo = 4f * funcionario.getSalario();
        }
        else if (funcionario instanceof Funcionario){
            emprestimo = 2f * funcionario.getSalario();
        }
        
        return emprestimo;
    }
    
    /*
    public static float calcularEmprestimo(Pessoa pessoa)    {
        float emprestimo = 0f;
        
        //instanceof compara objetos
        if (pessoa instanceof ChefeDeDepartamento)   {
            emprestimo = 4f * ((ChefeDeDepartamento) pessoa).getSalario();
        }
        else if (pessoa instanceof Funcionario){
            Funcionario func = (Funcionario)pessoa;
            emprestimo = 2f * func.getSalario();
        }
        else if (pessoa instanceof Pessoa)  {
            emprestimo = 1000f;
        }
        
        return emprestimo;
    }
    */
    
}
