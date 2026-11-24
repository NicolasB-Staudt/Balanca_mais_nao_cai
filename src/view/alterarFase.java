package view;

import Dao.Daofases;
import Dao.DataSource;
import javax.swing.table.DefaultTableModel;
import model.fase;
import javax.swing.JOptionPane;

public class alterarFase extends javax.swing.JInternalFrame {
    public alterarFase() {
        initComponents();

        setClosable(false);
        setResizable(false);
        setMaximizable(false);

        limpacampos();
        letable();
    }

    @SuppressWarnings("unchecked")
    //GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codFase = new javax.swing.JTextField();
        nomeFase = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));  
        jLabel1.setText("ALTERAR FASES ");

        btVoltar.setText("Voltar ao Menu");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));  
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));  
        jLabel3.setText("Nome");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18));  
        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39))))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(codFase, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(nomeFase, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(6, 6, 6)))
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        menuFinal janela = new menuFinal();

        getDesktopPane().add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    DataSource dataSource = new DataSource();
    Daofases dao = new Daofases(dataSource);

    fase cat = new fase();

    cat.setIdFase(Integer.parseInt(codFase.getText()));
    cat.setDsFase(nomeFase.getText());

    dao.alterar(cat);

    limpacampos();
    letable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    modelo.setNumRows(0);

    DataSource dataSource = new DataSource();
    Daofases dao = new Daofases(dataSource);

    for (fase cat : dao.seleciona(pesquisar.getText())) {
        modelo.addRow(new Object[]{
            cat.getIdFase(),
            cat.getDsFase()
        });
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpacampos() {
    codFase.setText("");
    nomeFase.setText("");
}

    public void limpatabela() {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(15);

modelo.setNumRows(0);
}      

    public void consulta() {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    modelo.setNumRows(0);
    }

public void letable() {
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    modelo.setNumRows(0);

    DataSource datasource = new DataSource();
    try {
        Daofases catDao = new Daofases(datasource);

        for (fase c : catDao.consulta()) {
            modelo.addRow(new Object[]{
                c.getIdFase(),
                c.getDsFase()
            });
        }
    } finally {
        datasource.closeDataSource();
    }
}

    //GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField codFase;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nomeFase;
    private javax.swing.JTextField pesquisar;
    //GEN-END:variables
}
