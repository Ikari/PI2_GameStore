/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamestore.interfaces;

import com.gamestore.main.GameStore;

/**
 *
 * @author Roger
 */
public class SelecaoInicial extends javax.swing.JPanel {

    GameStore parent;
    
    /**
     * Creates new form SelecaoInicial
     */
    public SelecaoInicial(GameStore parent) {
        initComponents();
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsPanel = new javax.swing.JPanel();
        botaoCadastroClientes = new javax.swing.JButton();
        botaoCadastroProdutos = new javax.swing.JButton();
        botaoVendas = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroClientesActionPerformed
        parent.exibirPainel("listarCliente");
    }//GEN-LAST:event_botaoCadastroClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastroClientes;
    private javax.swing.JButton botaoCadastroProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JPanel buttonsPanel;
    // End of variables declaration//GEN-END:variables
}