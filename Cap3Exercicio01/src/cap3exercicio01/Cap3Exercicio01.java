/*
 * Exemplo do uso de classe
 * Modelor o gerenciamento de uma lampada
 */
package cap3exercicio01;

/**
 *
 * @author alexandre
 */
public class Cap3Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampada lampada1 = new Lampada();
        lampada1.acender();
        
        Lampada lampada2 = new Lampada();
        lampada2.apagar();
        
        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
        
    }
    
}
