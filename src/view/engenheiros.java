package view;

public class engenheiros extends javax.swing.JInternalFrame {
    public engenheiros() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btIncluirEngenheiros = new javax.swing.JButton();
        btConsultarEngenheiros = new javax.swing.JButton();
        btAlterarEngenheiros = new javax.swing.JButton();
        btExcluirEngenheiros = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel2.setText("Sistema de Controle de Obras — Balança-Mas-Não-Cai");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Engenheiros");

        btIncluirEngenheiros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btIncluirEngenheiros.setText("Inlcuir Engenheiros");
        btIncluirEngenheiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirEngenheirosActionPerformed(evt);
            }
        });

        btConsultarEngenheiros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btConsultarEngenheiros.setText("Consultar Engenheiros");
        btConsultarEngenheiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarEngenheirosActionPerformed(evt);
            }
        });

        btAlterarEngenheiros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAlterarEngenheiros.setText("Alterar Engenheiros");
        btAlterarEngenheiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarEngenheirosActionPerformed(evt);
            }
        });

        btExcluirEngenheiros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btExcluirEngenheiros.setText("Excluir Engenheiros");
        btExcluirEngenheiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirEngenheirosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAlterarEngenheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluirEngenheiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btIncluirEngenheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btConsultarEngenheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(281, 281, 281))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btIncluirEngenheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarEngenheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btExcluirEngenheiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterarEngenheiros, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirEngenheirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirEngenheirosActionPerformed
        incluirEngenheiro janela = new incluirEngenheiro();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btIncluirEngenheirosActionPerformed

    private void btAlterarEngenheirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarEngenheirosActionPerformed
        alterarEngenheiros janela = new alterarEngenheiros();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btAlterarEngenheirosActionPerformed

    private void btExcluirEngenheirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirEngenheirosActionPerformed
        excluirEngenheiros janela = new excluirEngenheiros();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btExcluirEngenheirosActionPerformed

    private void btConsultarEngenheirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarEngenheirosActionPerformed
        consultarEngenheiros janela = new consultarEngenheiros();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btConsultarEngenheirosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarEngenheiros;
    private javax.swing.JButton btConsultarEngenheiros;
    private javax.swing.JButton btExcluirEngenheiros;
    private javax.swing.JButton btIncluirEngenheiros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
