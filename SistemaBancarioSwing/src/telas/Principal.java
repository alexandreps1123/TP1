/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author alexandre
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        //maximizar ao iniciar
        //this.setExtendedState(MAXIMIZED_BOTH);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        mnbPrincipal = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mntCadastrarGerente = new javax.swing.JMenuItem();
        mntCadastrarCliente = new javax.swing.JMenuItem();
        mntCadastrarContas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mntSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Bancário");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/banco2.png")).getImage());

        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1414, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1414, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1414, 768));

        mnCadastro.setText("Cadastro");

        mntCadastrarGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerente.png"))); // NOI18N
        mntCadastrarGerente.setText("Gerente");
        mntCadastrarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntCadastrarGerenteActionPerformed(evt);
            }
        });
        mnCadastro.add(mntCadastrarGerente);

        mntCadastrarCliente.setText("Cliente");
        mntCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntCadastrarClienteActionPerformed(evt);
            }
        });
        mnCadastro.add(mntCadastrarCliente);

        mntCadastrarContas.setText("Contas");
        mntCadastrarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntCadastrarContasActionPerformed(evt);
            }
        });
        mnCadastro.add(mntCadastrarContas);
        mnCadastro.add(jSeparator1);

        mntSair.setMnemonic('s');
        mntSair.setText("Sair");
        mntSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntSairActionPerformed(evt);
            }
        });
        mnCadastro.add(mntSair);

        mnbPrincipal.add(mnCadastro);

        jMenu2.setText("Relatorio");
        mnbPrincipal.add(jMenu2);

        jMenu3.setText("Ajuda");
        mnbPrincipal.add(jMenu3);

        setJMenuBar(mnbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 115, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mntCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntCadastrarClienteActionPerformed
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_mntCadastrarClienteActionPerformed

    private void mntCadastrarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntCadastrarContasActionPerformed
        new CadastroConta().setVisible(true);
    }//GEN-LAST:event_mntCadastrarContasActionPerformed

    private void mntSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntSairActionPerformed
        // Sair da execução
        System.exit(0);
        
    }//GEN-LAST:event_mntSairActionPerformed

    private void mntCadastrarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntCadastrarGerenteActionPerformed
        new CadastroGerente().setVisible(true);
    }//GEN-LAST:event_mntCadastrarGerenteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuBar mnbPrincipal;
    private javax.swing.JMenuItem mntCadastrarCliente;
    private javax.swing.JMenuItem mntCadastrarContas;
    private javax.swing.JMenuItem mntCadastrarGerente;
    private javax.swing.JMenuItem mntSair;
    // End of variables declaration//GEN-END:variables
}
