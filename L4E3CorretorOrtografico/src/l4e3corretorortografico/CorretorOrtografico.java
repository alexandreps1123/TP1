package l4e3corretorortografico;

import java.util.Scanner;

public class CorretorOrtografico 
{
    
    static boolean listEqualsPesquisa(String[] palavrasInseridas, String palavraPesquisada)
    {
        for(int i = 0; i < palavrasInseridas.length; i++)
        {
            if(palavraPesquisada.equals(palavrasInseridas[i]))
                return true;
        }
        return false;
    }
    
    static String sugestaoPesquisa(String[] palavrasInseridas, String palavraPesquisada)
    {
        char[] char1 = palavraPesquisada.toCharArray();
        char aux;
        StringBuffer replace1 = new StringBuffer(palavraPesquisada);
        //String replace2;
        
        for(int i = 0; i < palavraPesquisada.length(); i++)
        {   
            for(int j = 0; j < char1.length; j++)
            {
                
                replace1.setCharAt(i, char1[char1.length- i - 1]);
                replace1.setCharAt(char1.length - i -1, char1[i]);
            
                System.out.println(replace1);
                if(replace1.equals(palavrasInseridas[j]))
                {
                    return palavrasInseridas[j];
                }
                
            }
        
        }
        
        return "not found";
    }

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numeroEntradas;
        boolean flag = false;
        
        numeroEntradas = teclado.nextInt();
        teclado.nextLine();
        
        String[] palavrasInseridas = new String[numeroEntradas];
        String palavraPesquisada = new String();
        
        for (int i = 0; i < palavrasInseridas.length; i++)
        {
            palavrasInseridas[i] = teclado.nextLine();
        }
        
        palavraPesquisada = teclado.nextLine();
        
        if (listEqualsPesquisa(palavrasInseridas, palavraPesquisada) == true)
        {
            System.out.println("palavra correta");
        }
        else if(sugestaoPesquisa(palavrasInseridas, palavraPesquisada) != "not found")
        {
            System.out.println("palavra incorreta");
            System.out.println(sugestaoPesquisa(palavrasInseridas, palavraPesquisada) + "?");
        }
        else
        {
            System.out.println("nenhuma sugestão");
        }
    
    }
}
