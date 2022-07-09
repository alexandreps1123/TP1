package exemplopolimorfismo;

public class ExemploPolimorfismo {

    public static void main(String[] args) {
        
        //Polimorfismo -> muitas formas
        
        //Sobreposição ou sobrescrita (Overriding) -> mesma assinatura
        
        //Sobrecarga (Overloading) -> assinaturas diferentes
        
        //Assinatura: nome do método + quant parametros + tipo parametro
        //mesma assinatura
        //public void soma(int a, int b)
        //public int soma(int x, int y)
        
        //assinatura diferente
        //public void soma(int a, int b)
        //public void soma(float a, int b)
        
        //em uma mesma classe só pode existir um uníco método com a mesma assinatura
        //métodos com assinaturas iguais podem coexistir
    }
    
    //métodos com assinaturas diferentes
    public void soma(int a, int b){
        
    }
    
    public void soma(float a, int b) {
        
    }
    
    public void soma(int a, float b){
        
    }
    
}
