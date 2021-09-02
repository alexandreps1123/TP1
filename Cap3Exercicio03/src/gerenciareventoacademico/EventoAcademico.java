package gerenciareventoacademico;

import datasimples.DataSimples;

public class EventoAcademico {
    //Atributos
    private String nomeDoEvento;
    private String localDoEvento;
    private DataSimples inicioDoEvento;
    private DataSimples fimDoEvento;
    public int numeroDeParticipantes;
    
    //Construtor
    public EventoAcademico(String nomeDoEvento, 
                                    String localDoEvento, 
                                    DataSimples inicioDoEvento, 
                                    DataSimples fimDoEvento, 
                                    int numeroDeParticipantes){
        
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.inicioDoEvento = new DataSimples(inicioDoEvento.getDia(),
                                                inicioDoEvento.getMes(),
                                                inicioDoEvento.getAno());
        
        this.fimDoEvento = new DataSimples(fimDoEvento.getDia(),
                                            fimDoEvento.getMes(),
                                            fimDoEvento.getAno());
        
        this.numeroDeParticipantes = numeroDeParticipantes;
    }
    
    public String getNomeDoEvento(){
        return nomeDoEvento;
    }
    
    public String getLocalDoEvento(){
        return localDoEvento;
    }
    
    public int getNumeroDeParticipantes(){
        return numeroDeParticipantes;
    }
    
    public void setNumeroDeParticipantes(int numeroDeParticipantes){
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public String toString(){
        String dados = "";
        
        dados = dados + "Evento: " + nomeDoEvento + "\n";
        dados = dados + "Local: " + localDoEvento + "\n";
        dados = dados + "Inicio do Evento: " + inicioDoEvento + "\n";
        dados = dados + "Fim do Evento: " + fimDoEvento + "\n";
        dados = dados + "Numero de Participantes: " + numeroDeParticipantes + "\n";
        
        return dados;
    }
}
