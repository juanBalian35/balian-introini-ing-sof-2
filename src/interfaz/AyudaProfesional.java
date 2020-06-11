package interfaz;

import dominio.Sistema;

public class AyudaProfesional extends javax.swing.JDialog {

    private Sistema sistema;

    public AyudaProfesional(Sistema unSistema) {
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
        jScrollPane16 = new javax.swing.JScrollPane();
        textDesayuno4 = new javax.swing.JTextArea();
        btnIngresarAlimentoIngerido1 = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        textDesayuno5 = new javax.swing.JTextArea();
        btnIngresarAlimentoIngerido = new javax.swing.JButton();
        btnIngresarAlimentoIngerido2 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        textDesayuno3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
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
        jPanel1.add(lblNombreUsuario, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 28, 0};
        jPanel2Layout.rowHeights = new int[] {0, 28, 0, 28, 0};
        jPanel2.setLayout(jPanel2Layout);

        textDesayuno4.setEditable(false);
        textDesayuno4.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno4.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno4.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno4.setTabSize(0);
        textDesayuno4.setText("Registrar alimentos en el sistema\nque luego podrán marcar como\ningeridos los usuarios.");
        jScrollPane16.setViewportView(textDesayuno4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jScrollPane16, gridBagConstraints);

        btnIngresarAlimentoIngerido1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Food_70px.png"))); // NOI18N
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

        textDesayuno5.setEditable(false);
        textDesayuno5.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno5.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno5.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno5.setTabSize(0);
        textDesayuno5.setText("Ver y responder las consultas\npendientes que realizaron los \nusuarios.");
        jScrollPane17.setViewportView(textDesayuno5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jScrollPane17, gridBagConstraints);

        btnIngresarAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Message_70px.png"))); // NOI18N
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

        btnIngresarAlimentoIngerido2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Edit_Property_70px.png"))); // NOI18N
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

        textDesayuno3.setEditable(false);
        textDesayuno3.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno3.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno3.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno3.setTabSize(0);
        textDesayuno3.setText("Responder a las solicitudes de \nplanes de alimentación.");
        jScrollPane15.setViewportView(textDesayuno3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jScrollPane15, gridBagConstraints);

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
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JTextArea textDesayuno3;
    private javax.swing.JTextArea textDesayuno4;
    private javax.swing.JTextArea textDesayuno5;
    // End of variables declaration//GEN-END:variables
}
