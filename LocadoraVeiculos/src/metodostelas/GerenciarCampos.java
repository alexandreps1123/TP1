package metodostelas;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GerenciarCampos {
 
    //textfield desabilitados cliente
    public static void camposDefault(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JTextField campo7){
        
        campo1.setEnabled(false);
        campo2.setEnabled(false);
        campo3.setEnabled(false);
        campo4.setEnabled(false);
        campo5.setEnabled(false);
        campo6.setEnabled(false);
        campo7.setEnabled(false);
    }
    
    //textfield e radiobutton desabilitados moto
    public static void camposDefault(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JRadioButton rdoBtn1, JRadioButton rdoBtn2){
        
        campo1.setEnabled(false);
        campo2.setEnabled(false);
        campo3.setEnabled(false);
        campo4.setEnabled(false);
        campo5.setEnabled(false);
        campo6.setEnabled(false);
        rdoBtn1.setEnabled(false);
        rdoBtn2.setEnabled(false);
    }
    
    //textfield e radiobutton desabilitados carro
    public static void camposDefault(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JTextField campo7, JRadioButton rdoBtn1, JRadioButton rdoBtn2){
        
        campo1.setEnabled(false);
        campo2.setEnabled(false);
        campo3.setEnabled(false);
        campo4.setEnabled(false);
        campo5.setEnabled(false);
        campo6.setEnabled(false);
        campo7.setEnabled(false);
        rdoBtn1.setEnabled(false);
        rdoBtn2.setEnabled(false);
    }
    
    //textfield e combo box desabilitados alugarmoto/alugarcarro
    public static void camposDefault(JTextField campo1, JTextField campo2,
            JComboBox cmb1, JComboBox cmb2){
        
        campo1.setEnabled(false);
        campo2.setEnabled(false);
        cmb1.setEnabled(false);
        cmb2.setEnabled(false);
        
    }
    
    //textfield e combo box desabilitados alugarmoto/alugarcarro
    public static void camposDefault(JRadioButton rdoBtn1, JRadioButton rdoBtn2,
            JRadioButton rdoBtn3, JRadioButton rdoBtn4, JComboBox cmb1){
        
        rdoBtn1.setEnabled(false);
        rdoBtn2.setEnabled(false);
        rdoBtn3.setEnabled(false);
        rdoBtn4.setEnabled(false);
        cmb1.setEnabled(false);
        
    }
    
    
    //textfield habilitados cliente
    public static void opcaoNovoEditar(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JTextField campo7){
        
        campo1.setEnabled(true);
        campo2.setEnabled(true);
        campo3.setEnabled(true);
        campo4.setEnabled(true);
        campo5.setEnabled(true);
        campo6.setEnabled(true);
        campo7.setEnabled(true);
    }
    
    //textfield e combobox habilitados alugarmoto/alugarcarro
    public static void opcaoNovoEditar(JTextField campo1, JTextField campo2,
           JComboBox cmb1, JComboBox cmb2){
        
        campo1.setEnabled(true);
        campo2.setEnabled(true);
        cmb1.setEnabled(true);
        cmb2.setEnabled(true);
        
    }
    
    //textfield e radiobutton habilitados moto
    public static void opcaoNovoEditar(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JRadioButton rdoBtn1, JRadioButton rdoBtn2){
        
        campo1.setEnabled(true);
        campo2.setEnabled(true);
        campo3.setEnabled(true);
        campo4.setEnabled(true);
        campo5.setEnabled(true);
        campo6.setEnabled(true);
        rdoBtn1.setEnabled(true);
        rdoBtn2.setEnabled(true);
        
    }
    
    //textfield e radiobutton habilitados carro
    public static void opcaoNovoEditar(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JTextField campo7, JRadioButton rdoBtn1, JRadioButton rdoBtn2){
        
        campo1.setEnabled(true);
        campo2.setEnabled(true);
        campo3.setEnabled(true);
        campo4.setEnabled(true);
        campo5.setEnabled(true);
        campo6.setEnabled(true);
        campo7.setEnabled(true);
        rdoBtn1.setEnabled(true);
        rdoBtn2.setEnabled(true);
        
    }
    
    //textfield habilitado para pesquisa cliente
    public static void opcaoPesquisar(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JTextField campo7){
        
        campo1.setEnabled(false);
        campo2.setEnabled(true);
        campo3.setEnabled(false);
        campo4.setEnabled(false);
        campo5.setEnabled(false);
        campo6.setEnabled(false);
        campo7.setEnabled(false);
    }
    
    //textfield e radiobutton habilitados para pesquisar moto
    public static void opcaoPesquisar(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JRadioButton rdoBtn1, JRadioButton rdoBtn2){
        
        campo1.setEnabled(true);
        campo2.setEnabled(false);
        campo3.setEnabled(false);
        campo4.setEnabled(false);
        campo5.setEnabled(false);
        campo6.setEnabled(false);
        rdoBtn1.setEnabled(false);
        rdoBtn2.setEnabled(false);
        
    }
    
    //textfield e radiobutton habilitados para pesquisar carro
    public static void opcaoPesquisar(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JTextField campo7, JRadioButton rdoBtn1, JRadioButton rdoBtn2){
        
        campo1.setEnabled(true);
        campo2.setEnabled(false);
        campo3.setEnabled(false);
        campo4.setEnabled(false);
        campo5.setEnabled(false);
        campo6.setEnabled(false);
        campo7.setEnabled(false);
        rdoBtn1.setEnabled(false);
        rdoBtn2.setEnabled(false);
        
    }
    
    //set textfield como vazio cliente
    public static void limparTodosCampos(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JTextField campo7){
        
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo5.setText("");
        campo6.setText("");
        campo7.setText("");
    }
    
    //set campos como vazio moto
    public static void limparTodosCampos(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JRadioButton rdoBtn1, JRadioButton rdoBtn2){
        
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo5.setText("");
        campo6.setText("");
        rdoBtn1.removeAll();
        rdoBtn2.removeAll();
    }
    
    //set campos como vazio moto
    public static void limparTodosCampos(JRadioButton rdoBtn1, JRadioButton rdoBtn2,
            JRadioButton rdoBtn3, JRadioButton rdoBtn4, JComboBox cmb1){
        
        
        rdoBtn1.removeAll();
        rdoBtn2.removeAll();
        rdoBtn3.removeAll();
        rdoBtn4.removeAll();
        cmb1.removeAllItems();
        cmb1.addItem("Selecione um aluguel cadastrado");
        
    }
    
    //set campos como vazio pagamento
    public static void limparTodosCampos(JTextField campo1, JTextField campo2,
           JTextField campo3, JTextField campo4, JTextField campo5, 
           JTextField campo6, JTextField campo7, JRadioButton rdoBtn1, JRadioButton rdoBtn2){
        
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo5.setText("");
        campo6.setText("");
        campo7.setText("");
        rdoBtn1.removeAll();
        rdoBtn2.removeAll();
    }
    
    
    //set campos como vazio alugarmoto/alugarcarro
    public static void limparTodosCampos(JTextField campo1, JTextField campo2,
           JComboBox cmb1, JComboBox cmb2){
        
        campo1.setText("");
        campo2.setText("");
        cmb1.removeAllItems();
        cmb2.removeAllItems();
        cmb1.addItem("Selecione um cliente");
        cmb2.addItem("Selecione uma moto");
        
    }
    
}
