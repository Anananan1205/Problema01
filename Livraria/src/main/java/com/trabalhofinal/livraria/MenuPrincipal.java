package com.trabalhofinal.livraria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelComboBoxEncomenda = new javax.swing.JLabel();
        radioButton_PAC = new javax.swing.JRadioButton();
        radioButton_SEDEX = new javax.swing.JRadioButton();
        radioButton_RETIRADA = new javax.swing.JRadioButton();
        labelValorTotal = new javax.swing.JLabel();
        labelValorLivro = new javax.swing.JLabel();
        btnAdicionarLivro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnListarLivros = new javax.swing.JButton();
        labelTaxaDeEntrega = new javax.swing.JLabel();
        labelR$Taxa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Livraria Twonk");

        labelComboBoxEncomenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelComboBoxEncomenda.setText("Digite o tipo da encomenda:");

        buttonGroup1.add(radioButton_PAC);
        radioButton_PAC.setSelected(true);
        radioButton_PAC.setText("PAC");

        buttonGroup1.add(radioButton_SEDEX);
        radioButton_SEDEX.setText("SEDEX");

        buttonGroup1.add(radioButton_RETIRADA);
        radioButton_RETIRADA.setText("RETIRADA NO LOCAL");

        labelValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValorTotal.setText("VALOR TOTAL:");

        labelValorLivro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelValorLivro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValorLivro.setText("R$");

        btnAdicionarLivro.setText("Adicionar");
        btnAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarLivroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Itens:");

        btnListarLivros.setText("Listar");
        btnListarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarLivrosActionPerformed(evt);
            }
        });

        labelTaxaDeEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTaxaDeEntrega.setText("Taxa de entrega:");

        labelR$Taxa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelR$Taxa.setText("R$");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelR$Taxa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioButton_RETIRADA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioButton_SEDEX, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioButton_PAC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelComboBoxEncomenda)))
                            .addComponent(labelTaxaDeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdicionarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelValorTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelValorLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarLivro)
                    .addComponent(btnListarLivros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelComboBoxEncomenda)
                .addGap(3, 3, 3)
                .addComponent(radioButton_PAC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButton_SEDEX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButton_RETIRADA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTaxaDeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelR$Taxa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(16, 16, 16)
                .addComponent(labelValorTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelValorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //-------------------------------COMEÇO----------------------------------------

    private void btnAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarLivroActionPerformed
        abrirTelaAdicionarLivro();
    }//GEN-LAST:event_btnAdicionarLivroActionPerformed

    private void btnListarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarLivrosActionPerformed
        abrirTelaMostrarLivros();
    }//GEN-LAST:event_btnListarLivrosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizarResumoDeValoresNaTela();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void abrirTelaAdicionarLivro() {
        new TelaAdicionarLivro().setVisible(true);
    }

    private void abrirTelaMostrarLivros() {
        new TelaMostrarLivros().setVisible(true);
    }

    private void atualizarResumoDeValoresNaTela() {
        Dinheiro valorTotalProdutos = EstanteLivros.calcularValorTotal();
        Dinheiro valorFrete = calcularValorFrete();

        Dinheiro valorFinal = valorTotalProdutos.somar(valorFrete);

        labelValorLivro.setText(valorFinal.toString());
        labelR$Taxa.setText(valorFrete.toString());
    }

    public Dinheiro calcularValorFrete() {
        if (radioButton_PAC.isSelected()) {
            return calcularFretePac();
        }

        if (radioButton_SEDEX.isSelected()) {
            return calcularFreteSedex();
        }

        return new Dinheiro(0f);
    }

    private Dinheiro calcularFretePac() {
        Peso pesoTotal = EstanteLivros.calcularPesoTotal();

        if (pesoTotal.naoUltrapassa(1f)) {
            return new Dinheiro(10f);
        }
        if (pesoTotal.naoUltrapassa(2f)) {
            return new Dinheiro(15f);
        }

        exibirAvisoDePesoExcedido("PAC");
        return new Dinheiro(0f);
    }

    private Dinheiro calcularFreteSedex() {
        Peso pesoTotal = EstanteLivros.calcularPesoTotal();


        if (pesoTotal.naoUltrapassa(0.5f)) {
            return new Dinheiro(12.50f);
        }


        if (pesoTotal.naoUltrapassa(1.0f)) {
            return new Dinheiro(20.00f);
        }

        int fracoesAdicionais = pesoTotal.obterFracoesDe100gAcimaDe(1.0f);

        float custoExtra = fracoesAdicionais * 1.50f;

        return new Dinheiro(46.50f + custoExtra);
        
        
        
    }

    private void exibirAvisoDePesoExcedido(String tipoFrete) {
        JOptionPane.showMessageDialog(this,
                "O peso total excedeu o limite de 2kg para o envio via " + tipoFrete + ".",
                "Aviso de Frete",
                JOptionPane.WARNING_MESSAGE);
    }

    public Dinheiro calcularFretePorTipo(String tipo) {
    if (tipo.equalsIgnoreCase("PAC")) {
        return calcularFretePac();
    }
    if (tipo.equalsIgnoreCase("SEDEX")) {
        return calcularFreteSedex();
    }
    if (tipo.equalsIgnoreCase("RETIRADA")) {
        return new Dinheiro(0f);
    }
    return new Dinheiro(0f);
    }
//-------------------------------FIM----------------------------------------
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarLivro;
    private javax.swing.JButton btnListarLivros;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelComboBoxEncomenda;
    private javax.swing.JLabel labelR$Taxa;
    private javax.swing.JLabel labelTaxaDeEntrega;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValorLivro;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JRadioButton radioButton_PAC;
    private javax.swing.JRadioButton radioButton_RETIRADA;
    private javax.swing.JRadioButton radioButton_SEDEX;
    // End of variables declaration//GEN-END:variables
}
