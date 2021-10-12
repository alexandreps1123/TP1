package l7e2empresa;

public class Horista extends Funcionario {
    
    //atributos
    private float valorHora;
    private int totalHoras;
    
    //contrutores

    public Horista() {
    }

    public Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras) {
        
        super(nome, dataNascimento, salario + valorHora * totalHoras);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }
    
    //metodos especiais

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = super.toString();
        resultado = resultado + "Cargo: horista\n";
        resultado = resultado + "Valor por Hora: R$" + valorHora + "\n";
        resultado = resultado + "Total de horas: " + totalHoras;
        return resultado;
    }
    
}
