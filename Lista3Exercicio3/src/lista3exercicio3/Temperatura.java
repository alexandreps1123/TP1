package lista3exercicio3;

public class Temperatura 
{
    //atributo
    private double temperatura;
    
    //metodo construtor
    public Temperatura(double temperatura)
    {
        this.temperatura = temperatura;
    }
    
    public void converterCelsius2Fahrenheit(double temperatura){
        if (temperatura != this.temperatura)
            this.temperatura = temperatura;
        else
            this.temperatura = temperatura * 9.0 / 5.0 + 32;
    }
    
    public void converterFahrenheit2Celsius(double temperatura){
        if (temperatura != this.temperatura)
            this.temperatura = temperatura;
        else
            this.temperatura = (temperatura - 32.0) * 5.0 / 9.0;
    }
    
    @Override
    public String toString(){
       String temperatura = "";
       temperatura = temperatura + this.temperatura;
       return temperatura; 
    }
    
}
