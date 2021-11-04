package turmadealunos;

import java.util.*;

public class AlunoDeGraduacao {
    
    private String nome;
    private int idade;
    private float mediaDeNotas;
    private Set<DisciplinaCursada> disciplinasCursadas;

    public AlunoDeGraduacao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        mediaDeNotas = 0;
        disciplinasCursadas = new HashSet<DisciplinaCursada>();
    }

    public float getMediaDeNotas() {
        return mediaDeNotas;
    }

    public String getNome() {
        return nome;
    }
    
    public void lancarNotas(DisciplinaCursada disciplina) {
        
        this.disciplinasCursadas.add(disciplina);
        int totalDeDisciplinas = 0;
        float totalDeNotas = 0;
        for (DisciplinaCursada dic : this.disciplinasCursadas) {
            totalDeNotas += dic.getNotaFinal();
            totalDeDisciplinas++;
        }
        this.mediaDeNotas = totalDeNotas/totalDeDisciplinas;
    }

    @Override
    public String toString() {
        return "nome: " + nome + " - qtde. disciplinas: " + disciplinasCursadas.size() + " - media: " + mediaDeNotas + "\n";
    }
    
}
