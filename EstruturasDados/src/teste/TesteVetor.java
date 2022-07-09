package teste;

import vetor.Array;

public class TesteVetor {
    public static void main(String[] args) {

        Array vetor = new Array(2);

        try {
            vetor.adiciona("primero");
            vetor.adiciona("segundo");
            //vetor.adiciona("terceiro");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor);
        System.out.println(vetor.tamanho());
        System.out.println(vetor.busca(0));
    }
}
