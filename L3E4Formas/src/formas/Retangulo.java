package formas;

public class Retangulo {
    //atributos
    private int comprimento = 1;
    private int largura = 1;

    public void setComprimento(int comprimento){
        if (comprimento > 0 && comprimento < 20)
            this.comprimento = comprimento;
    }

    public int getComprimento(){
        return comprimento;
    }
    
    public void setLargura(int largura){
        if (largura > 0 && largura < 20)
            this.largura = largura;
    }
    
    public int getLargura(){
        return largura;
    }
    
    public int perimetroRetangulo(){

        return 2 * (comprimento + largura);
    }
    
    public int areaRetangulo(){
        
        return comprimento * largura;
    }
    
    public String toString(){
        String dados = "";
        dados = dados + comprimento +
                " " + largura + 
                " " + perimetroRetangulo() +
                " " + areaRetangulo();
        
        return dados;
    }
    
}
