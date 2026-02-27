
package View;

import Controller.Controller;
import Modelo.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class Principal extends javax.swing.JFrame {
    private DefaultTableModel tablaJugadores = new DefaultTableModel();
    private DefaultTableModel tablaArbitros = new DefaultTableModel();
    private Object[] arreglo = new Object[8];
    private Object[] arreglo2 = new Object[5];
    private Controller controller;
       
    public Principal() {
        initComponents();
        tablaJugadores = (DefaultTableModel)jTableJugadores.getModel();
        tablaArbitros = (DefaultTableModel)jTableArbitros.getModel();

    }
    public Principal(Controller controller){
        initComponents();
        this.controller= controller;
        tablaJugadores = (DefaultTableModel)jTableJugadores.getModel();
        tablaArbitros = (DefaultTableModel)jTableArbitros.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelPrincipal = new javax.swing.JPanel();
        JTabbedMain = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jPanelCargar = new javax.swing.JPanel();
        jTabbedCarga = new javax.swing.JTabbedPane();
        jPanelJugador = new javax.swing.JPanel();
        CargaJugador = new javax.swing.JPanel();
        NombreJugador = new javax.swing.JTextField();
        apellidoJugador = new javax.swing.JTextField();
        spinnerDia = new javax.swing.JSpinner();
        spinnerAnio = new javax.swing.JSpinner();
        spinnerMes = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        comboBoxNacionalidadJugador = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxClub = new javax.swing.JComboBox<>();
        comboBoxPosicion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spinnerGoles = new javax.swing.JSpinner();
        spinnerTarjetasRojas = new javax.swing.JSpinner();
        spinnerTarjetasAmarillas = new javax.swing.JSpinner();
        dniJugador = new javax.swing.JTextField();
        BotonCargaJugador = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanelArbitro = new javax.swing.JPanel();
        CargaArbitro = new javax.swing.JPanel();
        NombreArbitro = new javax.swing.JTextField();
        ApellidoArbitro = new javax.swing.JTextField();
        SpinnerDiaArbitro = new javax.swing.JSpinner();
        SpinneranioArbitro = new javax.swing.JSpinner();
        SpinnerMesArbitro = new javax.swing.JSpinner();
        ComboboxNacionalidadArbitro = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        SpinnerTarjetasArbitro = new javax.swing.JSpinner();
        CheckInternacional = new javax.swing.JCheckBox();
        DNIArbitro = new javax.swing.JTextField();
        BotonCargaArbitro = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanelMostrar = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelBuscarJugador = new javax.swing.JPanel();
        CargaJugador1 = new javax.swing.JPanel();
        jTextFieldNombreJugador = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldDNIjugBuscado = new javax.swing.JTextField();
        jTextFieldClubEncontrado = new javax.swing.JTextField();
        jTextFieldGolesEncontrado = new javax.swing.JTextField();
        jTextFieldNacionalidadEncontradaJugador = new javax.swing.JTextField();
        jTextFieldRojasEncontrado = new javax.swing.JTextField();
        jTextFieldAmarillasEncontrado = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButtonBuscarJugador = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldFechaNacEncontradoJugador = new javax.swing.JTextField();
        jButtonEliminarJugador = new javax.swing.JButton();
        jButtonGuardarJugador = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonMasRojas = new javax.swing.JButton();
        jPanelBuscarArbitro = new javax.swing.JPanel();
        CargaArbitro1 = new javax.swing.JPanel();
        jTextFieldNombreCompletoArbitroEncontrado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldDNIArbBuscado = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldNacimientoEncontradoArb = new javax.swing.JTextField();
        jTextFieldNacionalidadEncontradaArb = new javax.swing.JTextField();
        jTextFieldTarjetasSacadas = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jCheckBoxInternacionalBuscado = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jButtonEliminarArb = new javax.swing.JButton();
        jButtonGuardarArb = new javax.swing.JButton();
        jPanelMenus = new javax.swing.JPanel();
        jTabbedPaneMenus = new javax.swing.JTabbedPane();
        jPanelPeorJugador = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldPeorJugador = new javax.swing.JTextField();
        jTextFieldNacionalidaPJugador = new javax.swing.JTextField();
        jTextFieldPosicionPJugador = new javax.swing.JTextField();
        jTextFieldGolesPJugador = new javax.swing.JTextField();
        jTextFieldTAmarillasPJugador = new javax.swing.JTextField();
        jTextFieldClubPJugador = new javax.swing.JTextField();
        jTextFieldTRojasPJugador = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        BuscarPeorJugador = new javax.swing.JButton();
        jPanelArbitros = new javax.swing.JPanel();
        BoxListaInternacional = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArbitros = new javax.swing.JTable();
        botonActualizarArbitros = new javax.swing.JButton();
        jButtonTodosArbitros = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jSpinnerGoles = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableJugadores = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        BotonListaGoleadores = new javax.swing.JButton();
        jPanelContador = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        BoxEquipoContador = new javax.swing.JComboBox<>();
        TFCantJugPosc = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        BoxPosicionCont = new javax.swing.JComboBox<>();
        TFCantJugEqui = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        BotonBuscarporEquipo = new javax.swing.JButton();
        BotonBuscarporPosicion = new javax.swing.JButton();
        jPanelBarraSuperior = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelPrincipal.setName(""); // NOI18N
        JPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTabbedMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabbedMainMouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Baskerville Old Face", 1, 80)); // NOI18N
        jLabel42.setText("Asociacion de futbol 5");

        jLabel43.setFont(new java.awt.Font("Baskerville Old Face", 2, 60)); // NOI18N
        jLabel43.setText("Bienvenido a: ");

        jLabel44.setFont(new java.awt.Font("Baskerville Old Face", 2, 50)); // NOI18N
        jLabel44.setText("Programa administrativo ");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/MESSI.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Baskerville Old Face", 2, 50)); // NOI18N
        jLabel56.setText("de jugadores y arbitros");

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        JTabbedMain.addTab("Inicio", jPanelInicio);

        NombreJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        NombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreJugadorActionPerformed(evt);
            }
        });

        apellidoJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        apellidoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoJugadorActionPerformed(evt);
            }
        });

        spinnerDia.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        spinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        spinnerDia.setMaximumSize(new java.awt.Dimension(10, 1));

        spinnerAnio.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        spinnerAnio.setModel(new javax.swing.SpinnerNumberModel(2000, 1987, 2010, 1));

        spinnerMes.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel1.setText("     Dia              Mes               Año");

        comboBoxNacionalidadJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        comboBoxNacionalidadJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Venezolana", "Chilena", "Uruguay", "Otra", "Ciudad Del Vaticano" }));
        comboBoxNacionalidadJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNacionalidadJugadorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel2.setText("Nacionalidad");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel3.setText("Club ");

        comboBoxClub.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        comboBoxClub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "River Plate", "Boca Juniors", "Colo Colo", "Boca Juniors", "Barcelona", "Real Madrid", "Manchester United", "Manchester City", "Chacarita", "Inter" }));
        comboBoxClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClubActionPerformed(evt);
            }
        });

        comboBoxPosicion.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        comboBoxPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arquero", "Ala izquierda", "Ala derecha", "Pivot", "Cierre" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel4.setText("Posicion");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel5.setText("Goles");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel6.setText("Tarjetas Rojas");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel7.setText("Tarjetas Amarillas");

        spinnerGoles.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        spinnerGoles.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTarjetasRojas.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        spinnerTarjetasRojas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTarjetasAmarillas.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        spinnerTarjetasAmarillas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        dniJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        dniJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniJugadorActionPerformed(evt);
            }
        });

        BotonCargaJugador.setBackground(new java.awt.Color(37, 222, 164));
        BotonCargaJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        BotonCargaJugador.setForeground(new java.awt.Color(0, 0, 0));
        BotonCargaJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Load.png"))); // NOI18N
        BotonCargaJugador.setText("Cargar");
        BotonCargaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargaJugadorActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel12.setText("Nombre");

        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel22.setText("Apellido");

        jLabel23.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel23.setText("DNI");

        jLabel54.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel54.setText("Fecha de nacimiento");

        javax.swing.GroupLayout CargaJugadorLayout = new javax.swing.GroupLayout(CargaJugador);
        CargaJugador.setLayout(CargaJugadorLayout);
        CargaJugadorLayout.setHorizontalGroup(
            CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaJugadorLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CargaJugadorLayout.createSequentialGroup()
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxClub, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxNacionalidadJugador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(CargaJugadorLayout.createSequentialGroup()
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreJugador)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apellidoJugador)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dniJugador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CargaJugadorLayout.createSequentialGroup()
                                    .addComponent(spinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(spinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(spinnerAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaJugadorLayout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaJugadorLayout.createSequentialGroup()
                            .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spinnerGoles, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spinnerTarjetasRojas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spinnerTarjetasAmarillas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(BotonCargaJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );
        CargaJugadorLayout.setVerticalGroup(
            CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaJugadorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaJugadorLayout.createSequentialGroup()
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CargaJugadorLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaJugadorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinnerGoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CargaJugadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaJugadorLayout.createSequentialGroup()
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spinnerTarjetasRojas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spinnerTarjetasAmarillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CargaJugadorLayout.createSequentialGroup()
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboBoxNacionalidadJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboBoxClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CargaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboBoxPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74)
                .addComponent(BotonCargaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanelJugadorLayout = new javax.swing.GroupLayout(jPanelJugador);
        jPanelJugador.setLayout(jPanelJugadorLayout);
        jPanelJugadorLayout.setHorizontalGroup(
            jPanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CargaJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelJugadorLayout.setVerticalGroup(
            jPanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CargaJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedCarga.addTab("Jugador", jPanelJugador);

        NombreArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        NombreArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreArbitroActionPerformed(evt);
            }
        });

        ApellidoArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        ApellidoArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoArbitroActionPerformed(evt);
            }
        });

        SpinnerDiaArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        SpinnerDiaArbitro.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        SpinneranioArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        SpinneranioArbitro.setModel(new javax.swing.SpinnerNumberModel(2000, 1987, 2010, 1));

        SpinnerMesArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        SpinnerMesArbitro.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        ComboboxNacionalidadArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        ComboboxNacionalidadArbitro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Venezolana", "Chilena", "Uruguay", "Otra", "Vaticano" }));
        ComboboxNacionalidadArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxNacionalidadArbitroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel9.setText("Nacionalidad");

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel14.setText("Tarjetas Sacadas");

        SpinnerTarjetasArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        SpinnerTarjetasArbitro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        CheckInternacional.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        CheckInternacional.setText("Internacional");
        CheckInternacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInternacionalActionPerformed(evt);
            }
        });

        DNIArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        BotonCargaArbitro.setBackground(new java.awt.Color(37, 222, 164));
        BotonCargaArbitro.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        BotonCargaArbitro.setForeground(new java.awt.Color(0, 0, 0));
        BotonCargaArbitro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Load.png"))); // NOI18N
        BotonCargaArbitro.setText("Cargar");
        BotonCargaArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargaArbitroActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel24.setText("Nombre");

        jLabel25.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel25.setText("Apellido");

        jLabel26.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel26.setText("DNI");

        jLabel29.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel29.setText("Dia");

        jLabel30.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel30.setText("Mes");

        jLabel31.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel31.setText("Año");

        jLabel55.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel55.setText("Fecha de nacimiento");

        javax.swing.GroupLayout CargaArbitroLayout = new javax.swing.GroupLayout(CargaArbitro);
        CargaArbitro.setLayout(CargaArbitroLayout);
        CargaArbitroLayout.setHorizontalGroup(
            CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaArbitroLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaArbitroLayout.createSequentialGroup()
                        .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CargaArbitroLayout.createSequentialGroup()
                                .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CargaArbitroLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CargaArbitroLayout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CargaArbitroLayout.createSequentialGroup()
                                        .addComponent(ApellidoArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DNIArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(CargaArbitroLayout.createSequentialGroup()
                                    .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SpinnerDiaArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpinnerMesArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SpinneranioArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(SpinnerTarjetasArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CargaArbitroLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(44, 44, 44)
                                    .addComponent(ComboboxNacionalidadArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckInternacional, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21))
                    .addGroup(CargaArbitroLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(530, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaArbitroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCargaArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        CargaArbitroLayout.setVerticalGroup(
            CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaArbitroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaArbitroLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpinnerDiaArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinnerMesArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinneranioArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)))
                    .addGroup(CargaArbitroLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(SpinnerTarjetasArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addGroup(CargaArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboboxNacionalidadArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CheckInternacional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(BotonCargaArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanelArbitroLayout = new javax.swing.GroupLayout(jPanelArbitro);
        jPanelArbitro.setLayout(jPanelArbitroLayout);
        jPanelArbitroLayout.setHorizontalGroup(
            jPanelArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CargaArbitro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelArbitroLayout.setVerticalGroup(
            jPanelArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CargaArbitro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedCarga.addTab("Arbitro", jPanelArbitro);

        javax.swing.GroupLayout jPanelCargarLayout = new javax.swing.GroupLayout(jPanelCargar);
        jPanelCargar.setLayout(jPanelCargarLayout);
        jPanelCargarLayout.setHorizontalGroup(
            jPanelCargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedCarga)
        );
        jPanelCargarLayout.setVerticalGroup(
            jPanelCargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedCarga)
        );

        JTabbedMain.addTab("Cargar", jPanelCargar);

        jTextFieldNombreJugador.setEditable(false);
        jTextFieldNombreJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldNombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreJugadorActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel13.setText("Nacionalidad");

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel16.setText("Club ");

        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel17.setText("Posicion");

        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel18.setText("Goles");

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel19.setText("Tarjetas Rojas");

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel20.setText("Tarjetas Amarillas");

        jTextFieldDNIjugBuscado.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldDNIjugBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIjugBuscadoActionPerformed(evt);
            }
        });

        jTextFieldClubEncontrado.setEditable(false);
        jTextFieldClubEncontrado.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jTextFieldGolesEncontrado.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jTextFieldNacionalidadEncontradaJugador.setEditable(false);
        jTextFieldNacionalidadEncontradaJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldNacionalidadEncontradaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNacionalidadEncontradaJugadorActionPerformed(evt);
            }
        });

        jTextFieldRojasEncontrado.setEditable(false);
        jTextFieldRojasEncontrado.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jTextFieldAmarillasEncontrado.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldAmarillasEncontrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmarillasEncontradoActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel32.setText("DNI");

        jLabel33.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel33.setText("Datos Modificables");

        jButtonBuscarJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jButtonBuscarJugador.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscarJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Search.png"))); // NOI18N
        jButtonBuscarJugador.setText("Buscar");
        jButtonBuscarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarJugadorActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel8.setText("Nombre Completo");

        jLabel34.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel34.setText("Fecha de Nacimiento");

        jTextFieldFechaNacEncontradoJugador.setEditable(false);
        jTextFieldFechaNacEncontradoJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldFechaNacEncontradoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaNacEncontradoJugadorActionPerformed(evt);
            }
        });

        jButtonEliminarJugador.setBackground(new java.awt.Color(255, 102, 102));
        jButtonEliminarJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jButtonEliminarJugador.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEliminarJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Delete.png"))); // NOI18N
        jButtonEliminarJugador.setText("Eliminar");
        jButtonEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarJugadorActionPerformed(evt);
            }
        });

        jButtonGuardarJugador.setBackground(new java.awt.Color(37, 222, 164));
        jButtonGuardarJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jButtonGuardarJugador.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGuardarJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Modify.png"))); // NOI18N
        jButtonGuardarJugador.setText("Guardar Cambios");
        jButtonGuardarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarJugadorActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arquero", "Ala izquierda", "Ala derecha", "Pivot", "Cierre" }));

        jButtonMasRojas.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jButtonMasRojas.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMasRojas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Incrementar.png"))); // NOI18N
        jButtonMasRojas.setText("Incrementar");
        jButtonMasRojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasRojasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CargaJugador1Layout = new javax.swing.GroupLayout(CargaJugador1);
        CargaJugador1.setLayout(CargaJugador1Layout);
        CargaJugador1Layout.setHorizontalGroup(
            CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaJugador1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaJugador1Layout.createSequentialGroup()
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CargaJugador1Layout.createSequentialGroup()
                                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel19))
                                .addGap(82, 82, 82)
                                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CargaJugador1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldClubEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(CargaJugador1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldRojasEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonMasRojas))
                                    .addComponent(jTextFieldNacionalidadEncontradaJugador)))
                            .addComponent(jTextFieldNombreJugador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148))
                    .addGroup(CargaJugador1Layout.createSequentialGroup()
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CargaJugador1Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFechaNacEncontradoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CargaJugador1Layout.createSequentialGroup()
                                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDNIjugBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscarJugador))
                            .addComponent(jButtonEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaJugador1Layout.createSequentialGroup()
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGuardarJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CargaJugador1Layout.createSequentialGroup()
                                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(88, 88, 88)
                                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAmarillasEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldGolesEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaJugador1Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(277, 277, 277))))
        );
        CargaJugador1Layout.setVerticalGroup(
            CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaJugador1Layout.createSequentialGroup()
                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CargaJugador1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDNIjugBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarJugador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFieldNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jTextFieldFechaNacEncontradoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldNacionalidadEncontradaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldClubEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CargaJugador1Layout.createSequentialGroup()
                                .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jTextFieldRojasEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonMasRojas))
                                .addGap(116, 116, 116))
                            .addComponent(jButtonEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CargaJugador1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(26, 26, 26)
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAmarillasEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(CargaJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextFieldGolesEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBuscarJugadorLayout = new javax.swing.GroupLayout(jPanelBuscarJugador);
        jPanelBuscarJugador.setLayout(jPanelBuscarJugadorLayout);
        jPanelBuscarJugadorLayout.setHorizontalGroup(
            jPanelBuscarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CargaJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBuscarJugadorLayout.setVerticalGroup(
            jPanelBuscarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargaJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jugador", jPanelBuscarJugador);

        jTextFieldNombreCompletoArbitroEncontrado.setEditable(false);
        jTextFieldNombreCompletoArbitroEncontrado.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldNombreCompletoArbitroEncontrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCompletoArbitroEncontradoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel11.setText("Nacionalidad");

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel15.setText("Tarjetas Sacadas");

        jTextFieldDNIArbBuscado.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldDNIArbBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIArbBuscadoActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel21.setText("Nacimiento");

        jTextFieldNacimientoEncontradoArb.setEditable(false);
        jTextFieldNacimientoEncontradoArb.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldNacimientoEncontradoArb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNacimientoEncontradoArbActionPerformed(evt);
            }
        });

        jTextFieldNacionalidadEncontradaArb.setEditable(false);
        jTextFieldNacionalidadEncontradaArb.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldNacionalidadEncontradaArb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNacionalidadEncontradaArbActionPerformed(evt);
            }
        });

        jTextFieldTarjetasSacadas.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel27.setText("DNI");

        jLabel28.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel28.setText("Nombre completo");

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Search.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jCheckBoxInternacionalBuscado.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jCheckBoxInternacionalBuscado.setText("Internacional");

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel10.setText("Datos Modificables");

        jButtonEliminarArb.setBackground(new java.awt.Color(255, 102, 102));
        jButtonEliminarArb.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jButtonEliminarArb.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEliminarArb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Delete.png"))); // NOI18N
        jButtonEliminarArb.setText("Eliminar");
        jButtonEliminarArb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarArbActionPerformed(evt);
            }
        });

        jButtonGuardarArb.setBackground(new java.awt.Color(37, 222, 164));
        jButtonGuardarArb.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jButtonGuardarArb.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGuardarArb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Modify.png"))); // NOI18N
        jButtonGuardarArb.setText("Guardar Cambios");
        jButtonGuardarArb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarArbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CargaArbitro1Layout = new javax.swing.GroupLayout(CargaArbitro1);
        CargaArbitro1.setLayout(CargaArbitro1Layout);
        CargaArbitro1Layout.setHorizontalGroup(
            CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaArbitro1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaArbitro1Layout.createSequentialGroup()
                        .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(CargaArbitro1Layout.createSequentialGroup()
                                    .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel28)
                                        .addComponent(jTextFieldNombreCompletoArbitroEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(134, 134, 134))
                                .addComponent(jCheckBoxInternacionalBuscado, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(CargaArbitro1Layout.createSequentialGroup()
                                .addComponent(jTextFieldDNIArbBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscar))
                            .addComponent(jButtonEliminarArb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CargaArbitro1Layout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaArbitro1Layout.createSequentialGroup()
                                .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CargaArbitro1Layout.createSequentialGroup()
                                        .addGap(383, 383, 383)
                                        .addComponent(jLabel15)
                                        .addGap(44, 44, 44)
                                        .addComponent(jTextFieldTarjetasSacadas, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                    .addGroup(CargaArbitro1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonGuardarArb)))
                                .addGap(171, 171, 171))))
                    .addGroup(CargaArbitro1Layout.createSequentialGroup()
                        .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNacimientoEncontradoArb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNacionalidadEncontradaArb, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        CargaArbitro1Layout.setVerticalGroup(
            CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaArbitro1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaArbitro1Layout.createSequentialGroup()
                        .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel10))
                        .addGap(5, 5, 5)
                        .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDNIArbBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFieldNombreCompletoArbitroEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargaArbitro1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTarjetasSacadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldNacimientoEncontradoArb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNacionalidadEncontradaArb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxInternacionalBuscado)
                .addGap(53, 53, 53)
                .addGroup(CargaArbitro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminarArb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardarArb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBuscarArbitroLayout = new javax.swing.GroupLayout(jPanelBuscarArbitro);
        jPanelBuscarArbitro.setLayout(jPanelBuscarArbitroLayout);
        jPanelBuscarArbitroLayout.setHorizontalGroup(
            jPanelBuscarArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarArbitroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargaArbitro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBuscarArbitroLayout.setVerticalGroup(
            jPanelBuscarArbitroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarArbitroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargaArbitro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arbitro", jPanelBuscarArbitro);

        javax.swing.GroupLayout jPanelMostrarLayout = new javax.swing.GroupLayout(jPanelMostrar);
        jPanelMostrar.setLayout(jPanelMostrarLayout);
        jPanelMostrarLayout.setHorizontalGroup(
            jPanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelMostrarLayout.setVerticalGroup(
            jPanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        JTabbedMain.addTab("Modificar", jPanelMostrar);

        jPanelPeorJugador.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel35.setFont(new java.awt.Font("Segoe UI Historic", 0, 40)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Tarjeta roja.png"))); // NOI18N
        jLabel35.setText("Jugador Con Más Rojas");

        jTextFieldPeorJugador.setEditable(false);
        jTextFieldPeorJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 40)); // NOI18N
        jTextFieldPeorJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPeorJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPeorJugadorActionPerformed(evt);
            }
        });

        jTextFieldNacionalidaPJugador.setEditable(false);
        jTextFieldNacionalidaPJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jTextFieldPosicionPJugador.setEditable(false);
        jTextFieldPosicionPJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextFieldPosicionPJugador.setToolTipText("");

        jTextFieldGolesPJugador.setEditable(false);
        jTextFieldGolesPJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jTextFieldTAmarillasPJugador.setEditable(false);
        jTextFieldTAmarillasPJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jTextFieldClubPJugador.setEditable(false);
        jTextFieldClubPJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jTextFieldTRojasPJugador.setEditable(false);
        jTextFieldTRojasPJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel36.setText("Nacionalidad");

        jLabel37.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel37.setText("Club Actual");

        jLabel38.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel38.setText("Posicion");

        jLabel39.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel39.setText("Goles");

        jLabel40.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel40.setText("Tarjetas Amarillas");

        jLabel41.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel41.setText("Tarjetas Rojas");

        BuscarPeorJugador.setBackground(new java.awt.Color(150, 196, 252));
        BuscarPeorJugador.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        BuscarPeorJugador.setForeground(new java.awt.Color(32, 133, 206));
        BuscarPeorJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Update.png"))); // NOI18N
        BuscarPeorJugador.setText("Actualizar");
        BuscarPeorJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPeorJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPeorJugadorLayout = new javax.swing.GroupLayout(jPanelPeorJugador);
        jPanelPeorJugador.setLayout(jPanelPeorJugadorLayout);
        jPanelPeorJugadorLayout.setHorizontalGroup(
            jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPeorJugadorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BuscarPeorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
            .addGroup(jPanelPeorJugadorLayout.createSequentialGroup()
                .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPeorJugadorLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39)
                            .addGroup(jPanelPeorJugadorLayout.createSequentialGroup()
                                .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelPeorJugadorLayout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNacionalidaPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelPeorJugadorLayout.createSequentialGroup()
                                        .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel40))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldTAmarillasPJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTRojasPJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(102, 102, 102)
                                .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38))))
                        .addGap(67, 67, 67)
                        .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldPosicionPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldClubPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldGolesPJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPeorJugadorLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jTextFieldPeorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanelPeorJugadorLayout.setVerticalGroup(
            jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeorJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPeorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextFieldClubPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jTextFieldNacionalidaPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPosicionPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel40)
                    .addComponent(jTextFieldTAmarillasPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanelPeorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGolesPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jTextFieldTRojasPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(BuscarPeorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPaneMenus.addTab("Peor Jugador", jPanelPeorJugador);

        BoxListaInternacional.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BoxListaInternacional.setText("Internacional");

        jTableArbitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tarjetas", "Nacionalidad", "Nacimiento", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableArbitros);

        botonActualizarArbitros.setBackground(new java.awt.Color(150, 196, 252));
        botonActualizarArbitros.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        botonActualizarArbitros.setForeground(new java.awt.Color(32, 133, 206));
        botonActualizarArbitros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Update.png"))); // NOI18N
        botonActualizarArbitros.setText("Actualizar");
        botonActualizarArbitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarArbitrosActionPerformed(evt);
            }
        });

        jButtonTodosArbitros.setBackground(new java.awt.Color(145, 197, 64));
        jButtonTodosArbitros.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButtonTodosArbitros.setText("Todos");
        jButtonTodosArbitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTodosArbitrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelArbitrosLayout = new javax.swing.GroupLayout(jPanelArbitros);
        jPanelArbitros.setLayout(jPanelArbitrosLayout);
        jPanelArbitrosLayout.setHorizontalGroup(
            jPanelArbitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArbitrosLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(BoxListaInternacional)
                .addGap(18, 18, 18)
                .addComponent(botonActualizarArbitros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonTodosArbitros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        jPanelArbitrosLayout.setVerticalGroup(
            jPanelArbitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArbitrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelArbitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTodosArbitros, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelArbitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BoxListaInternacional)
                        .addComponent(botonActualizarArbitros)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
        );

        jTabbedPaneMenus.addTab("Lista de Arbitros", jPanelArbitros);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel50.setText("Jugadores con mas de ");

        jSpinnerGoles.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jSpinnerGoles.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerGoles.setToolTipText("");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel51.setText("Goles");

        jTableJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Nacionalidad", "Club", "Posicion", "Goles", "TR", "TA", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableJugadores);

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel52.setText("TR=Tarjetas rojas");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel53.setText("TA= Tarjetas amarillas");

        BotonListaGoleadores.setBackground(new java.awt.Color(150, 196, 252));
        BotonListaGoleadores.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BotonListaGoleadores.setForeground(new java.awt.Color(32, 133, 206));
        BotonListaGoleadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Update.png"))); // NOI18N
        BotonListaGoleadores.setText("Actualizar");
        BotonListaGoleadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListaGoleadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(BotonListaGoleadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addGap(95, 95, 95))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(BotonListaGoleadores))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
        );

        jTabbedPaneMenus.addTab("Lista goleadores", jPanel1);

        jLabel45.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel45.setText("Por equipo");

        BoxEquipoContador.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BoxEquipoContador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "River Plate", "Boca Juniors", "Colo Colo", "Barcelona", "Real Madrid", "Manchester United", "Manchester City", "Chacarita", "Inter" }));

        TFCantJugPosc.setEditable(false);
        TFCantJugPosc.setFont(new java.awt.Font("Segoe UI Historic", 0, 60)); // NOI18N
        TFCantJugPosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCantJugPoscActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel46.setText("Jugador/es");

        jLabel47.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel47.setText("Por Posicion");

        BoxPosicionCont.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BoxPosicionCont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arquero", "Ala izquierda", "Ala derecha", "Pivot", "Cierre" }));

        TFCantJugEqui.setEditable(false);
        TFCantJugEqui.setFont(new java.awt.Font("Segoe UI Historic", 0, 60)); // NOI18N
        TFCantJugEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCantJugEquiActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel48.setText("Jugador/es");

        jLabel49.setFont(new java.awt.Font("Segoe UI Historic", 0, 50)); // NOI18N
        jLabel49.setText("Contador de jugadores");

        BotonBuscarporEquipo.setBackground(new java.awt.Color(150, 196, 252));
        BotonBuscarporEquipo.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        BotonBuscarporEquipo.setForeground(new java.awt.Color(32, 133, 206));
        BotonBuscarporEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Update.png"))); // NOI18N
        BotonBuscarporEquipo.setText("Actualizar");
        BotonBuscarporEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarporEquipoActionPerformed(evt);
            }
        });

        BotonBuscarporPosicion.setBackground(new java.awt.Color(150, 196, 252));
        BotonBuscarporPosicion.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        BotonBuscarporPosicion.setForeground(new java.awt.Color(32, 133, 206));
        BotonBuscarporPosicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Update.png"))); // NOI18N
        BotonBuscarporPosicion.setText("Actualizar");
        BotonBuscarporPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarporPosicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContadorLayout = new javax.swing.GroupLayout(jPanelContador);
        jPanelContador.setLayout(jPanelContadorLayout);
        jPanelContadorLayout.setHorizontalGroup(
            jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContadorLayout.createSequentialGroup()
                .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContadorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContadorLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContadorLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelContadorLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(TFCantJugEqui, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxEquipoContador, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonBuscarporEquipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                                .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxPosicionCont, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelContadorLayout.createSequentialGroup()
                                        .addComponent(BotonBuscarporPosicion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18)
                .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addGroup(jPanelContadorLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(TFCantJugPosc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(370, 370, 370))
            .addGroup(jPanelContadorLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(359, 359, 359))
        );
        jPanelContadorLayout.setVerticalGroup(
            jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContadorLayout.createSequentialGroup()
                .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContadorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel49)
                        .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContadorLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BoxEquipoContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BoxPosicionCont, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(jPanelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BotonBuscarporEquipo)
                                    .addComponent(BotonBuscarporPosicion))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel46))
                            .addGroup(jPanelContadorLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(TFCantJugEqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelContadorLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TFCantJugPosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel48)))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPaneMenus.addTab("Contador", jPanelContador);

        javax.swing.GroupLayout jPanelMenusLayout = new javax.swing.GroupLayout(jPanelMenus);
        jPanelMenus.setLayout(jPanelMenusLayout);
        jPanelMenusLayout.setHorizontalGroup(
            jPanelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenus)
        );
        jPanelMenusLayout.setVerticalGroup(
            jPanelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenus)
        );

        JTabbedMain.addTab("Menú", jPanelMenus);

        JPanelPrincipal.add(JTabbedMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1280, 560));

        jPanelBarraSuperior.setBackground(new java.awt.Color(218, 218, 218));
        jPanelBarraSuperior.setForeground(java.awt.Color.pink);

        jButton1.setBackground(new java.awt.Color(255, 65, 65));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Safe&Close.png"))); // NOI18N
        jButton1.setText("Guardar y Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarraSuperiorLayout = new javax.swing.GroupLayout(jPanelBarraSuperior);
        jPanelBarraSuperior.setLayout(jPanelBarraSuperiorLayout);
        jPanelBarraSuperiorLayout.setHorizontalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 1136, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanelBarraSuperiorLayout.setVerticalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        JPanelPrincipal.add(jPanelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 70));

        getContentPane().add(JPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreJugadorActionPerformed
    private void apellidoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoJugadorActionPerformed
    private void comboBoxNacionalidadJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNacionalidadJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNacionalidadJugadorActionPerformed
    private void NombreArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreArbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreArbitroActionPerformed
    private void ApellidoArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoArbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoArbitroActionPerformed
    private void ComboboxNacionalidadArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxNacionalidadArbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboboxNacionalidadArbitroActionPerformed
    private void CheckInternacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInternacionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckInternacionalActionPerformed
    private void jTextFieldNombreCompletoArbitroEncontradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCompletoArbitroEncontradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreCompletoArbitroEncontradoActionPerformed
    private void jTextFieldNombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreJugadorActionPerformed
    private void jTextFieldDNIArbBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIArbBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIArbBuscadoActionPerformed
    private void jTextFieldNacimientoEncontradoArbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNacimientoEncontradoArbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNacimientoEncontradoArbActionPerformed
    private void jTextFieldNacionalidadEncontradaArbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNacionalidadEncontradaArbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNacionalidadEncontradaArbActionPerformed
    private void jTextFieldDNIjugBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIjugBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIjugBuscadoActionPerformed
    private void BotonCargaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargaJugadorActionPerformed
        // TODO add your handling code here:
        Jugador jugador= new Jugador();
        
        controller.inicializarJugador(jugador);
        
        //control Dia,mes y año
        int dia,mes,anio;
        //obtengo valores
        dia = (Integer)spinnerDia.getValue();
        
        mes = (Integer)spinnerMes.getValue();
        
        anio = (Integer)spinnerAnio.getValue();
        
        boolean fechaValida = false;//fecha si es verdadero es valida si es negativa es invalida mostrar carter
        if(anio >= 1925 && anio < 2025){
             if(dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
            fechaValida = true;//meses con 31
        }
        if(dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
            fechaValida = true;//meses con 30
            
        }
        if(dia <= 28){
            fechaValida = true;//todos los meses tiene al menos 28 dias
        }
            
        }
        //si es valida asigno al jugador
        if(fechaValida){
            
            controller.setDia(1,(Integer)(spinnerDia.getValue()));
            controller.setMes(1,(Integer)spinnerMes.getValue());
            controller.setAnio(1,(Integer)spinnerAnio.getValue());
            
            controller.setNacionalidad(1,(String)comboBoxNacionalidadJugador.getSelectedItem());
            controller.setPosicion((String)comboBoxPosicion.getSelectedItem());
            controller.setGoles((Integer)spinnerGoles.getValue());
            controller.setTarjetasAmarillas((Integer)spinnerTarjetasAmarillas.getValue());
            controller.setTarjetasRojas((Integer)spinnerTarjetasRojas.getValue());
            
            
            controller.setClub((String)comboBoxClub.getSelectedItem());
        
            try{
            String nombre=  NombreJugador.getText();
            String apellido= apellidoJugador.getText();
           
            if( nombre.trim().isEmpty()  ){
               throw new NombreException();
                
                
            }
            if(apellido.trim().isEmpty()){
            throw new NombreException();
            }
            
            
             for(int i = 0; i<nombre.length(); i++){
            char letra = nombre.charAt(i);
            
            if( ((letra >='A' && letra <='Z') || (letra>='a' && letra <='z') || letra == ' ' ) ){
                
                
            }else {
                throw new NombreException();
            }
             
         }
             
             for(int i = 0; i<apellido.length(); i++){
            char letra = apellido.charAt(i);
            
            if( ((letra >='A' && letra <='Z') || (letra>='a' && letra <='z') || letra == ' ') ){
                
                
            }else {
                throw new NombreException();
            }
             
         }
            controller.setNombre(1,nombre);
           
            controller.setApellido(1,apellido);
        
        
            
            
            
            
        long dni = Long.parseLong(dniJugador.getText());
        if(dni <100000000 && dni > 9999999){
        
        boolean condicion = controller.buscarDni(dni);
        
        if(!condicion){
        controller.setDniJ(dni);
        
        controller.Ingreso(1,controller.getJugador());
        
        NombreJugador.setText("");
        apellidoJugador.setText("");
        dniJugador.setText("");
        spinnerDia.setValue(1);
        spinnerMes.setValue(1);
        spinnerAnio.setValue(2000);
        spinnerGoles.setValue(0);
        spinnerTarjetasRojas.setValue(0);
        spinnerTarjetasAmarillas.setValue(0);
        }
        else {
            
        throw new NumberFormatException();
          
        }
        
        }
        else {
          
            throw new NumberFormatException();
            
        }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Formato DNI invalido","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(NombreException e){
            
        }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Ingrese la fecha correctamente","Error",JOptionPane.ERROR_MESSAGE);
            //return; //ver si dejo el return 
        }
        
        
        
       
        
       
       
        
        
    }//GEN-LAST:event_BotonCargaJugadorActionPerformed
    private void BotonCargaArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargaArbitroActionPerformed
        // TODO add your handling code here:
        
        Arbitro arbitro = new Arbitro();
         controller.inicializarArbitro(arbitro);
        //control para dia,mes y año 
        int dia,mes,anio;
        //obtengo valores
        dia = (Integer)SpinnerDiaArbitro.getValue();
        
        mes = (Integer)SpinnerMesArbitro.getValue();
        
        anio = (Integer)SpinneranioArbitro.getValue();
        
        boolean fechaValida = false;//fecha si es verdadero es valida si es negativa es invalida mostrar carter
        
        
            if(dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
            fechaValida = true;//meses con 31
            }
            if(dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
            fechaValida = true;//meses con 30
            }
            if(dia <= 28){
            fechaValida = true;//todos los meses tiene al menos 28 dias
            }
        
       
        
        //si es valida asigno al jugador
        if(fechaValida){
            controller.setDia(0,(Integer)(SpinnerDiaArbitro.getValue()));
            controller.setMes(0,(Integer)SpinnerMesArbitro.getValue());
            controller.setAnio(0,(Integer)SpinneranioArbitro.getValue());
            controller.setNacionalidad(0,(String)ComboboxNacionalidadArbitro.getSelectedItem());
            controller.setTarjetasSacadas((Integer)SpinnerTarjetasArbitro.getValue());
            controller.setInternacional(CheckInternacional.isSelected());
            
            
            
            
            
            
    try{  
                 
         String nombre= NombreArbitro.getText();        
         String apellido = ApellidoArbitro.getText();   
         
         if(nombre.trim().isEmpty()){
          throw new NombreException();
             
         }
         if(apellido.trim().isEmpty()){
             throw new NombreException();
         }
         
         for(int i = 0; i<nombre.length(); i++){
            char letra = nombre.charAt(i);
           
               if( ((letra >='A' && letra <='Z') || (letra>='a' && letra <='z') || letra == ' ' ) ){
                
                
            }else {
                throw new NombreException();
            }
         }
         
          for(int i = 0; i<apellido.length(); i++){
            char letra = apellido.charAt(i);
           
               if( ((letra >='A' && letra <='Z') || (letra>='a' && letra <='z') || letra == ' ' ) ){
                
                
            }else {
                throw new NombreException();
            }
         }
         controller.setNombre(0,nombre);
         controller.setApellido(0,apellido);
                 
             
        long dni= Long.parseLong(DNIArbitro.getText());
            
                
        if(dni <100000000 && dni > 9999999){
        
        boolean condicion = controller.buscarDni(dni);
        
        if(!condicion){
        controller.setDniA(dni);
        controller.Ingreso(0,controller.getArbitro());
        
        NombreArbitro.setText("");
        ApellidoArbitro.setText("");
        DNIArbitro.setText("");
        SpinnerDiaArbitro.setValue(1);
        SpinnerMesArbitro.setValue(1);
        SpinneranioArbitro.setValue(2000);
        SpinnerTarjetasArbitro.setValue(0);
        
        }
        else {
            
        throw new NumberFormatException();
          
        }
        
        }
        else {
          
            throw new NumberFormatException();
            
        }           
        
        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null,"Formato DNI invalido","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        catch(NombreException e){
        
        }
            
            
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Ingrese la fecha correctamente","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
        
    }//GEN-LAST:event_BotonCargaArbitroActionPerformed
    private void comboBoxClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxClubActionPerformed
    private void jButtonEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarJugadorActionPerformed
       long dni;
                  int resultado = JOptionPane.showConfirmDialog(
                null,
                "¿Deseás continuar?",
                "Confirmar acción",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            // Verificamos qué opción eligió el usuario
            if (resultado == JOptionPane.OK_OPTION) {
       try{
        dni=Long.parseLong( jTextFieldDNIjugBuscado.getText());
        controller.Eliminar(1,dni);
        jTextFieldNombreJugador.setText("");
        jTextFieldFechaNacEncontradoJugador.setText("");
        jTextFieldNacionalidadEncontradaJugador.setText("");
        jTextFieldClubEncontrado.setText("");
        jTextFieldRojasEncontrado.setText("");
        jTextFieldAmarillasEncontrado.setText("");
        jTextFieldGolesEncontrado.setText("");
        jTextFieldDNIjugBuscado.setText("");
        }catch(EliminarException e){
            JOptionPane.showMessageDialog(null,"Error: No se puede borrar el jugador","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error: Casillero de Dni vacio","Error",JOptionPane.ERROR_MESSAGE);
        }            } else if (resultado == JOptionPane.CANCEL_OPTION || resultado == JOptionPane.CLOSED_OPTION) {
                
            }

    }//GEN-LAST:event_jButtonEliminarJugadorActionPerformed
    private void jTextFieldAmarillasEncontradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmarillasEncontradoActionPerformed
    }//GEN-LAST:event_jTextFieldAmarillasEncontradoActionPerformed
    private void jButtonBuscarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarJugadorActionPerformed
   
        try{
        long DNI = Long.parseLong(jTextFieldDNIjugBuscado.getText());
        controller.inicializarJugador((Jugador) controller.buscarDNI(1, DNI));
        
        
        
        jTextFieldNombreJugador.setText(controller.getNombreJ()+ " "+controller.getApellidoJ());
        
        jTextFieldFechaNacEncontradoJugador.setText(controller.getDiaJ() +"/"+ controller.getMesJ()+"/"+ controller.getAnioJ());
        
        jTextFieldNacionalidadEncontradaJugador.setText(controller.getNacionalidadJ());
        
        jTextFieldClubEncontrado.setText(controller.getClub());
        
        jTextFieldRojasEncontrado.setText(Integer.toString(controller.getTarjetaRoja()));
        
        jComboBox1.setSelectedItem(controller.getPosicion());
        
        jTextFieldAmarillasEncontrado.setText(Integer.toString(controller.getTarjetaAmarilla()));
        
        jTextFieldGolesEncontrado.setText(Integer.toString(controller.getGoles()));
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"No se encontro el jugador","Error",JOptionPane.ERROR_MESSAGE);
        }
         catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null,"Formato DNI invalido","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBuscarJugadorActionPerformed
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try{
        long DNI = Long.parseLong(jTextFieldDNIArbBuscado.getText());
        controller.inicializarArbitro((Arbitro)controller.buscarDNI(0, DNI));
        
        
        jTextFieldNombreCompletoArbitroEncontrado.setText(controller.getNombreA()+" "+ controller.getApellidoA());
        jTextFieldNacionalidadEncontradaArb.setText(controller.getNacionalidadA());
        jTextFieldNacimientoEncontradoArb.setText(controller.getDiaA()+ "/"+ controller.getMesA()+"/" + controller.getAnioA());
        jTextFieldTarjetasSacadas.setText(Integer.toString(controller.getTarjetasSacadas()));
        jCheckBoxInternacionalBuscado.setSelected(controller.getInternacional());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se encontro el arbitro","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Formato DNI invalido","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    private void jButtonEliminarArbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarArbActionPerformed
                     int resultado = JOptionPane.showConfirmDialog(null,"¿Deseás continuar?",
                "Confirmar acción",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            // Verificamos qué opción eligió el usuario
            if (resultado == JOptionPane.OK_OPTION) {
                       
        try{
        long DNI= Long.parseLong(jTextFieldDNIArbBuscado.getText());
        controller.Eliminar(0, DNI);
        jTextFieldNombreCompletoArbitroEncontrado.setText("");
        jTextFieldNacionalidadEncontradaArb.setText("");
        jTextFieldNacimientoEncontradoArb.setText("");
        jTextFieldTarjetasSacadas.setText("");
         }
        catch(EliminarException e ){
            JOptionPane.showMessageDialog(null,"Error: No se puede borrar el arbitro","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,"Error: Casillero de Dni vacio","Error",JOptionPane.ERROR_MESSAGE);
        }
            } else if (resultado == JOptionPane.CANCEL_OPTION || resultado == JOptionPane.CLOSED_OPTION) {
                
            }

    }//GEN-LAST:event_jButtonEliminarArbActionPerformed
    private void jButtonGuardarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarJugadorActionPerformed
        try {
        // Validar goles
         long dni = Long.parseLong(jTextFieldDNIjugBuscado.getText());
        String posicion= (String)jComboBox1.getSelectedItem();
        int goles = Integer.parseInt(jTextFieldGolesEncontrado.getText());
        if(goles < 0){
            throw new NumberFormatException();
        }
        int tarjetas = Integer.parseInt(jTextFieldAmarillasEncontrado.getText());
        if(tarjetas <0){
            throw new NumberFormatException();
        }
        controller.Modificar(1, dni, posicion, goles, tarjetas);

        // Limpiar campos de texto
        jTextFieldNombreJugador.setText("");
        jTextFieldFechaNacEncontradoJugador.setText("");
        jTextFieldNacionalidadEncontradaJugador.setText("");
        jTextFieldClubEncontrado.setText("");
        jTextFieldRojasEncontrado.setText("");
        jTextFieldAmarillasEncontrado.setText("");
        jTextFieldGolesEncontrado.setText("");
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: No se puede realizar el cambio", "Error al Guardar", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonGuardarJugadorActionPerformed
    private void jButtonGuardarArbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarArbActionPerformed
        try{
        long dni = Long.parseLong(jTextFieldDNIArbBuscado.getText());
        int tarjetas = Integer.parseInt( jTextFieldTarjetasSacadas.getText());
        if(tarjetas <0 )throw new NumberFormatException();
        boolean internacional = jCheckBoxInternacionalBuscado.isSelected();
        //Carga la informacion del arbitro
        controller.modificar(0,tarjetas, internacional,dni);
        jTextFieldNombreCompletoArbitroEncontrado.setText("");
        jTextFieldNacionalidadEncontradaArb.setText("");
        jTextFieldNacimientoEncontradoArb.setText("");
        jTextFieldTarjetasSacadas.setText("");
        //Guarda la informacion del arbitro
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: No se puede guardar arbitro","Error al Guardar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarArbActionPerformed
    private void TFCantJugPoscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCantJugPoscActionPerformed
    }//GEN-LAST:event_TFCantJugPoscActionPerformed
    private void TFCantJugEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCantJugEquiActionPerformed
    }//GEN-LAST:event_TFCantJugEquiActionPerformed
    private void BotonBuscarporEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarporEquipoActionPerformed
        String nombre = (String) BoxEquipoContador.getSelectedItem();
        int cantidad =controller.cantidadPorEquipo(nombre);
        TFCantJugEqui.setText(Integer.toString(cantidad));
    }//GEN-LAST:event_BotonBuscarporEquipoActionPerformed
    private void BotonBuscarporPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarporPosicionActionPerformed
        String posicion = (String)BoxPosicionCont.getSelectedItem();
        int cantidad =controller.cantidadPorPosicion(posicion);
        TFCantJugPosc.setText(Integer.toString(cantidad));
    }//GEN-LAST:event_BotonBuscarporPosicionActionPerformed
    private void BuscarPeorJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPeorJugadorActionPerformed
        Jugador jugador = new Jugador();
        controller.inicializarJugador(controller.BuscarPeorJugador());
        
        
        jTextFieldPeorJugador.setText(controller.getNombreJ() + " " + controller.getApellidoJ());
        jTextFieldNacionalidaPJugador.setText(controller.getNacionalidadJ());
        jTextFieldClubPJugador.setText(controller.getClub());
        jTextFieldPosicionPJugador.setText(controller.getPosicion());
        jTextFieldGolesPJugador.setText(Integer.toString(controller.getGoles()));
        jTextFieldTAmarillasPJugador.setText(Integer.toString(controller.getTarjetaAmarilla()));
        jTextFieldTRojasPJugador.setText(Integer.toString(controller.getTarjetaRoja()));
        //Busca el peor jugador y lo muestra en los casilleros correspondientes   
    }//GEN-LAST:event_BuscarPeorJugadorActionPerformed
    private void BotonListaGoleadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListaGoleadoresActionPerformed
        tablaJugadores.setRowCount(0);
        int goles = (Integer)jSpinnerGoles.getValue();
        List<Jugador> jugador = controller.listaDeJugadores(goles);
        
        for(Jugador persona : jugador){
            controller.inicializarJugador(persona);
            arreglo[0]= controller.getNombreJ() +" "+ controller.getApellidoJ();
            arreglo[1]= controller.getNacionalidadJ();
            arreglo[2]= controller.getClub();
            arreglo[3]= controller.getPosicion();
            arreglo[4]= Integer.toString(controller.getGoles());
            arreglo[5]= Integer.toString(controller.getTarjetaRoja());
            arreglo[6]= Integer.toString(controller.getTarjetaAmarilla());
            arreglo[7]= Long.toString(controller.getDniJ());
         tablaJugadores.addRow(arreglo);
        }
    }//GEN-LAST:event_BotonListaGoleadoresActionPerformed
    private void botonActualizarArbitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarArbitrosActionPerformed
        boolean internacional = BoxListaInternacional.isSelected();
        tablaArbitros.setRowCount(0);
        List<Arbitro> arbitros = controller.listaDeArbitros(internacional);
        for(Arbitro persona : arbitros){
            controller.inicializarArbitro(persona);
            arreglo2[0]= controller.getNombreA()+" "+ controller.getApellidoA();
            arreglo2[1]= Integer.toString(controller.getTarjetasSacadas());
            arreglo2[2]= controller.getNacionalidadA();
            arreglo2[3]= Integer.toString(controller.getDiaA())+"/"+Integer.toString(controller.getMesA())+"/"+Integer.toString(controller.getAnioA());
            arreglo2[4]= Long.toString(controller.getDniA());
            tablaArbitros.addRow(arreglo2);
        }
    }//GEN-LAST:event_botonActualizarArbitrosActionPerformed
    private void jTextFieldFechaNacEncontradoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaNacEncontradoJugadorActionPerformed
    }//GEN-LAST:event_jTextFieldFechaNacEncontradoJugadorActionPerformed
    private void jButtonMasRojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasRojasActionPerformed
        try{
        long dni = Long.parseLong(jTextFieldDNIjugBuscado.getText());
        int cantidad = controller.Modificar(dni);
        jTextFieldRojasEncontrado.setText(Integer.toString(cantidad));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error: Casillero Dni vacio","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Error: No se encontro jugador","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMasRojasActionPerformed
    private void jButtonTodosArbitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTodosArbitrosActionPerformed
        List<Arbitro>lista = controller.listaDeArbitros();
        tablaArbitros.setRowCount(0);
        for(Arbitro persona: lista){
            controller.inicializarArbitro(persona);
            arreglo2[0]= controller.getNombreA()+" "+ controller.getApellidoA();
            arreglo2[1]= Integer.toString(controller.getTarjetasSacadas());
            arreglo2[2]= controller.getNacionalidadA();
            arreglo2[3]= Integer.toString(controller.getDiaA())+"/"+Integer.toString(controller.getMesA())+"/"+Integer.toString(controller.getAnioA());
            arreglo2[4]= Long.toString(controller.getDniA());
            tablaArbitros.addRow(arreglo2);        
            //Muestra en la pantalla de arbitros todos ellos
        } 
    }//GEN-LAST:event_jButtonTodosArbitrosActionPerformed
    private void dniJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniJugadorActionPerformed
    }//GEN-LAST:event_dniJugadorActionPerformed
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    }//GEN-LAST:event_jButton1MouseClicked
    private void jTextFieldNacionalidadEncontradaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNacionalidadEncontradaJugadorActionPerformed
    }//GEN-LAST:event_jTextFieldNacionalidadEncontradaJugadorActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    int resultado = JOptionPane.showConfirmDialog(
                null,
                "¿Deseás Salir?",
                "Confirmar acción",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            // Verificamos qué opción eligió el usuario
            if (resultado == JOptionPane.OK_OPTION) {
              controller.Actualizar();//Actualiza  
               System.exit(0);           
            } else if (resultado == JOptionPane.CANCEL_OPTION || resultado == JOptionPane.CLOSED_OPTION) {
            }       
    
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jTextFieldPeorJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPeorJugadorActionPerformed
 
    }//GEN-LAST:event_jTextFieldPeorJugadorActionPerformed
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
   
        JOptionPane.showMessageDialog(null, "¿Qué miras bobo?", "Easter Egg", HEIGHT);
              //Cartel secreto de messi
    }//GEN-LAST:event_jButton2MouseClicked

    private void JTabbedMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabbedMainMouseClicked
        BotonListaGoleadores.doClick();
        jButtonTodosArbitros.doClick();
        
    }//GEN-LAST:event_JTabbedMainMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "¿Qué miras bobo?", "Easter Egg", HEIGHT);
              //Cartel secreto de messi
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoArbitro;
    private javax.swing.JButton BotonBuscarporEquipo;
    private javax.swing.JButton BotonBuscarporPosicion;
    private javax.swing.JButton BotonCargaArbitro;
    private javax.swing.JButton BotonCargaJugador;
    private javax.swing.JButton BotonListaGoleadores;
    private javax.swing.JComboBox<String> BoxEquipoContador;
    private javax.swing.JCheckBox BoxListaInternacional;
    private javax.swing.JComboBox<String> BoxPosicionCont;
    private javax.swing.JButton BuscarPeorJugador;
    private javax.swing.JPanel CargaArbitro;
    private javax.swing.JPanel CargaArbitro1;
    private javax.swing.JPanel CargaJugador;
    private javax.swing.JPanel CargaJugador1;
    private javax.swing.JCheckBox CheckInternacional;
    private javax.swing.JComboBox<String> ComboboxNacionalidadArbitro;
    private javax.swing.JTextField DNIArbitro;
    private javax.swing.JPanel JPanelPrincipal;
    private javax.swing.JTabbedPane JTabbedMain;
    private javax.swing.JTextField NombreArbitro;
    private javax.swing.JTextField NombreJugador;
    private javax.swing.JSpinner SpinnerDiaArbitro;
    private javax.swing.JSpinner SpinnerMesArbitro;
    private javax.swing.JSpinner SpinnerTarjetasArbitro;
    private javax.swing.JSpinner SpinneranioArbitro;
    private javax.swing.JTextField TFCantJugEqui;
    private javax.swing.JTextField TFCantJugPosc;
    private javax.swing.JTextField apellidoJugador;
    private javax.swing.JButton botonActualizarArbitros;
    private javax.swing.JComboBox<String> comboBoxClub;
    private javax.swing.JComboBox<String> comboBoxNacionalidadJugador;
    private javax.swing.JComboBox<String> comboBoxPosicion;
    private javax.swing.JTextField dniJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarJugador;
    private javax.swing.JButton jButtonEliminarArb;
    private javax.swing.JButton jButtonEliminarJugador;
    private javax.swing.JButton jButtonGuardarArb;
    private javax.swing.JButton jButtonGuardarJugador;
    private javax.swing.JButton jButtonMasRojas;
    private javax.swing.JButton jButtonTodosArbitros;
    private javax.swing.JCheckBox jCheckBoxInternacionalBuscado;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelArbitro;
    private javax.swing.JPanel jPanelArbitros;
    private javax.swing.JPanel jPanelBarraSuperior;
    private javax.swing.JPanel jPanelBuscarArbitro;
    private javax.swing.JPanel jPanelBuscarJugador;
    private javax.swing.JPanel jPanelCargar;
    private javax.swing.JPanel jPanelContador;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelJugador;
    private javax.swing.JPanel jPanelMenus;
    private javax.swing.JPanel jPanelMostrar;
    private javax.swing.JPanel jPanelPeorJugador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerGoles;
    private javax.swing.JTabbedPane jTabbedCarga;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneMenus;
    private javax.swing.JTable jTableArbitros;
    private javax.swing.JTable jTableJugadores;
    private javax.swing.JTextField jTextFieldAmarillasEncontrado;
    private javax.swing.JTextField jTextFieldClubEncontrado;
    private javax.swing.JTextField jTextFieldClubPJugador;
    private javax.swing.JTextField jTextFieldDNIArbBuscado;
    private javax.swing.JTextField jTextFieldDNIjugBuscado;
    private javax.swing.JTextField jTextFieldFechaNacEncontradoJugador;
    private javax.swing.JTextField jTextFieldGolesEncontrado;
    private javax.swing.JTextField jTextFieldGolesPJugador;
    private javax.swing.JTextField jTextFieldNacimientoEncontradoArb;
    private javax.swing.JTextField jTextFieldNacionalidaPJugador;
    private javax.swing.JTextField jTextFieldNacionalidadEncontradaArb;
    private javax.swing.JTextField jTextFieldNacionalidadEncontradaJugador;
    private javax.swing.JTextField jTextFieldNombreCompletoArbitroEncontrado;
    private javax.swing.JTextField jTextFieldNombreJugador;
    private javax.swing.JTextField jTextFieldPeorJugador;
    private javax.swing.JTextField jTextFieldPosicionPJugador;
    private javax.swing.JTextField jTextFieldRojasEncontrado;
    private javax.swing.JTextField jTextFieldTAmarillasPJugador;
    private javax.swing.JTextField jTextFieldTRojasPJugador;
    private javax.swing.JTextField jTextFieldTarjetasSacadas;
    private javax.swing.JSpinner spinnerAnio;
    private javax.swing.JSpinner spinnerDia;
    private javax.swing.JSpinner spinnerGoles;
    private javax.swing.JSpinner spinnerMes;
    private javax.swing.JSpinner spinnerTarjetasAmarillas;
    private javax.swing.JSpinner spinnerTarjetasRojas;
    // End of variables declaration//GEN-END:variables
}
