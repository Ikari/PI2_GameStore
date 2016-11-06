/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamestore.interfaces;

import com.gamestore.main.GameStore;
import com.gamestore.models.Cliente;
import com.gamestore.models.Produto;
import com.gamestore.services.ServicoCliente;
import com.gamestore.services.ServicoPedido;
import com.gamestore.services.ServicoProduto;
import java.awt.CardLayout;
import java.text.ParseException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roger
 */
public class IniciarVenda extends javax.swing.JPanel {

    GameStore parent;
    ServicoPedido servico;
    ServicoCliente servicoCliente;
    ServicoProduto servicoProduto;
    
    /**
     * Creates new form IniciarVenda
     */
    public IniciarVenda(GameStore parent, ServicoPedido servico, ServicoCliente servicoCliente, ServicoProduto servicoProduto) {
        initComponents();
        this.parent = parent;
        this.servico = servico;
        this.servicoCliente = servicoCliente;
        this.servicoProduto = servicoProduto;
        panelCliente.setVisible(false);
        scrollPaneProdutos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textCliente = new javax.swing.JTextField();
        botaoIncluirCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        textProduto = new javax.swing.JTextField();
        botaoIncluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        labelTotal = new javax.swing.JLabel();
        scrollPaneProdutos = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JList<>();
        panelCliente = new javax.swing.JPanel();
        piCliente = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        labelNomeClienteSelecionado = new javax.swing.JLabel();
        labelEmailClienteSelecionado = new javax.swing.JLabel();
        labelFidelidadeClienteSelecionado = new javax.swing.JLabel();
        labelIdadeClienteSelecionado = new javax.swing.JLabel();
        psCliente = new javax.swing.JPanel();
        scrollPaneClientes = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList<>();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gamestore/resources/will-smith.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel2.setText("Apelido");

        jTextField3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("_______________________________________________________________________________________________________________________________");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel3.setText("CLIENTE");

        textCliente.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textClienteKeyReleased(evt);
            }
        });

        botaoIncluirCliente.setText(">>");
        botaoIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirClienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel8.setText("PRODUTO");

        textProduto.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textProdutoKeyReleased(evt);
            }
        });

        botaoIncluirProduto.setText(">>");
        botaoIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirProdutoActionPerformed(evt);
            }
        });

        tabelaProdutos.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Valor unitário", "Quantidade", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        labelTotal.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        labelTotal.setText("TOTAL: R$ 0");

        listaProdutos.setModel(new DefaultListModel());
        listaProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdutosMouseClicked(evt);
            }
        });
        scrollPaneProdutos.setViewportView(listaProdutos);

        panelCliente.setLayout(new java.awt.CardLayout());

        piCliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gamestore/resources/will-smith-pequeno.jpg"))); // NOI18N

        labelNomeClienteSelecionado.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelNomeClienteSelecionado.setText("WILL SMITH DA SILVA");

        labelEmailClienteSelecionado.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelEmailClienteSelecionado.setText("will.smith@gmail.com");

        labelFidelidadeClienteSelecionado.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelFidelidadeClienteSelecionado.setText("CLIENTE DESDE 10/2010");

        labelIdadeClienteSelecionado.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelIdadeClienteSelecionado.setText("45 Anos");

        javax.swing.GroupLayout piClienteLayout = new javax.swing.GroupLayout(piCliente);
        piCliente.setLayout(piClienteLayout);
        piClienteLayout.setHorizontalGroup(
            piClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(piClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(piClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(piClienteLayout.createSequentialGroup()
                        .addComponent(labelNomeClienteSelecionado)
                        .addGap(111, 111, 111)
                        .addComponent(labelIdadeClienteSelecionado))
                    .addComponent(labelEmailClienteSelecionado)
                    .addComponent(labelFidelidadeClienteSelecionado))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        piClienteLayout.setVerticalGroup(
            piClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(piClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(piClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(piClienteLayout.createSequentialGroup()
                        .addGroup(piClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomeClienteSelecionado)
                            .addComponent(labelIdadeClienteSelecionado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEmailClienteSelecionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelFidelidadeClienteSelecionado))
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCliente.add(piCliente, "card2");

        psCliente.setBackground(new java.awt.Color(255, 255, 255));

        listaClientes.setModel(new DefaultListModel());
        listaProdutos.setModel(new DefaultListModel());
        listaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClientesMouseClicked(evt);
            }
        });
        scrollPaneClientes.setViewportView(listaClientes);

        javax.swing.GroupLayout psClienteLayout = new javax.swing.GroupLayout(psCliente);
        psCliente.setLayout(psClienteLayout);
        psClienteLayout.setHorizontalGroup(
            psClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        psClienteLayout.setVerticalGroup(
            psClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        panelCliente.add(psCliente, "card3");

        botaoSalvar.setText("SALVAR");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("CANCELAR");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textProduto)
                            .addComponent(textCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoIncluirCliente)
                            .addComponent(botaoIncluirProduto)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPaneProdutos))
                        .addGap(58, 58, 58)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(botaoIncluirCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoIncluirProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
           
    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        servico.cancelarPedido();            
        parent.exibirPainel("selecaoInicial");
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        try
        {            
            servico.salvarPedido();            
            limparFormulario();
        }
        catch(ParseException pex)
        {
            JOptionPane.showMessageDialog(this, pex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void textProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProdutoKeyReleased
        
        DefaultListModel model = (DefaultListModel) listaProdutos.getModel();
        model.setSize(0);
        
        scrollPaneProdutos.setVisible(false);
        
        if (textProduto.getText().length() <= 3)
            return;
        
        List<Produto> produtos = servicoProduto.ObterProdutos(textProduto.getText());
                              
        int size = produtos.size();        
        
        for (int i = 0; i < size; i++){
            Produto pro = produtos.get(i);
            if (pro != null) {
                model.addElement(String.format("%s - %s", pro.getId(), pro.getNome()));                
            }            
        }        
        
        scrollPaneProdutos.setVisible(true);
        revalidate();
    }//GEN-LAST:event_textProdutoKeyReleased

    private void listaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdutosMouseClicked
        
    }//GEN-LAST:event_listaProdutosMouseClicked

    private void incluirNovoProduto(Produto produto) throws Exception {
        if (produto == null){
            JOptionPane.showMessageDialog(this, "Produto não encontrado.");
            return;
        }
            
        DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
        
        servico.adicionarItem(produto, 1);
        
        Object[] row = new Object[5];
        row[0] = produto.getId();
        row[1] = produto.getNome();
        row[2] = produto.getPreco();
        row[3] = 1;
        row[4] = 1 * produto.getPreco();
        model.addRow(row);                
    }
    
    private void listaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClientesMouseClicked

    }//GEN-LAST:event_listaClientesMouseClicked

    private void textClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClienteKeyReleased
        DefaultListModel model = (DefaultListModel) listaClientes.getModel();
        model.setSize(0);
        
        panelCliente.setVisible(false);
        
        if (textCliente.getText().length() <= 3)
            return;
        
        List<Cliente> clientes = servicoCliente.obterClientes(textCliente.getText());
                              
        int size = clientes.size();        
        
        for (int i = 0; i < size; i++){
            Cliente cli = clientes.get(i);
            if (cli != null) {
                model.addElement(String.format("%s - %s", cli.getId(), cli.getNome()));                
            }            
        }        
                
        panelCliente.setVisible(true);
        controlarPainelCliente("card3");
        
        revalidate();
    }//GEN-LAST:event_textClienteKeyReleased

    private void botaoIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirClienteActionPerformed
        try
        {
            DefaultListModel model = (DefaultListModel) listaClientes.getModel();        
            String selectedCliente = (String)model.getElementAt(listaClientes.getSelectedIndex());

            int selectedId = Integer.parseInt(selectedCliente.substring(0, selectedCliente.indexOf("-")).trim());

            Cliente cliente = servicoCliente.obterItemPorId(selectedId);
            
            labelNomeClienteSelecionado.setText(cliente.getNome());
            labelIdadeClienteSelecionado.setText(cliente.getIdade());
            labelEmailClienteSelecionado.setText(cliente.getEmail());
            labelFidelidadeClienteSelecionado.setText("Cliente está comprando pela primeira vez");
            
            servico.novoPedido(cliente);            
            
            controlarPainelCliente("card2");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Não foi possível incluir o cliente.");
        }     
    }//GEN-LAST:event_botaoIncluirClienteActionPerformed

    private void botaoIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirProdutoActionPerformed
        try
        {
            DefaultListModel model = (DefaultListModel) listaProdutos.getModel();        
            String selectedProduto = (String)model.getElementAt(listaProdutos.getSelectedIndex());

            int selectedProdutoId = Integer.parseInt(selectedProduto.substring(0, selectedProduto.indexOf("-")).trim());

            incluirNovoProduto(servicoProduto.obterItemPorId(selectedProdutoId));
            scrollPaneProdutos.setVisible(false);
            textProduto.setText("");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Não foi possível incluir o produto.");
        }        
    }//GEN-LAST:event_botaoIncluirProdutoActionPerformed

    private void controlarPainelCliente(String painel){
        CardLayout card = (CardLayout)panelCliente.getLayout();
        card.show(panelCliente, painel);
    }
    
    private void limparFormulario(){
        
        labelEmailClienteSelecionado.setText("");
        labelFidelidadeClienteSelecionado.setText("");
        labelIdadeClienteSelecionado.setText("");
        labelNomeClienteSelecionado.setText("");
        labelTotal.setText("");
        textCliente.setText("");
        textProduto.setText("");
        panelCliente.setVisible(false);
                
        DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
        model.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoIncluirCliente;
    private javax.swing.JButton botaoIncluirProduto;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelEmailClienteSelecionado;
    private javax.swing.JLabel labelFidelidadeClienteSelecionado;
    private javax.swing.JLabel labelIdadeClienteSelecionado;
    private javax.swing.JLabel labelNomeClienteSelecionado;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JList<String> listaProdutos;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel piCliente;
    private javax.swing.JPanel psCliente;
    private javax.swing.JScrollPane scrollPaneClientes;
    private javax.swing.JScrollPane scrollPaneProdutos;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textProduto;
    // End of variables declaration//GEN-END:variables
}
