package com.trabalhofinal.livraria;

import javax.swing.JOptionPane;

public class TelaAdicionarLivro extends javax.swing.JFrame {

    public TelaAdicionarLivro() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        textFieldPeso = new javax.swing.JTextField();
        labelDigitarNome = new javax.swing.JLabel();
        comboBoxPeso = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnAdicionarLivro = new javax.swing.JButton();
        textFieldNomeLivro = new javax.swing.JTextField();
        labelValorLivro = new javax.swing.JLabel();
        textFieldValorLivro = new javax.swing.JTextField();
        labelR$ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelTitulo.setBackground(new java.awt.Color(153, 153, 153));
        labelTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Livraria Twonk");

        textFieldPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPesoActionPerformed(evt);
            }
        });

        labelDigitarNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDigitarNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDigitarNome.setText("Digite o peso da mercadoria:");

        comboBoxPeso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gramas", "Quilos", "Toneladas", " " }));
        comboBoxPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPesoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digite o nome do livro:");

        btnAdicionarLivro.setText("Adicionar Item");
        btnAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarLivroActionPerformed(evt);
            }
        });

        textFieldNomeLivro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNomeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeLivroActionPerformed(evt);
            }
        });

        labelValorLivro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelValorLivro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValorLivro.setText("Digite o valor do livro:");

        textFieldValorLivro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelR$.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelR$.setText("R$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldNomeLivro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDigitarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelValorLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxPeso, 0, 106, Short.MAX_VALUE))
                            .addComponent(btnAdicionarLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(159, 159, 159))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelR$)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldValorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDigitarNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(textFieldPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelValorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldValorLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(labelR$))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPesoActionPerformed

    }//GEN-LAST:event_textFieldPesoActionPerformed

    private void comboBoxPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPesoActionPerformed

    }//GEN-LAST:event_comboBoxPesoActionPerformed

    private void textFieldNomeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeLivroActionPerformed

    }//GEN-LAST:event_textFieldNomeLivroActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
//--------------------------------------COMEÇO--------------------------------------------
    

    private void btnAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarLivroActionPerformed
     try {
            Livro novoLivro = extrairLivroDaTela();
            EstanteLivros.adicionarLivro(novoLivro);
            fecharTela();

        } catch (NumberFormatException erroDePreenchimento) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, digite apenas números válidos para peso e valor.",
                    "Erro de digitação",
                    JOptionPane.WARNING_MESSAGE);
                    
        } catch (IllegalArgumentException erroDeRegra) {
            // Esse catch NOVO pega a recusa que programamos lá nas classes Peso e Dinheiro!
            JOptionPane.showMessageDialog(this,
                    erroDeRegra.getMessage(), // Isso vai imprimir a frase exata que você colocou no throw
                    "Valor inválido",
                    JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_btnAdicionarLivroActionPerformed
    private Livro extrairLivroDaTela() {
        String nome = textFieldNomeLivro.getText();
        float valorBruto = converterTextoParaFloat(textFieldValorLivro.getText());
        float pesoBruto = converterTextoParaFloat(textFieldPeso.getText());
        String unidade = comboBoxPeso.getSelectedItem().toString();

        float pesoEmQuilos = normalizarPesoParaQuilos(pesoBruto, unidade);
        return new Livro(nome, new Dinheiro(valorBruto), new Peso(pesoEmQuilos));
    }

    private float converterTextoParaFloat(String texto) {
        return Float.parseFloat(texto.replace(',', '.'));
    }

    private float normalizarPesoParaQuilos(float peso, String unidade) {
        return switch (unidade) {
            case "Gramas" ->
                peso / 1000f;
            case "Toneladas" ->
                peso * 1000f;
            default ->
                peso;
        };
    }

    private void fecharTela() {
        this.dispose();
    }

    //--------------------------------------FIM--------------------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarLivro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxPeso;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDigitarNome;
    private javax.swing.JLabel labelR$;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValorLivro;
    private javax.swing.JTextField textFieldNomeLivro;
    private javax.swing.JTextField textFieldPeso;
    private javax.swing.JTextField textFieldValorLivro;
    // End of variables declaration//GEN-END:variables
}
