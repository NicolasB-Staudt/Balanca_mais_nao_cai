package view;

public class funcoes extends javax.swing.JInternalFrame {
    public funcoes() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btIncluirObras = new javax.swing.JButton();
        btConsultarObras = new javax.swing.JButton();
        btAlterarObras = new javax.swing.JButton();
        btExcluirFases = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btIncluirFuncoes = new javax.swing.JButton();
        btConsultarFuncoes = new javax.swing.JButton();
        btAlterarFuncoes = new javax.swing.JButton();
        btExcluirFuncoes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Obras");

        btIncluirObras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btIncluirObras.setText("Inlcuir Obras");
        btIncluirObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirObrasActionPerformed(evt);
            }
        });

        btConsultarObras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btConsultarObras.setText("Consultar Obras");

        btAlterarObras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAlterarObras.setText("Alterar Obras");

        btExcluirFases.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btExcluirFases.setText("Excluir Obras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAlterarObras, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluirFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btIncluirObras, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btConsultarObras, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btIncluirObras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarObras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btExcluirFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterarObras, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setText("Sistema de Controle de Obras — Balança-Mas-Não-Cai");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Funções");

        btIncluirFuncoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btIncluirFuncoes.setText("Inlcuir Funções");
        btIncluirFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirFuncoesActionPerformed(evt);
            }
        });

        btConsultarFuncoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btConsultarFuncoes.setText("Consultar Funções");
        btConsultarFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarFuncoesActionPerformed(evt);
            }
        });

        btAlterarFuncoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAlterarFuncoes.setText("Alterar Funções");
        btAlterarFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarFuncoesActionPerformed(evt);
            }
        });

        btExcluirFuncoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btExcluirFuncoes.setText("Excluir Funções");
        btExcluirFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFuncoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btAlterarFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluirFuncoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btIncluirFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btConsultarFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btIncluirFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btExcluirFuncoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterarFuncoes, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel4.setText("Sistema de Controle de Obras — Balança-Mas-Não-Cai");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel4)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirObrasActionPerformed
    }//GEN-LAST:event_btIncluirObrasActionPerformed

    private void btIncluirFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirFuncoesActionPerformed
        incluirFuncoes janela = new incluirFuncoes();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btIncluirFuncoesActionPerformed

    private void btConsultarFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarFuncoesActionPerformed
       consultarFuncoes janela = new consultarFuncoes();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btConsultarFuncoesActionPerformed

    private void btAlterarFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarFuncoesActionPerformed
        alterarFuncoes janela = new alterarFuncoes();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btAlterarFuncoesActionPerformed

    private void btExcluirFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFuncoesActionPerformed
        excluirFuncoes janela = new excluirFuncoes();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btExcluirFuncoesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarFuncoes;
    private javax.swing.JButton btAlterarObras;
    private javax.swing.JButton btConsultarFuncoes;
    private javax.swing.JButton btConsultarObras;
    private javax.swing.JButton btExcluirFases;
    private javax.swing.JButton btExcluirFuncoes;
    private javax.swing.JButton btIncluirFuncoes;
    private javax.swing.JButton btIncluirObras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
