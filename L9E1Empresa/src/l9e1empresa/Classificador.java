package l9e1empresa;

public class Classificador {

    private Classificavel[] classificavel;

    public void setClassificavel(Classificavel[] classificavel) {
        this.classificavel = classificavel;
    }
        
    public void ordenar(Classificavel[] a) {
        
        Classificavel elemento, menor;
        int pos;
        
        for(int i = 0; i < a.length - 1; i++) {
            elemento = a[i];
            menor = a[i+1];
            pos = i+1;
            
            for(int j = i + 2; j < a.length; j++) {
                if(a[j].menorElemento(menor)) {
                    menor = a[j];
                    pos = j;
                }
            }
                
            if(menor.menorElemento(elemento))   {
                a[i] = a[pos];
                a[pos] = elemento;
            }
        }
    }
}
