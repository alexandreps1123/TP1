package l7e2empresa;

public class FolhaPagamento {
    
    //metodos
    public static void mostrarPagamentos(String nome, String cidade, String mes, Funcionario funcionario[]) {
        
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Endereço: " + cidade);
        System.out.println("Mês: " + mes);
        
        for (int i = 0; i < funcionario.length; i++) {
            if (funcionario[i] instanceof Chefe)    {
                System.out.print("\n");
                System.out.println((Chefe) funcionario[i]);
            }
            else if (funcionario[i] instanceof Vendedor)  {
                System.out.print("\n");
                System.out.println((Vendedor) funcionario[i]);
            }
            else if (funcionario[i] instanceof Operario)  {
                System.out.print("\n");
                System.out.println((Operario) funcionario[i]);
                
            }
            else if (funcionario[i] instanceof Horista) {
                System.out.print("\n");
                System.out.println((Horista) funcionario[i]);
            }
        }
    }
}
