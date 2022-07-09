package l3e2circulo;

public class Circulo implements Cloneable   {
    private int x, y, raio;
    public static final double PI = 3.14159;
    
    public Circulo(int x, int y, int raio)  {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    
    public int getX()   {
        return x;
    }
    
    public int getY()   {
        return y;
    }
    
    public int getRaio()    {
        return raio;
    }
    
    public void setRaio(int raio)   {
        this.raio = raio;
    }
    
    public double circunferencia()  {
        return 2 * PI * raio;
    }
    
    //shallow copy
    @Override
    public Object clone() throws 
            CloneNotSupportedException
    {
        return super.clone();
    }
    
    @Override
    public String toString()   {
        return x + " " + 
                y + " " + 
                raio;
    }
    
}