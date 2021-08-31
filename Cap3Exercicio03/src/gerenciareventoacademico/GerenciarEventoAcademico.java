/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciareventoacademico;

import datasimples.DataSimples;

/**
 *
 * @author alexandre
 */
public class GerenciarEventoAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DataSimples data1 = new DataSimples((byte)10, (byte)2, (short)2020);
        DataSimples data2 = new DataSimples((byte)19, (byte)2, (short)2020);
        
        EventoAcademico semanaUniversitaria = new EventoAcademico("Semana Universitaria", "UnB", data1, data2, 10000);
        
        System.out.println(semanaUniversitaria);
        
    }
    
}
