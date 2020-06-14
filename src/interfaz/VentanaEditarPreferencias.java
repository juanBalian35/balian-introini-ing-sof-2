package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;

public class VentanaEditarPreferencias extends javax.swing.JDialog {

    private Sistema sistema;
    private Usuario usuarioActual;

    public VentanaEditarPreferencias(Sistema unSistema, Usuario unUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.usuarioActual = unUsuario;
        cargarListaPreferencias();
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

        panelEditarPreferencias = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblEditarPreferencias = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rdBtnCarnesBlancas = new javax.swing.JRadioButton();
        rdBtnCarnesRojas = new javax.swing.JRadioButton();
        rdBtnFrutas = new javax.swing.JRadioButton();
        rdBtnHarinas = new javax.swing.JRadioButton();
        rdBtnVerduras = new javax.swing.JRadioButton();
        lblTxtPreferencias = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEditarPreferencias = new javax.swing.JButton();
        panelListo = new javax.swing.JPanel();
        lblListo = new javax.swing.JLabel();
        lblIconoListo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(508, 450));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelEditarPreferencias.setBackground(new java.awt.Color(51, 51, 51));
        panelEditarPreferencias.setMaximumSize(new java.awt.Dimension(508, 450));
        panelEditarPreferencias.setMinimumSize(new java.awt.Dimension(508, 450));
        panelEditarPreferencias.setPreferredSize(new java.awt.Dimension(508, 450));
        panelEditarPreferencias.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(205, 72));

        lblEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarPreferencias.png"))); // NOI18N

        lblEditar.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblEditarPreferencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEditar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditarPreferencias)
            .addComponent(lblEditar)
        );

        panelEditarPreferencias.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0};
        jPanel3Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel3Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel3.setLayout(jPanel3Layout);

        rdBtnCarnesBlancas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCarnesBlancas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCarnesBlancas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCarnesBlancas.setText("Preferencia 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel3.add(rdBtnCarnesBlancas, gridBagConstraints);

        rdBtnCarnesRojas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCarnesRojas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCarnesRojas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCarnesRojas.setText("Preferencia 1");
        rdBtnCarnesRojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnCarnesRojasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel3.add(rdBtnCarnesRojas, gridBagConstraints);

        rdBtnFrutas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnFrutas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnFrutas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnFrutas.setText("Preferencia 4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel3.add(rdBtnFrutas, gridBagConstraints);

        rdBtnHarinas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnHarinas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnHarinas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnHarinas.setText("Preferencia 5");
        rdBtnHarinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnHarinasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel3.add(rdBtnHarinas, gridBagConstraints);

        rdBtnVerduras.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnVerduras.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnVerduras.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnVerduras.setText("Preferencia 3");
        rdBtnVerduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnVerdurasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel3.add(rdBtnVerduras, gridBagConstraints);

        lblTxtPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtPreferencias.setText("Preferencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 60, 0, 0);
        jPanel3.add(lblTxtPreferencias, gridBagConstraints);

        panelEditarPreferencias.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnEditarPreferencias.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnEditarPreferencias.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOkEditar.png"))); // NOI18N
        btnEditarPreferencias.setText("Confirmar cambios");
        btnEditarPreferencias.setBorderPainted(false);
        btnEditarPreferencias.setContentAreaFilled(false);
        btnEditarPreferencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarPreferencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPreferenciasActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditarPreferencias, java.awt.BorderLayout.EAST);

        panelEditarPreferencias.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        panelListo.setBackground(new java.awt.Color(51, 51, 51));
        panelListo.setMaximumSize(new java.awt.Dimension(508, 450));
        panelListo.setMinimumSize(new java.awt.Dimension(508, 450));
        panelListo.setPreferredSize(new java.awt.Dimension(508, 450));
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
            .addComponent(panelEditarPreferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditarPreferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdBtnHarinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnHarinasActionPerformed
    }//GEN-LAST:event_rdBtnHarinasActionPerformed

    private void rdBtnCarnesRojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnCarnesRojasActionPerformed
    }//GEN-LAST:event_rdBtnCarnesRojasActionPerformed

    private void btnEditarPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPreferenciasActionPerformed
        ArrayList<String> preferencias = new ArrayList<>();
        agregarPreferenciasUsuario(preferencias);
        this.usuarioActual.actualizarPreferenciasUsuario(usuarioActual, preferencias);
        this.panelListo.setVisible(true);
        this.panelEditarPreferencias.setVisible(false);
    }//GEN-LAST:event_btnEditarPreferenciasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_formWindowClosing

    private void rdBtnVerdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnVerdurasActionPerformed
    }//GEN-LAST:event_rdBtnVerdurasActionPerformed

    void agregarPreferenciasUsuario(ArrayList<String> preferencias) {
        if (this.rdBtnCarnesBlancas.isSelected()) {
            preferencias.add("Carnes Blancas");
        }
        if (this.rdBtnCarnesRojas.isSelected()) {
            preferencias.add("Carnes Rojas");
        }
        if (this.rdBtnFrutas.isSelected()) {
            preferencias.add("Frutas");
        }
        if (this.rdBtnVerduras.isSelected()) {
            preferencias.add("Verduras");
        }
        if (this.rdBtnHarinas.isSelected()) {
            preferencias.add("Harinas");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPreferencias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditarPreferencias;
    private javax.swing.JLabel lblIconoListo;
    private javax.swing.JLabel lblListo;
    private javax.swing.JLabel lblTxtPreferencias;
    private javax.swing.JPanel panelEditarPreferencias;
    private javax.swing.JPanel panelListo;
    private javax.swing.JRadioButton rdBtnCarnesBlancas;
    private javax.swing.JRadioButton rdBtnCarnesRojas;
    private javax.swing.JRadioButton rdBtnFrutas;
    private javax.swing.JRadioButton rdBtnHarinas;
    private javax.swing.JRadioButton rdBtnVerduras;
    // End of variables declaration//GEN-END:variables

   private void cargarListaPreferencias() {
        Sistema.Preferencias[] listaPreferencias = new Sistema.Preferencias[5];
        listaPreferencias[0] = Sistema.Preferencias.CARNES_BLANCAS;
        listaPreferencias[1] = Sistema.Preferencias.CARNES_ROJAS;
        listaPreferencias[2] = Sistema.Preferencias.FRUTAS;
        listaPreferencias[3] = Sistema.Preferencias.HARINAS;
        listaPreferencias[4] = Sistema.Preferencias.VERDURAS;
        for (int i = 0; i < listaPreferencias.length; i++) {
            if (i == 0) {
                this.rdBtnCarnesRojas.setText("Carnes Rojas");
            }
            if (i == 1) {
                this.rdBtnCarnesBlancas.setText("Carnes Blancas");
            }
            if (i == 2) {
                this.rdBtnFrutas.setText("Frutas");
            }
            if (i == 3) {
                this.rdBtnHarinas.setText("Harinas");
            }
            if (i == 4) {
                this.rdBtnVerduras.setText("Verduras");
            }
        }
    }

}
