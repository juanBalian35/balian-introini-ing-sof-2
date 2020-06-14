package interfaz;

import dominio.Sistema;

import java.awt.*;
import java.util.List;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaRegistrarProfesional extends javax.swing.JDialog {

    private Sistema sistema;
    private ImageIcon fotoDePerfilActual;
    private boolean primeraVez;

    public VentanaRegistrarProfesional(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.fotoDePerfilActual = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandardChico.png"));
        this.primeraVez = true;
        cargarListaPaisesGraduacion();
        Calendar fecha = new GregorianCalendar();
        this.dateChooserFechaNacimiento.setMaxDate(fecha);
        this.dateChooserFechaGraduacion.setMaxDate(fecha);
        this.dateChooserFechaNacimiento.setText("");
        this.dateChooserFechaGraduacion.setText("");
        ocultarEtiquetas();
        this.primeraVez = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel1 = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblValidarNombre = new javax.swing.JLabel();
        lblNombreVacio = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblValidarApellido = new javax.swing.JLabel();
        lblApellidoVacio = new javax.swing.JLabel();
        lblTxtNacionalidad1 = new javax.swing.JLabel();
        btnIngresarFotoPerfil = new javax.swing.JButton();
        lblValidarFechaNac = new javax.swing.JLabel();
        lblTxtFechaNac = new javax.swing.JLabel();
        dateChooserFechaNacimiento = new datechooser.beans.DateChooserCombo();
        lblFechaNacVacio = new javax.swing.JLabel();
        lblTituloProfesional = new javax.swing.JLabel();
        listaTituloProfesional = new javax.swing.JComboBox<>();
        lblValidarTituloProfesional = new javax.swing.JLabel();
        lblTituloVacio = new javax.swing.JLabel();
        lblFechaGraduacion = new javax.swing.JLabel();
        dateChooserFechaGraduacion = new datechooser.beans.DateChooserCombo();
        lblPaisGraduacion = new javax.swing.JLabel();
        listaPaisGraduacion = new javax.swing.JComboBox<>();
        lblValidarPaisGraduacion = new javax.swing.JLabel();
        lblPaisVacio = new javax.swing.JLabel();
        lblValidarFechaGrad = new javax.swing.JLabel();
        lblFechaGradVacio = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblIconoNuevoProfesional = new javax.swing.JLabel();
        lblNuevoProfesional = new javax.swing.JLabel();
        btnCerrarSistema = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        btnIngresarProfesionalASistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1060, 800));
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1060, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout(5, 0));

        panel1.setBackground(new java.awt.Color(164, 211, 249));
        panel1.setMaximumSize(new java.awt.Dimension(260, 800));
        panel1.setMinimumSize(new java.awt.Dimension(260, 800));
        panel1.setPreferredSize(new java.awt.Dimension(260, 800));

        lblTituloVentana.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        lblTituloVentana.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloVentana.setText("Broccoli");

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVolverAtras.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setFocusPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBrocoli.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(116, 116, 116)
                .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.WEST);

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setMaximumSize(new java.awt.Dimension(800, 800));
        panel2.setMinimumSize(new java.awt.Dimension(800, 800));
        panel2.setPreferredSize(new java.awt.Dimension(800, 800));
        panel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel3.setLayout(jPanel3Layout);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(615, 56));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0};
        jPanel1Layout.rowHeights = new int[] {0, 14, 0, 14, 0, 14, 0, 14, 0, 14, 0, 14, 0, 14, 0, 14, 0};
        jPanel1.setLayout(jPanel1Layout);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(lblNombre, gridBagConstraints);

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel1.add(txtNombre, gridBagConstraints);

        lblValidarNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel1.add(lblValidarNombre, gridBagConstraints);

        lblNombreVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNombreVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNombreVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel1.add(lblNombreVacio, gridBagConstraints);

        lblApellido.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido");
        lblApellido.setPreferredSize(new java.awt.Dimension(194, 36));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(lblApellido, gridBagConstraints);

        txtApellido.setBackground(new java.awt.Color(227, 227, 227));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido.setMaximumSize(new java.awt.Dimension(6, 26));
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel1.add(txtApellido, gridBagConstraints);

        lblValidarApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel1.add(lblValidarApellido, gridBagConstraints);

        lblApellidoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblApellidoVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblApellidoVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel1.add(lblApellidoVacio, gridBagConstraints);

        lblTxtNacionalidad1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtNacionalidad1.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtNacionalidad1.setText("Foto de perfil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(lblTxtNacionalidad1, gridBagConstraints);

        btnIngresarFotoPerfil.setFont(new java.awt.Font("Century Gothic", 0, 20));
        btnIngresarFotoPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarFotoUsuario.png"))); // NOI18N
        btnIngresarFotoPerfil.setBorderPainted(false);
        btnIngresarFotoPerfil.setContentAreaFilled(false);
        btnIngresarFotoPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresarFotoPerfil.setMaximumSize(new java.awt.Dimension(110, 110));
        btnIngresarFotoPerfil.setMinimumSize(new java.awt.Dimension(110, 110));
        btnIngresarFotoPerfil.setPreferredSize(new java.awt.Dimension(110, 110));
        btnIngresarFotoPerfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresarFotoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarFotoPerfilActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btnIngresarFotoPerfil, gridBagConstraints);

        lblValidarFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarFechaNac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        jPanel1.add(lblValidarFechaNac, gridBagConstraints);

        lblTxtFechaNac.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtFechaNac.setText("Nacimiento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(lblTxtFechaNac, gridBagConstraints);

        dateChooserFechaNacimiento.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 19));
        dateChooserFechaNacimiento.setMaxDate(new java.util.GregorianCalendar(2017, 10, 9));
        dateChooserFechaNacimiento.setMinDate(new java.util.GregorianCalendar(1917, 10, 1));
        dateChooserFechaNacimiento.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        dateChooserFechaNacimiento.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dateChooserFechaNacimientoOnCommit(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(dateChooserFechaNacimiento, gridBagConstraints);

        lblFechaNacVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblFechaNacVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblFechaNacVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        jPanel1.add(lblFechaNacVacio, gridBagConstraints);

        lblTituloProfesional.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTituloProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloProfesional.setText("Seleccione el título profesional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(lblTituloProfesional, gridBagConstraints);

        listaTituloProfesional.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaTituloProfesional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Ciencia de los alimentos", "Entrenador físico e instructor aeróbico", "Ingeniería en alimentos", "Licenciatura en nutrición", "Maestro de salud y educación física", "Medicina", "Nutrición Humana y Dietética", "Nutricionista", "Técnicatura en Gestión Gastronómica", "Técnicatura en tecnología de alimentos", "Técnico operador de alimentos", "Otro..." }));
        listaTituloProfesional.setMinimumSize(new java.awt.Dimension(419, 32));
        listaTituloProfesional.setPreferredSize(new java.awt.Dimension(419, 32));
        listaTituloProfesional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaTituloProfesionalItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(listaTituloProfesional, gridBagConstraints);

        lblValidarTituloProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarTituloProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        jPanel1.add(lblValidarTituloProfesional, gridBagConstraints);

        lblTituloVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblTituloVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblTituloVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        jPanel1.add(lblTituloVacio, gridBagConstraints);

        lblFechaGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblFechaGraduacion.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaGraduacion.setText("Fecha de graduación");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(lblFechaGraduacion, gridBagConstraints);

        dateChooserFechaGraduacion.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 19));
        dateChooserFechaGraduacion.setMaxDate(new java.util.GregorianCalendar(2017, 10, 9));
        dateChooserFechaGraduacion.setMinDate(new java.util.GregorianCalendar(1917, 10, 1));
        dateChooserFechaGraduacion.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        dateChooserFechaGraduacion.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dateChooserFechaGraduacionOnCommit(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 129, 0, 0);
        jPanel1.add(dateChooserFechaGraduacion, gridBagConstraints);

        lblPaisGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblPaisGraduacion.setForeground(new java.awt.Color(255, 255, 255));
        lblPaisGraduacion.setText("Seleccione el pais de graduación");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(lblPaisGraduacion, gridBagConstraints);

        listaPaisGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaPaisGraduacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaPaisGraduacionItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(listaPaisGraduacion, gridBagConstraints);

        lblValidarPaisGraduacion.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarPaisGraduacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        jPanel1.add(lblValidarPaisGraduacion, gridBagConstraints);

        lblPaisVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblPaisVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblPaisVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        jPanel1.add(lblPaisVacio, gridBagConstraints);

        lblValidarFechaGrad.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarFechaGrad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        jPanel1.add(lblValidarFechaGrad, gridBagConstraints);

        lblFechaGradVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblFechaGradVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblFechaGradVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        jPanel1.add(lblFechaGradVacio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 65, 0, 0);
        jPanel3.add(jPanel1, gridBagConstraints);

        panel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel4.setLayout(jPanel4Layout);

        lblIconoNuevoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel4.add(lblIconoNuevoProfesional, gridBagConstraints);

        lblNuevoProfesional.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoProfesional.setText("Nuevo Profesional");
        lblNuevoProfesional.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel4.add(lblNuevoProfesional, gridBagConstraints);

        btnCerrarSistema.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema.setAlignmentX(0.5F);
        btnCerrarSistema.setBorderPainted(false);
        btnCerrarSistema.setContentAreaFilled(false);
        btnCerrarSistema.setFocusPainted(false);
        btnCerrarSistema.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistemaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel4.add(btnCerrarSistema, gridBagConstraints);

        panel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel2.setLayout(jPanel2Layout);

        lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos.setText("Aún quedan datos incorrectos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(lblDatosIncorrectos, gridBagConstraints);

        btnIngresarProfesionalASistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnIngresarProfesionalASistema.setBorderPainted(false);
        btnIngresarProfesionalASistema.setContentAreaFilled(false);
        btnIngresarProfesionalASistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarProfesionalASistemaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(btnIngresarProfesionalASistema, gridBagConstraints);

        panel2.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(panel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public ImageIcon getFotoDePerfilActual() {
        return fotoDePerfilActual;
    }

    public void setFotoDePerfilActual(ImageIcon unaFoto) {
        this.fotoDePerfilActual = unaFoto;
    }

    public boolean getPrimeraVezEnSistema() {
        return primeraVez;
    }

    public void setPrimeraVezEnSistema(boolean primera) {
        this.primeraVez = primera;
    }

    private void btnIngresarProfesionalASistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarProfesionalASistemaActionPerformed
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        String tituloProfesional = (String) this.listaTituloProfesional.getSelectedItem();
        String paisGraduacion = (String) this.listaPaisGraduacion.getSelectedItem();
        String fechaNacimiento = this.dateChooserFechaNacimiento.getText();
        String fechaGraduacion = this.dateChooserFechaGraduacion.getText();
        if (nombre.equals("") || apellido.equals("") || tituloProfesional.equals("Seleccione...") || paisGraduacion.equals("Seleccione...")
                || fechaNacimiento.isEmpty() || fechaGraduacion.isEmpty()) {
            this.lblDatosIncorrectos.setVisible(true);
            mostrarErrores(nombre, apellido, tituloProfesional, paisGraduacion, fechaGraduacion,fechaNacimiento);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            boolean seAgregoProfesional = this.getSistema().crearProfesional(nombre, apellido, fechaNacimiento, this.fotoDePerfilActual, tituloProfesional, fechaGraduacion, paisGraduacion);
            if (seAgregoProfesional) {
                this.txtNombre.setText("");
                this.txtApellido.setText("");
                VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
                this.setVisible(false);
                vPrincipal.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnIngresarProfesionalASistemaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_formWindowClosing

    private void listaTituloProfesionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaTituloProfesionalItemStateChanged
        String tituloIngresado = (String) this.listaTituloProfesional.getSelectedItem();
        if (tituloIngresado.equals("Seleccione...")) {
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
            this.lblTituloVacio.setVisible(true);
        } else {
            this.lblTituloVacio.setVisible(false);
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
        }
    }//GEN-LAST:event_listaTituloProfesionalItemStateChanged

    private void listaPaisGraduacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaPaisGraduacionItemStateChanged
        if (!this.primeraVez) {
            String paisGraduacionIngresado = (String) this.listaPaisGraduacion.getSelectedItem();
            if (paisGraduacionIngresado.equals("Seleccione...")) {
                this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarPaisGraduacion.setVisible(true);
                this.lblPaisVacio.setVisible(true);
            } else {
                this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarPaisGraduacion.setVisible(true);
                this.lblPaisVacio.setVisible(false);
            }
        }
    }//GEN-LAST:event_listaPaisGraduacionItemStateChanged

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombreIngresado = this.txtNombre.getText();
        if (nombreIngresado.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        } else {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        String apellidoIngresado = this.txtApellido.getText();
        if (apellidoIngresado.equals("")) {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(true);
        } else {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void btnIngresarFotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFotoPerfilActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Imagenes(png, jpg, jpeg, bmp)", "png", "jpeg", "jpg", "bmp");
        fileChooser.setFileFilter(file);
        fileChooser.setAcceptAllFileFilterUsed(false);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            if(fileChooser.getSelectedFile().exists()){
                ImageIcon iconoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
                Image image = iconoPerfil.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon iconoNuevo = new ImageIcon(image);
                
                this.btnIngresarFotoPerfil.setIcon(iconoNuevo);
                this.fotoDePerfilActual = iconoPerfil;
            }
            else{
                String mensajeError = "El archivo seleccionado no existe.";

                JOptionPane.showMessageDialog(null, mensajeError, "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnIngresarFotoPerfilActionPerformed

    private void btnCerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistemaActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistemaActionPerformed

    private void dateChooserFechaGraduacionOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserFechaGraduacionOnCommit
        String fecha = this.dateChooserFechaGraduacion.getText();
        if (fecha.equals("")) {
            this.lblValidarFechaGrad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarFechaGrad.setVisible(true);
            this.lblFechaGradVacio.setVisible(true);
        } else {
            this.lblValidarFechaGrad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarFechaGrad.setVisible(true);
            this.lblFechaGradVacio.setVisible(false);
        }
    }//GEN-LAST:event_dateChooserFechaGraduacionOnCommit

    private void dateChooserFechaNacimientoOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserFechaNacimientoOnCommit
        String fecha = this.dateChooserFechaNacimiento.getText();
        if (fecha.equals("")) {
            this.lblValidarFechaNac.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarFechaNac.setVisible(true);
            this.lblFechaNacVacio.setVisible(true);
        } else {
            this.lblValidarFechaNac.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarFechaNac.setVisible(true);
            this.lblFechaNacVacio.setVisible(false);
        }
    }//GEN-LAST:event_dateChooserFechaNacimientoOnCommit


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSistema;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarFotoPerfil;
    private javax.swing.JButton btnIngresarProfesionalASistema;
    private datechooser.beans.DateChooserCombo dateChooserFechaGraduacion;
    private datechooser.beans.DateChooserCombo dateChooserFechaNacimiento;
    private javax.swing.JLabel icono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoVacio;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblFechaGradVacio;
    private javax.swing.JLabel lblFechaGraduacion;
    private javax.swing.JLabel lblFechaNacVacio;
    private javax.swing.JLabel lblIconoNuevoProfesional;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreVacio;
    private javax.swing.JLabel lblNuevoProfesional;
    private javax.swing.JLabel lblPaisGraduacion;
    private javax.swing.JLabel lblPaisVacio;
    private javax.swing.JLabel lblTituloProfesional;
    private javax.swing.JLabel lblTituloVacio;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JLabel lblTxtFechaNac;
    private javax.swing.JLabel lblTxtNacionalidad1;
    private javax.swing.JLabel lblValidarApellido;
    private javax.swing.JLabel lblValidarFechaGrad;
    private javax.swing.JLabel lblValidarFechaNac;
    private javax.swing.JLabel lblValidarNombre;
    private javax.swing.JLabel lblValidarPaisGraduacion;
    private javax.swing.JLabel lblValidarTituloProfesional;
    private javax.swing.JComboBox<String> listaPaisGraduacion;
    private javax.swing.JComboBox<String> listaTituloProfesional;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void ocultarEtiquetas() {
        this.lblValidarNombre.setVisible(false);
        this.lblValidarApellido.setVisible(false);
        this.lblValidarTituloProfesional.setVisible(false);
        this.lblValidarPaisGraduacion.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblNombreVacio.setVisible(false);
        this.lblApellidoVacio.setVisible(false);
        this.lblTituloVacio.setVisible(false);
        this.lblPaisVacio.setVisible(false);
        this.lblValidarFechaNac.setVisible(false);
        this.lblFechaNacVacio.setVisible(false);
        this.lblValidarFechaGrad.setVisible(false);
        this.lblFechaGradVacio.setVisible(false);
    }

    private void cargarListaPaisesGraduacion() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        List<String> paisesEnSistema = sistema.devolverListaPaises();
        this.listaPaisGraduacion.setModel(modelo);
        this.listaPaisGraduacion.addItem("Seleccione...");
        for (int i = 0; i < paisesEnSistema.size(); i++) {
            this.listaPaisGraduacion.addItem(paisesEnSistema.get(i));
        }
    }

    private void mostrarErrores(String nombre, String apellido, String tituloProfesional, String paisGraduacion, String fechaGraduacion, String fechaNacimiento) {
        if (nombre.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        }
        if (apellido.equals("")) {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(true);
        }
        if (tituloProfesional.equals("Seleccione...")) {
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
            this.lblTituloVacio.setVisible(true);
        }
        if (paisGraduacion.equals("Seleccione...")) {
            this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarPaisGraduacion.setVisible(true);
            this.lblPaisVacio.setVisible(true);
        }
        if (fechaGraduacion.isEmpty()) {
            this.lblValidarFechaGrad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarFechaGrad.setVisible(true);
            this.lblFechaGradVacio.setVisible(true);
        }
        if (fechaNacimiento.isEmpty()) {
            this.lblValidarFechaNac.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarFechaNac.setVisible(true);
            this.lblFechaNacVacio.setVisible(true);
        }
    }

}
