/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import locadoraveiculo.Funcionario;
import metodostelas.CarregarTabela;
import metodostelas.GerenciarBotoes;
import metodostelas.GerenciarCampos;

/**
 *
 * @author alexandre
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    //variavel para indicar editar ou novo quando for salvar
    String botao;
    
    //array de funcionario
    static ArrayList<Funcionario> listaFuncionarios;
    
    /**
     * Creates new form CriarNovaConta
     */
    public CadastroFuncionario() {
        initComponents();
        
        //criar lista
        listaFuncionarios = new ArrayList();

        //Maximizar a tela
        this.setExtendedState(MAXIMIZED_BOTH);

        //desabilitar campos de texto
        GerenciarCampos.camposDefault(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
        //desabilitar e habilitar botoes
        GerenciarBotoes.iniciarTela(btnNovoFuncionario, btnSalvarFuncionario, btnEditarFuncionario, 
                btnCancelarFuncionario, btnPesquisarFuncionario, btnExcluirFuncionario, btnOkFuncionario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpStatusFuncionario = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNomeFuncionario = new javax.swing.JLabel();
        lblCpfFuncionario = new javax.swing.JLabel();
        lblDataNascimentoFuncionario = new javax.swing.JLabel();
        lblEmailFuncionario = new javax.swing.JLabel();
        lblTelefoneFuncionario = new javax.swing.JLabel();
        lblLoginFuncionario = new javax.swing.JLabel();
        lblSenhaFuncionario = new javax.swing.JLabel();
        lblStatusFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtCpfFuncionario = new javax.swing.JTextField();
        txtDataNascimentoFuncionario = new javax.swing.JTextField();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtTelefoneFuncionario = new javax.swing.JTextField();
        txtLoginFuncionario = new javax.swing.JTextField();
        rdoBtnAtivo = new javax.swing.JRadioButton();
        rdoBtnInativo = new javax.swing.JRadioButton();
        btnOkFuncionario = new javax.swing.JButton();
        txtPwrdSenhaFuncionario = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarioLista = new javax.swing.JTable();
        btnSalvarFuncionario = new javax.swing.JButton();
        btnNovoFuncionario = new javax.swing.JButton();
        btnEditarFuncionario = new javax.swing.JButton();
        btnCancelarFuncionario = new javax.swing.JButton();
        btnPesquisarFuncionario = new javax.swing.JButton();
        btnExcluirFuncionario = new javax.swing.JButton();
        btnVoltarFromFuncionario2Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Funcionário"));

        lblNomeFuncionario.setText("Nome");

        lblCpfFuncionario.setText("CPF");

        lblDataNascimentoFuncionario.setText("Data de Nascimento");

        lblEmailFuncionario.setText("Email");

        lblTelefoneFuncionario.setText("Telefone");

        lblLoginFuncionario.setText("Login");

        lblSenhaFuncionario.setText("Senha");

        lblStatusFuncionario.setText("Status");

        btnGrpStatusFuncionario.add(rdoBtnAtivo);
        rdoBtnAtivo.setSelected(true);
        rdoBtnAtivo.setText("Ativo");

        btnGrpStatusFuncionario.add(rdoBtnInativo);
        rdoBtnInativo.setText("Inativo");

        btnOkFuncionario.setText("OK");
        btnOkFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataNascimentoFuncionario)
                    .addComponent(lblEmailFuncionario)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(lblCpfFuncionario)
                    .addComponent(lblSenhaFuncionario)
                    .addComponent(lblTelefoneFuncionario)
                    .addComponent(lblLoginFuncionario)
                    .addComponent(lblStatusFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoBtnAtivo)
                        .addGap(105, 105, 105)
                        .addComponent(rdoBtnInativo)
                        .addGap(173, 282, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoginFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefoneFuncionario)
                            .addComponent(txtNomeFuncionario)
                            .addComponent(txtEmailFuncionario)
                            .addComponent(txtDataNascimentoFuncionario)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOkFuncionario))
                                    .addComponent(txtPwrdSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfFuncionario)
                    .addComponent(btnOkFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimentoFuncionario)
                    .addComponent(txtDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailFuncionario)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneFuncionario)
                    .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginFuncionario)
                    .addComponent(txtLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaFuncionario)
                    .addComponent(txtPwrdSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStatusFuncionario)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoBtnAtivo)
                        .addComponent(rdoBtnInativo))))
        );

        tblFuncionarioLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Email", "Telefone", "Login", "Senha", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuncionarioLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionarioListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionarioLista);

        btnSalvarFuncionario.setText("Salvar");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });

        btnNovoFuncionario.setText("Novo");
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        btnEditarFuncionario.setText("Editar");
        btnEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarFuncionario.setText("Cancelar");
        btnCancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFuncionarioActionPerformed(evt);
            }
        });

        btnPesquisarFuncionario.setText("Pesquisar");
        btnPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFuncionarioActionPerformed(evt);
            }
        });

        btnExcluirFuncionario.setText("Excluir");
        btnExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncionarioActionPerformed(evt);
            }
        });

        btnVoltarFromFuncionario2Menu.setText("Voltar");
        btnVoltarFromFuncionario2Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarFromFuncionario2MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisarFuncionario)
                .addGap(24, 24, 24)
                .addComponent(btnExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarFromFuncionario2Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoFuncionario)
                    .addComponent(btnExcluirFuncionario)
                    .addComponent(btnPesquisarFuncionario)
                    .addComponent(btnSalvarFuncionario)
                    .addComponent(btnEditarFuncionario)
                    .addComponent(btnCancelarFuncionario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarFromFuncionario2Menu)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarFromFuncionario2MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarFromFuncionario2MenuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarFromFuncionario2MenuActionPerformed

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
        
        botao = "novo";
        
        //desabilitar ou habilitar campos de texto
        GerenciarCampos.opcaoNovoEditar(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
        //desabilitar e habilitar botoes
        GerenciarBotoes.botaoNovoEditar(btnNovoFuncionario, btnSalvarFuncionario, btnEditarFuncionario, 
                btnCancelarFuncionario, btnPesquisarFuncionario, btnExcluirFuncionario, btnOkFuncionario);
        
        //limpar os campos
        GerenciarCampos.limparTodosCampos(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
        txtNomeFuncionario.requestFocus();
        
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed

        if(txtNomeFuncionario.getText().equals("") ||
                txtCpfFuncionario.getText().equals("") || txtDataNascimentoFuncionario.getText().equals("") ||
                txtEmailFuncionario.getText().equals("") || txtTelefoneFuncionario.getText().equals("") ||
                txtLoginFuncionario.getText().equals("") || txtPwrdSenhaFuncionario.getPassword().equals("") ||
                (rdoBtnAtivo.isSelected() == false && rdoBtnInativo.isSelected() == false))   {
                
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Messagem", JOptionPane.PLAIN_MESSAGE);
            
            txtNomeFuncionario.requestFocus();
            
        } else {
            
            if (botao.equals("novo"))   {
                    
            boolean estaDisponivel = true;
            if (rdoBtnAtivo.isSelected())  {
                estaDisponivel = true;
            } else  if (rdoBtnInativo.isSelected())    {
                estaDisponivel = false;
            } else {
                JOptionPane.showMessageDialog(null, "É preciso selecionar a disponibilidade", "Messagem", JOptionPane.PLAIN_MESSAGE);
            }
            
            
            //cadastrar funcionario
            listaFuncionarios.add(Funcionario.cadastrarFuncionario(txtNomeFuncionario.getText(),
                                    txtCpfFuncionario.getText(), txtDataNascimentoFuncionario.getText(), 
                                    txtEmailFuncionario.getText(), txtTelefoneFuncionario.getText(), 
                                    txtLoginFuncionario.getText(), String.valueOf(txtPwrdSenhaFuncionario.getPassword()),
                                    estaDisponivel));
            
            JOptionPane.showMessageDialog(null, "Funcionário cadastrada com sucesso!", "Messagem", JOptionPane.INFORMATION_MESSAGE);
            
            } else if (botao.equals("editar"))  {
                
                int index = tblFuncionarioLista.getSelectedRow();
                
                boolean estaDisponivel = true;
                if (rdoBtnAtivo.isSelected())  {
                    estaDisponivel = true;
                } else  if (rdoBtnInativo.isSelected())    {
                    estaDisponivel = false;
                } else {
                    JOptionPane.showMessageDialog(null, "É preciso selecionar a disponibilidade", "Messagem", JOptionPane.PLAIN_MESSAGE);
                }
                
                //editar funcionario
                Funcionario.editarFuncionario(listaFuncionarios.get(index), txtNomeFuncionario.getText(),
                                    txtCpfFuncionario.getText(), txtDataNascimentoFuncionario.getText(), 
                                    txtEmailFuncionario.getText(), txtTelefoneFuncionario.getText(), 
                                    txtLoginFuncionario.getText(), String.valueOf(txtPwrdSenhaFuncionario.getPassword()),
                                    estaDisponivel);
                
                JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!", "Messagem", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            
            //carregar os dados na tabela de clientes
            CarregarTabela.tabelaFuncionarioLista(tblFuncionarioLista, listaFuncionarios);
            
            //limpar os campos
            GerenciarCampos.limparTodosCampos(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
            
            txtNomeFuncionario.requestFocus();
            
        }
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void btnEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFuncionarioActionPerformed

        botao = "editar";
        
        //desabilitar ou habilitar campos de texto
        GerenciarCampos.opcaoNovoEditar(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
        //desabilitar e habilitar botoes
        GerenciarBotoes.botaoNovoEditar(btnNovoFuncionario, btnSalvarFuncionario, btnEditarFuncionario, 
                btnCancelarFuncionario, btnPesquisarFuncionario, btnExcluirFuncionario, btnOkFuncionario);
        
        txtNomeFuncionario.requestFocus();
        
    }//GEN-LAST:event_btnEditarFuncionarioActionPerformed

    private void btnCancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFuncionarioActionPerformed

        //desabilitar campos de texto
        GerenciarCampos.camposDefault(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
        //desabilitar ou habilitar campos de texto
        GerenciarCampos.limparTodosCampos(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
        //desabilitar e habilitar botoes
        GerenciarBotoes.botaoCancelar(btnNovoFuncionario, btnSalvarFuncionario, btnEditarFuncionario, 
                btnCancelarFuncionario, btnPesquisarFuncionario, btnExcluirFuncionario, btnOkFuncionario);
        
    }//GEN-LAST:event_btnCancelarFuncionarioActionPerformed

    private void btnPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFuncionarioActionPerformed

        if (listaFuncionarios.isEmpty())   {
            
            JOptionPane.showMessageDialog(null, "Nenhuma funcionário cadastrado para pesquisa!", "Messagem", JOptionPane.PLAIN_MESSAGE);
            
        } else {
        
            //limpar os campos
            GerenciarCampos.limparTodosCampos(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
            //desabilitar e habilitar botoes
            GerenciarBotoes.botaoPesquisar(btnNovoFuncionario, btnSalvarFuncionario, btnEditarFuncionario, 
                btnCancelarFuncionario, btnPesquisarFuncionario, btnExcluirFuncionario, btnOkFuncionario);
        
            //desabilitar ou habilitar campos de texto
            GerenciarCampos.opcaoPesquisar(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
            txtCpfFuncionario.requestFocus();
            
        }
        
    }//GEN-LAST:event_btnPesquisarFuncionarioActionPerformed

    private void btnExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionarioActionPerformed

        int index = tblFuncionarioLista.getSelectedRow(); 
        
        if (index >= 0 && index < listaFuncionarios.size()){
            listaFuncionarios.remove(index);
        }
        
        //carregar os dados na tabela de clientes
        CarregarTabela.tabelaFuncionarioLista(tblFuncionarioLista, listaFuncionarios);
        
        //limpar os campos
        GerenciarCampos.limparTodosCampos(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
        
        //desabilitar e habilitar botoes
        GerenciarBotoes.iniciarTela(btnNovoFuncionario, btnSalvarFuncionario, btnEditarFuncionario, 
                btnCancelarFuncionario, btnPesquisarFuncionario, btnExcluirFuncionario, btnOkFuncionario);
    }//GEN-LAST:event_btnExcluirFuncionarioActionPerformed

    private void btnOkFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkFuncionarioActionPerformed

        if (txtCpfFuncionario.getText().equals(""))   {
            JOptionPane.showMessageDialog(null, "Nenhum CPF informado para pesquisa!", "Messagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            Funcionario funcionario;
            
            String cpfPesquisa = txtCpfFuncionario.getText();
            
            String nome = "";
            String cpf = "";
            String dataNascimento = "";
            String email = "";
            String telefone = "";
            String login = "";
            String senha = "";
            String status = "";
            
            for (int i = 0; i < listaFuncionarios.size(); i++)  {
                
                funcionario = listaFuncionarios.get(i);
                
                if (cpfPesquisa.equals(funcionario.getCpf()))   {
                    
                    nome = String.valueOf(funcionario.getNomeCompleto());
                    cpf = String.valueOf(funcionario.getCpf());
                    dataNascimento = String.valueOf(funcionario.getDataNascimento());
                    email = String.valueOf(funcionario.getEmail());
                    telefone = String.valueOf(funcionario.getTelefone());
                    login = String.valueOf(funcionario.getLogin());
                    status = String.valueOf(funcionario.getEstaAtivo());
                    
                }
            }
            
            if (cpfPesquisa.equals(""))  {
                
                JOptionPane.showMessageDialog(null, "Não existe funcionário cadastrada para este CPF!", "Messagem", JOptionPane.PLAIN_MESSAGE);
            
                //limpar os campos
                GerenciarCampos.limparTodosCampos(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
                
            } else  {
            
                txtCpfFuncionario.setText(cpf);
                txtNomeFuncionario.setText(nome);
                txtDataNascimentoFuncionario.setText(dataNascimento);
                txtEmailFuncionario.setText(email);
                txtTelefoneFuncionario.setText(telefone);
                txtLoginFuncionario.setText(login);
                txtPwrdSenhaFuncionario.setText(senha);
                
                
                if (status.equals("true")) {
                    rdoBtnAtivo.isSelected();
                } else if (status.equals("false")) {
                    rdoBtnInativo.isSelected();
                }

            }
            
            txtCpfFuncionario.selectAll();
            txtCpfFuncionario.requestFocus();
            
        }
        
    }//GEN-LAST:event_btnOkFuncionarioActionPerformed

    private void tblFuncionarioListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionarioListaMouseClicked

        int index = tblFuncionarioLista.getSelectedRow();   
        
        if (index >= 0 && index < listaFuncionarios.size()) {
            Funcionario funcionario = listaFuncionarios.get(index);
            
            txtCpfFuncionario.setText(String.valueOf(funcionario.getCpf()));
            txtNomeFuncionario.setText(String.valueOf(funcionario.getNomeCompleto()));
            txtDataNascimentoFuncionario.setText(String.valueOf(funcionario.getDataNascimento()));
            txtEmailFuncionario.setText(String.valueOf(funcionario.getEmail()));
            txtTelefoneFuncionario.setText(String.valueOf(funcionario.getTelefone()));
            txtLoginFuncionario.setText(String.valueOf(funcionario.getLogin()));
            txtPwrdSenhaFuncionario.setText(String.valueOf(funcionario.getSenhaFuncionario()));
            
            boolean estaDisponivel = funcionario.getEstaAtivo();
            
            if (estaDisponivel == true) {
                rdoBtnAtivo.isSelected();
            } else if (estaDisponivel == false) {
                rdoBtnInativo.isSelected();
            }
        }
        
        //desabilitar e habilitar botoes
        GerenciarBotoes.itemTabela(btnNovoFuncionario, btnSalvarFuncionario, btnEditarFuncionario, 
                btnCancelarFuncionario, btnPesquisarFuncionario, btnExcluirFuncionario, btnOkFuncionario);
        
        //desabilitar campos de texto
        GerenciarCampos.camposDefault(txtCpfFuncionario, txtNomeFuncionario,  
                    txtDataNascimentoFuncionario, txtEmailFuncionario, txtTelefoneFuncionario, 
                    txtLoginFuncionario, txtPwrdSenhaFuncionario, rdoBtnAtivo, rdoBtnInativo);
    }//GEN-LAST:event_tblFuncionarioListaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarFuncionario;
    private javax.swing.JButton btnEditarFuncionario;
    private javax.swing.JButton btnExcluirFuncionario;
    private javax.swing.ButtonGroup btnGrpStatusFuncionario;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnOkFuncionario;
    private javax.swing.JButton btnPesquisarFuncionario;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JButton btnVoltarFromFuncionario2Menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpfFuncionario;
    private javax.swing.JLabel lblDataNascimentoFuncionario;
    private javax.swing.JLabel lblEmailFuncionario;
    private javax.swing.JLabel lblLoginFuncionario;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblSenhaFuncionario;
    private javax.swing.JLabel lblStatusFuncionario;
    private javax.swing.JLabel lblTelefoneFuncionario;
    private javax.swing.JRadioButton rdoBtnAtivo;
    private javax.swing.JRadioButton rdoBtnInativo;
    private javax.swing.JTable tblFuncionarioLista;
    private javax.swing.JTextField txtCpfFuncionario;
    private javax.swing.JTextField txtDataNascimentoFuncionario;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtLoginFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JPasswordField txtPwrdSenhaFuncionario;
    private javax.swing.JTextField txtTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}
