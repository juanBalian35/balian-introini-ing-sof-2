package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;

public class VentanaEditarRestricciones extends javax.swing.JDialog {

    private Sistema sistema;
    private Usuario usuarioActual;

    public VentanaEditarRestricciones(Sistema unSistema, Usuario unUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.usuarioActual = unUsuario;
        cargarListaRestricciones();
        this.panelListo.setVisible(false);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario unUsuarioActual) {
        this.usuarioActual = unUsuarioActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelEditarRestricciones = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rdBtnDiabetes = new javax.swing.JRadioButton();
        rdBtnCeliaco = new javax.swing.JRadioButton();
        rdBtnIntoleranteLactosa = new javax.swing.JRadioButton();
        lblTxtRestricciones = new javax.swing.JLabel();
        rdBtnVegano = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnEditarPreferencias = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        lblEditarRestricciones = new javax.swing.JLabel();
        panelListo = new javax.swing.JPanel();
        lblListo = new javax.swing.JLabel();
        lblIconoListo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(508, 390));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelEditarRestricciones.setBackground(new java.awt.Color(51, 51, 51));
        panelEditarRestricciones.setMaximumSize(new java.awt.Dimension(508, 390));
        panelEditarRestricciones.setMinimumSize(new java.awt.Dimension(508, 390));
        panelEditarRestricciones.setName(""); // NOI18N
        panelEditarRestricciones.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0};
        jPanel1Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel1Layout.columnWeights = new double[] {1.0};
        jPanel1.setLayout(jPanel1Layout);

        rdBtnDiabetes.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnDiabetes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnDiabetes.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnDiabetes.setText("Restriccion 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel1.add(rdBtnDiabetes, gridBagConstraints);

        rdBtnCeliaco.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCeliaco.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCeliaco.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCeliaco.setText("Restriccion 4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel1.add(rdBtnCeliaco, gridBagConstraints);

        rdBtnIntoleranteLactosa.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnIntoleranteLactosa.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnIntoleranteLactosa.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnIntoleranteLactosa.setText("Restriccion 3");
        rdBtnIntoleranteLactosa.setActionCommand("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel1.add(rdBtnIntoleranteLactosa, gridBagConstraints);

        lblTxtRestricciones.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtRestricciones.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtRestricciones.setText("Restricciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 60, 0, 0);
        jPanel1.add(lblTxtRestricciones, gridBagConstraints);

        rdBtnVegano.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnVegano.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnVegano.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnVegano.setText("Restriccion 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel1.add(rdBtnVegano, gridBagConstraints);

        panelEditarRestricciones.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnEditarPreferencias.setBackground(new java.awt.Color(51, 51, 51));
        btnEditarPreferencias.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnEditarPreferencias.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOkEditar.png"))); // NOI18N
        btnEditarPreferencias.setText("Confirmar cambios");
        btnEditarPreferencias.setBorderPainted(false);
        btnEditarPreferencias.setContentAreaFilled(false);
        btnEditarPreferencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarPreferencias.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditarPreferencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPreferenciasActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditarPreferencias, java.awt.BorderLayout.EAST);

        panelEditarRestricciones.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        lblEditar.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");

        lblEditarRestricciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarRestricciones.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarRestricciones)
                .addGap(10, 10, 10)
                .addComponent(lblEditar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditarRestricciones)
                    .addComponent(lblEditar))
                .addContainerGap())
        );

        panelEditarRestricciones.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        panelListo.setBackground(new java.awt.Color(51, 51, 51));
        panelListo.setMaximumSize(new java.awt.Dimension(508, 390));
        panelListo.setMinimumSize(new java.awt.Dimension(508, 390));
        panelListo.setPreferredSize(new java.awt.Dimension(508, 390));
        panelListo.setLayout(new java.awt.GridBagLayout());

        lblListo.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblListo.setForeground(new java.awt.Color(255, 255, 255));
        lblListo.setText("Listo!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelListo.add(lblListo, gridBagConstraints);

        lblIconoListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelListo.add(lblIconoListo, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditarRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditarRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPreferenciasActionPerformed
        ArrayList<String> restricciones = new ArrayList<>();
        agregarRestriccionesUsuario(restricciones);
        this.usuarioActual.actualizarRestriccionesUsuario(usuarioActual, restricciones);
        this.panelEditarRestricciones.setVisible(false);
        this.panelListo.setVisible(true);
    }//GEN-LAST:event_btnEditarPreferenciasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema(false);
    }//GEN-LAST:event_formWindowClosing

    void agregarRestriccionesUsuario(ArrayList<String> restricciones) {
        if (this.rdBtnCeliaco.isSelected()) {
            restricciones.add("Celíaco");
        }
        if (this.rdBtnDiabetes.isSelected()) {
            restricciones.add("Diabético");
        }
        if (this.rdBtnVegano.isSelected()) {
            restricciones.add("Veganismo");
        }
        if (this.rdBtnIntoleranteLactosa.isSelected()) {
            restricciones.add("Intolerancia a la lactosa");
        }
    }

    private void cargarListaRestricciones() {
        Sistema.Restricciones[] listaRestricciones = new Sistema.Restricciones[4];
        listaRestricciones[0] = Sistema.Restricciones.CELIAQUIA;
        listaRestricciones[1] = Sistema.Restricciones.DIABETES;
        listaRestricciones[2] = Sistema.Restricciones.INTOLERANCIA_LACTOSA;
        listaRestricciones[3] = Sistema.Restricciones.VEGANISMO;
        for (int i = 0; i < listaRestricciones.length; i++) {
            if (i == 0) {
                this.rdBtnCeliaco.setText("Celiaquía");
            }
            if (i == 1) {
                this.rdBtnDiabetes.setText("Diabetes");
            }
            if (i == 2) {
                this.rdBtnIntoleranteLactosa.setText("Intolerante a la lactosa");
            }
            if (i == 3) {
                this.rdBtnVegano.setText("Veganismo");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPreferencias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditarRestricciones;
    private javax.swing.JLabel lblIconoListo;
    private javax.swing.JLabel lblListo;
    private javax.swing.JLabel lblTxtRestricciones;
    private javax.swing.JPanel panelEditarRestricciones;
    private javax.swing.JPanel panelListo;
    private javax.swing.JRadioButton rdBtnCeliaco;
    private javax.swing.JRadioButton rdBtnDiabetes;
    private javax.swing.JRadioButton rdBtnIntoleranteLactosa;
    private javax.swing.JRadioButton rdBtnVegano;
    // End of variables declaration//GEN-END:variables
}
