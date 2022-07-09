package turmadealunos;

import java.util.Comparator;

public class CompararPorNomeCrescente implements Comparator<AlunoDeGraduacao>{

    @Override
    public int compare(AlunoDeGraduacao a1, AlunoDeGraduacao a2) {
        
        return a1.getNome().compareTo(a2.getNome());
        
    }
    
}
