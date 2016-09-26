/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamestore.main;

import com.gamestore.interfaces.IncluirCliente;

/**
 *
 * @author Roger
 */
public class GameStore extends javax.swing.JFrame {

    /**
     * Creates new form GameStore
     */
    public GameStore() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        incluirCliente1 = new com.gamestore.interfaces.IncluirCliente();
        backgroundPanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        botaoCadastroClientes = new javax.swing.JButton();
        botaoCadastroProdutos = new javax.swing.JButton();
        botaoVendas = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Store");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        backgroundPanel.setBackground(new java.awt.Color(204, 202, 255));
        backgroundPanel.setLayout(new java.awt.GridBagLayout());

        buttonsPanel.setPreferredSize(new java.awt.Dimension(600, 300));
        buttonsPanel.setLayout(new java.awt.GridLayout());

        botaoCadastroClientes.setText("CLIENTES");
        botaoCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroClientesActionPerformed(evt);
            }
        });
        buttonsPanel.add(botaoCadastroClientes);

        botaoCadastroProdutos.setText("PRODUTOS");
        buttonsPanel.add(botaoCadastroProdutos);

        botaoVendas.setText("VENDAS");
        buttonsPanel.add(botaoVendas);

        botaoRelatorios.setText("RELATÓRIOS");
        buttonsPanel.add(botaoRelatorios);

        backgroundPanel.add(buttonsPanel, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroClientesActionPerformed
        buttonsPanel.setVisible(false);
        
        javax.swing.JPanel cliente = new IncluirCliente();
        
        backgroundPanel.add(cliente);
        
        cliente.setVisible(true);
    }//GEN-LAST:event_botaoCadastroClientesActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton botaoCadastroClientes;
    private javax.swing.JButton botaoCadastroProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JPanel buttonsPanel;
    private com.gamestore.interfaces.IncluirCliente incluirCliente1;
    // End of variables declaration//GEN-END:variables
}
