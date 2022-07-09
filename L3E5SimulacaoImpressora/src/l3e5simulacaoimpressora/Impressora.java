package l3e5simulacaoimpressora;

public class Impressora {
    //Atributos
    private String modelo;
    private String cor;
    private String tipoPapel;
    private boolean bluetooth;
    private boolean wifi;
    private boolean colorida;
    private boolean ligada;
    private boolean papel;
    private boolean digitalizadora;
    private boolean copiadora;
    
    // construtor
    public Impressora() {
        
    }
    
    //Metodos
    //set modelo
    public void setModelo(String modelo)    {
        this.modelo = modelo;
    }
    
    //get modelo
    public String getModelo() {
        return modelo;
    }
    
    //set cor
    public void setCor(String cor)  {
        this.cor = cor;
    }
    
    //get cor
    public String getCor()    {
        return cor;
    }
    
    //set tipoPapel
    public void setTipoPapel(String tipoPapel)  {
        this.tipoPapel = tipoPapel;
    }
    
    //get tipoPapel
    public String getTipoPapel()  {
        return tipoPapel;
    }
    
    //set bluetooth
    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    
    //get bluetooth
    public boolean getBluetooth()   {
        return bluetooth;
    }
    
    //set wifi
    public void setWifi(boolean wifi)   {
        this.wifi = wifi;
    }
    
    //get wifi
    public boolean getWifi()    {
        return wifi;
    }
    
    //set colorida
    public void setColorida(boolean colorida)   {
        this.colorida = colorida;
    }
    
    //get colorida
    public boolean getColorida()    {
        return colorida;
    }
    
    //set ligada
    public void setLigada(boolean ligada)   {
        this.ligada = ligada;
    }
    
    //get ligada
    public boolean getLigada()  {
        return ligada;
    }
    
    //set papel
    public void setPapel(boolean papel)   {
        this.papel = papel;
    }
    
    //get papel
    public boolean getPapel() {
        return papel;
    }
    
    //set digitalizadora
    public void setDigitalizadora(boolean digitalizadora)   {
        this.digitalizadora = digitalizadora;
    }
    
    //get digitalizadora
    public boolean getDigitalizadora()  {
        return digitalizadora;
    }
    
    //set copiadora
    public void setCopiadora(boolean copiadora)   {
        this.copiadora = copiadora;
    }
    
    //get copiadora
    public boolean getCopiadora()  {
        return copiadora;
    }
    
    //metodo ligar
    public void ligar() {
        if(ligada == false) {
            System.out.println("ligando...");
            ligada = true;
        }
    }
    
    //metodo desligar
    public void desligar()  {
        if(ligada == true)  {
            System.out.println("desligando...");
            ligada = false;
        }
    }
    
    //metodo imprimir
    public void imprimir()  {
        if (ligada == true && papel == true)    {
            System.out.println("imprimindo...");
        }
        else if (ligada == true && papel == false)  {
            System.out.println("sem papel");
        }
        else    {
            System.out.println("impressora desligada");
        }
    }
    
    //metodo digitalizar
    public void digitalizar()   {
        if (ligada == true && digitalizadora == true)   {
            System.out.println("digitalização sendo realizada...");
        }
        else if (ligada == true && digitalizadora == false) {
            System.out.println("não é possível digitalizar");
        }
        else    {
            System.out.println("impressora desligada");
        }
    }
    
    //metodo copiar
    public void copiar()    {
        if (ligada == true && copiadora == true)    {
            System.out.println("cópia sendo realizada...");
        }
        else if (ligada == true && copiadora == false)  {
            System.out.println("não é possível copiar");
        }
        else    {
            System.out.println("impressora desligada");
        }
    }
    
    //metodo status
    public void status()    {
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(tipoPapel);

        if (bluetooth == true)   {
            System.out.println("bluetooth on");
        }
        else    {
            System.out.println("bluetooth off");
        }
        
        if (wifi == true)   {
            System.out.println("wifi on");
        }
        else    {
            System.out.println("wifi off");
        }
        
        if (colorida == true)   {
            System.out.println("impressão colorida");
        }
        else    {
            System.out.println("impressão preto e branco");
        }
        
        if (ligada == true)   {
            System.out.println("impressora on");
        }
        else    {
            System.out.println("impressora off");
        }        

        if (papel == true)   {
            System.out.println("tem papel");
        }
        else    {
            System.out.println("não tem papel");
        }
        
        if (digitalizadora == true)   {
            System.out.println("digitalizadora on");
        }
        else    {
            System.out.println("digitalizadora off");
        }
        
        if (copiadora == true)   {
            System.out.println("copiadora on");
        }
        else    {
            System.out.println("copiadora off");
        }

    }
}
