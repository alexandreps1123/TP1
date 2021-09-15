package l4e1manipulandofrases;

public class Frase 
{
    private String frase;
    
    public Frase(String frase)
    {
        this.frase = frase;
    }
    
    public void setFrase(String frase)
    {
        this.frase = frase;
    }
    
    public String getFrase()
    {
        return frase;
    }
    
    public int contarVogais()
    {
        int quatindadeVogais = 0;
        frase.trim().toLowerCase();
        char[] char1 = frase.toCharArray();
        
        for (int i = 0; i < frase.length(); i++)
        {
            if(char1[i] == 'a' || char1[i] == 'à' || char1[i] == 'á' || char1[i] == 'â' || char1[i] == 'ã' ||
                    char1[i] == 'e' || char1[i] == 'è' || char1[i] == 'é' || char1[i] == 'ê' || char1[i] == 'ẽ' ||
                    char1[i] == 'i' || char1[i] == 'ì' || char1[i] == 'í' || char1[i] == 'î' || char1[i] == 'ĩ' ||
                    char1[i] == 'o' || char1[i] == 'ò' || char1[i] == 'ó' || char1[i] == 'ô' || char1[i] == 'õ' ||
                    char1[i] == 'u' || char1[i] == 'ù' || char1[i] == 'ú' || char1[i] == 'û' || char1[i] == 'ũ')
            {
                quatindadeVogais++;
            }
        }
        
        return quatindadeVogais;
    }
    
    public int contarPalavras()
    {
        int quantidadePalavras = 0;

        frase.trim();
        String[] palavras = frase.split(" ");
        
        for (int i = 0; i < palavras.length; i++)
        {
            quantidadePalavras++;
        }
        
        return quantidadePalavras;
    }
}
