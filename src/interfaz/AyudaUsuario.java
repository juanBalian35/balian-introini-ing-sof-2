package interfaz;

import dominio.Sistema;

public class AyudaUsuario extends javax.swing.JDialog {

    private Sistema sistema;

    public AyudaUsuario(Sistema unSistema) {
        initComponents();
        this.sistema = unSistema;
        this.setLocationRelativeTo(null);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIngresarAlimentoIngerido = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        textDesayuno4 = new javax.swing.JTextArea();
        btnIngresarAlimentoIngerido2 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        textDesayuno2 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        textDesayuno3 = new javax.swing.JTextArea();
        btnIngresarAlimentoIngerido1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lblNombreUsuario.setFont(new java.awt.Font("Levenim MT", 0, 55)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreUsuario.setText("Ayuda");
        lblNombreUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombreUsuario, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 28, 0};
        jPanel2Layout.rowHeights = new int[] {0, 28, 0, 28, 0};
        jPanel2.setLayout(jPanel2Layout);

        btnIngresarAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Chat_70px.png"))); // NOI18N
        btnIngresarAlimentoIngerido.setBorder(null);
        btnIngresarAlimentoIngerido.setBorderPainted(false);
        btnIngresarAlimentoIngerido.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido.setFocusPainted(false);
        btnIngresarAlimentoIngerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngeridoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(btnIngresarAlimentoIngerido, gridBagConstraints);

        textDesayuno4.setEditable(false);
        textDesayuno4.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno4.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno4.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno4.setTabSize(0);
        textDesayuno4.setText("Solicitar planes de alimentación\na los profesionales registrados en\nel sistema.");
        jScrollPane16.setViewportView(textDesayuno4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jScrollPane16, gridBagConstraints);

        btnIngresarAlimentoIngerido2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Calendar_70px.png"))); // NOI18N
        btnIngresarAlimentoIngerido2.setBorder(null);
        btnIngresarAlimentoIngerido2.setBorderPainted(false);
        btnIngresarAlimentoIngerido2.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido2.setFocusPainted(false);
        btnIngresarAlimentoIngerido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngerido2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(btnIngresarAlimentoIngerido2, gridBagConstraints);

        textDesayuno2.setEditable(false);
        textDesayuno2.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno2.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno2.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno2.setTabSize(0);
        textDesayuno2.setText("Ingresar ingesta de alimentos.");
        jScrollPane14.setViewportView(textDesayuno2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jScrollPane14, gridBagConstraints);

        textDesayuno3.setEditable(false);
        textDesayuno3.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno3.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno3.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno3.setTabSize(0);
        textDesayuno3.setText("Entablar contacto con \nprofesionales y realizar\nconsultas sobre alimentación.");
        jScrollPane15.setViewportView(textDesayuno3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jScrollPane15, gridBagConstraints);

        btnIngresarAlimentoIngerido1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Food_And_Wine_70px.png"))); // NOI18N
        btnIngresarAlimentoIngerido1.setBorder(null);
        btnIngresarAlimentoIngerido1.setBorderPainted(false);
        btnIngresarAlimentoIngerido1.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido1.setFocusPainted(false);
        btnIngresarAlimentoIngerido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngerido1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel2.add(btnIngresarAlimentoIngerido1, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarAlimentoIngeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngeridoActionPerformed
       
    }//GEN-LAST:event_btnIngresarAlimentoIngeridoActionPerformed

    private void btnIngresarAlimentoIngerido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngerido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarAlimentoIngerido1ActionPerformed

    private void btnIngresarAlimentoIngerido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngerido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarAlimentoIngerido2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarAlimentoIngerido;
    private javax.swing.JButton btnIngresarAlimentoIngerido1;
    private javax.swing.JButton btnIngresarAlimentoIngerido2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JTextArea textDesayuno2;
    private javax.swing.JTextArea textDesayuno3;
    private javax.swing.JTextArea textDesayuno4;
    // End of variables declaration//GEN-END:variables
}
