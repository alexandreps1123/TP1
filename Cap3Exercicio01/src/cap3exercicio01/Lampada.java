package cap3exercicio01;

public class Lampada {
    
    //Atributos
    private boolean estadoDaLampada;
    
    //Metodos
    public void acender(){
        estadoDaLampada = true;
    }
    
    public void apagar(){
        estadoDaLampada = false;
    }
    
    public void mostrarEstado(){
        if (estadoDaLampada == true){
            System.out.println("Lampada acesa.");
        }else{
            System.out.println("Lampada apagada.");
        }
    }
}
