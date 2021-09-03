package l2e5operacoesdevenda;

import java.util.Scanner;

public class OperacoesDeVenda   {
    
    public static void main(String[] args)  {
        
        Scanner teclado = new Scanner(System.in);
        
        int produtosACadastrar = teclado.nextInt();
        teclado.nextLine();
        
        int x = 0;
        String[] nomeCadastrado = new String[produtosACadastrar];
        String[] quantidadeCadastrado = new String[produtosACadastrar];
        String[] pesquisaProduto = new String[100];
        String[] nomePesquisado = new String[100];
        String[] quantidadePesquisado = new String[100];
        
        //Primeira parte da entrada de dados
        for (int i = 0; i < produtosACadastrar; i++)    {
            nomeCadastrado[i] = teclado.next();
            quantidadeCadastrado[i] = teclado.next();
            teclado.nextLine();
        }
        
        //Segunda parte da entrada de dados
        for (int i = 0; i < pesquisaProduto.length; i++)    {
            
            String pesquisa = teclado.nextLine();
            
            if (pesquisa.equals("fim")) {
                break;
            }
            else    {
                pesquisaProduto[i] = pesquisa;
            }
        }
        
        //Tratamento da segunda parte da entrada de dados
        for(int i=0; i < pesquisaProduto.length; i++)   {
            if(pesquisaProduto[i] != null)  {
                try {
                    int testeInput = Integer.parseInt(pesquisaProduto[i+1]);
                    nomePesquisado[x] = pesquisaProduto[i];
                    quantidadePesquisado[x] = pesquisaProduto[i+1];
                    x++;
                    i++;
                }
                catch(NumberFormatException err)    {
                    nomePesquisado[x] = pesquisaProduto[i];
                    x++;
                }
            }
            else{
                break;
            }
        }
        
        
        //Exibindo tratamento da segunda parte da entrada de dados
        for(int i=0; i < nomePesquisado.length; i++)    {
            
            boolean flag = false;
            
            if(nomePesquisado[i] != null)   {
                for(int j=0; j < nomeCadastrado.length; j++)    {
                    if(nomeCadastrado[j].equals(nomePesquisado[i])) {
                        flag = true;
                    }
                }
                
                if (flag == true)   {
                    System.out.printf("%s %s\n",nomePesquisado[i], quantidadePesquisado[i]);
                }
                else if (flag == false){
                    System.out.printf("%s produto não encontrado\n", nomePesquisado[i]);
                }  
            }
            else    {
                break;
            }
        }
        
        //imprimindo restante dos produtos
        for(int i=0; i < nomeCadastrado.length; i++)    {
            
            boolean flag = false;
            
            for(int j=0; j < nomePesquisado.length; j++)    {
                if(nomePesquisado[j] == null)   {
                    break;
                }
                else if(nomePesquisado[j].equals(nomeCadastrado[i]) && 
                        nomePesquisado[j] != null && 
                        quantidadePesquisado[j] != null)
                {    
                    flag = true;
                    int a = Integer.parseInt(quantidadeCadastrado[i]);
                    int b = Integer.parseInt(quantidadePesquisado[j]);
                    int quantidadeRestante = a - b;
                    System.out.printf("%s %d\n",nomeCadastrado[i], quantidadeRestante);
                    break;
                }
            }
            
            if (flag == false)
                System.out.printf("%s %s\n",nomeCadastrado[i], quantidadeCadastrado[i]);

        }        
    }
    
}