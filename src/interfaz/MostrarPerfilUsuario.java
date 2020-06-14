package interfaz;

import dominio.Alimento;
import dominio.Ingesta;
import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

public class MostrarPerfilUsuario extends javax.swing.JDialog {

    private Sistema sistema;
    private String nombreUsuario;

    public MostrarPerfilUsuario(Sistema unSistema, String usuarioAMostrar) {
        initComponents();
        this.sistema = unSistema;
        this.nombreUsuario = usuarioAMostrar;
        this.setLocationRelativeTo(null);
        Usuario usuarioPerfil = (Usuario) sistema.getUsuarioPorNombre(nombreUsuario);
        this.lblNombreUsuario.setText(usuarioPerfil.getNombreCompleto());
        this.lblFechaNacimientoUsuario.setText(usuarioPerfil.getFechaNacimiento());
        this.lblFotoDeUsuario.setIcon(usuarioPerfil.getFotoDePerfil());
        if (usuarioPerfil.getArrayAlimentosIngeridos().length > 0) {
            List<Ingesta> ingeridos = usuarioPerfil.getAlimentosIngeridos();
            ArrayList <String> listaASetear = new ArrayList <>();
            for (int i = 0; i < ingeridos.size(); i++) {
                Ingesta ingestaActual = ingeridos.get(i);
                List <Alimento> alimentosActuales = ingestaActual.getListaAlimentosPorFecha();
                for (int j = 0; j < alimentosActuales.size(); j++) {
                    listaASetear.add(alimentosActuales.get(i).toString());
                }
            }
            String [] arrayASetear = new String [listaASetear.size()]; 
            for (int i = 0; i < listaASetear.size(); i++) {
                arrayASetear[i] = listaASetear.get(i);
            }
            this.listaIngestas.setListData(arrayASetear);
        }
        if (usuarioPerfil.getArrayPreferencias().length > 0) {
            this.listaPreferencias.setListData(usuarioPerfil.getArrayPreferencias());
        }
        if (usuarioPerfil.getArrayRestricciones().length > 0) {
            this.listaRestricciones.setListData(usuarioPerfil.getArrayRestricciones());
        }
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String unNombreUsuario) {
        this.nombreUsuario = unNombreUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblFotoDeUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaIngestas = new javax.swing.JList<>();
        lblFechaNacimiento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRestricciones = new javax.swing.JList<>();
        lblTxtIngestas = new javax.swing.JLabel();
        lblPreferencias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPreferencias = new javax.swing.JList<>();
        lblFechaNacimientoUsuario = new javax.swing.JLabel();
        lblRestricciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblFotoDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(lblFotoDeUsuario, gridBagConstraints);

        lblNombreUsuario.setFont(new java.awt.Font("Levenim MT", 0, 68)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(lblNombreUsuario, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 19, 0, 19, 0, 19, 0};
        jPanel3Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel3.setLayout(jPanel3Layout);

        jScrollPane3.setViewportView(listaIngestas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.ipady = 67;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jScrollPane3, gridBagConstraints);

        lblFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha de nacimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(lblFechaNacimiento, gridBagConstraints);

        jScrollPane2.setViewportView(listaRestricciones);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.ipady = 67;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jScrollPane2, gridBagConstraints);

        lblTxtIngestas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblTxtIngestas.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtIngestas.setText("Ingestas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(lblTxtIngestas, gridBagConstraints);

        lblPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblPreferencias.setText("Preferencias:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(lblPreferencias, gridBagConstraints);

        jScrollPane1.setViewportView(listaPreferencias);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.ipady = 67;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jScrollPane1, gridBagConstraints);

        lblFechaNacimientoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblFechaNacimientoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimientoUsuario.setText("Fecha del usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(lblFechaNacimientoUsuario, gridBagConstraints);

        lblRestricciones.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblRestricciones.setForeground(new java.awt.Color(255, 255, 255));
        lblRestricciones.setText("Restricciones:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(lblRestricciones, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFechaNacimientoUsuario;
    private javax.swing.JLabel lblFotoDeUsuario;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPreferencias;
    private javax.swing.JLabel lblRestricciones;
    private javax.swing.JLabel lblTxtIngestas;
    private javax.swing.JList<String> listaIngestas;
    private javax.swing.JList<String> listaPreferencias;
    private javax.swing.JList<String> listaRestricciones;
    // End of variables declaration//GEN-END:variables
}
