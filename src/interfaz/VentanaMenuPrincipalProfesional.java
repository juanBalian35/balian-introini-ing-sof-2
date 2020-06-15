package interfaz;

import dominio.*;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class VentanaMenuPrincipalProfesional extends javax.swing.JDialog {
    private Sistema sistema;
    private Usuario usuarioSeleccionado;
    private ImageIcon fotoDeAlimentoActual;
    private final boolean[] nutrientesSeleccionados;
    private String diaDeLaSemanaAnterior;
    private String diaDeLaSemanaActual;
    private final String[][] planAlimentacion;
    private PlanAlimentacion planSeleccionado;

    public VentanaMenuPrincipalProfesional(Sistema unSistema) {
        initComponents();
        sistema = unSistema;
        this.setLocationRelativeTo(null);
        ocultarPaneles();
        this.panelVacio.setVisible(true);
        this.nutrientesSeleccionados = new boolean[7];
        this.diaDeLaSemanaAnterior = "Lunes";
        this.planAlimentacion = new String[7][3];
        this.diaDeLaSemanaActual = "Lunes";
        this.fotoDeAlimentoActual = new ImageIcon(getClass().getResource("/Imagenes/fotoDelAlimentoEstandar.png"));
        lblValidarTipoAlimento.setVisible(false);
        lblValidarNombre.setVisible(false);
        lblDatosIncorrectos.setVisible(false);
        ocultarPrincipalesNutrientes();
        this.panelVacio.setVisible(true);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public ImageIcon getFotoDeAlimentoActual() {
        return fotoDeAlimentoActual;
    }

    public void setFotoDeAlimentoActual(ImageIcon unaFoto) {
        this.fotoDeAlimentoActual = unaFoto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelMenu = new javax.swing.JPanel();
        btnConsultasPendientes = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblConsultasPendientes = new javax.swing.JLabel();
        btnPlanesSolicitados = new javax.swing.JButton();
        lblPlanesSolicitados = new javax.swing.JLabel();
        lblPlanesSolicitados2 = new javax.swing.JLabel();
        btnIngresarAlimento = new javax.swing.JButton();
        lblIngresarAlimento = new javax.swing.JLabel();
        lblIngresarAlimento2 = new javax.swing.JLabel();
        panelDerecho = new javax.swing.JPanel();
        panelVacio = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        btnCerrarSistema8 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();
        panelNoHayPlanesPendientes = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNoHayAlimentosIcono = new javax.swing.JLabel();
        lblNoHayAlimentos1 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblNoHayAlimentos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNohayPlanesTexto1 = new javax.swing.JLabel();
        lblNohayConsultasTexto2 = new javax.swing.JLabel();
        lblNohayPlanesIcono = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        btnCerrarSistema7 = new javax.swing.JButton();
        panelNoHayConsultasPendientes = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNohayConsultasTexto = new javax.swing.JLabel();
        lblNohayConsultas = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        btnCerrarSistema6 = new javax.swing.JButton();
        panelConsultaConProfesional = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaConversaciones = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        panelConversacion = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMostrarConversacion = new javax.swing.JTextPane();
        btnEnviarMensaje = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensajeNuevo = new javax.swing.JTextArea();
        panelConversacionOk = new javax.swing.JPanel();
        panelMostrarOk = new javax.swing.JPanel();
        lblOK = new javax.swing.JLabel();
        lblOKTexto = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblFotoProfesional = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        btnVerPerfilDeUsuario = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lblIconoInicioSesion = new javax.swing.JLabel();
        lblInicioSesion = new javax.swing.JLabel();
        btnCerrarSistema = new javax.swing.JButton();
        panelElaborarPlan = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lblNombreDelDia = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        textCena = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        textAlmuerzo = new javax.swing.JTextArea();
        lblDesayuno = new javax.swing.JLabel();
        lblAlmuerzo = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        textDesayuno = new javax.swing.JTextArea();
        lblCena = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnAgregarAlPlan = new javax.swing.JButton();
        listaComidasPlan = new javax.swing.JComboBox<>();
        lblNombrePlanVacio = new javax.swing.JLabel();
        btnEliminarDelPlan = new javax.swing.JButton();
        listaDiasDeLaSemana = new javax.swing.JComboBox<>();
        lblComida = new javax.swing.JLabel();
        lblNombrePlan = new javax.swing.JLabel();
        txtNombrePlan = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaAlimentosEnSistema = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        lblValidarNombrePlan = new javax.swing.JLabel();
        btnEliminarDelPlan1 = new javax.swing.JButton();
        lblAlimentos = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btnElaborarPlan1 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        lblIconoInicioSesion1 = new javax.swing.JLabel();
        lblInicioSesion1 = new javax.swing.JLabel();
        btnCerrarSistema1 = new javax.swing.JButton();
        panelMostrarPlanEnviado = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        lblOK2 = new javax.swing.JLabel();
        lblOKTexto2 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        btnCerrarSistema5 = new javax.swing.JButton();
        panelPlanAlimentacion = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        panelPerfilDeUsuario = new javax.swing.JPanel();
        lblNombreUsuario2 = new javax.swing.JLabel();
        lblFotoDeUsuario = new javax.swing.JLabel();
        lblTxtFechaNacimiento = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblTxtRestricciones = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaRestricciones = new javax.swing.JList<>();
        lblPreferencias = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaPreferencias = new javax.swing.JList<>();
        lblIngestas = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaIngestas = new javax.swing.JList<>();
        btnElaborarPlan = new javax.swing.JButton();
        panelIzquierdo = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPlanesPendientes = new javax.swing.JList<>();
        lblElijaUnUsuario = new javax.swing.JLabel();
        panelDatosUsuario = new javax.swing.JPanel();
        lblIconoInicioSesion2 = new javax.swing.JLabel();
        lblInicioSesion2 = new javax.swing.JLabel();
        btnCerrarSistema2 = new javax.swing.JButton();
        panelNuevoAlimento = new javax.swing.JPanel();
        panelAlimentroRegistradoCorrectamente = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblNoPlanes2 = new javax.swing.JLabel();
        lblNohayPlanesTexto2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        btnCerrarSistema4 = new javax.swing.JButton();
        panelIngresarAlimentoAlSistema = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        btnIngresarAlimentoASistema = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        checkVitaminas = new javax.swing.JCheckBox();
        checkHidratos = new javax.swing.JCheckBox();
        txtMinerales = new javax.swing.JTextField();
        txtHidratos = new javax.swing.JTextField();
        txtVitaminas = new javax.swing.JTextField();
        txtGlucidos = new javax.swing.JTextField();
        txtFibra = new javax.swing.JTextField();
        txtLipidos = new javax.swing.JTextField();
        checkFibra = new javax.swing.JCheckBox();
        checkLipidos = new javax.swing.JCheckBox();
        checkGlucidos = new javax.swing.JCheckBox();
        checkProteínas = new javax.swing.JCheckBox();
        checkMinerales = new javax.swing.JCheckBox();
        txtProteínas = new javax.swing.JTextField();
        lblPrincipalesNutrientes = new javax.swing.JLabel();
        lblGramosProteinas = new javax.swing.JLabel();
        lblGramosVitaminas = new javax.swing.JLabel();
        lblGramosGlucidos = new javax.swing.JLabel();
        lblGramosMinerales = new javax.swing.JLabel();
        lblGramosFibras = new javax.swing.JLabel();
        lblGramosLipidos = new javax.swing.JLabel();
        lblGramosHidratos = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lblValidarTipoAlimento = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblValidarNombre = new javax.swing.JLabel();
        lblNombreVacio = new javax.swing.JLabel();
        lblTipoAlimento = new javax.swing.JLabel();
        listaTipoAlimentos = new javax.swing.JComboBox<>();
        lblTipoAlimentoVacio = new javax.swing.JLabel();
        lblTxtNacionalidad1 = new javax.swing.JLabel();
        btnIngresarFotoAlimento = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        lblIconoInicioSesion3 = new javax.swing.JLabel();
        lblInicioSesion3 = new javax.swing.JLabel();
        btnCerrarSistema3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout(5, 0));

        panelMenu.setBackground(new java.awt.Color(164, 211, 249));
        panelMenu.setMaximumSize(new java.awt.Dimension(260, 800));
        panelMenu.setMinimumSize(new java.awt.Dimension(260, 800));
        panelMenu.setPreferredSize(new java.awt.Dimension(260, 800));

        btnConsultasPendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultasPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultasPendientes.png"))); // NOI18N
        btnConsultasPendientes.setBorder(null);
        btnConsultasPendientes.setBorderPainted(false);
        btnConsultasPendientes.setContentAreaFilled(false);
        btnConsultasPendientes.setFocusPainted(false);
        btnConsultasPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasPendientesActionPerformed(evt);
            }
        });

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

        lblConsultasPendientes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblConsultasPendientes.setText("Consultas pendientes");

        btnPlanesSolicitados.setForeground(new java.awt.Color(255, 255, 255));
        btnPlanesSolicitados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPlanesSolicitados.png"))); // NOI18N
        btnPlanesSolicitados.setBorder(null);
        btnPlanesSolicitados.setBorderPainted(false);
        btnPlanesSolicitados.setContentAreaFilled(false);
        btnPlanesSolicitados.setFocusPainted(false);
        btnPlanesSolicitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanesSolicitadosActionPerformed(evt);
            }
        });

        lblPlanesSolicitados.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPlanesSolicitados.setText("Planes de alimentación");

        lblPlanesSolicitados2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPlanesSolicitados2.setText("solicitados");

        btnIngresarAlimento.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoIngresarAlimentoProfesional.png"))); // NOI18N
        btnIngresarAlimento.setBorder(null);
        btnIngresarAlimento.setBorderPainted(false);
        btnIngresarAlimento.setContentAreaFilled(false);
        btnIngresarAlimento.setFocusPainted(false);
        btnIngresarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoActionPerformed(evt);
            }
        });

        lblIngresarAlimento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIngresarAlimento.setText("Ingresar un alimento");

        lblIngresarAlimento2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIngresarAlimento2.setText("al sistema");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblPlanesSolicitados2))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblIngresarAlimento2))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblIngresarAlimento)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(btnPlanesSolicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlanesSolicitados)
                            .addComponent(lblConsultasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(btnIngresarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(btnConsultasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(32, 32, 32)
                .addComponent(btnConsultasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConsultasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnPlanesSolicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPlanesSolicitados)
                .addGap(18, 18, 18)
                .addComponent(lblPlanesSolicitados2)
                .addGap(53, 53, 53)
                .addComponent(btnIngresarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngresarAlimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngresarAlimento2)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.WEST);

        panelDerecho.setBackground(new java.awt.Color(51, 51, 51));
        panelDerecho.setMaximumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setMinimumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setPreferredSize(new java.awt.Dimension(800, 800));
        panelDerecho.setLayout(new java.awt.CardLayout());

        panelVacio.setBackground(new java.awt.Color(51, 51, 51));
        panelVacio.setMaximumSize(new java.awt.Dimension(800, 800));
        panelVacio.setMinimumSize(new java.awt.Dimension(800, 800));
        panelVacio.setPreferredSize(new java.awt.Dimension(800, 800));
        panelVacio.setLayout(new java.awt.BorderLayout());

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel27Layout = new java.awt.GridBagLayout();
        jPanel27Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel27.setLayout(jPanel27Layout);

        btnCerrarSistema8.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema8.setAlignmentX(0.5F);
        btnCerrarSistema8.setBorderPainted(false);
        btnCerrarSistema8.setContentAreaFilled(false);
        btnCerrarSistema8.setFocusPainted(false);
        btnCerrarSistema8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistema8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel27.add(btnCerrarSistema8, gridBagConstraints);

        panelVacio.add(jPanel27, java.awt.BorderLayout.PAGE_START);

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel28Layout = new java.awt.GridBagLayout();
        jPanel28Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel28.setLayout(jPanel28Layout);

        btnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Question_Mark_64px.png"))); // NOI18N
        btnAyuda.setBorder(null);
        btnAyuda.setBorderPainted(false);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setFocusPainted(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel28.add(btnAyuda, gridBagConstraints);

        panelVacio.add(jPanel28, java.awt.BorderLayout.PAGE_END);

        panelDerecho.add(panelVacio, "card7");

        panelNoHayPlanesPendientes.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayPlanesPendientes.setMaximumSize(new java.awt.Dimension(800, 800));
        panelNoHayPlanesPendientes.setMinimumSize(new java.awt.Dimension(800, 800));
        panelNoHayPlanesPendientes.setName(""); // NOI18N
        panelNoHayPlanesPendientes.setPreferredSize(new java.awt.Dimension(800, 800));
        panelNoHayPlanesPendientes.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblNoHayAlimentosIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(lblNoHayAlimentosIcono, gridBagConstraints);

        lblNoHayAlimentos1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayAlimentos1.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayAlimentos1.setText("No hay alimentos registrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(lblNoHayAlimentos1, gridBagConstraints);

        jPanel30.setBackground(new java.awt.Color(51, 51, 51));
        jPanel30.setLayout(new java.awt.GridBagLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoMensaje.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel30.add(jButton1, gridBagConstraints);

        lblNoHayAlimentos.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayAlimentos.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayAlimentos.setText("Crear");
        lblNoHayAlimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel30.add(lblNoHayAlimentos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jPanel30, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lblNohayPlanesTexto1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayPlanesTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayPlanesTexto1.setText("No hay planes de alimentación");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(lblNohayPlanesTexto1, gridBagConstraints);

        lblNohayConsultasTexto2.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto2.setText("pendientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel3.add(lblNohayConsultasTexto2, gridBagConstraints);

        lblNohayPlanesIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(lblNohayPlanesIcono, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jPanel3, gridBagConstraints);

        panelNoHayPlanesPendientes.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel26Layout = new java.awt.GridBagLayout();
        jPanel26Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel26.setLayout(jPanel26Layout);

        btnCerrarSistema7.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema7.setAlignmentX(0.5F);
        btnCerrarSistema7.setBorderPainted(false);
        btnCerrarSistema7.setContentAreaFilled(false);
        btnCerrarSistema7.setFocusPainted(false);
        btnCerrarSistema7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistema7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel26.add(btnCerrarSistema7, gridBagConstraints);

        panelNoHayPlanesPendientes.add(jPanel26, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelNoHayPlanesPendientes, "card3");

        panelNoHayConsultasPendientes.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayConsultasPendientes.setMaximumSize(new java.awt.Dimension(800, 800));
        panelNoHayConsultasPendientes.setMinimumSize(new java.awt.Dimension(800, 800));
        panelNoHayConsultasPendientes.setName(""); // NOI18N
        panelNoHayConsultasPendientes.setPreferredSize(new java.awt.Dimension(800, 800));
        panelNoHayConsultasPendientes.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblNohayConsultasTexto.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto.setText("No hay consultas pendientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(lblNohayConsultasTexto, gridBagConstraints);

        lblNohayConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(lblNohayConsultas, gridBagConstraints);

        panelNoHayConsultasPendientes.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel25Layout = new java.awt.GridBagLayout();
        jPanel25Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel25.setLayout(jPanel25Layout);

        btnCerrarSistema6.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema6.setAlignmentX(0.5F);
        btnCerrarSistema6.setBorderPainted(false);
        btnCerrarSistema6.setContentAreaFilled(false);
        btnCerrarSistema6.setFocusPainted(false);
        btnCerrarSistema6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistema6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel25.add(btnCerrarSistema6, gridBagConstraints);

        panelNoHayConsultasPendientes.add(jPanel25, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelNoHayConsultasPendientes, "card3");

        panelConsultaConProfesional.setBackground(new java.awt.Color(51, 51, 51));
        panelConsultaConProfesional.setMaximumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setMinimumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setPreferredSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel7Layout = new java.awt.GridBagLayout();
        jPanel7Layout.columnWidths = new int[] {0, 25, 0};
        jPanel7.setLayout(jPanel7Layout);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        listaConversaciones.setBackground(new java.awt.Color(51, 51, 51));
        listaConversaciones.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaConversaciones.setForeground(new java.awt.Color(255, 255, 255));
        listaConversaciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaConversacionesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaConversaciones);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 461;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel7.add(jPanel6, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel7.add(jLabel1, gridBagConstraints);

        panelConversacion.setBackground(new java.awt.Color(51, 51, 51));
        panelConversacion.setOpaque(false);
        panelConversacion.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(728, 599));
        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0, 15, 0};
        jPanel5Layout.rowHeights = new int[] {0, 25, 0};
        jPanel5.setLayout(jPanel5Layout);

        txtMostrarConversacion.setEditable(false);
        txtMostrarConversacion.setBackground(new java.awt.Color(238, 238, 238));
        txtMostrarConversacion.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMostrarConversacion.setAutoscrolls(false);
        jScrollPane2.setViewportView(txtMostrarConversacion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 430;
        gridBagConstraints.ipady = 338;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane2, gridBagConstraints);

        btnEnviarMensaje.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEnviarMensaje.png"))); // NOI18N
        btnEnviarMensaje.setBorderPainted(false);
        btnEnviarMensaje.setContentAreaFilled(false);
        btnEnviarMensaje.setFocusPainted(false);
        btnEnviarMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnviarMensaje.setLabel("Enviar");
        btnEnviarMensaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel5.add(btnEnviarMensaje, gridBagConstraints);

        txtMensajeNuevo.setBackground(new java.awt.Color(238, 238, 238));
        txtMensajeNuevo.setColumns(20);
        txtMensajeNuevo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMensajeNuevo.setRows(5);
        jScrollPane1.setViewportView(txtMensajeNuevo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 353;
        gridBagConstraints.ipady = 139;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelConversacion.add(jPanel5, gridBagConstraints);

        panelConversacionOk.setBackground(new java.awt.Color(51, 51, 51));

        panelMostrarOk.setBackground(new java.awt.Color(51, 51, 51));

        lblOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        lblOKTexto.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblOKTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblOKTexto.setText("Mensaje Enviado");

        javax.swing.GroupLayout panelMostrarOkLayout = new javax.swing.GroupLayout(panelMostrarOk);
        panelMostrarOk.setLayout(panelMostrarOkLayout);
        panelMostrarOkLayout.setHorizontalGroup(
            panelMostrarOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarOkLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOK)
                .addGap(116, 116, 116))
            .addGroup(panelMostrarOkLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblOKTexto)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelMostrarOkLayout.setVerticalGroup(
            panelMostrarOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarOkLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblOKTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOK, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelConversacionOkLayout = new javax.swing.GroupLayout(panelConversacionOk);
        panelConversacionOk.setLayout(panelConversacionOkLayout);
        panelConversacionOkLayout.setHorizontalGroup(
            panelConversacionOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversacionOkLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(panelMostrarOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConversacionOkLayout.setVerticalGroup(
            panelConversacionOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversacionOkLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(panelMostrarOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelConversacion.add(panelConversacionOk, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(panelConversacion, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        lblFotoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandardChico.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel8.add(lblFotoProfesional, gridBagConstraints);

        lblNombreUsuario.setFont(new java.awt.Font("Levenim MT", 0, 30)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel8.add(lblNombreUsuario, gridBagConstraints);

        btnVerPerfilDeUsuario.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnVerPerfilDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVerPerfilUsuarioChico.png"))); // NOI18N
        btnVerPerfilDeUsuario.setText("Verperfil de usuario");
        btnVerPerfilDeUsuario.setBorderPainted(false);
        btnVerPerfilDeUsuario.setContentAreaFilled(false);
        btnVerPerfilDeUsuario.setMaximumSize(new java.awt.Dimension(190, 50));
        btnVerPerfilDeUsuario.setMinimumSize(new java.awt.Dimension(190, 50));
        btnVerPerfilDeUsuario.setPreferredSize(new java.awt.Dimension(160, 30));
        btnVerPerfilDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPerfilDeUsuarioActionPerformed(evt);
            }
        });
        jPanel8.add(btnVerPerfilDeUsuario, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jPanel8, gridBagConstraints);

        panelConsultaConProfesional.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel9Layout = new java.awt.GridBagLayout();
        jPanel9Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel9.setLayout(jPanel9Layout);

        lblIconoInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultaConProfesionalesTitulo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel9.add(lblIconoInicioSesion, gridBagConstraints);

        lblInicioSesion.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion.setText("Consulta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel9.add(lblInicioSesion, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel9.add(btnCerrarSistema, gridBagConstraints);

        panelConsultaConProfesional.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelConsultaConProfesional, "card4");

        panelElaborarPlan.setBackground(new java.awt.Color(51, 51, 51));
        panelElaborarPlan.setMaximumSize(new java.awt.Dimension(800, 800));
        panelElaborarPlan.setMinimumSize(new java.awt.Dimension(800, 800));
        panelElaborarPlan.setPreferredSize(new java.awt.Dimension(800, 800));
        panelElaborarPlan.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setLayout(null);

        lblNombreDelDia.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblNombreDelDia.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDelDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreDelDia.setText("Nombre del dia");
        jPanel12.add(lblNombreDelDia);
        lblNombreDelDia.setBounds(30, 350, 170, 220);

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel11Layout = new java.awt.GridBagLayout();
        jPanel11Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0};
        jPanel11Layout.rowHeights = new int[] {0, 0, 0};
        jPanel11.setLayout(jPanel11Layout);

        textCena.setBackground(new java.awt.Color(51, 51, 51));
        textCena.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textCena.setForeground(new java.awt.Color(255, 255, 255));
        textCena.setRows(5);
        jScrollPane11.setViewportView(textCena);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 217;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel11.add(jScrollPane11, gridBagConstraints);

        textAlmuerzo.setBackground(new java.awt.Color(51, 51, 51));
        textAlmuerzo.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textAlmuerzo.setForeground(new java.awt.Color(255, 255, 255));
        textAlmuerzo.setRows(5);
        jScrollPane10.setViewportView(textAlmuerzo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 217;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel11.add(jScrollPane10, gridBagConstraints);

        lblDesayuno.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblDesayuno.setForeground(new java.awt.Color(255, 255, 255));
        lblDesayuno.setText("Desayuno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel11.add(lblDesayuno, gridBagConstraints);

        lblAlmuerzo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlmuerzo.setForeground(new java.awt.Color(255, 255, 255));
        lblAlmuerzo.setText("Almuerzo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel11.add(lblAlmuerzo, gridBagConstraints);

        textDesayuno.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno.setRows(5);
        jScrollPane12.setViewportView(textDesayuno);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 217;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel11.add(jScrollPane12, gridBagConstraints);

        lblCena.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblCena.setForeground(new java.awt.Color(255, 255, 255));
        lblCena.setText("Cena");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel11.add(lblCena, gridBagConstraints);

        jPanel12.add(jPanel11);
        jPanel11.setBounds(190, 319, 608, 251);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel10Layout = new java.awt.GridBagLayout();
        jPanel10Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0};
        jPanel10Layout.rowHeights = new int[] {0, 14, 0, 14, 0, 14, 0, 14, 0, 14, 0, 14, 0};
        jPanel10.setLayout(jPanel10Layout);

        btnAgregarAlPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarAlPlan.png"))); // NOI18N
        btnAgregarAlPlan.setBorderPainted(false);
        btnAgregarAlPlan.setContentAreaFilled(false);
        btnAgregarAlPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlPlanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel10.add(btnAgregarAlPlan, gridBagConstraints);

        listaComidasPlan.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaComidasPlan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaComidasPlanItemStateChanged(evt);
            }
        });
        listaComidasPlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listaComidasPlanFocusLost(evt);
            }
        });
        listaComidasPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaComidasPlanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel10.add(listaComidasPlan, gridBagConstraints);

        lblNombrePlanVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNombrePlanVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNombrePlanVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel10.add(lblNombrePlanVacio, gridBagConstraints);

        btnEliminarDelPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEliminarDelPlan.png"))); // NOI18N
        btnEliminarDelPlan.setBorderPainted(false);
        btnEliminarDelPlan.setContentAreaFilled(false);
        btnEliminarDelPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDelPlanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel10.add(btnEliminarDelPlan, gridBagConstraints);

        listaDiasDeLaSemana.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaDiasDeLaSemana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaDiasDeLaSemanaItemStateChanged(evt);
            }
        });
        listaDiasDeLaSemana.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listaDiasDeLaSemanaFocusLost(evt);
            }
        });
        listaDiasDeLaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDiasDeLaSemanaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel10.add(listaDiasDeLaSemana, gridBagConstraints);

        lblComida.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblComida.setForeground(new java.awt.Color(255, 255, 255));
        lblComida.setText("Comida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel10.add(lblComida, gridBagConstraints);

        lblNombrePlan.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblNombrePlan.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePlan.setText("Nombre del plan:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel10.add(lblNombrePlan, gridBagConstraints);

        txtNombrePlan.setBackground(new java.awt.Color(227, 227, 227));
        txtNombrePlan.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombrePlan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombrePlan.setMaximumSize(new java.awt.Dimension(6, 26));
        txtNombrePlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombrePlanFocusLost(evt);
            }
        });
        txtNombrePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePlanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel10.add(txtNombrePlan, gridBagConstraints);

        listaAlimentosEnSistema.setBackground(new java.awt.Color(238, 238, 238));
        listaAlimentosEnSistema.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaAlimentosEnSistema.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAlimentosEnSistemaValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(listaAlimentosEnSistema);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel10.add(jScrollPane8, gridBagConstraints);

        lblDia.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblDia.setForeground(new java.awt.Color(255, 255, 255));
        lblDia.setText("Día");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        jPanel10.add(lblDia, gridBagConstraints);

        lblValidarNombrePlan.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNombrePlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel10.add(lblValidarNombrePlan, gridBagConstraints);

        btnEliminarDelPlan1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnEliminarDelPlan1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarDelPlan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardarDia.png"))); // NOI18N
        btnEliminarDelPlan1.setText("Guardar día");
        btnEliminarDelPlan1.setBorderPainted(false);
        btnEliminarDelPlan1.setContentAreaFilled(false);
        btnEliminarDelPlan1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminarDelPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDelPlan1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel10.add(btnEliminarDelPlan1, gridBagConstraints);

        lblAlimentos.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblAlimentos.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentos.setText("Alimentos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel10.add(lblAlimentos, gridBagConstraints);

        jPanel12.add(jPanel10);
        jPanel10.setBounds(25, 6, 751, 295);

        panelElaborarPlan.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setPreferredSize(new java.awt.Dimension(800, 84));
        jPanel13.setLayout(new java.awt.BorderLayout());

        btnElaborarPlan1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnElaborarPlan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEnviarMensaje.png"))); // NOI18N
        btnElaborarPlan1.setText("Enviar");
        btnElaborarPlan1.setBorderPainted(false);
        btnElaborarPlan1.setContentAreaFilled(false);
        btnElaborarPlan1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElaborarPlan1.setIconTextGap(-7);
        btnElaborarPlan1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnElaborarPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaborarPlan1ActionPerformed(evt);
            }
        });
        jPanel13.add(btnElaborarPlan1, java.awt.BorderLayout.EAST);

        panelElaborarPlan.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel14Layout = new java.awt.GridBagLayout();
        jPanel14Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel14.setLayout(jPanel14Layout);

        lblIconoInicioSesion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultaConProfesionalesTitulo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel14.add(lblIconoInicioSesion1, gridBagConstraints);

        lblInicioSesion1.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblInicioSesion1.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion1.setText("Elaborar plan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel14.add(lblInicioSesion1, gridBagConstraints);

        btnCerrarSistema1.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema1.setAlignmentX(0.5F);
        btnCerrarSistema1.setBorderPainted(false);
        btnCerrarSistema1.setContentAreaFilled(false);
        btnCerrarSistema1.setFocusPainted(false);
        btnCerrarSistema1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistema1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel14.add(btnCerrarSistema1, gridBagConstraints);

        panelElaborarPlan.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelElaborarPlan, "card2");

        panelMostrarPlanEnviado.setBackground(new java.awt.Color(51, 51, 51));
        panelMostrarPlanEnviado.setMaximumSize(new java.awt.Dimension(800, 800));
        panelMostrarPlanEnviado.setMinimumSize(new java.awt.Dimension(800, 800));
        panelMostrarPlanEnviado.setPreferredSize(new java.awt.Dimension(800, 800));
        panelMostrarPlanEnviado.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setLayout(new java.awt.GridBagLayout());

        lblOK2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        jPanel23.add(lblOK2, gridBagConstraints);

        lblOKTexto2.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblOKTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblOKTexto2.setText("Plan Enviado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel23.add(lblOKTexto2, gridBagConstraints);

        panelMostrarPlanEnviado.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel24Layout = new java.awt.GridBagLayout();
        jPanel24Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel24.setLayout(jPanel24Layout);

        btnCerrarSistema5.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema5.setAlignmentX(0.5F);
        btnCerrarSistema5.setBorderPainted(false);
        btnCerrarSistema5.setContentAreaFilled(false);
        btnCerrarSistema5.setFocusPainted(false);
        btnCerrarSistema5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistema5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel24.add(btnCerrarSistema5, gridBagConstraints);

        panelMostrarPlanEnviado.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelMostrarPlanEnviado, "card2");

        panelPlanAlimentacion.setBackground(new java.awt.Color(51, 51, 51));
        panelPlanAlimentacion.setMaximumSize(new java.awt.Dimension(800, 800));
        panelPlanAlimentacion.setMinimumSize(new java.awt.Dimension(800, 800));
        panelPlanAlimentacion.setPreferredSize(new java.awt.Dimension(800, 800));
        panelPlanAlimentacion.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));

        panelPerfilDeUsuario.setBackground(new java.awt.Color(51, 51, 51));
        panelPerfilDeUsuario.setMaximumSize(new java.awt.Dimension(450, 580));
        panelPerfilDeUsuario.setMinimumSize(new java.awt.Dimension(450, 580));
        panelPerfilDeUsuario.setPreferredSize(new java.awt.Dimension(450, 580));
        java.awt.GridBagLayout panelPerfilDeUsuarioLayout = new java.awt.GridBagLayout();
        panelPerfilDeUsuarioLayout.columnWidths = new int[] {0, 21, 0, 21, 0, 21, 0, 21, 0};
        panelPerfilDeUsuarioLayout.rowHeights = new int[] {0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0};
        panelPerfilDeUsuario.setLayout(panelPerfilDeUsuarioLayout);

        lblNombreUsuario2.setFont(new java.awt.Font("Levenim MT", 0, 35)); // NOI18N
        lblNombreUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario2.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelPerfilDeUsuario.add(lblNombreUsuario2, gridBagConstraints);

        lblFotoDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandardChico.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelPerfilDeUsuario.add(lblFotoDeUsuario, gridBagConstraints);

        lblTxtFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblTxtFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtFechaNacimiento.setText("Fecha de nacimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelPerfilDeUsuario.add(lblTxtFechaNacimiento, gridBagConstraints);

        lblFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha del usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelPerfilDeUsuario.add(lblFechaNacimiento, gridBagConstraints);

        lblTxtRestricciones.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblTxtRestricciones.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtRestricciones.setText("Restricciones:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelPerfilDeUsuario.add(lblTxtRestricciones, gridBagConstraints);

        listaRestricciones.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(listaRestricciones);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.ipady = 67;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelPerfilDeUsuario.add(jScrollPane5, gridBagConstraints);

        lblPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblPreferencias.setText("Preferencias:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelPerfilDeUsuario.add(lblPreferencias, gridBagConstraints);

        listaPreferencias.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(listaPreferencias);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.ipady = 67;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelPerfilDeUsuario.add(jScrollPane6, gridBagConstraints);

        lblIngestas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblIngestas.setForeground(new java.awt.Color(255, 255, 255));
        lblIngestas.setText("Ingestas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelPerfilDeUsuario.add(lblIngestas, gridBagConstraints);

        listaIngestas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(listaIngestas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.ipady = 67;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelPerfilDeUsuario.add(jScrollPane7, gridBagConstraints);

        btnElaborarPlan.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnElaborarPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEnviarMensaje.png"))); // NOI18N
        btnElaborarPlan.setText("Siguiente");
        btnElaborarPlan.setBorderPainted(false);
        btnElaborarPlan.setContentAreaFilled(false);
        btnElaborarPlan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElaborarPlan.setIconTextGap(-7);
        btnElaborarPlan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnElaborarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaborarPlanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelPerfilDeUsuario.add(btnElaborarPlan, gridBagConstraints);

        panelIzquierdo.setBackground(new java.awt.Color(51, 51, 51));
        panelIzquierdo.setMaximumSize(new java.awt.Dimension(250, 90));
        panelIzquierdo.setMinimumSize(new java.awt.Dimension(250, 90));
        panelIzquierdo.setPreferredSize(new java.awt.Dimension(250, 90));
        java.awt.GridBagLayout panelIzquierdoLayout = new java.awt.GridBagLayout();
        panelIzquierdoLayout.columnWidths = new int[] {0};
        panelIzquierdoLayout.rowHeights = new int[] {0, 8, 0};
        panelIzquierdo.setLayout(panelIzquierdoLayout);

        listaPlanesPendientes.setBackground(new java.awt.Color(51, 51, 51));
        listaPlanesPendientes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaPlanesPendientes.setForeground(new java.awt.Color(255, 255, 255));
        listaPlanesPendientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPlanesPendientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPlanesPendientesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaPlanesPendientes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 481;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelIzquierdo.add(jScrollPane4, gridBagConstraints);

        lblElijaUnUsuario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblElijaUnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblElijaUnUsuario.setText("Elija un usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelIzquierdo.add(lblElijaUnUsuario, gridBagConstraints);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(panelPerfilDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPerfilDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        panelPlanAlimentacion.add(jPanel15, java.awt.BorderLayout.CENTER);

        panelDatosUsuario.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout panelDatosUsuarioLayout = new java.awt.GridBagLayout();
        panelDatosUsuarioLayout.columnWeights = new double[] {1.0, 1.0};
        panelDatosUsuario.setLayout(panelDatosUsuarioLayout);

        lblIconoInicioSesion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPerfilDeUsuarioAgrandado.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        panelDatosUsuario.add(lblIconoInicioSesion2, gridBagConstraints);

        lblInicioSesion2.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblInicioSesion2.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion2.setText("Perfil de usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        panelDatosUsuario.add(lblInicioSesion2, gridBagConstraints);

        btnCerrarSistema2.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema2.setAlignmentX(0.5F);
        btnCerrarSistema2.setBorderPainted(false);
        btnCerrarSistema2.setContentAreaFilled(false);
        btnCerrarSistema2.setFocusPainted(false);
        btnCerrarSistema2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistema2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        panelDatosUsuario.add(btnCerrarSistema2, gridBagConstraints);

        panelPlanAlimentacion.add(panelDatosUsuario, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelPlanAlimentacion, "card4");

        panelNuevoAlimento.setBackground(new java.awt.Color(51, 51, 51));
        panelNuevoAlimento.setMaximumSize(new java.awt.Dimension(800, 800));
        panelNuevoAlimento.setMinimumSize(new java.awt.Dimension(800, 800));
        panelNuevoAlimento.setPreferredSize(new java.awt.Dimension(800, 800));
        panelNuevoAlimento.setLayout(null);

        panelAlimentroRegistradoCorrectamente.setBackground(new java.awt.Color(51, 51, 51));
        panelAlimentroRegistradoCorrectamente.setMaximumSize(new java.awt.Dimension(800, 800));
        panelAlimentroRegistradoCorrectamente.setMinimumSize(new java.awt.Dimension(800, 800));
        panelAlimentroRegistradoCorrectamente.setPreferredSize(new java.awt.Dimension(800, 800));
        panelAlimentroRegistradoCorrectamente.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setLayout(new java.awt.GridBagLayout());

        lblNoPlanes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        jPanel17.add(lblNoPlanes2, gridBagConstraints);

        lblNohayPlanesTexto2.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayPlanesTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayPlanesTexto2.setText("Alimento registrado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel17.add(lblNohayPlanesTexto2, gridBagConstraints);

        panelAlimentroRegistradoCorrectamente.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel22Layout = new java.awt.GridBagLayout();
        jPanel22Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel22.setLayout(jPanel22Layout);

        btnCerrarSistema4.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema4.setAlignmentX(0.5F);
        btnCerrarSistema4.setBorderPainted(false);
        btnCerrarSistema4.setContentAreaFilled(false);
        btnCerrarSistema4.setFocusPainted(false);
        btnCerrarSistema4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistema4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel22.add(btnCerrarSistema4, gridBagConstraints);

        panelAlimentroRegistradoCorrectamente.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        panelNuevoAlimento.add(panelAlimentroRegistradoCorrectamente);
        panelAlimentroRegistradoCorrectamente.setBounds(0, 0, 800, 800);

        panelIngresarAlimentoAlSistema.setBackground(new java.awt.Color(51, 51, 51));
        panelIngresarAlimentoAlSistema.setMaximumSize(new java.awt.Dimension(800, 800));
        panelIngresarAlimentoAlSistema.setMinimumSize(new java.awt.Dimension(800, 800));
        panelIngresarAlimentoAlSistema.setPreferredSize(new java.awt.Dimension(800, 800));
        panelIngresarAlimentoAlSistema.setLayout(new java.awt.BorderLayout());

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setPreferredSize(new java.awt.Dimension(800, 120));
        java.awt.GridBagLayout jPanel29Layout = new java.awt.GridBagLayout();
        jPanel29Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel29.setLayout(jPanel29Layout);

        lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatosIncorrectos.setText("Aún quedan datos incorrectos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel29.add(lblDatosIncorrectos, gridBagConstraints);

        btnIngresarAlimentoASistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnIngresarAlimentoASistema.setBorderPainted(false);
        btnIngresarAlimentoASistema.setContentAreaFilled(false);
        btnIngresarAlimentoASistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoASistemaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel29.add(btnIngresarAlimentoASistema, gridBagConstraints);

        panelIngresarAlimentoAlSistema.add(jPanel29, java.awt.BorderLayout.PAGE_END);

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel20Layout = new java.awt.GridBagLayout();
        jPanel20Layout.columnWidths = new int[] {0};
        jPanel20Layout.rowHeights = new int[] {0, 24, 0};
        jPanel20Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel20.setLayout(jPanel20Layout);

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel16Layout1 = new java.awt.GridBagLayout();
        jPanel16Layout1.columnWidths = new int[] {0, 19, 0, 19, 0, 19, 0, 19, 0};
        jPanel16Layout1.rowHeights = new int[] {0, 6, 0, 6, 0, 6, 0, 6, 0};
        jPanel16.setLayout(jPanel16Layout1);

        checkVitaminas.setBackground(new java.awt.Color(51, 51, 51));
        checkVitaminas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkVitaminas.setForeground(new java.awt.Color(255, 255, 255));
        checkVitaminas.setText("Vitaminas");
        checkVitaminas.setActionCommand("Hiidratos de carbono");
        checkVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVitaminasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(checkVitaminas, gridBagConstraints);

        checkHidratos.setBackground(new java.awt.Color(51, 51, 51));
        checkHidratos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkHidratos.setForeground(new java.awt.Color(255, 255, 255));
        checkHidratos.setText("Hidratos de carbono ");
        checkHidratos.setActionCommand("Hiidratos de carbono");
        checkHidratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHidratosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(checkHidratos, gridBagConstraints);

        txtMinerales.setBackground(new java.awt.Color(227, 227, 227));
        txtMinerales.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMinerales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMinerales.setMaximumSize(new java.awt.Dimension(6, 26));
        txtMinerales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMineralesKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(txtMinerales, gridBagConstraints);

        txtHidratos.setBackground(new java.awt.Color(227, 227, 227));
        txtHidratos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtHidratos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHidratos.setMaximumSize(new java.awt.Dimension(6, 26));
        txtHidratos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHidratosKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(txtHidratos, gridBagConstraints);

        txtVitaminas.setBackground(new java.awt.Color(227, 227, 227));
        txtVitaminas.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtVitaminas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtVitaminas.setMaximumSize(new java.awt.Dimension(6, 26));
        txtVitaminas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVitaminasKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(txtVitaminas, gridBagConstraints);

        txtGlucidos.setBackground(new java.awt.Color(227, 227, 227));
        txtGlucidos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtGlucidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGlucidos.setMaximumSize(new java.awt.Dimension(6, 26));
        txtGlucidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGlucidosKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(txtGlucidos, gridBagConstraints);

        txtFibra.setBackground(new java.awt.Color(227, 227, 227));
        txtFibra.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtFibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFibra.setMaximumSize(new java.awt.Dimension(6, 26));
        txtFibra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFibraKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(txtFibra, gridBagConstraints);

        txtLipidos.setBackground(new java.awt.Color(227, 227, 227));
        txtLipidos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtLipidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLipidos.setMaximumSize(new java.awt.Dimension(6, 26));
        txtLipidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLipidosKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(txtLipidos, gridBagConstraints);

        checkFibra.setBackground(new java.awt.Color(51, 51, 51));
        checkFibra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkFibra.setForeground(new java.awt.Color(255, 255, 255));
        checkFibra.setText("Fibras");
        checkFibra.setActionCommand("Hiidratos de carbono");
        checkFibra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFibraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(checkFibra, gridBagConstraints);

        checkLipidos.setBackground(new java.awt.Color(51, 51, 51));
        checkLipidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkLipidos.setForeground(new java.awt.Color(255, 255, 255));
        checkLipidos.setText("Lípidos");
        checkLipidos.setActionCommand("Hiidratos de carbono");
        checkLipidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLipidosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(checkLipidos, gridBagConstraints);

        checkGlucidos.setBackground(new java.awt.Color(51, 51, 51));
        checkGlucidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkGlucidos.setForeground(new java.awt.Color(255, 255, 255));
        checkGlucidos.setText("Glúcidos");
        checkGlucidos.setActionCommand("Hiidratos de carbono");
        checkGlucidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkGlucidosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(checkGlucidos, gridBagConstraints);

        checkProteínas.setBackground(new java.awt.Color(51, 51, 51));
        checkProteínas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkProteínas.setForeground(new java.awt.Color(255, 255, 255));
        checkProteínas.setText("Proteínas");
        checkProteínas.setActionCommand("Hiidratos de carbono");
        checkProteínas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProteínasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(checkProteínas, gridBagConstraints);

        checkMinerales.setBackground(new java.awt.Color(51, 51, 51));
        checkMinerales.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkMinerales.setForeground(new java.awt.Color(255, 255, 255));
        checkMinerales.setText("Minerales");
        checkMinerales.setActionCommand("Hiidratos de carbono");
        checkMinerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMineralesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(checkMinerales, gridBagConstraints);

        txtProteínas.setBackground(new java.awt.Color(227, 227, 227));
        txtProteínas.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtProteínas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProteínas.setMaximumSize(new java.awt.Dimension(6, 26));
        txtProteínas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProteínasKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(txtProteínas, gridBagConstraints);

        lblPrincipalesNutrientes.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblPrincipalesNutrientes.setForeground(new java.awt.Color(255, 255, 255));
        lblPrincipalesNutrientes.setText("Ingrese los principales nutrientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel16.add(lblPrincipalesNutrientes, gridBagConstraints);

        lblGramosProteinas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblGramosProteinas.setForeground(new java.awt.Color(255, 255, 255));
        lblGramosProteinas.setText("(gramos)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel16.add(lblGramosProteinas, gridBagConstraints);

        lblGramosVitaminas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblGramosVitaminas.setForeground(new java.awt.Color(255, 255, 255));
        lblGramosVitaminas.setText("(gramos)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel16.add(lblGramosVitaminas, gridBagConstraints);

        lblGramosGlucidos.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblGramosGlucidos.setForeground(new java.awt.Color(255, 255, 255));
        lblGramosGlucidos.setText("(gramos)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel16.add(lblGramosGlucidos, gridBagConstraints);

        lblGramosMinerales.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblGramosMinerales.setForeground(new java.awt.Color(255, 255, 255));
        lblGramosMinerales.setText("(gramos)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel16.add(lblGramosMinerales, gridBagConstraints);

        lblGramosFibras.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblGramosFibras.setForeground(new java.awt.Color(255, 255, 255));
        lblGramosFibras.setText("(gramos)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel16.add(lblGramosFibras, gridBagConstraints);

        lblGramosLipidos.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblGramosLipidos.setForeground(new java.awt.Color(255, 255, 255));
        lblGramosLipidos.setText("(gramos)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel16.add(lblGramosLipidos, gridBagConstraints);

        lblGramosHidratos.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblGramosHidratos.setForeground(new java.awt.Color(255, 255, 255));
        lblGramosHidratos.setText("(gramos)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel16.add(lblGramosHidratos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel20.add(jPanel16, gridBagConstraints);

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel18Layout = new java.awt.GridBagLayout();
        jPanel18Layout.columnWidths = new int[] {0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0};
        jPanel18Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel18.setLayout(jPanel18Layout);

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.setMaximumSize(new java.awt.Dimension(6, 26));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel18.add(txtNombre, gridBagConstraints);

        lblValidarTipoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarTipoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        lblValidarTipoAlimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblValidarTipoAlimentoFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        jPanel18.add(lblValidarTipoAlimento, gridBagConstraints);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel18.add(lblNombre, gridBagConstraints);

        lblValidarNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        lblValidarNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblValidarNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblValidarNombreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        jPanel18.add(lblValidarNombre, gridBagConstraints);

        lblNombreVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNombreVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNombreVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        jPanel18.add(lblNombreVacio, gridBagConstraints);

        lblTipoAlimento.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTipoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoAlimento.setText("Tipo de alimento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel18.add(lblTipoAlimento, gridBagConstraints);

        listaTipoAlimentos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaTipoAlimentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Fruta", "Verdura", "Cereal", "Legumbre", "Carne", "Lácteo", "Bebida" }));
        listaTipoAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTipoAlimentosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel18.add(listaTipoAlimentos, gridBagConstraints);

        lblTipoAlimentoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblTipoAlimentoVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblTipoAlimentoVacio.setText("Dato vacío");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        jPanel18.add(lblTipoAlimentoVacio, gridBagConstraints);

        lblTxtNacionalidad1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtNacionalidad1.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtNacionalidad1.setText("Foto del alimento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel18.add(lblTxtNacionalidad1, gridBagConstraints);

        btnIngresarFotoAlimento.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnIngresarFotoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarFotoUsuario.png"))); // NOI18N
        btnIngresarFotoAlimento.setBorderPainted(false);
        btnIngresarFotoAlimento.setContentAreaFilled(false);
        btnIngresarFotoAlimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresarFotoAlimento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresarFotoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarFotoAlimentoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel18.add(btnIngresarFotoAlimento, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel20.add(jPanel18, gridBagConstraints);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIngresarAlimentoAlSistema.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel21Layout = new java.awt.GridBagLayout();
        jPanel21Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel21.setLayout(jPanel21Layout);

        lblIconoInicioSesion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoIngresarAlimento.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel21.add(lblIconoInicioSesion3, gridBagConstraints);

        lblInicioSesion3.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblInicioSesion3.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion3.setText("Nuevo alimento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel21.add(lblInicioSesion3, gridBagConstraints);

        btnCerrarSistema3.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema3.setAlignmentX(0.5F);
        btnCerrarSistema3.setBorderPainted(false);
        btnCerrarSistema3.setContentAreaFilled(false);
        btnCerrarSistema3.setFocusPainted(false);
        btnCerrarSistema3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarSistema3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistema3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel21.add(btnCerrarSistema3, gridBagConstraints);

        panelIngresarAlimentoAlSistema.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        panelNuevoAlimento.add(panelIngresarAlimentoAlSistema);
        panelIngresarAlimentoAlSistema.setBounds(0, 0, 800, 800);

        panelDerecho.add(panelNuevoAlimento, "card5");

        getContentPane().add(panelDerecho, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultasPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasPendientesActionPerformed
        ocultarPaneles();
        this.panelConsultaConProfesional.setVisible(true);
        this.listaConversaciones.setSelectedIndex(0);
        String[] lista = this.sistema.getListaNombresUsuariosConversacionesPendientes(sistema.getPersonaLogueada().getNombreCompleto());
        if (lista.length > 0) {
            this.listaConversaciones.setListData(lista);
            this.listaConversaciones.setSelectedIndex(0);
        } else {
            ocultarPaneles();
            this.panelNoHayConsultasPendientes.setVisible(true);
        }
        this.btnConsultasPendientes.setEnabled(false);
    }//GEN-LAST:event_btnConsultasPendientesActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPlanesSolicitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesSolicitadosActionPerformed
        ocultarPaneles();
        this.btnPlanesSolicitados.setEnabled(false);
        if (sistema.getListaAlimentos().isEmpty()) {
            this.panelNoHayPlanesPendientes.setVisible(true);
            this.lblNohayPlanesTexto1.setVisible(false);
            this.lblNohayConsultasTexto2.setVisible(false);
            this.lblNoHayAlimentos.setVisible(true);
            this.lblNoHayAlimentosIcono.setVisible(true);
            this.lblNohayPlanesIcono.setVisible(false);
            this.jPanel2.setVisible((true));
        } else {
            this.panelPlanAlimentacion.setVisible(true);
            this.panelPerfilDeUsuario.setVisible(false);
            this.btnPlanesSolicitados.setEnabled(false);
            this.listaPlanesPendientes.setSelectedIndex(0);
            String nombreProfesionalLogueado = sistema.getPersonaLogueada().getNombreCompleto();
            Profesional profesionalLogueado = sistema.getProfesionalPorNombre(nombreProfesionalLogueado);
            List<PlanAlimentacion> lista = this.sistema.getListaPlanesPendientes(profesionalLogueado);

            String[] stringArray = Arrays.copyOf(lista.stream().map(x -> x.toString()).collect(Collectors.toList()).toArray(), lista.size(), String[].class);
            if (!lista.isEmpty()) {
                this.listaPlanesPendientes.setListData(stringArray);
            } else {
                ocultarPaneles();
                this.panelNoHayPlanesPendientes.setVisible(true);
                this.lblNohayPlanesTexto1.setVisible(true);
                this.lblNohayConsultasTexto2.setVisible(true);
                this.lblNoHayAlimentos.setVisible(false);
                this.lblNoHayAlimentosIcono.setVisible(false);
                this.lblNohayPlanesIcono.setVisible(true);
                this.jPanel3.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPlanesSolicitadosActionPerformed

    private void listaConversacionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaConversacionesValueChanged
        this.panelConversacionOk.setVisible(true);
        this.panelMostrarOk.setVisible(false);
        this.panelConversacion.setVisible(true);
        this.jPanel8.setVisible(true);
       
        if (this.listaConversaciones.getSelectedValue() != null) {
            this.usuarioSeleccionado = sistema.getUsuarioPorNombre(this.listaConversaciones.getSelectedValue());
        
            Image image = usuarioSeleccionado.getFotoDePerfil()
                    .getImage()
                    .getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        
            lblFotoProfesional.setIcon(new ImageIcon(image));
        }
        actualizarConversaciones(this.usuarioSeleccionado);
    }//GEN-LAST:event_listaConversacionesValueChanged

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        String mensaje = this.txtMensajeNuevo.getText();
        String usuario = this.usuarioSeleccionado.toString();
        String profesional = this.sistema.getPersonaLogueada().getNombreCompleto();
        this.sistema.agregarMensajeConversacion(profesional, usuario, mensaje, true, true);
        this.txtMensajeNuevo.setText("");
        this.txtMostrarConversacion.setText("");
        this.lblNombreUsuario.setText("Usuario");
        this.panelConversacionOk.setVisible(true);
        this.jPanel8.setVisible(false);
        this.panelMostrarOk.setVisible(true);
        String[] listaUsuariosConversacionesPendientes = sistema.getListaNombresUsuariosConversacionesPendientes(profesional);
        if (listaUsuariosConversacionesPendientes.length > 0) {
            this.listaConversaciones.setListData(listaUsuariosConversacionesPendientes);
        } else {
            ocultarPaneles();
            this.panelNoHayConsultasPendientes.setVisible(true);
        }
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void btnIngresarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoActionPerformed
        ocultarPaneles();
        this.btnIngresarAlimento.setEnabled(false);
        this.panelNuevoAlimento.setVisible(true);
        this.panelIngresarAlimentoAlSistema.setVisible(true);
    }//GEN-LAST:event_btnIngresarAlimentoActionPerformed

    private void btnIngresarFotoAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFotoAlimentoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Imagenes(png, jpg, jpeg, bmp)", "png", "jpeg", "jpg", "bmp");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            if(fileChooser.getSelectedFile().exists()){
                ImageIcon iconoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
                Image image = iconoPerfil.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(image);

                btnIngresarFotoAlimento.setIcon(icono);
                this.setFotoDeAlimentoActual(icono);
            }
            else{
                String mensajeError = "El archivo seleccionado no existe.";

                JOptionPane.showMessageDialog(null, mensajeError, "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnIngresarFotoAlimentoActionPerformed

    private void listaTipoAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTipoAlimentosActionPerformed
        String tipoAlimentoIngresado = (String) this.listaTipoAlimentos.getSelectedItem();
        if (tipoAlimentoIngresado.equals("Seleccione...")) {
            this.lblValidarTipoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTipoAlimento.setVisible(true);
            this.lblTipoAlimentoVacio.setVisible(true);
        } else {
            this.lblValidarTipoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarTipoAlimento.setVisible(true);
            this.lblTipoAlimentoVacio.setVisible(false);
        }
    }//GEN-LAST:event_listaTipoAlimentosActionPerformed

    private void btnIngresarAlimentoASistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoASistemaActionPerformed
        String nombre = this.txtNombre.getText();
        String tipoAlimento = (String) this.listaTipoAlimentos.getSelectedItem();
        ArrayList<ComposicionAlimento> listaNutrientesConProporcion = nutrientesSeleccionados();
        if (nombre.equals("") || tipoAlimento.equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            mostrarErrores(nombre, tipoAlimento);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            boolean seAgregoAlimento = this.getSistema().crearAlimento(nombre, tipoAlimento, listaNutrientesConProporcion, fotoDeAlimentoActual);
            if (seAgregoAlimento) {
                this.txtNombre.setText("");
                this.listaTipoAlimentos.setSelectedIndex(0);
                this.panelAlimentroRegistradoCorrectamente.setVisible(true);
                this.btnIngresarAlimento.setEnabled(true);
                this.lblValidarNombre.setVisible(false);
                this.lblValidarTipoAlimento.setVisible(false);
                this.lblTipoAlimentoVacio.setVisible(false);
                this.btnIngresarFotoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarFotoUsuario.png")));
                this.lblNombreVacio.setVisible(false);
                ocultarCheckbox();
                ocultarPrincipalesNutrientes();
                this.panelIngresarAlimentoAlSistema.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnIngresarAlimentoASistemaActionPerformed

    private void btnVerPerfilDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPerfilDeUsuarioActionPerformed
        MostrarPerfilUsuario perfil = new MostrarPerfilUsuario(getSistema(), usuarioSeleccionado.toString());
        perfil.setVisible(true);
    }//GEN-LAST:event_btnVerPerfilDeUsuarioActionPerformed

    private void checkHidratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHidratosActionPerformed
        if (!this.nutrientesSeleccionados[0]) {
            this.txtHidratos.setVisible(true);
            this.lblGramosHidratos.setVisible(true);
            this.nutrientesSeleccionados[0] = true;
        } else {
            this.txtHidratos.setVisible(false);
            this.lblGramosHidratos.setVisible(false);
            this.nutrientesSeleccionados[0] = false;
        }
    }//GEN-LAST:event_checkHidratosActionPerformed

    private void checkGlucidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkGlucidosActionPerformed
        if (!this.nutrientesSeleccionados[1]) {
            this.txtGlucidos.setVisible(true);
            this.lblGramosGlucidos.setVisible(true);
            this.nutrientesSeleccionados[1] = true;
        } else {
            this.txtGlucidos.setVisible(false);
            this.nutrientesSeleccionados[1] = false;
            this.lblGramosGlucidos.setVisible(false);
        }
    }//GEN-LAST:event_checkGlucidosActionPerformed

    private void checkLipidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLipidosActionPerformed
        if (!this.nutrientesSeleccionados[2]) {
            this.txtLipidos.setVisible(true);
            this.lblGramosLipidos.setVisible(true);
            this.nutrientesSeleccionados[2] = true;
        } else {
            txtLipidos.setVisible(false);
            this.lblGramosLipidos.setVisible(false);
            nutrientesSeleccionados[2] = false;
        }
    }//GEN-LAST:event_checkLipidosActionPerformed

    private void checkProteínasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProteínasActionPerformed
        if (!nutrientesSeleccionados[3]) {
            txtProteínas.setVisible(true);
            lblGramosProteinas.setVisible(true);
            nutrientesSeleccionados[3] = true;
        } else {
            txtProteínas.setVisible(false);
            lblGramosProteinas.setVisible(false);
            nutrientesSeleccionados[3] = false;
        }
    }//GEN-LAST:event_checkProteínasActionPerformed

    private void checkMineralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMineralesActionPerformed
        if (!nutrientesSeleccionados[4]) {
            txtMinerales.setVisible(true);
            lblGramosMinerales.setVisible(true);
            nutrientesSeleccionados[4] = true;
        } else {
            txtMinerales.setVisible(false);
            lblGramosMinerales.setVisible(false);
            nutrientesSeleccionados[4] = false;
        }
    }//GEN-LAST:event_checkMineralesActionPerformed

    private void checkFibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFibraActionPerformed
        if (!nutrientesSeleccionados[5]) {
            txtFibra.setVisible(true);
            lblGramosFibras.setVisible(true);
            nutrientesSeleccionados[5] = true;
        } else {
            txtFibra.setVisible(false);
            lblGramosFibras.setVisible(false);
            nutrientesSeleccionados[5] = false;
        }

    }//GEN-LAST:event_checkFibraActionPerformed

    private void checkVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVitaminasActionPerformed
        if (!nutrientesSeleccionados[6]) {
            txtVitaminas.setVisible(true);
            lblGramosVitaminas.setVisible(true);
            nutrientesSeleccionados[6] = true;
        } else {
            txtVitaminas.setVisible(false);
            lblGramosVitaminas.setVisible(false);
            nutrientesSeleccionados[6] = false;
            
        }
    }//GEN-LAST:event_checkVitaminasActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombreIngresado = txtNombre.getText();
        if (nombreIngresado.equals("")) {
            lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        } else {
            lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void lblValidarNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarNombreFocusGained

    }//GEN-LAST:event_lblValidarNombreFocusGained

    private void lblValidarTipoAlimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarTipoAlimentoFocusGained

    }//GEN-LAST:event_lblValidarTipoAlimentoFocusGained

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_formWindowClosing

    private void lblValidarNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarNombreFocusLost
    }//GEN-LAST:event_lblValidarNombreFocusLost

    private void listaPlanesPendientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPlanesPendientesValueChanged
        String selectedValue = this.listaPlanesPendientes.getSelectedValue();
        Optional<PlanAlimentacion> planActual = sistema.getListaPlanesAlimentacion().
                stream().
                filter(x -> x.toString().equals(selectedValue)).
                findFirst();

        if(!planActual.isPresent())
            return;

        planSeleccionado = planActual.get();
        this.usuarioSeleccionado = planSeleccionado.getUsuario();
        this.lblNombreUsuario2.setText(usuarioSeleccionado.toString());
        
        lblFechaNacimiento.setText(usuarioSeleccionado.getFechaNacimiento());
        Image image = usuarioSeleccionado.getFotoDePerfil()
                .getImage()
                .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        
        lblFotoDeUsuario.setIcon(new ImageIcon(image));
        
        if (usuarioSeleccionado.getArrayAlimentosIngeridos().length > 0) {
            List<Ingesta> ingeridos = usuarioSeleccionado.getAlimentosIngeridos();
            ArrayList<String> listaASetear = new ArrayList<>();
            for (int i = 0; i < ingeridos.size(); i++) {
                Ingesta ingestaActual = ingeridos.get(i);
                List<Alimento> alimentosActuales = ingestaActual.getListaAlimentosPorFecha();
                for (int j = 0; j < alimentosActuales.size(); j++) {
                    listaASetear.add(alimentosActuales.get(i).toString());
                }
            }
            String[] arrayASetear = new String[listaASetear.size()];
            for (int i = 0; i < listaASetear.size(); i++) {
                arrayASetear[i] = listaASetear.get(i);
            }
            this.listaIngestas.setListData(arrayASetear);
        }
        if (usuarioSeleccionado.getArrayPreferencias().length > 0) {
            listaPreferencias.setListData(usuarioSeleccionado.getArrayPreferencias());
        }
        if (usuarioSeleccionado.getArrayRestricciones().length > 0) {
            listaRestricciones.setListData(usuarioSeleccionado.getArrayRestricciones());
        }
        this.panelDatosUsuario.setVisible(true);
        this.panelPerfilDeUsuario.setVisible(true);
    }//GEN-LAST:event_listaPlanesPendientesValueChanged

    private void btnElaborarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElaborarPlanActionPerformed
        ocultarPaneles();
        cargarListaDiasDeLaSemana();
        cargarListaIngestasPorDia();
        this.listaAlimentosEnSistema.setListData(sistema.getListaAlimentos().toArray());
        this.lblNombreDelDia.setText("Lunes");
        this.panelElaborarPlan.setVisible(true);
        this.listaAlimentosEnSistema.setSelectedIndex(0);
    }//GEN-LAST:event_btnElaborarPlanActionPerformed

    private void listaDiasDeLaSemanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaItemStateChanged

        String diaSeleccionado = (String) this.listaDiasDeLaSemana.getSelectedItem();
        this.diaDeLaSemanaActual = diaSeleccionado;
        this.lblNombreDelDia.setText(this.diaDeLaSemanaActual);
        switch (this.diaDeLaSemanaActual) {
            case "Lunes":
                this.textDesayuno.setText(this.planAlimentacion[0][0]);
                this.textCena.setText(this.planAlimentacion[0][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[0][1]);
                break;
            case "Martes":
                this.textDesayuno.setText(this.planAlimentacion[1][0]);
                this.textCena.setText(this.planAlimentacion[1][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[1][1]);
                break;
            case "Miercoles":
                this.textDesayuno.setText(this.planAlimentacion[2][0]);
                this.textCena.setText(this.planAlimentacion[2][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[2][1]);
                break;
            case "Jueves":
                this.textDesayuno.setText(this.planAlimentacion[3][0]);
                this.textCena.setText(this.planAlimentacion[3][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[3][1]);
                break;
            case "Viernes":
                this.textDesayuno.setText(this.planAlimentacion[4][0]);
                this.textCena.setText(this.planAlimentacion[4][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[4][1]);
                break;
            case "Sabado":
                this.textDesayuno.setText(this.planAlimentacion[5][0]);
                this.textCena.setText(this.planAlimentacion[5][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[5][1]);
                break;
            case "Domingo":
                this.textDesayuno.setText(this.planAlimentacion[6][0]);
                this.textCena.setText(this.planAlimentacion[6][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[6][1]);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_listaDiasDeLaSemanaItemStateChanged

    private void listaDiasDeLaSemanaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaFocusLost
    }//GEN-LAST:event_listaDiasDeLaSemanaFocusLost

    private void listaDiasDeLaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaActionPerformed

    }//GEN-LAST:event_listaDiasDeLaSemanaActionPerformed

    private void listaComidasPlanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaComidasPlanItemStateChanged

    }//GEN-LAST:event_listaComidasPlanItemStateChanged

    private void listaComidasPlanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaComidasPlanFocusLost
    }//GEN-LAST:event_listaComidasPlanFocusLost

    private void listaComidasPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaComidasPlanActionPerformed

    }//GEN-LAST:event_listaComidasPlanActionPerformed

    private void listaAlimentosEnSistemaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAlimentosEnSistemaValueChanged
    }//GEN-LAST:event_listaAlimentosEnSistemaValueChanged

    private void txtNombrePlanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombrePlanFocusLost
        String nombrePlanIngresado = this.txtNombrePlan.getText();
        if (nombrePlanIngresado.equals("")) {
            this.lblValidarNombrePlan.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombrePlan.setVisible(true);
            this.lblNombrePlanVacio.setVisible(true);
        } else {
            this.lblValidarNombrePlan.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarNombrePlan.setVisible(true);
            this.lblNombrePlanVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtNombrePlanFocusLost

    private void txtNombrePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePlanActionPerformed
    }//GEN-LAST:event_txtNombrePlanActionPerformed

    private void btnAgregarAlPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlPlanActionPerformed
        String diaSeleccionado = (String) this.listaDiasDeLaSemana.getSelectedItem();
        this.diaDeLaSemanaAnterior = diaSeleccionado;
        String ingestaSeleccionada = (String) this.listaComidasPlan.getSelectedItem();
        String alimentoAgregado = this.listaAlimentosEnSistema.getSelectedValue().toString();
        String textoAnterior = "";
        switch (ingestaSeleccionada) {
            case "Desayuno":
                textoAnterior = this.textDesayuno.getText();
                if (textoAnterior.equals("")) {
                    textoAnterior = alimentoAgregado;
                } else {
                    textoAnterior += "\n" + alimentoAgregado;
                }
                this.textDesayuno.setText(textoAnterior);
                break;
            case "Almuerzo":
                textoAnterior = this.textAlmuerzo.getText();
                if (textoAnterior.equals("")) {
                    textoAnterior = alimentoAgregado;
                } else {
                    textoAnterior += "\n" + alimentoAgregado;
                }
                this.textAlmuerzo.setText(textoAnterior);
                break;
            case "Cena":
                textoAnterior = this.textCena.getText();
                if (textoAnterior.equals("")) {
                    textoAnterior = alimentoAgregado;
                } else {
                    textoAnterior += "\n" + alimentoAgregado;
                }
                this.textCena.setText(textoAnterior);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnAgregarAlPlanActionPerformed

    private void btnEliminarDelPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDelPlanActionPerformed
        String ingestaSeleccionada = (String) this.listaComidasPlan.getSelectedItem();
        String alimentoEliminado = this.listaAlimentosEnSistema.getSelectedValue().toString();
        String aRemplazar = "";
        String remplazado = "";
        CharSequence secuencia = "\n";
        switch (ingestaSeleccionada) {
            case "Desayuno":
                aRemplazar = this.textDesayuno.getText();
                if (aRemplazar.contains(secuencia)) {
                    alimentoEliminado += "\n";
                }
                remplazado = aRemplazar.replaceFirst(alimentoEliminado, "");
                this.textDesayuno.setText(remplazado);
                break;
            case "Almuerzo":
                aRemplazar = this.textAlmuerzo.getText();
                if (aRemplazar.contains(secuencia)) {
                    alimentoEliminado += "\n";
                }
                remplazado = aRemplazar.replaceFirst(alimentoEliminado, "");
                this.textAlmuerzo.setText(remplazado);
                break;
            case "Cena":
                aRemplazar = this.textCena.getText();
                if (aRemplazar.contains(secuencia)) {
                    alimentoEliminado += "\n";
                }
                remplazado = aRemplazar.replaceFirst(alimentoEliminado, "");
                this.textCena.setText(remplazado);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnEliminarDelPlanActionPerformed

    private void btnElaborarPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElaborarPlan1ActionPerformed
        String nombreDelPlan = this.txtNombrePlan.getText();
        if (nombreDelPlan.equals("")) {
            this.lblNombrePlanVacio.setVisible(true);
            this.lblValidarNombrePlan.setVisible(true);
        } else {
            listaPlanesPendientes.getSelectedValue();
            boolean fueAtendidoElPlan = this.sistema.atenderSolicitudDelPlan(planAlimentacion, planSeleccionado, nombreDelPlan);
            if (fueAtendidoElPlan) {
                ocultarPaneles();
                this.panelMostrarPlanEnviado.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnElaborarPlan1ActionPerformed

    private void btnEliminarDelPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDelPlan1ActionPerformed
        guardarDatosDelPlan();
    }//GEN-LAST:event_btnEliminarDelPlan1ActionPerformed

    private void txtHidratosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHidratosKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtHidratosKeyTyped

    private void txtProteínasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProteínasKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }

    }//GEN-LAST:event_txtProteínasKeyTyped

    private void txtVitaminasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVitaminasKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }

    }//GEN-LAST:event_txtVitaminasKeyTyped

    private void txtGlucidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGlucidosKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtGlucidosKeyTyped

    private void txtMineralesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMineralesKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtMineralesKeyTyped

    private void txtFibraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFibraKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFibraKeyTyped

    private void txtLipidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLipidosKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtLipidosKeyTyped

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        AyudaProfesional ayuda = new AyudaProfesional(sistema);
        ayuda.setVisible(true);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnCerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistemaActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistemaActionPerformed

    private void btnCerrarSistema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema1ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema1ActionPerformed

    private void btnCerrarSistema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema2ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema2ActionPerformed

    private void btnCerrarSistema3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema3ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema3ActionPerformed

    private void btnCerrarSistema4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema4ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema4ActionPerformed

    private void btnCerrarSistema5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema5ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema5ActionPerformed

    private void btnCerrarSistema6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema6ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema6ActionPerformed

    private void btnCerrarSistema7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema7ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema7ActionPerformed

    private void btnCerrarSistema8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema8ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema8ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        btnIngresarAlimentoActionPerformed(null);        
    }//GEN-LAST:event_jButton1MouseClicked

    private void ocultarPaneles() {
        this.btnConsultasPendientes.setEnabled(true);
        this.btnIngresarAlimento.setEnabled(true);
        this.btnPlanesSolicitados.setEnabled(true);
        this.panelConsultaConProfesional.setVisible(false);
        this.txtMostrarConversacion.setText("");
        this.jPanel8.setVisible(false);
        this.panelMostrarOk.setVisible(false);
        this.panelNoHayConsultasPendientes.setVisible(false);
        this.panelNuevoAlimento.setVisible(false);
        this.panelIngresarAlimentoAlSistema.setVisible(false);
        this.jPanel2.setVisible(false);
        this.jPanel3.setVisible(false);
        this.panelPlanAlimentacion.setVisible(false);
        this.panelNoHayPlanesPendientes.setVisible(false);
        this.panelMostrarPlanEnviado.setVisible(false);
        this.panelVacio.setVisible(false);
        this.panelDatosUsuario.setVisible(false);
        this.panelElaborarPlan.setVisible(false);
        this.panelPerfilDeUsuario.setVisible(false);
        this.lblTipoAlimentoVacio.setVisible(false);
        this.lblNombreVacio.setVisible(false);
        this.lblValidarNombrePlan.setVisible(false);
        this.lblNombrePlanVacio.setVisible(false);
        this.panelAlimentroRegistradoCorrectamente.setVisible(false);
        this.panelVacio.setVisible(false);
    }

    private void actualizarConversaciones(Usuario remitente) {
        if (remitente != null) {
            String destinatario = sistema.getPersonaLogueada().getNombreCompleto();
            String conversacion = sistema.getConversacion(destinatario, remitente.getNombreCompleto());
            txtMostrarConversacion.setText(conversacion);
            lblNombreUsuario.setText(usuarioSeleccionado.getNombreCompleto());
            listaConversaciones.setListData(sistema.getListaNombresUsuariosConversacionesPendientes(destinatario));
        }
    }

    void ocultarPrincipalesNutrientes() {
        txtHidratos.setVisible(false);
        txtProteínas.setVisible(false);
        txtVitaminas.setVisible(false);
        txtGlucidos.setVisible(false);
        txtMinerales.setVisible(false);
        txtFibra.setVisible(false);
        txtLipidos.setVisible(false);
        this.lblGramosFibras.setVisible(false);
        this.lblGramosGlucidos.setVisible(false);
        this.lblGramosHidratos.setVisible(false);
        this.lblGramosLipidos.setVisible(false);
        this.lblGramosMinerales.setVisible(false);
        this.lblGramosProteinas.setVisible(false);
        this.lblGramosVitaminas.setVisible(false);
        for (int i = 0; i < nutrientesSeleccionados.length; i++) {
            nutrientesSeleccionados[i] = false;
        }
    }

    ArrayList<ComposicionAlimento> nutrientesSeleccionados() {
        ArrayList<ComposicionAlimento> listaRetorno = new ArrayList<>();
        if (checkFibra.isSelected()) {
            String proporcionIngresada = txtFibra.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Fibras", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkGlucidos.isSelected()) {
            String proporcionIngresada = txtGlucidos.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Glucidos", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkHidratos.isSelected()) {
            String proporcionIngresada = txtHidratos.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Hidratos de carbono", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkLipidos.isSelected()) {
            String proporcionIngresada = txtLipidos.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Lipidos", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkMinerales.isSelected()) {
            String proporcionIngresada = txtMinerales.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Minerales", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkProteínas.isSelected()) {
            String proporcionIngresada = txtProteínas.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Proteinas", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkVitaminas.isSelected()) {
            String proporcionIngresada = txtVitaminas.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Vitaminas", proporcion);
                listaRetorno.add(nueva);
            }
        }
        return listaRetorno;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlPlan;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCerrarSistema;
    private javax.swing.JButton btnCerrarSistema1;
    private javax.swing.JButton btnCerrarSistema2;
    private javax.swing.JButton btnCerrarSistema3;
    private javax.swing.JButton btnCerrarSistema4;
    private javax.swing.JButton btnCerrarSistema5;
    private javax.swing.JButton btnCerrarSistema6;
    private javax.swing.JButton btnCerrarSistema7;
    private javax.swing.JButton btnCerrarSistema8;
    private javax.swing.JButton btnConsultasPendientes;
    private javax.swing.JButton btnElaborarPlan;
    private javax.swing.JButton btnElaborarPlan1;
    private javax.swing.JButton btnEliminarDelPlan;
    private javax.swing.JButton btnEliminarDelPlan1;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarAlimento;
    private javax.swing.JButton btnIngresarAlimentoASistema;
    private javax.swing.JButton btnIngresarFotoAlimento;
    private javax.swing.JButton btnPlanesSolicitados;
    private javax.swing.JButton btnVerPerfilDeUsuario;
    private javax.swing.JCheckBox checkFibra;
    private javax.swing.JCheckBox checkGlucidos;
    private javax.swing.JCheckBox checkHidratos;
    private javax.swing.JCheckBox checkLipidos;
    private javax.swing.JCheckBox checkMinerales;
    private javax.swing.JCheckBox checkProteínas;
    private javax.swing.JCheckBox checkVitaminas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblAlimentos;
    private javax.swing.JLabel lblAlmuerzo;
    private javax.swing.JLabel lblCena;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblConsultasPendientes;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblDesayuno;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblElijaUnUsuario;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFotoDeUsuario;
    private javax.swing.JLabel lblFotoProfesional;
    private javax.swing.JLabel lblGramosFibras;
    private javax.swing.JLabel lblGramosGlucidos;
    private javax.swing.JLabel lblGramosHidratos;
    private javax.swing.JLabel lblGramosLipidos;
    private javax.swing.JLabel lblGramosMinerales;
    private javax.swing.JLabel lblGramosProteinas;
    private javax.swing.JLabel lblGramosVitaminas;
    private javax.swing.JLabel lblIconoInicioSesion;
    private javax.swing.JLabel lblIconoInicioSesion1;
    private javax.swing.JLabel lblIconoInicioSesion2;
    private javax.swing.JLabel lblIconoInicioSesion3;
    private javax.swing.JLabel lblIngestas;
    private javax.swing.JLabel lblIngresarAlimento;
    private javax.swing.JLabel lblIngresarAlimento2;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblInicioSesion1;
    private javax.swing.JLabel lblInicioSesion2;
    private javax.swing.JLabel lblInicioSesion3;
    private javax.swing.JLabel lblNoHayAlimentos;
    private javax.swing.JLabel lblNoHayAlimentos1;
    private javax.swing.JLabel lblNoHayAlimentosIcono;
    private javax.swing.JLabel lblNoPlanes2;
    private javax.swing.JLabel lblNohayConsultas;
    private javax.swing.JLabel lblNohayConsultasTexto;
    private javax.swing.JLabel lblNohayConsultasTexto2;
    private javax.swing.JLabel lblNohayPlanesIcono;
    private javax.swing.JLabel lblNohayPlanesTexto1;
    private javax.swing.JLabel lblNohayPlanesTexto2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreDelDia;
    private javax.swing.JLabel lblNombrePlan;
    private javax.swing.JLabel lblNombrePlanVacio;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNombreUsuario2;
    private javax.swing.JLabel lblNombreVacio;
    private javax.swing.JLabel lblOK;
    private javax.swing.JLabel lblOK2;
    private javax.swing.JLabel lblOKTexto;
    private javax.swing.JLabel lblOKTexto2;
    private javax.swing.JLabel lblPlanesSolicitados;
    private javax.swing.JLabel lblPlanesSolicitados2;
    private javax.swing.JLabel lblPreferencias;
    private javax.swing.JLabel lblPrincipalesNutrientes;
    private javax.swing.JLabel lblTipoAlimento;
    private javax.swing.JLabel lblTipoAlimentoVacio;
    private javax.swing.JLabel lblTxtFechaNacimiento;
    private javax.swing.JLabel lblTxtNacionalidad1;
    private javax.swing.JLabel lblTxtRestricciones;
    private javax.swing.JLabel lblValidarNombre;
    private javax.swing.JLabel lblValidarNombrePlan;
    private javax.swing.JLabel lblValidarTipoAlimento;
    private javax.swing.JList listaAlimentosEnSistema;
    private javax.swing.JComboBox<String> listaComidasPlan;
    private javax.swing.JList<String> listaConversaciones;
    private javax.swing.JComboBox<String> listaDiasDeLaSemana;
    private javax.swing.JList<String> listaIngestas;
    private javax.swing.JList<String> listaPlanesPendientes;
    private javax.swing.JList<String> listaPreferencias;
    private javax.swing.JList<String> listaRestricciones;
    private javax.swing.JComboBox<String> listaTipoAlimentos;
    private javax.swing.JPanel panelAlimentroRegistradoCorrectamente;
    private javax.swing.JPanel panelConsultaConProfesional;
    private javax.swing.JPanel panelConversacion;
    private javax.swing.JPanel panelConversacionOk;
    private javax.swing.JPanel panelDatosUsuario;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelElaborarPlan;
    private javax.swing.JPanel panelIngresarAlimentoAlSistema;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMostrarOk;
    private javax.swing.JPanel panelMostrarPlanEnviado;
    private javax.swing.JPanel panelNoHayConsultasPendientes;
    private javax.swing.JPanel panelNoHayPlanesPendientes;
    private javax.swing.JPanel panelNuevoAlimento;
    private javax.swing.JPanel panelPerfilDeUsuario;
    private javax.swing.JPanel panelPlanAlimentacion;
    private javax.swing.JPanel panelVacio;
    private javax.swing.JTextArea textAlmuerzo;
    private javax.swing.JTextArea textCena;
    private javax.swing.JTextArea textDesayuno;
    private javax.swing.JTextField txtFibra;
    private javax.swing.JTextField txtGlucidos;
    private javax.swing.JTextField txtHidratos;
    private javax.swing.JTextField txtLipidos;
    private javax.swing.JTextArea txtMensajeNuevo;
    private javax.swing.JTextField txtMinerales;
    private javax.swing.JTextPane txtMostrarConversacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombrePlan;
    private javax.swing.JTextField txtProteínas;
    private javax.swing.JTextField txtVitaminas;
    // End of variables declaration//GEN-END:variables

    private void cargarListaDiasDeLaSemana() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        List<String> diasEnSistema = sistema.devolverListaDiasDeLaSemana();
        this.listaDiasDeLaSemana.setModel(modelo);
        for (int i = 0; i < diasEnSistema.size(); i++) {
            this.listaDiasDeLaSemana.addItem(diasEnSistema.get(i));
        }
    }

    private void cargarListaIngestasPorDia() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        List<String> ingestasEnSistema = sistema.devolverListaIngestasDeLaSemana();
        this.listaComidasPlan.setModel(modelo);
        for (int i = 0; i < ingestasEnSistema.size(); i++) {
            this.listaComidasPlan.addItem(ingestasEnSistema.get(i));
        }
    }

    private void guardarDatosDelPlan() {
        String diaSeleccionado = (String) this.listaDiasDeLaSemana.getSelectedItem();
        this.diaDeLaSemanaActual = diaSeleccionado;
        this.lblNombreDelDia.setText(diaSeleccionado);
        String itemsDesayuno = this.textDesayuno.getText();
        String itemsAlmuerzo = this.textAlmuerzo.getText();
        String itemsCena = this.textCena.getText();
        this.textDesayuno.setText("");
        this.textAlmuerzo.setText("");
        this.textCena.setText("");
        switch (this.diaDeLaSemanaAnterior) {
            case "Lunes":
                this.planAlimentacion[0][0] = itemsDesayuno;
                this.planAlimentacion[0][1] = itemsAlmuerzo;
                this.planAlimentacion[0][2] = itemsCena;
                break;
            case "Martes":
                this.planAlimentacion[1][0] = itemsDesayuno;
                this.planAlimentacion[1][1] = itemsAlmuerzo;
                this.planAlimentacion[1][2] = itemsCena;
                break;
            case "Miercoles":
                this.planAlimentacion[2][0] = itemsDesayuno;
                this.planAlimentacion[2][1] = itemsAlmuerzo;
                this.planAlimentacion[2][2] = itemsCena;
                break;
            case "Jueves":
                this.planAlimentacion[3][0] = itemsDesayuno;
                this.planAlimentacion[3][1] = itemsAlmuerzo;
                this.planAlimentacion[3][2] = itemsCena;
                break;
            case "Viernes":
                this.planAlimentacion[4][0] = itemsDesayuno;
                this.planAlimentacion[4][1] = itemsAlmuerzo;
                this.planAlimentacion[4][2] = itemsCena;
                break;
            case "Sabado":
                this.planAlimentacion[5][0] = itemsDesayuno;
                this.planAlimentacion[5][1] = itemsAlmuerzo;
                this.planAlimentacion[5][2] = itemsCena;
                break;
            case "Domingo":
                this.planAlimentacion[6][0] = itemsDesayuno;
                this.planAlimentacion[6][1] = itemsAlmuerzo;
                this.planAlimentacion[6][2] = itemsCena;
                break;
            default:
                break;
        }
    }

    private void mostrarErrores(String nombre, String tipoAlimento) {
        if (nombre.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        }
        if (tipoAlimento.equals("Seleccione...")) {
            this.lblValidarTipoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTipoAlimento.setVisible(true);
            this.lblTipoAlimentoVacio.setVisible(true);
        }

    }

    private void ocultarCheckbox() {
        this.checkFibra.setSelected(false);
        this.checkGlucidos.setSelected(false);
        this.checkHidratos.setSelected(false);
        this.checkLipidos.setSelected(false);
        this.checkMinerales.setSelected(false);
        this.checkProteínas.setSelected(false);
        this.checkVitaminas.setSelected(false);
        this.txtFibra.setText("");
        this.txtGlucidos.setText("");
        this.txtHidratos.setText("");
        this.txtLipidos.setText("");
        this.txtMinerales.setText("");
        this.txtProteínas.setText("");
        this.txtVitaminas.setText("");
        this.txtFibra.setVisible(false);
        this.txtGlucidos.setVisible(false);
        this.txtHidratos.setVisible(false);
        this.txtLipidos.setVisible(false);
        this.txtMinerales.setVisible(false);
        this.txtProteínas.setVisible(false);
        this.txtVitaminas.setVisible(false);
        this.lblGramosFibras.setVisible(false);
        this.lblGramosGlucidos.setVisible(false);
        this.lblGramosHidratos.setVisible(false);
        this.lblGramosLipidos.setVisible(false);
        this.lblGramosMinerales.setVisible(false);
        this.lblGramosProteinas.setVisible(false);
        this.lblGramosVitaminas.setVisible(false);
        
        
    }
}
