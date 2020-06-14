package interfaz;

import dominio.Alimento;
import dominio.Ingesta;
import dominio.PlanAlimentacion;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaMenuPrincipalUsuario extends javax.swing.JDialog {

    private Sistema sistema;
    private String profesionalSeleccionado;
    private boolean existeConversacion;
    private boolean primeraVez;
    private boolean primeraIngesta;
    private String nombreDelPlan;

    public VentanaMenuPrincipalUsuario(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        ocultarPaneles();
        this.sistema = unSistema;
        Calendar fecha = new GregorianCalendar();
        this.fechaIngestaUsuario.setMaxDate(fecha);
        this.fechaIngestaUsuario.setText("");
        this.existeConversacion = false;
        this.lblValidarProfesionalPlan.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblDatosIncorrectos1.setVisible(false);
        this.lblValidarNuevoAlimento.setVisible(false);
        this.lblValidarNuevoAlimento1.setVisible(false);
        this.lblNuevoAlimentoVacio.setVisible(false);
        this.lblNuevoAlimentoVacio1.setVisible(false);
        this.lblDatosIncorrectos2.setVisible(false);
        this.nombreDelPlan = "";
        this.primeraVez = true;
        this.primeraIngesta = true;
        this.panelVacio.setVisible(true);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public boolean getYaExisteConversacion() {
        return existeConversacion;
    }

    public void setYaExisteConversacion(boolean existe) {
        this.existeConversacion = existe;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelMenu = new javax.swing.JPanel();
        btnConsultaConProfesional = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblConsultaConProfesional = new javax.swing.JLabel();
        btnSolicitarPlanAlimentacion = new javax.swing.JButton();
        lblSolicitarPlanAlimentacion = new javax.swing.JLabel();
        btnIngresarAlimentoIngerido = new javax.swing.JButton();
        lblIngresarAlimentoIngerido = new javax.swing.JLabel();
        panelDerecho = new javax.swing.JPanel();
        panelNoHayAlimentos = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btnCerrarSistema5 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        lblNohayConsultasTexto = new javax.swing.JLabel();
        lblNohayConsultas = new javax.swing.JLabel();
        lblNohayConsultasTexto2 = new javax.swing.JLabel();
        panelNoHayConversacionesCreadas = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        lblNohayConsultasTexto3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNohayProfesionales = new javax.swing.JLabel();
        lblNohayConsultasTexto4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCrearConv = new javax.swing.JLabel();
        btnNuevaConversacion1 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        btnCerrarSistema6 = new javax.swing.JButton();
        panelConsultaConProfesional = new javax.swing.JPanel();
        panelConversacion = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevaConversacion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaConversaciones = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        btnEnviarMensaje = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMostrarConversacion = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensajeNuevo = new javax.swing.JTextArea();
        lblNombreProfesional = new javax.swing.JLabel();
        lblFotoProfesional = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblIconoInicioSesion = new javax.swing.JLabel();
        lblInicioSesion = new javax.swing.JLabel();
        btnCerrarSistema = new javax.swing.JButton();
        panelElegirProfesional = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblIconoInicioSesion1 = new javax.swing.JLabel();
        lblInicioSesion1 = new javax.swing.JLabel();
        btnCerrarSistema1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaElegirProfesionales = new javax.swing.JList();
        panelVerPlanAlimentacion = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lblNombreDelProfesional = new javax.swing.JLabel();
        lblNombreDelPlan = new javax.swing.JLabel();
        lblTituloDelProfesional = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado5 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado11 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblAlimentoIngeridoSeleccionado8 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        txtComidasSabado = new javax.swing.JTextArea();
        lblAlimentoIngeridoSeleccionado9 = new javax.swing.JLabel();
        jScrollPane40 = new javax.swing.JScrollPane();
        txtComidasViernes = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        txtComidasDomingo = new javax.swing.JTextArea();
        lblAlimentoIngeridoSeleccionado10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        txtComidasJueves = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        txtComidasMiercoles = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        txtComidasLunes = new javax.swing.JTextArea();
        lblAlimentoIngeridoSeleccionado6 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado7 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado14 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado4 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        txtComidasMartes = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        lblIconoInicioSesion4 = new javax.swing.JLabel();
        lblInicioSesion4 = new javax.swing.JLabel();
        btnCerrarSistema4 = new javax.swing.JButton();
        panelIngestaRegistradaCorrectamente = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblNohayConsultas1 = new javax.swing.JLabel();
        lblNohayConsultasTexto1 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        btnCerrarSistema7 = new javax.swing.JButton();
        panelAlimentoIngerido = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblValidarNuevoAlimento = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado = new javax.swing.JLabel();
        lblNuevoAlimentoVacio = new javax.swing.JLabel();
        lblFechaAlimentoIngerido = new javax.swing.JLabel();
        fechaIngestaUsuario = new datechooser.beans.DateChooserCombo();
        comboAlimentosEnSistema = new javax.swing.JComboBox<>();
        lblNuevoAlimentoVacio1 = new javax.swing.JLabel();
        lblValidarNuevoAlimento1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblIconoInicioSesion2 = new javax.swing.JLabel();
        lblInicioSesion2 = new javax.swing.JLabel();
        btnCerrarSistema2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lblDatosIncorrectos2 = new javax.swing.JLabel();
        btnNuevaIngesta = new javax.swing.JButton();
        panelPlanDeAlimentacion = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblIconoInicioSesion3 = new javax.swing.JLabel();
        lblInicioSesion3 = new javax.swing.JLabel();
        btnCerrarSistema3 = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        panelNoHayPlanesDisponibles = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        lblCrearConv1 = new javax.swing.JLabel();
        btnNuevaConversacion2 = new javax.swing.JButton();
        lblPlanSolicitadoCorrectamente1 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        lblNoHayPlanes = new javax.swing.JLabel();
        lblNoHayPlanes1 = new javax.swing.JLabel();
        panelPlanSolicitadoCorrectamente = new javax.swing.JPanel();
        lblPlanSolicitadoCorrectamente = new javax.swing.JLabel();
        lblPlanSolicitado = new javax.swing.JLabel();
        panelSolicitarNuevoPlan = new javax.swing.JPanel();
        comboProfesionalesEnSistema = new javax.swing.JComboBox<>();
        lblSeleccioneProfesional1 = new javax.swing.JLabel();
        lblCambiarPreferencias3 = new javax.swing.JLabel();
        lblCambiarPreferencias2 = new javax.swing.JLabel();
        btnEditarPreferencias = new javax.swing.JButton();
        lblCambiarPreferencias4 = new javax.swing.JLabel();
        btnEditarRestricciones = new javax.swing.JButton();
        lblCambiarPreferencias5 = new javax.swing.JLabel();
        lblCambiarPreferencias6 = new javax.swing.JLabel();
        btnAceptarSolicitudPlanAlimentacion = new javax.swing.JButton();
        lblValidarProfesionalPlan = new javax.swing.JLabel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        lblDatosIncorrectos1 = new javax.swing.JLabel();
        panelBuscarPlan = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPlanesDelUsuario = new javax.swing.JList<>();
        lblSeleccioneProfesional2 = new javax.swing.JLabel();
        btnSolicitarNuevoPlan = new javax.swing.JButton();
        btnVerPlanesExistentes = new javax.swing.JButton();
        panelVacio = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        btnCerrarSistema8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setModal(true);
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

        btnConsultaConProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaConProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultaConProfesionales.png"))); // NOI18N
        btnConsultaConProfesional.setBorder(null);
        btnConsultaConProfesional.setBorderPainted(false);
        btnConsultaConProfesional.setContentAreaFilled(false);
        btnConsultaConProfesional.setFocusPainted(false);
        btnConsultaConProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaConProfesionalActionPerformed(evt);
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

        lblConsultaConProfesional.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblConsultaConProfesional.setText("Consulta con profesional");

        btnSolicitarPlanAlimentacion.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitarPlanAlimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPlanAlimentacion.png"))); // NOI18N
        btnSolicitarPlanAlimentacion.setBorder(null);
        btnSolicitarPlanAlimentacion.setBorderPainted(false);
        btnSolicitarPlanAlimentacion.setContentAreaFilled(false);
        btnSolicitarPlanAlimentacion.setFocusPainted(false);
        btnSolicitarPlanAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarPlanAlimentacionActionPerformed(evt);
            }
        });

        lblSolicitarPlanAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSolicitarPlanAlimentacion.setText("Plan de alimentación");

        btnIngresarAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoIngresarAlimentoIngerido.png"))); // NOI18N
        btnIngresarAlimentoIngerido.setBorder(null);
        btnIngresarAlimentoIngerido.setBorderPainted(false);
        btnIngresarAlimentoIngerido.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido.setFocusPainted(false);
        btnIngresarAlimentoIngerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngeridoActionPerformed(evt);
            }
        });

        lblIngresarAlimentoIngerido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIngresarAlimentoIngerido.setText("Ingresar alimento ingerido");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblConsultaConProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnHome))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.WEST);

        panelDerecho.setBackground(new java.awt.Color(51, 51, 51));
        panelDerecho.setMaximumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setMinimumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setPreferredSize(new java.awt.Dimension(800, 800));
        panelDerecho.setLayout(new java.awt.CardLayout());

        panelNoHayAlimentos.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayAlimentos.setMaximumSize(new java.awt.Dimension(800, 800));
        panelNoHayAlimentos.setMinimumSize(new java.awt.Dimension(800, 800));
        panelNoHayAlimentos.setName(""); // NOI18N
        panelNoHayAlimentos.setPreferredSize(new java.awt.Dimension(800, 800));
        panelNoHayAlimentos.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel17Layout = new java.awt.GridBagLayout();
        jPanel17Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel17.setLayout(jPanel17Layout);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel17.add(btnCerrarSistema5, gridBagConstraints);

        panelNoHayAlimentos.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setLayout(new java.awt.GridBagLayout());

        lblNohayConsultasTexto.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto.setText("No hay alimentos registrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel18.add(lblNohayConsultasTexto, gridBagConstraints);

        lblNohayConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel18.add(lblNohayConsultas, gridBagConstraints);

        lblNohayConsultasTexto2.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto2.setText("Intente en otro momento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel18.add(lblNohayConsultasTexto2, gridBagConstraints);

        panelNoHayAlimentos.add(jPanel18, java.awt.BorderLayout.CENTER);

        panelDerecho.add(panelNoHayAlimentos, "card2");

        panelNoHayConversacionesCreadas.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayConversacionesCreadas.setMaximumSize(new java.awt.Dimension(800, 800));
        panelNoHayConversacionesCreadas.setMinimumSize(new java.awt.Dimension(800, 800));
        panelNoHayConversacionesCreadas.setPreferredSize(new java.awt.Dimension(800, 800));
        panelNoHayConversacionesCreadas.setLayout(new java.awt.BorderLayout());

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel19.setLayout(new java.awt.GridBagLayout());

        lblNohayConsultasTexto3.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto3.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto3.setText("No hay conversaciones creadas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel19.add(lblNohayConsultasTexto3, gridBagConstraints);
        lblNohayConsultasTexto3.getAccessibleContext().setAccessibleName("No hay conversaciones creadas. ");
        lblNohayConsultasTexto3.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 279, 0, 0);
        jPanel19.add(jLabel2, gridBagConstraints);

        lblNohayProfesionales.setBackground(new java.awt.Color(51, 51, 51));
        lblNohayProfesionales.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayProfesionales.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayProfesionales.setText("Aun no hay profesionales creados");
        lblNohayProfesionales.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel19.add(lblNohayProfesionales, gridBagConstraints);

        lblNohayConsultasTexto4.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto4.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto4.setText("Intente en otro momento.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel19.add(lblNohayConsultasTexto4, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblCrearConv.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblCrearConv.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearConv.setText("Crear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(lblCrearConv, gridBagConstraints);

        btnNuevaConversacion1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConversacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoMensaje.png"))); // NOI18N
        btnNuevaConversacion1.setBorder(null);
        btnNuevaConversacion1.setBorderPainted(false);
        btnNuevaConversacion1.setContentAreaFilled(false);
        btnNuevaConversacion1.setFocusPainted(false);
        btnNuevaConversacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversacion1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(btnNuevaConversacion1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 248, 6, 0);
        jPanel19.add(jPanel1, gridBagConstraints);

        panelNoHayConversacionesCreadas.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel20Layout = new java.awt.GridBagLayout();
        jPanel20Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel20.setLayout(jPanel20Layout);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel20.add(btnCerrarSistema6, gridBagConstraints);

        panelNoHayConversacionesCreadas.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelNoHayConversacionesCreadas, "card9");

        panelConsultaConProfesional.setBackground(new java.awt.Color(51, 51, 51));
        panelConsultaConProfesional.setMaximumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setMinimumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setPreferredSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setLayout(new java.awt.BorderLayout());

        panelConversacion.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout panelConversacionLayout = new java.awt.GridBagLayout();
        panelConversacionLayout.columnWidths = new int[] {0, 25, 0};
        panelConversacionLayout.rowHeights = new int[] {0, 0, 0};
        panelConversacion.setLayout(panelConversacionLayout);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnNuevaConversacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConversacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoMensaje.png"))); // NOI18N
        btnNuevaConversacion.setText("Consultar a otro profesional");
        btnNuevaConversacion.setBorderPainted(false);
        btnNuevaConversacion.setContentAreaFilled(false);
        btnNuevaConversacion.setFocusPainted(false);
        btnNuevaConversacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        jPanel2.add(btnNuevaConversacion, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 461;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelConversacion.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 15, 0};
        jPanel3Layout.rowHeights = new int[] {0, 25, 0};
        jPanel3.setLayout(jPanel3Layout);

        btnEnviarMensaje.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEnviarMensaje.png"))); // NOI18N
        btnEnviarMensaje.setText("Enviar");
        btnEnviarMensaje.setBorderPainted(false);
        btnEnviarMensaje.setContentAreaFilled(false);
        btnEnviarMensaje.setFocusPainted(false);
        btnEnviarMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnviarMensaje.setIconTextGap(-7);
        btnEnviarMensaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel3.add(btnEnviarMensaje, gridBagConstraints);

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
        jPanel3.add(jScrollPane2, gridBagConstraints);

        txtMensajeNuevo.setBackground(new java.awt.Color(238, 238, 238));
        txtMensajeNuevo.setColumns(20);
        txtMensajeNuevo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMensajeNuevo.setRows(5);
        txtMensajeNuevo.setMaximumSize(new java.awt.Dimension(100, 100));
        txtMensajeNuevo.setMinimumSize(new java.awt.Dimension(100, 100));
        txtMensajeNuevo.setPreferredSize(new java.awt.Dimension(100, 100));
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
        jPanel3.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelConversacion.add(jPanel3, gridBagConstraints);

        lblNombreProfesional.setFont(new java.awt.Font("Levenim MT", 0, 30)); // NOI18N
        lblNombreProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreProfesional.setText("Profesional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        panelConversacion.add(lblNombreProfesional, gridBagConstraints);

        lblFotoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandardChico.png"))); // NOI18N
        lblFotoProfesional.setAlignmentY(0.0F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelConversacion.add(lblFotoProfesional, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione al profesional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        panelConversacion.add(jLabel1, gridBagConstraints);

        panelConsultaConProfesional.add(panelConversacion, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel4.setLayout(jPanel4Layout);

        lblIconoInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultaConProfesionalesTitulo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel4.add(lblIconoInicioSesion, gridBagConstraints);

        lblInicioSesion.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion.setText("Consulta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel4.add(lblInicioSesion, gridBagConstraints);

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
        jPanel4.add(btnCerrarSistema, gridBagConstraints);

        panelConsultaConProfesional.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelConsultaConProfesional, "card3");

        panelElegirProfesional.setBackground(new java.awt.Color(51, 51, 51));
        panelElegirProfesional.setMaximumSize(new java.awt.Dimension(800, 800));
        panelElegirProfesional.setMinimumSize(new java.awt.Dimension(800, 800));
        panelElegirProfesional.setPreferredSize(new java.awt.Dimension(800, 800));
        panelElegirProfesional.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel5.setLayout(jPanel5Layout);

        lblIconoInicioSesion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultaConProfesionalesTitulo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel5.add(lblIconoInicioSesion1, gridBagConstraints);

        lblInicioSesion1.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblInicioSesion1.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion1.setText("Elija un profesional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel5.add(lblInicioSesion1, gridBagConstraints);

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
        jPanel5.add(btnCerrarSistema1, gridBagConstraints);

        panelElegirProfesional.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        listaElegirProfesionales.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaElegirProfesionales.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaElegirProfesionalesValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(listaElegirProfesionales);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        panelElegirProfesional.add(jPanel6, java.awt.BorderLayout.CENTER);

        panelDerecho.add(panelElegirProfesional, "card4");

        panelVerPlanAlimentacion.setBackground(new java.awt.Color(51, 51, 51));
        panelVerPlanAlimentacion.setMaximumSize(new java.awt.Dimension(800, 800));
        panelVerPlanAlimentacion.setMinimumSize(new java.awt.Dimension(800, 800));
        panelVerPlanAlimentacion.setPreferredSize(new java.awt.Dimension(800, 800));
        panelVerPlanAlimentacion.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel14Layout = new java.awt.GridBagLayout();
        jPanel14Layout.columnWidths = new int[] {0, 14, 0};
        jPanel14Layout.rowHeights = new int[] {0, 10, 0, 10, 0};
        jPanel14.setLayout(jPanel14Layout);

        lblNombreDelProfesional.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblNombreDelProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDelProfesional.setText("nombre del profesional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel14.add(lblNombreDelProfesional, gridBagConstraints);

        lblNombreDelPlan.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblNombreDelPlan.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDelPlan.setText("nombre del plan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel14.add(lblNombreDelPlan, gridBagConstraints);

        lblTituloDelProfesional.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblTituloDelProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloDelProfesional.setText("titulo del profesional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel14.add(lblTituloDelProfesional, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado5.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado5.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado5.setText("Título del profesional:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel14.add(lblAlimentoIngeridoSeleccionado5, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado11.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado11.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado11.setText("Nombre del profesional:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel14.add(lblAlimentoIngeridoSeleccionado11, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado2.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado2.setText("Nombre del plan:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel14.add(lblAlimentoIngeridoSeleccionado2, gridBagConstraints);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel13Layout = new java.awt.GridBagLayout();
        jPanel13Layout.columnWidths = new int[] {0, 33, 0, 33, 0};
        jPanel13Layout.rowHeights = new int[] {0, 6, 0};
        jPanel13.setLayout(jPanel13Layout);

        lblAlimentoIngeridoSeleccionado8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado8.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado8.setText("Viernes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel13.add(lblAlimentoIngeridoSeleccionado8, gridBagConstraints);

        txtComidasSabado.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasSabado.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasSabado.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasSabado.setRows(5);
        jScrollPane37.setViewportView(txtComidasSabado);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 187;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jScrollPane37, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado9.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado9.setText("Sábado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel13.add(lblAlimentoIngeridoSeleccionado9, gridBagConstraints);

        txtComidasViernes.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasViernes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasViernes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasViernes.setRows(5);
        jScrollPane40.setViewportView(txtComidasViernes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 187;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jScrollPane40, gridBagConstraints);

        txtComidasDomingo.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasDomingo.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasDomingo.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasDomingo.setRows(5);
        jScrollPane39.setViewportView(txtComidasDomingo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 187;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jScrollPane39, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado10.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado10.setText("Domingo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel13.add(lblAlimentoIngeridoSeleccionado10, gridBagConstraints);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel12Layout = new java.awt.GridBagLayout();
        jPanel12Layout.columnWidths = new int[] {0, 33, 0, 33, 0, 33, 0};
        jPanel12Layout.rowHeights = new int[] {0, 6, 0};
        jPanel12.setLayout(jPanel12Layout);

        txtComidasJueves.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasJueves.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasJueves.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasJueves.setRows(5);
        jScrollPane36.setViewportView(txtComidasJueves);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 187;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 36);
        jPanel12.add(jScrollPane36, gridBagConstraints);

        txtComidasMiercoles.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasMiercoles.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasMiercoles.setRows(5);
        jScrollPane35.setViewportView(txtComidasMiercoles);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 187;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jScrollPane35, gridBagConstraints);

        txtComidasLunes.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasLunes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasLunes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasLunes.setRows(5);
        jScrollPane38.setViewportView(txtComidasLunes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 187;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 33, 0, 0);
        jPanel12.add(jScrollPane38, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado6.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado6.setText("Miércoles");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel12.add(lblAlimentoIngeridoSeleccionado6, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado7.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado7.setText("Jueves");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 36);
        jPanel12.add(lblAlimentoIngeridoSeleccionado7, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado14.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado14.setText("Lunes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 33, 0, 0);
        jPanel12.add(lblAlimentoIngeridoSeleccionado14, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado4.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado4.setText("Martes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel12.add(lblAlimentoIngeridoSeleccionado4, gridBagConstraints);

        txtComidasMartes.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasMartes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasMartes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasMartes.setRows(5);
        jScrollPane34.setViewportView(txtComidasMartes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 187;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jScrollPane34, gridBagConstraints);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelVerPlanAlimentacion.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel16Layout = new java.awt.GridBagLayout();
        jPanel16Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel16.setLayout(jPanel16Layout);

        lblIconoInicioSesion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoAlimento.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel16.add(lblIconoInicioSesion4, gridBagConstraints);

        lblInicioSesion4.setFont(new java.awt.Font("Levenim MT", 0, 35)); // NOI18N
        lblInicioSesion4.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion4.setText("Plan de alimentación propuesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel16.add(lblInicioSesion4, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel16.add(btnCerrarSistema4, gridBagConstraints);

        panelVerPlanAlimentacion.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelVerPlanAlimentacion, "card5");

        panelIngestaRegistradaCorrectamente.setBackground(new java.awt.Color(51, 51, 51));
        panelIngestaRegistradaCorrectamente.setMaximumSize(new java.awt.Dimension(800, 800));
        panelIngestaRegistradaCorrectamente.setMinimumSize(new java.awt.Dimension(800, 800));
        panelIngestaRegistradaCorrectamente.setPreferredSize(new java.awt.Dimension(800, 800));
        panelIngestaRegistradaCorrectamente.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        lblNohayConsultas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        jPanel11.add(lblNohayConsultas1, new java.awt.GridBagConstraints());

        lblNohayConsultasTexto1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto1.setText("Ingesta registrada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel11.add(lblNohayConsultasTexto1, gridBagConstraints);

        panelIngestaRegistradaCorrectamente.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel21Layout = new java.awt.GridBagLayout();
        jPanel21Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel21.setLayout(jPanel21Layout);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel21.add(btnCerrarSistema7, gridBagConstraints);

        panelIngestaRegistradaCorrectamente.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelIngestaRegistradaCorrectamente, "card10");

        panelAlimentoIngerido.setBackground(new java.awt.Color(51, 51, 51));
        panelAlimentoIngerido.setMaximumSize(new java.awt.Dimension(800, 800));
        panelAlimentoIngerido.setMinimumSize(new java.awt.Dimension(800, 800));
        panelAlimentoIngerido.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel7Layout = new java.awt.GridBagLayout();
        jPanel7Layout.columnWidths = new int[] {0, 0, 0, 0, 0};
        jPanel7Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
        jPanel7.setLayout(jPanel7Layout);

        lblValidarNuevoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNuevoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel7.add(lblValidarNuevoAlimento, gridBagConstraints);

        lblAlimentoIngeridoSeleccionado.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblAlimentoIngeridoSeleccionado.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado.setText("Ingrese el nuevo alimento ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel7.add(lblAlimentoIngeridoSeleccionado, gridBagConstraints);

        lblNuevoAlimentoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNuevoAlimentoVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNuevoAlimentoVacio.setText("Dato vacio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel7.add(lblNuevoAlimentoVacio, gridBagConstraints);

        lblFechaAlimentoIngerido.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblFechaAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaAlimentoIngerido.setText("Ingrese la fecha de ingesta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel7.add(lblFechaAlimentoIngerido, gridBagConstraints);

        fechaIngestaUsuario.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 17));
        fechaIngestaUsuario.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        fechaIngestaUsuario.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                fechaIngestaUsuarioOnCommit(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel7.add(fechaIngestaUsuario, gridBagConstraints);

        comboAlimentosEnSistema.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        comboAlimentosEnSistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        comboAlimentosEnSistema.setMaximumSize(new java.awt.Dimension(400, 300));
        comboAlimentosEnSistema.setPreferredSize(new java.awt.Dimension(400, 27));
        comboAlimentosEnSistema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAlimentosEnSistemaItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel7.add(comboAlimentosEnSistema, gridBagConstraints);

        lblNuevoAlimentoVacio1.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNuevoAlimentoVacio1.setForeground(new java.awt.Color(240, 128, 128));
        lblNuevoAlimentoVacio1.setText("Dato vacio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel7.add(lblNuevoAlimentoVacio1, gridBagConstraints);

        lblValidarNuevoAlimento1.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNuevoAlimento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel7.add(lblValidarNuevoAlimento1, gridBagConstraints);

        panelAlimentoIngerido.add(jPanel7, java.awt.BorderLayout.WEST);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel8Layout = new java.awt.GridBagLayout();
        jPanel8Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel8.setLayout(jPanel8Layout);

        lblIconoInicioSesion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoAlimento.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel8.add(lblIconoInicioSesion2, gridBagConstraints);

        lblInicioSesion2.setFont(new java.awt.Font("Levenim MT", 0, 45)); // NOI18N
        lblInicioSesion2.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion2.setText("Datos del alimento ingerido");
        lblInicioSesion2.setMaximumSize(new java.awt.Dimension(650, 77));
        lblInicioSesion2.setMinimumSize(new java.awt.Dimension(650, 77));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel8.add(lblInicioSesion2, gridBagConstraints);

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
        jPanel8.add(btnCerrarSistema2, gridBagConstraints);

        panelAlimentoIngerido.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel9Layout = new java.awt.GridBagLayout();
        jPanel9Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel9.setLayout(jPanel9Layout);

        lblDatosIncorrectos2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos2.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos2.setText("Aún quedan datos incorrectos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel9.add(lblDatosIncorrectos2, gridBagConstraints);

        btnNuevaIngesta.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnNuevaIngesta.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnNuevaIngesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarALaLista.png"))); // NOI18N
        btnNuevaIngesta.setText("Registrar ingesta");
        btnNuevaIngesta.setBorderPainted(false);
        btnNuevaIngesta.setContentAreaFilled(false);
        btnNuevaIngesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaIngesta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevaIngesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaIngestaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
        jPanel9.add(btnNuevaIngesta, gridBagConstraints);

        panelAlimentoIngerido.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        panelDerecho.add(panelAlimentoIngerido, "card5");

        panelPlanDeAlimentacion.setBackground(new java.awt.Color(51, 51, 51));
        panelPlanDeAlimentacion.setMaximumSize(new java.awt.Dimension(800, 800));
        panelPlanDeAlimentacion.setMinimumSize(new java.awt.Dimension(800, 800));
        panelPlanDeAlimentacion.setPreferredSize(new java.awt.Dimension(800, 800));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setMaximumSize(new java.awt.Dimension(800, 2147483647));
        jPanel10.setMinimumSize(new java.awt.Dimension(800, 119));
        jPanel10.setPreferredSize(new java.awt.Dimension(800, 119));
        java.awt.GridBagLayout jPanel10Layout = new java.awt.GridBagLayout();
        jPanel10Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel10.setLayout(jPanel10Layout);

        lblIconoInicioSesion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPlanAlimentacionTitulo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 0);
        jPanel10.add(lblIconoInicioSesion3, gridBagConstraints);

        lblInicioSesion3.setFont(new java.awt.Font("Levenim MT", 0, 55)); // NOI18N
        lblInicioSesion3.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion3.setText("Plan de alimentación");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 120, 0, 0);
        jPanel10.add(lblInicioSesion3, gridBagConstraints);

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
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel10.add(btnCerrarSistema3, gridBagConstraints);

        panelBotones.setBackground(new java.awt.Color(51, 51, 51));
        panelBotones.setLayout(null);

        panelNoHayPlanesDisponibles.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayPlanesDisponibles.setMaximumSize(new java.awt.Dimension(100, 100));
        panelNoHayPlanesDisponibles.setLayout(new java.awt.GridBagLayout());

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setLayout(new java.awt.GridBagLayout());

        lblCrearConv1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblCrearConv1.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearConv1.setText("Crear");
        lblCrearConv1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel24.add(lblCrearConv1, gridBagConstraints);

        btnNuevaConversacion2.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConversacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoMensaje.png"))); // NOI18N
        btnNuevaConversacion2.setToolTipText("");
        btnNuevaConversacion2.setBorder(null);
        btnNuevaConversacion2.setBorderPainted(false);
        btnNuevaConversacion2.setContentAreaFilled(false);
        btnNuevaConversacion2.setFocusPainted(false);
        btnNuevaConversacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
        });
        btnNuevaConversacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversacion2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel24.add(btnNuevaConversacion2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 74, 0);
        panelNoHayPlanesDisponibles.add(jPanel24, gridBagConstraints);

        lblPlanSolicitadoCorrectamente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        panelNoHayPlanesDisponibles.add(lblPlanSolicitadoCorrectamente1, gridBagConstraints);

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setLayout(new java.awt.GridBagLayout());

        lblNoHayPlanes.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayPlanes.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayPlanes.setText("disponibles");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel25.add(lblNoHayPlanes, gridBagConstraints);

        lblNoHayPlanes1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayPlanes1.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayPlanes1.setText("No hay planes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel25.add(lblNoHayPlanes1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelNoHayPlanesDisponibles.add(jPanel25, gridBagConstraints);

        panelBotones.add(panelNoHayPlanesDisponibles);
        panelNoHayPlanesDisponibles.setBounds(450, 150, 350, 530);

        panelPlanSolicitadoCorrectamente.setBackground(new java.awt.Color(51, 51, 51));
        panelPlanSolicitadoCorrectamente.setMaximumSize(new java.awt.Dimension(100, 100));
        java.awt.GridBagLayout panelPlanSolicitadoCorrectamenteLayout = new java.awt.GridBagLayout();
        panelPlanSolicitadoCorrectamenteLayout.rowWeights = new double[] {1.0, 1.0};
        panelPlanSolicitadoCorrectamente.setLayout(panelPlanSolicitadoCorrectamenteLayout);

        lblPlanSolicitadoCorrectamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(55, 0, 0, 0);
        panelPlanSolicitadoCorrectamente.add(lblPlanSolicitadoCorrectamente, gridBagConstraints);

        lblPlanSolicitado.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblPlanSolicitado.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanSolicitado.setText("Plan solicitado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 264, 0);
        panelPlanSolicitadoCorrectamente.add(lblPlanSolicitado, gridBagConstraints);

        panelBotones.add(panelPlanSolicitadoCorrectamente);
        panelPlanSolicitadoCorrectamente.setBounds(0, 150, 450, 530);

        panelSolicitarNuevoPlan.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout panelSolicitarNuevoPlanLayout = new java.awt.GridBagLayout();
        panelSolicitarNuevoPlanLayout.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
        panelSolicitarNuevoPlanLayout.rowHeights = new int[] {0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0};
        panelSolicitarNuevoPlan.setLayout(panelSolicitarNuevoPlanLayout);

        comboProfesionalesEnSistema.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        comboProfesionalesEnSistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        comboProfesionalesEnSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProfesionalesEnSistemaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSolicitarNuevoPlan.add(comboProfesionalesEnSistema, gridBagConstraints);

        lblSeleccioneProfesional1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblSeleccioneProfesional1.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccioneProfesional1.setText("Seleccione el Profesional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSolicitarNuevoPlan.add(lblSeleccioneProfesional1, gridBagConstraints);

        lblCambiarPreferencias3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCambiarPreferencias3.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias3.setText("para elaborar el plan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSolicitarNuevoPlan.add(lblCambiarPreferencias3, gridBagConstraints);

        lblCambiarPreferencias2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCambiarPreferencias2.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias2.setText("Recuerde que el profesional se basará en ella");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSolicitarNuevoPlan.add(lblCambiarPreferencias2, gridBagConstraints);

        btnEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarPreferencias.png"))); // NOI18N
        btnEditarPreferencias.setBorderPainted(false);
        btnEditarPreferencias.setContentAreaFilled(false);
        btnEditarPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPreferenciasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 13, 0);
        panelSolicitarNuevoPlan.add(btnEditarPreferencias, gridBagConstraints);

        lblCambiarPreferencias4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCambiarPreferencias4.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias4.setText("¿Desea cambiar su información personal?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSolicitarNuevoPlan.add(lblCambiarPreferencias4, gridBagConstraints);

        btnEditarRestricciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarRestricciones.png"))); // NOI18N
        btnEditarRestricciones.setBorderPainted(false);
        btnEditarRestricciones.setContentAreaFilled(false);
        btnEditarRestricciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRestriccionesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 13, 15);
        panelSolicitarNuevoPlan.add(btnEditarRestricciones, gridBagConstraints);

        lblCambiarPreferencias5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCambiarPreferencias5.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias5.setText("Restricciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        panelSolicitarNuevoPlan.add(lblCambiarPreferencias5, gridBagConstraints);

        lblCambiarPreferencias6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCambiarPreferencias6.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias6.setText("Preferencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        panelSolicitarNuevoPlan.add(lblCambiarPreferencias6, gridBagConstraints);

        btnAceptarSolicitudPlanAlimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnAceptarSolicitudPlanAlimentacion.setBorderPainted(false);
        btnAceptarSolicitudPlanAlimentacion.setContentAreaFilled(false);
        btnAceptarSolicitudPlanAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarSolicitudPlanAlimentacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 160, 0);
        panelSolicitarNuevoPlan.add(btnAceptarSolicitudPlanAlimentacion, gridBagConstraints);

        lblValidarProfesionalPlan.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarProfesionalPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        lblValidarProfesionalPlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblValidarProfesionalPlanFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSolicitarNuevoPlan.add(lblValidarProfesionalPlan, gridBagConstraints);

        lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos.setText("completar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSolicitarNuevoPlan.add(lblDatosIncorrectos, gridBagConstraints);

        lblDatosIncorrectos1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos1.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos1.setText("Quedan datos sin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelSolicitarNuevoPlan.add(lblDatosIncorrectos1, gridBagConstraints);

        panelBotones.add(panelSolicitarNuevoPlan);
        panelSolicitarNuevoPlan.setBounds(0, 150, 450, 530);

        panelBuscarPlan.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout panelBuscarPlanLayout = new java.awt.GridBagLayout();
        panelBuscarPlanLayout.columnWeights = new double[] {1.0, 1.0};
        panelBuscarPlanLayout.rowWeights = new double[] {1.0, 1.0};
        panelBuscarPlan.setLayout(panelBuscarPlanLayout);

        listaPlanesDelUsuario.setBackground(new java.awt.Color(51, 51, 51));
        listaPlanesDelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaPlanesDelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        listaPlanesDelUsuario.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPlanesDelUsuarioValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaPlanesDelUsuario);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(37, 37, 37, 37);
        panelBuscarPlan.add(jScrollPane4, gridBagConstraints);

        lblSeleccioneProfesional2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblSeleccioneProfesional2.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccioneProfesional2.setText("Seleccione el plan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 37, 0, 0);
        panelBuscarPlan.add(lblSeleccioneProfesional2, gridBagConstraints);

        panelBotones.add(panelBuscarPlan);
        panelBuscarPlan.setBounds(450, 150, 350, 530);

        btnSolicitarNuevoPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoPlanAlimentacion.png"))); // NOI18N
        btnSolicitarNuevoPlan.setBorderPainted(false);
        btnSolicitarNuevoPlan.setContentAreaFilled(false);
        btnSolicitarNuevoPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarNuevoPlanActionPerformed(evt);
            }
        });
        panelBotones.add(btnSolicitarNuevoPlan);
        btnSolicitarNuevoPlan.setBounds(140, 10, 134, 110);

        btnVerPlanesExistentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVerPlanesAlimentacion.png"))); // NOI18N
        btnVerPlanesExistentes.setBorderPainted(false);
        btnVerPlanesExistentes.setContentAreaFilled(false);
        btnVerPlanesExistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPlanesExistentesActionPerformed(evt);
            }
        });
        panelBotones.add(btnVerPlanesExistentes);
        btnVerPlanesExistentes.setBounds(540, 10, 134, 110);

        javax.swing.GroupLayout panelPlanDeAlimentacionLayout = new javax.swing.GroupLayout(panelPlanDeAlimentacion);
        panelPlanDeAlimentacion.setLayout(panelPlanDeAlimentacionLayout);
        panelPlanDeAlimentacionLayout.setHorizontalGroup(
            panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelPlanDeAlimentacionLayout.setVerticalGroup(
            panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDerecho.add(panelPlanDeAlimentacion, "card6");

        panelVacio.setBackground(new java.awt.Color(51, 51, 51));
        panelVacio.setMaximumSize(new java.awt.Dimension(800, 800));
        panelVacio.setMinimumSize(new java.awt.Dimension(800, 800));
        panelVacio.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel23Layout = new java.awt.GridBagLayout();
        jPanel23Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel23.setLayout(jPanel23Layout);

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
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 15);
        jPanel23.add(btnAyuda, gridBagConstraints);

        panelVacio.add(jPanel23, java.awt.BorderLayout.PAGE_END);

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel22Layout = new java.awt.GridBagLayout();
        jPanel22Layout.columnWeights = new double[] {1.0, 1.0};
        jPanel22.setLayout(jPanel22Layout);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel22.add(btnCerrarSistema8, gridBagConstraints);

        panelVacio.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        panelDerecho.add(panelVacio, "card7");

        getContentPane().add(panelDerecho, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConsultaConProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaConProfesionalActionPerformed
        ocultarPaneles();
        this.btnConsultaConProfesional.setEnabled(false);
        if (sistema.getListaProfesionales().size() > 0) {
            String[] lista = sistema.getListaNombresProfesionalesConversaciones(sistema.getPersonaLogueada().getNombreCompleto());
            if (lista.length > 0) {
                this.existeConversacion = true;
                this.panelConversacion.setVisible(true);
                this.listaConversaciones.setListData(lista);
                this.listaConversaciones.setSelectedIndex(0);
                this.existeConversacion = true;
                this.panelConsultaConProfesional.setVisible(true);
            } else {
                this.lblNohayConsultasTexto4.setVisible(false);
                this.panelNoHayConversacionesCreadas.setVisible(true);
                this.lblNohayProfesionales.setVisible(false);
            }
        } else {
            this.panelNoHayConversacionesCreadas.setVisible(true);
            this.lblNohayProfesionales.setVisible(true);
            this.lblNohayConsultasTexto3.setVisible(false);
            this.lblNohayConsultasTexto4.setVisible(false);
            this.btnNuevaConversacion1.setVisible(false);
            this.lblCrearConv.setVisible(false);
        }
    }//GEN-LAST:event_btnConsultaConProfesionalActionPerformed

    private void btnSolicitarPlanAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarPlanAlimentacionActionPerformed
        ocultarPaneles();
        this.btnSolicitarPlanAlimentacion.setEnabled(false);
        if (sistema.getListaProfesionales().size() > 0) {
            this.lblValidarProfesionalPlan.setVisible(false);
            this.btnSolicitarPlanAlimentacion.setEnabled(false);
            this.panelPlanDeAlimentacion.setVisible(true);
        } else {
            this.panelNoHayConversacionesCreadas.setVisible(true);
            this.lblNohayProfesionales.setVisible(true);
            this.lblNohayConsultasTexto3.setVisible(false);
            this.btnNuevaConversacion1.setVisible(false);
            this.lblCrearConv.setVisible(false);
        }

    }//GEN-LAST:event_btnSolicitarPlanAlimentacionActionPerformed

    private void btnIngresarAlimentoIngeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngeridoActionPerformed
        ocultarPaneles();
        this.btnIngresarAlimentoIngerido.setEnabled(false);
        if (this.sistema.getListaAlimentos().size() > 0) {
            this.btnIngresarAlimentoIngerido.setEnabled(false);
            this.panelAlimentoIngerido.setVisible(true);
            List<Alimento> lstAlimentos = this.sistema.getListaAlimentos();
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            this.comboAlimentosEnSistema.setModel(modelo);
            this.comboAlimentosEnSistema.addItem("Seleccione...");
            for (int i = 0; i < lstAlimentos.size(); i++) {
                this.comboAlimentosEnSistema.addItem(lstAlimentos.get(i).toString());
            }
            this.primeraIngesta = false;
        } else {
            this.panelNoHayAlimentos.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresarAlimentoIngeridoActionPerformed

    private void listaElegirProfesionalesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaElegirProfesionalesValueChanged
        this.existeConversacion = true;
        Profesional profesional = (Profesional) this.listaElegirProfesionales.getSelectedValue();
        this.sistema.crearConversacion(this.sistema.getPersonaLogueada(), profesional, "CONVERSACION:", true);
        ocultarPaneles();
        this.panelConversacion.setVisible(true);
        actualizarConversaciones(profesional.getNombreCompleto());
        this.panelConsultaConProfesional.setVisible(true);
    }//GEN-LAST:event_listaElegirProfesionalesValueChanged

    private void listaConversacionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaConversacionesValueChanged
        if (this.existeConversacion && this.listaConversaciones.getSelectedValue() != null) {
            this.panelConversacion.setVisible(true);
            this.profesionalSeleccionado = this.listaConversaciones.getSelectedValue();
            
            actualizarConversaciones(this.profesionalSeleccionado);
        }
    }//GEN-LAST:event_listaConversacionesValueChanged

    private void btnNuevaConversacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConversacionActionPerformed
        List listaNombresProfesionalesSinConversacion = this.sistema.getNombresProfesionalesSinConversacionConUsuario((sistema.getPersonaLogueada()));
        if (listaNombresProfesionalesSinConversacion != null && listaNombresProfesionalesSinConversacion.size() > 0) {
            ocultarPaneles();
            this.listaElegirProfesionales.setListData(listaNombresProfesionalesSinConversacion.toArray());
            this.panelElegirProfesional.setVisible(true);
        }
        else{
            String mensajeError = "Ya tiene conversaciones con todos los profesionales del sistema.";
            
            JOptionPane.showMessageDialog(null, mensajeError, "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNuevaConversacionActionPerformed

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        String mensaje = this.txtMensajeNuevo.getText();
        String profesional = this.profesionalSeleccionado;
        String usuario = this.sistema.getPersonaLogueada().getNombreCompleto();
        this.sistema.agregarMensajeConversacion(usuario, profesional, mensaje, false, false);
        this.txtMensajeNuevo.setText("");
        actualizarConversaciones(profesional);
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void btnNuevaIngestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaIngestaActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
        List<Ingesta> listaIngestasDelUsuario = usuarioLogueado.getAlimentosIngeridos();
        String fechaIngesta = this.fechaIngestaUsuario.getText();
        String nuevoAlimento = this.comboAlimentosEnSistema.getSelectedItem().toString();
        
        boolean hayError = false;
        if (nuevoAlimento.equals("Seleccione...")) {
            this.lblDatosIncorrectos2.setVisible(true);
            this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNuevoAlimento.setVisible(true);
            this.lblNuevoAlimentoVacio.setVisible(true);
            hayError = true;
        } 
        
        if(fechaIngesta.isEmpty()){
            this.lblDatosIncorrectos2.setVisible(true);
            this.lblValidarNuevoAlimento1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNuevoAlimento1.setVisible(true);
            this.lblNuevoAlimentoVacio1.setVisible(true);
            hayError = true;
        }
        
        if(!hayError) {
            this.sistema.agregarIngestaAUsuario(listaIngestasDelUsuario, fechaIngesta, nuevoAlimento);
            this.panelIngestaRegistradaCorrectamente.setVisible(true);
            this.lblNuevoAlimentoVacio.setVisible(false);
            this.lblValidarNuevoAlimento.setVisible(false);
            this.btnIngresarAlimentoIngerido.setEnabled(true);
            this.lblDatosIncorrectos2.setVisible(false);
            this.lblValidarNuevoAlimento1.setVisible(false);
            this.lblNuevoAlimentoVacio1.setVisible(false);
            this.primeraIngesta = true;
            this.comboAlimentosEnSistema.setSelectedIndex(0);
            this.panelAlimentoIngerido.setVisible(false);
        }
    }//GEN-LAST:event_btnNuevaIngestaActionPerformed

    private void btnVerPlanesExistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPlanesExistentesActionPerformed
        this.btnVerPlanesExistentes.setEnabled(false);
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
        String[] planesDelUsuario = this.sistema.planesAtendidosDelUsuario(usuarioLogueado);
        if (planesDelUsuario.length > 0) {
            this.panelBuscarPlan.setVisible(true);
            this.listaPlanesDelUsuario.setListData(planesDelUsuario);
        } else {
            this.panelBuscarPlan.setVisible(true);
            this.panelNoHayPlanesDisponibles.setVisible(true);
        }
    }//GEN-LAST:event_btnVerPlanesExistentesActionPerformed

    private void btnSolicitarNuevoPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarNuevoPlanActionPerformed
        this.btnSolicitarNuevoPlan.setEnabled(false);
        this.lblValidarProfesionalPlan.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblDatosIncorrectos1.setVisible(false);
        this.panelSolicitarNuevoPlan.setVisible(true);
        List<Profesional> lstProfesionales = this.sistema.getListaProfesionales();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        this.comboProfesionalesEnSistema.setModel(modelo);
        this.comboProfesionalesEnSistema.addItem("Seleccione...");
        for (int i = 0; i < lstProfesionales.size(); i++) {
            this.comboProfesionalesEnSistema.addItem(lstProfesionales.get(i).toString());
        }
        this.primeraVez = false;
    }//GEN-LAST:event_btnSolicitarNuevoPlanActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_formWindowClosing

    private void comboAlimentosEnSistemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAlimentosEnSistemaItemStateChanged
        if (!this.primeraIngesta) {
            String alimentoIngresado = (String) this.comboAlimentosEnSistema.getSelectedItem();
            if (alimentoIngresado.equals("Seleccione...")) {
                this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarNuevoAlimento.setVisible(true);
                this.lblNuevoAlimentoVacio.setVisible(true);
            } else {
                this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarNuevoAlimento.setVisible(true);
                this.lblNuevoAlimentoVacio.setVisible(false);
            }
        }
    }//GEN-LAST:event_comboAlimentosEnSistemaItemStateChanged

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        AyudaUsuario ayuda = new AyudaUsuario(sistema);
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

    private void lblValidarProfesionalPlanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarProfesionalPlanFocusGained

    }//GEN-LAST:event_lblValidarProfesionalPlanFocusGained

    private void btnAceptarSolicitudPlanAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarSolicitudPlanAlimentacionActionPerformed
        String nombreProfesionalElegido = (String) this.comboProfesionalesEnSistema.getSelectedItem();
        if (nombreProfesionalElegido.equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            this.lblDatosIncorrectos1.setVisible(true);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            this.lblDatosIncorrectos1.setVisible(false);
            Profesional profesionalElegido = sistema.getProfesionalPorNombre(nombreProfesionalElegido);
            String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
            Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
            this.sistema.agregarPlanSolicitado(usuarioLogueado, profesionalElegido, LocalDateTime.now());
            this.panelSolicitarNuevoPlan.setVisible(false);
            this.panelPlanSolicitadoCorrectamente.setVisible(true);

        }
    }//GEN-LAST:event_btnAceptarSolicitudPlanAlimentacionActionPerformed

    private void btnEditarRestriccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRestriccionesActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
        VentanaEditarRestricciones editarRestriccionesUsuario = new VentanaEditarRestricciones(sistema, usuarioLogueado);
        editarRestriccionesUsuario.setVisible(true);
    }//GEN-LAST:event_btnEditarRestriccionesActionPerformed

    private void btnEditarPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPreferenciasActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
        VentanaEditarPreferencias editarPreferenciasUsuario = new VentanaEditarPreferencias(sistema, usuarioLogueado);
        editarPreferenciasUsuario.setVisible(true);
    }//GEN-LAST:event_btnEditarPreferenciasActionPerformed

    private void comboProfesionalesEnSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProfesionalesEnSistemaActionPerformed
        if (!this.primeraVez) {
            String profesionalElegido = (String) this.comboProfesionalesEnSistema.getSelectedItem();
            if (profesionalElegido.equals("Seleccione...")) {
                this.lblValidarProfesionalPlan.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarProfesionalPlan.setVisible(true);
            } else {
                this.lblValidarProfesionalPlan.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarProfesionalPlan.setVisible(true);
            }
        }
    }//GEN-LAST:event_comboProfesionalesEnSistemaActionPerformed

    private void listaPlanesDelUsuarioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPlanesDelUsuarioValueChanged
        ocultarPaneles();
        String[] infoPlan = this.listaPlanesDelUsuario.getSelectedValue().split("( \\| )");

        this.nombreDelPlan = infoPlan[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(infoPlan[1], formatter);
        PlanAlimentacion planSeleccionado = this.sistema.devolverPlanDadoNombreYFecha(nombreDelPlan, dateTime);
        this.lblNombreDelPlan.setText(planSeleccionado.getNombreDelPlan());
        this.lblNombreDelProfesional.setText(planSeleccionado.getProfesional().getNombreCompleto());
        this.lblTituloDelProfesional.setText(planSeleccionado.getProfesional().getTituloProfesional());
        String[][] planDiaADia = planSeleccionado.getPlanDiaADia();
        this.txtComidasLunes.setText(cargarDatosDelPlan(planDiaADia, 0));
        this.txtComidasMartes.setText(cargarDatosDelPlan(planDiaADia, 1));
        this.txtComidasMiercoles.setText(cargarDatosDelPlan(planDiaADia, 2));
        this.txtComidasJueves.setText(cargarDatosDelPlan(planDiaADia, 3));
        this.txtComidasViernes.setText(cargarDatosDelPlan(planDiaADia, 4));
        this.txtComidasSabado.setText(cargarDatosDelPlan(planDiaADia, 5));
        this.txtComidasDomingo.setText(cargarDatosDelPlan(planDiaADia, 6));
        this.panelVerPlanAlimentacion.setVisible(true);
    }//GEN-LAST:event_listaPlanesDelUsuarioValueChanged

    private void btnCerrarSistema4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema4ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema4ActionPerformed

    private void btnCerrarSistema3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema3ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema3ActionPerformed

    private void btnCerrarSistema5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema5ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema5ActionPerformed

    private void btnNuevaConversacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConversacion1ActionPerformed
        List listaNombresProfesionalesSinConversacion = this.sistema.getNombresProfesionalesSinConversacionConUsuario((sistema.getPersonaLogueada()));
        if (listaNombresProfesionalesSinConversacion != null && listaNombresProfesionalesSinConversacion.size() > 0) {
            ocultarPaneles();
            this.listaElegirProfesionales.setListData(listaNombresProfesionalesSinConversacion.toArray());
            this.panelElegirProfesional.setVisible(true);
        }
    }//GEN-LAST:event_btnNuevaConversacion1ActionPerformed

    private void btnCerrarSistema6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema6ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema6ActionPerformed

    private void btnCerrarSistema7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema7ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema7ActionPerformed

    private void btnCerrarSistema8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistema8ActionPerformed
        this.sistema.guardarDatosSistema(true);
    }//GEN-LAST:event_btnCerrarSistema8ActionPerformed

    private void fechaIngestaUsuarioOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_fechaIngestaUsuarioOnCommit
        String fecha = this.fechaIngestaUsuario.getText();
        if (fecha.equals("")) {
            this.lblValidarNuevoAlimento1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNuevoAlimento1.setVisible(true);
            this.lblNuevoAlimentoVacio1.setVisible(true);
        } else {
            this.lblValidarNuevoAlimento1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarNuevoAlimento1.setVisible(true);
            this.lblNuevoAlimentoVacio1.setVisible(false);
        }
    }//GEN-LAST:event_fechaIngestaUsuarioOnCommit

    private void btnNuevaConversacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConversacion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaConversacion2ActionPerformed

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
        btnSolicitarNuevoPlanActionPerformed(null);
    }//GEN-LAST:event_jPanel24MouseClicked

    private void ocultarPaneles() {
        this.btnConsultaConProfesional.setEnabled(true);
        this.btnIngresarAlimentoIngerido.setEnabled(true);
        this.btnSolicitarPlanAlimentacion.setEnabled(true);
        this.btnSolicitarNuevoPlan.setEnabled(true);
        this.btnVerPlanesExistentes.setEnabled(true);
        this.panelConsultaConProfesional.setVisible(false);
        this.txtMostrarConversacion.setText("");
        this.panelElegirProfesional.setVisible(false);
        this.panelBuscarPlan.setVisible(false);
        this.panelConversacion.setVisible(false);
        this.panelAlimentoIngerido.setVisible(false);
        this.panelPlanDeAlimentacion.setVisible(false);
        this.panelSolicitarNuevoPlan.setVisible(false);
        this.panelNoHayAlimentos.setVisible(false);
        this.panelVacio.setVisible(true);
        this.panelVerPlanAlimentacion.setVisible(false);
        this.panelPlanSolicitadoCorrectamente.setVisible(false);
        this.panelIngestaRegistradaCorrectamente.setVisible(false);
        this.panelNoHayConversacionesCreadas.setVisible(false);
        this.panelNoHayPlanesDisponibles.setVisible(false);
        this.panelVacio.setVisible(false);
    }

    private void actualizarConversaciones(String destinatario) {
        if (destinatario != null) {
            String remitente = this.sistema.getPersonaLogueada().getNombreCompleto();
            String conversacion = this.sistema.getConversacion(destinatario, remitente);
            this.txtMostrarConversacion.setText(conversacion);
            this.lblNombreProfesional.setText(this.profesionalSeleccionado);
            Profesional profesional = this.sistema.getProfesionalPorNombre(this.profesionalSeleccionado);
            
            Image image = profesional.getFotoDePerfil()
                    .getImage()
                    .getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        
            lblFotoProfesional.setIcon(new ImageIcon(image));
            
            this.listaConversaciones.setListData(this.sistema.getListaNombresProfesionalesConversaciones(remitente));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarSolicitudPlanAlimentacion;
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
    private javax.swing.JButton btnConsultaConProfesional;
    private javax.swing.JButton btnEditarPreferencias;
    private javax.swing.JButton btnEditarRestricciones;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarAlimentoIngerido;
    private javax.swing.JButton btnNuevaConversacion;
    private javax.swing.JButton btnNuevaConversacion1;
    private javax.swing.JButton btnNuevaConversacion2;
    private javax.swing.JButton btnNuevaIngesta;
    private javax.swing.JButton btnSolicitarNuevoPlan;
    private javax.swing.JButton btnSolicitarPlanAlimentacion;
    private javax.swing.JButton btnVerPlanesExistentes;
    private javax.swing.JComboBox<String> comboAlimentosEnSistema;
    private javax.swing.JComboBox<String> comboProfesionalesEnSistema;
    private datechooser.beans.DateChooserCombo fechaIngestaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado10;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado11;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado14;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado2;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado4;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado5;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado6;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado7;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado8;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado9;
    private javax.swing.JLabel lblCambiarPreferencias2;
    private javax.swing.JLabel lblCambiarPreferencias3;
    private javax.swing.JLabel lblCambiarPreferencias4;
    private javax.swing.JLabel lblCambiarPreferencias5;
    private javax.swing.JLabel lblCambiarPreferencias6;
    private javax.swing.JLabel lblConsultaConProfesional;
    private javax.swing.JLabel lblCrearConv;
    private javax.swing.JLabel lblCrearConv1;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblDatosIncorrectos1;
    private javax.swing.JLabel lblDatosIncorrectos2;
    private javax.swing.JLabel lblFechaAlimentoIngerido;
    private javax.swing.JLabel lblFotoProfesional;
    private javax.swing.JLabel lblIconoInicioSesion;
    private javax.swing.JLabel lblIconoInicioSesion1;
    private javax.swing.JLabel lblIconoInicioSesion2;
    private javax.swing.JLabel lblIconoInicioSesion3;
    private javax.swing.JLabel lblIconoInicioSesion4;
    private javax.swing.JLabel lblIngresarAlimentoIngerido;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblInicioSesion1;
    private javax.swing.JLabel lblInicioSesion2;
    private javax.swing.JLabel lblInicioSesion3;
    private javax.swing.JLabel lblInicioSesion4;
    private javax.swing.JLabel lblNoHayPlanes;
    private javax.swing.JLabel lblNoHayPlanes1;
    private javax.swing.JLabel lblNohayConsultas;
    private javax.swing.JLabel lblNohayConsultas1;
    private javax.swing.JLabel lblNohayConsultasTexto;
    private javax.swing.JLabel lblNohayConsultasTexto1;
    private javax.swing.JLabel lblNohayConsultasTexto2;
    private javax.swing.JLabel lblNohayConsultasTexto3;
    private javax.swing.JLabel lblNohayConsultasTexto4;
    private javax.swing.JLabel lblNohayProfesionales;
    private javax.swing.JLabel lblNombreDelPlan;
    private javax.swing.JLabel lblNombreDelProfesional;
    private javax.swing.JLabel lblNombreProfesional;
    private javax.swing.JLabel lblNuevoAlimentoVacio;
    private javax.swing.JLabel lblNuevoAlimentoVacio1;
    private javax.swing.JLabel lblPlanSolicitado;
    private javax.swing.JLabel lblPlanSolicitadoCorrectamente;
    private javax.swing.JLabel lblPlanSolicitadoCorrectamente1;
    private javax.swing.JLabel lblSeleccioneProfesional1;
    private javax.swing.JLabel lblSeleccioneProfesional2;
    private javax.swing.JLabel lblSolicitarPlanAlimentacion;
    private javax.swing.JLabel lblTituloDelProfesional;
    private javax.swing.JLabel lblValidarNuevoAlimento;
    private javax.swing.JLabel lblValidarNuevoAlimento1;
    private javax.swing.JLabel lblValidarProfesionalPlan;
    private javax.swing.JList<String> listaConversaciones;
    private javax.swing.JList listaElegirProfesionales;
    private javax.swing.JList<String> listaPlanesDelUsuario;
    private javax.swing.JPanel panelAlimentoIngerido;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBuscarPlan;
    private javax.swing.JPanel panelConsultaConProfesional;
    private javax.swing.JPanel panelConversacion;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelElegirProfesional;
    private javax.swing.JPanel panelIngestaRegistradaCorrectamente;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNoHayAlimentos;
    private javax.swing.JPanel panelNoHayConversacionesCreadas;
    private javax.swing.JPanel panelNoHayPlanesDisponibles;
    private javax.swing.JPanel panelPlanDeAlimentacion;
    private javax.swing.JPanel panelPlanSolicitadoCorrectamente;
    private javax.swing.JPanel panelSolicitarNuevoPlan;
    private javax.swing.JPanel panelVacio;
    private javax.swing.JPanel panelVerPlanAlimentacion;
    private javax.swing.JTextArea txtComidasDomingo;
    private javax.swing.JTextArea txtComidasJueves;
    private javax.swing.JTextArea txtComidasLunes;
    private javax.swing.JTextArea txtComidasMartes;
    private javax.swing.JTextArea txtComidasMiercoles;
    private javax.swing.JTextArea txtComidasSabado;
    private javax.swing.JTextArea txtComidasViernes;
    private javax.swing.JTextArea txtMensajeNuevo;
    private javax.swing.JTextPane txtMostrarConversacion;
    // End of variables declaration//GEN-END:variables

    private String cargarDatosDelPlan(String[][] planDiaADia, int indiceDia) {
        String actual = "DESAYUNO:" + "\n";
        if (planDiaADia[indiceDia][0] == null || planDiaADia[indiceDia][0].equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][0];
        }
        actual += "\n" + "\n" + "ALMUERZO:" + "\n";
        if (planDiaADia[indiceDia][1] == null || planDiaADia[indiceDia][1].equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][1];
        }
        actual += "\n" + "\n" + "CENA:" + "\n";
        if (planDiaADia[indiceDia][2] == null || planDiaADia[indiceDia][2].equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][2];
        }
        return actual;
    }

}
