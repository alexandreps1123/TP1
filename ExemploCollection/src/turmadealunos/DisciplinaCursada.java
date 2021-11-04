package turmadealunos;

public class DisciplinaCursada {
    
    private CodigoDisciplina codigo;
    private float notaFinal;

    public DisciplinaCursada(CodigoDisciplina codigo, float notaFinal) {
        this.codigo = codigo;
        this.notaFinal = notaFinal;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + ", nota final: " + notaFinal + "\n";
    }
    
    
}
