package turmadealunos;

import java.util.*;

public class TurmaDeAlunos {

    public static void main(String args[]) {
        
        List<AlunoDeGraduacao> turma = new LinkedList<>();
        
        
        AlunoDeGraduacao aluno1 = new AlunoDeGraduacao("Ana", 21);
        aluno1.lancarNotas(new DisciplinaCursada(CodigoDisciplina.FISICA, 8.5f));
        aluno1.lancarNotas(new DisciplinaCursada(CodigoDisciplina.MATEMATICA, 9.5f));
        
        AlunoDeGraduacao aluno2 = new AlunoDeGraduacao("Jessica", 31);
        aluno2.lancarNotas(new DisciplinaCursada(CodigoDisciplina.BIOLOGIA, 8.5f));
        
        AlunoDeGraduacao aluno3 = new AlunoDeGraduacao("Fernanda", 26);
        aluno3.lancarNotas(new DisciplinaCursada(CodigoDisciplina.QUIMICA, 8.5f));
        
        AlunoDeGraduacao aluno4 = new AlunoDeGraduacao("Carol", 28);
        aluno4.lancarNotas(new DisciplinaCursada(CodigoDisciplina.FILOSOFIA, 8.5f));
        aluno4.lancarNotas(new DisciplinaCursada(CodigoDisciplina.FISICA, 8.5f));
        aluno4.lancarNotas(new DisciplinaCursada(CodigoDisciplina.QUIMICA, 8.5f));
        
        turma.add(aluno1);
        turma.add(aluno2);
        turma.add(aluno3);
        turma.add(aluno4);
        
        Collections.sort(turma, new CompararPorNomeCrescente());
        System.out.println(turma);
        
        Collections.sort(turma, new CompararPorNotaDecrescente());
        System.out.println(turma);
        
    }
}
