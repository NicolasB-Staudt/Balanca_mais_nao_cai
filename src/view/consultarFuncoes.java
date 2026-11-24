package view;

import Dao.Daofuncoes;
import Dao.DataSource;
import javax.swing.table.DefaultTableModel;
import model.funcoes;

public class consultarFuncoes extends javax.swing.JInternalFrame {
    public consultarFuncoes() {
        initComponents();

        setClosable(false);
        setResizable(false);
        setMaximizable(false);

        letable();
    }

    @SuppressWarnings("unchecked")
    //GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome da Função"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));  
        jLabel1.setText("CONSULTA FUNÇÕES");

        btVoltar.setText("Voltar ao Menu");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar)
                    .addComponent(jLabel1))
                .addContainerGap(587, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        menuFinal janela = new menuFinal();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    public void consulta() {
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        modelo.setNumRows(0);
    }

    public void letable() {
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        modelo.setNumRows(0);

        DataSource datasource = new DataSource();
        try {
            Daofuncoes dao = new Daofuncoes(datasource);

            for (funcoes c : dao.consulta()) {
                modelo.addRow(new Object[]{
                    c.getIdFuncao(),
                    c.getDsFuncao()
                });
            }
        } finally {
            datasource.closeDataSource();
        }
    }

    //GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    //GEN-END:variables
}
