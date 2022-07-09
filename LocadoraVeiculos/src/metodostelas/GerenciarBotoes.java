package metodostelas;

import java.util.Map;
import javax.swing.JButton;

public class GerenciarBotoes {
    //atributos
    private JButton novo;
    private JButton salvar;
    private JButton editar;
    private JButton pesquisar;
    private JButton excluir;
    private JButton cancelar;
    private JButton ok;

    public GerenciarBotoes(JButton novo, JButton salvar, JButton editar, 
                            JButton pesquisar, JButton excluir, 
                            JButton cancelar, JButton ok) {
        this.novo = novo;
        this.salvar = salvar;
        this.editar = editar;
        this.pesquisar = pesquisar;
        this.excluir = excluir;
        this.cancelar = cancelar;
        this.ok = ok;
    }
    
    //botoes habilitados ou desabilitados ao inciar
    public void iniciarTela() {        
        if (this.novo != null) {
            this.novo.setEnabled(true);
        }
        
        if (this.salvar != null) {
            this.salvar.setEnabled(false);
        }
        
        if (this.editar != null) {
            this.editar.setEnabled(false);
        }
        
        if (this.pesquisar != null) {
            this.pesquisar.setEnabled(true);
        }
        
        if (this.excluir != null) {
            this.excluir.setEnabled(false);
        }
        
        if (this.cancelar != null) {
            this.cancelar.setEnabled(false);
        }
        
        if (this.ok != null) {
            this.ok.setEnabled(false);
        }
    }
    
    //botoes habilitados ou desabilitados ao inciar
    public static void iniciarTela(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton pesquisar, 
           JButton excluir, JButton ok){
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        editar.setEnabled(false);
        cancelar.setEnabled(false);
        pesquisar.setEnabled(true);
        excluir.setEnabled(false);
        ok.setEnabled(false);
    }
    
    //botoes habilitados ou desabilitados ao inciar alugar moto/carro
    public static void iniciarTela(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton excluir){
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        editar.setEnabled(false);
        cancelar.setEnabled(false);
        excluir.setEnabled(false);
        
    }
    
    //botoes habilitados ou desabilitados ao inciar alugar pagamento
    public static void iniciarTela(JButton novo, JButton salvar,
           JButton cancelar, JButton excluir){
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        cancelar.setEnabled(false);
        excluir.setEnabled(false);
        
    }
    
    //botoes habilitados ou desabilitados quando clicar no botao 'novo'
    public static void botaoNovoEditar(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton pesquisar, 
           JButton excluir, JButton ok){
        
        novo.setEnabled(false);
        salvar.setEnabled(true);
        editar.setEnabled(false);
        cancelar.setEnabled(true);
        pesquisar.setEnabled(false);
        excluir.setEnabled(false);
        ok.setEnabled(false);
    }
    
    //botoes habilitados ou desabilitados quando clicar no botao 'novo' alugar moto/carro
    public static void botaoNovoEditar(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton excluir){
        
        novo.setEnabled(false);
        salvar.setEnabled(true);
        editar.setEnabled(false);
        cancelar.setEnabled(true);
        excluir.setEnabled(false);
        
    }
    
    //botoes habilitados ou desabilitados quando clicar no botao 'novo' pagamento
    public static void botaoNovo(JButton novo, JButton salvar,
           JButton cancelar, JButton excluir){
        
        novo.setEnabled(false);
        salvar.setEnabled(true);
        cancelar.setEnabled(true);   
        excluir.setEnabled(false);
     
    }
    
    //botoes habilitados ou desabilitados quando clicar no botao 'pesquisar' em cliente
    public static void botaoPesquisar(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton pesquisar, 
           JButton excluir, JButton ok){
        
        novo.setEnabled(false);
        salvar.setEnabled(false);
        editar.setEnabled(false);
        cancelar.setEnabled(true);
        pesquisar.setEnabled(false);
        excluir.setEnabled(false);
        ok.setEnabled(true);
    }
    
    //botoes habilitados ou desabilitados quando clicar no botao 'cancelar' em cliente
    public static void botaoCancelar(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton pesquisar, 
           JButton excluir, JButton ok){
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        editar.setEnabled(false);
        cancelar.setEnabled(false);
        pesquisar.setEnabled(true);
        excluir.setEnabled(false);
        ok.setEnabled(false);
    }
    
        //botoes habilitados ou desabilitados quando clicar no botao 'cancelar' alugar moto/carrp
    public static void botaoCancelar(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton excluir){
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        editar.setEnabled(false);
        cancelar.setEnabled(false);
        excluir.setEnabled(false);

    }
    
    //botoes habilitados ou desabilitados quando clicar no botao 'cancelar' alugar moto/carrp
    public static void botaoCancelar(JButton novo, JButton salvar,
            JButton cancelar, JButton excluir){
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        cancelar.setEnabled(false);
        excluir.setEnabled(false);

    }
    
    //botoes habilitados ou desabilitados quando clicar em algum item da tabela cliente
    public static void itemTabela(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton pesquisar, 
           JButton excluir, JButton ok){
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        editar.setEnabled(true);
        cancelar.setEnabled(true);
        pesquisar.setEnabled(true);
        excluir.setEnabled(true);
        ok.setEnabled(false);
        
    }
    
    //botoes habilitados ou desabilitados quando clicar em algum item da tabela alugar moto/carro
    public static void itemTabela(JButton novo, JButton salvar,
           JButton editar, JButton cancelar, JButton excluir){
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        editar.setEnabled(true);
        cancelar.setEnabled(true);
        excluir.setEnabled(true);
        
    }
    
}
