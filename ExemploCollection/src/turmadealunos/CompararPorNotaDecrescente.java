package turmadealunos;

import java.util.Comparator;

public class CompararPorNotaDecrescente implements Comparator<AlunoDeGraduacao> {

    @Override
    public int compare(AlunoDeGraduacao a1, AlunoDeGraduacao a2) {
        
        Float nota1 = a1.getMediaDeNotas();
        Float nota2 = a2.getMediaDeNotas();
        
        return -nota1.compareTo(nota2);
    }
    
}
