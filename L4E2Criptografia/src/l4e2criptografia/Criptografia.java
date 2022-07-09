package l4e2criptografia;

public class Criptografia 
{
    private String frase;
    
    public Criptografia()
    {
        
    }
    
    public void setFrase(String frase)
    {
        this.frase = frase;
    }
    
    public String getFrase()
    {
        return frase;
    }
    
    public String criptografarFrase()
    {
        StringBuffer fraseCriptografada = new StringBuffer();
        frase.trim();
        
        char[] char1 = frase.toCharArray();
        
        for (int i = 0; i < frase.length(); i++)
        {
            if(char1[i] == 'a' || char1[i] == 'à' || char1[i] == 'á' || char1[i] == 'â' || char1[i] == 'ã' ||
                    char1[i] == 'e' || char1[i] == 'è' || char1[i] == 'é' || char1[i] == 'ê' || char1[i] == 'ẽ' ||
                    char1[i] == 'i' || char1[i] == 'ì' || char1[i] == 'í' || char1[i] == 'î' || char1[i] == 'ĩ' ||
                    char1[i] == 'o' || char1[i] == 'ò' || char1[i] == 'ó' || char1[i] == 'ô' || char1[i] == 'õ' ||
                    char1[i] == 'u' || char1[i] == 'ù' || char1[i] == 'ú' || char1[i] == 'û' || char1[i] == 'ũ' ||
                    char1[i] == 'A' || char1[i] == 'À' || char1[i] == 'Á' || char1[i] == 'Â' || char1[i] == 'Ã' ||
                    char1[i] == 'E' || char1[i] == 'È' || char1[i] == 'É' || char1[i] == 'Ê' || char1[i] == 'Ẽ' ||
                    char1[i] == 'I' || char1[i] == 'Ì' || char1[i] == 'Í' || char1[i] == 'Î' || char1[i] == 'Ĩ' ||
                    char1[i] == 'O' || char1[i] == 'Ò' || char1[i] == 'Ó' || char1[i] == 'Ô' || char1[i] == 'Õ' ||
                    char1[i] == 'U' || char1[i] == 'Ù' || char1[i] == 'Ú' || char1[i] == 'Û' || char1[i] == 'Ũ')
            {
                fraseCriptografada.append("*");
            }
            else
                fraseCriptografada.append(char1[i]);
        }
        
        return fraseCriptografada.toString();
    }
}
