package l3e5simulacaoimpressora;

import java.util.Scanner;

public class UsaImpressora 
{

    public static void main(String[] args) 
    {

    //instanciacao dos objetos
    Scanner teclado = new Scanner(System.in);
    Impressora impressora = new Impressora();

    //interface com o usuario
    String modelo = teclado.next();
    String cor = teclado.next();
    String tipoPapel = teclado.next();
    teclado.nextLine();

    //setters impressora
    impressora.setModelo(modelo);
    impressora.setCor(cor);
    impressora.setTipoPapel(tipoPapel);
    impressora.setBluetooth(true);
    impressora.setWifi(true);
    impressora.setColorida(true);
    impressora.setLigada(false);
    impressora.setPapel(true);
    impressora.setDigitalizadora(true);
    impressora.setCopiadora(false);

    //metodos impressora
    impressora.status();
    impressora.ligar();
    impressora.digitalizar();
    impressora.copiar();
    impressora.desligar();
    impressora.imprimir();
    }
}
