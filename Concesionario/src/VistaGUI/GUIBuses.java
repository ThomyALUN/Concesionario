/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaGUI;

import Controlador.ControladorBusesYBusetas;
import Modelo.BusesYBusetas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thomas Agudelo
 */
public class GUIBuses extends javax.swing.JFrame {

    private ControladorBusesYBusetas contBusesYBusetas;
    private Object datos[]=new Object[13];
    private DefaultTableModel tabla;
    private String modo;
    /**
     * Creates new form GUIBuses
     */
    public GUIBuses() {
        initComponents();
        contBusesYBusetas = new ControladorBusesYBusetas();
        tabla=(DefaultTableModel)jTablaBuses.getModel();
        jLinfoAdicional.setText("");
        
        //Llenar tabla con datos por defecto        
        llenarTabla();
        
        //Poner las opciones de los ComboBox
        configurarComboBoxes();
        
        //Ocultar/Inhabilitar botones
        ocultarOpciones();
        
    }
    
    public void llenarTabla(){
        for(BusesYBusetas bus:contBusesYBusetas.arregloBusesYBusetas){
            datos[0]=bus.getId();
            datos[1]=bus.getColor();
            datos[2]=bus.getMarca();
            datos[3]=bus.getNumeroChasis();
            datos[4]=bus.getNumeroMotor();
            datos[5]=bus.getNumeroPuertas();
            datos[6]=bus.getTamañoLLanta();            
            datos[7]=bus.getTipoTransmision();
            datos[8]=bus.getNumeroCambios();
            datos[9]=bus.getNumeroCilindros();
            datos[10]=bus.getGalonesKilometro();
            datos[11]=bus.getTipoGasolina();
            datos[12]=bus.getTipoBuseta();
            tabla.addRow(datos);
        }
    }
    
    public void configurarComboBoxes(){
        DefaultComboBoxModel combo=(DefaultComboBoxModel) jComboBox_TipoTransmision.getModel();
        combo.removeAllElements();
        String valores[]={"- - -","Automática","Mecánica"};
        for(String item:valores){
            combo.addElement(item);
        }
        
        combo=(DefaultComboBoxModel) jComboBox_TipoBuseta.getModel();
        combo.removeAllElements();
        valores[1]="Gasolina";
        valores[2]="Eléctrica";
        for(String item:valores){
            combo.addElement(item);
        }
    }
    
    public void limpiarCampos(){
        jTplaca.setText("");
        jTcolor.setText("");
        jTmarca.setText("");
        jTnumChasis.setText("");
        jTnumMotor.setText("");
        jTnumPuertas.setText("");
        jTtamLlanta.setText("");
        jTnumChasis.setText("");
        jTnumMotor.setText("");
        jTnumPuertas.setText("");
        jTtamLlanta.setText("");
        jTnumCambios.setText("");
        jTnumCilindros.setText("");
        jTgalonesKilometro.setText("");
        jTtipoGasoliona.setText("");
        configurarComboBoxes();
    }
    
    public void deshabilitarCampos(){
        limpiarCampos();
        jTcolor.setEnabled(false);
        jTmarca.setEnabled(false);
        jTnumChasis.setEnabled(false);
        jTnumMotor.setEnabled(false);
        jTnumPuertas.setEnabled(false);
        jTtamLlanta.setEnabled(false);
        jTnumChasis.setEnabled(false);
        jTnumMotor.setEnabled(false);
        jTnumPuertas.setEnabled(false);
        jTtamLlanta.setEnabled(false);
        jTnumCambios.setEnabled(false);
        jTnumCilindros.setEnabled(false);
        jTgalonesKilometro.setEnabled(false);
        jTtipoGasoliona.setEnabled(false);
        jComboBox_TipoTransmision.setEnabled(false);
        jComboBox_TipoBuseta.setEnabled(false);
    }
    
    public void habilitarCampos(){
        limpiarCampos();
        jTplaca.setEnabled(true);
        jTcolor.setEnabled(true);
        jTmarca.setEnabled(true);
        jTnumChasis.setEnabled(true);
        jTnumMotor.setEnabled(true);
        jTnumPuertas.setEnabled(true);
        jTtamLlanta.setEnabled(true);
        jTnumChasis.setEnabled(true);
        jTnumMotor.setEnabled(true);
        jTnumPuertas.setEnabled(true);
        jTtamLlanta.setEnabled(true);
        jTnumCambios.setEnabled(true);
        jTnumCilindros.setEnabled(true);
        jTgalonesKilometro.setEnabled(true);
        jTtipoGasoliona.setEnabled(true);
        jComboBox_TipoTransmision.setEnabled(true);
        jComboBox_TipoBuseta.setEnabled(true);
    }
    
    public void deshabilitarBotonesPrincipales(){
        jBinsertar.setEnabled(false);
        jBconsultarUno.setEnabled(false);
        jBconsultarTodos.setEnabled(false);
        jBmodificar.setEnabled(false);
        jBborrar.setEnabled(false);
        jBordenarPlaca.setEnabled(false);
        jBordenarMotor.setEnabled(false);
        jBordenarMarca.setEnabled(false);
    }
    
    public void habilitarBotonesPrincipales(){
        jBinsertar.setEnabled(true);
        jBconsultarUno.setEnabled(true);
        jBconsultarTodos.setEnabled(true);
        jBmodificar.setEnabled(true);
        jBborrar.setEnabled(true);
        jBordenarPlaca.setEnabled(true);
        jBordenarMotor.setEnabled(true);
        jBordenarMarca.setEnabled(true);
    }
    
    private void ocultarOpciones(){
        jLtitulo2.setVisible(false);
        jLinfoAdicional.setVisible(false);
        jBcontinuar.setVisible(false);
        jBvolver.setVisible(false);
    }
    
    private void mostrarOpciones(){
        jLtitulo2.setVisible(true);
        jLinfoAdicional.setVisible(true);
        jBcontinuar.setVisible(true);
        jBvolver.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaBuses = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jBinsertar = new javax.swing.JButton();
        jBconsultarUno = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jBordenarPlaca = new javax.swing.JButton();
        jBconsultarTodos = new javax.swing.JButton();
        jBordenarMotor = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jTplaca = new javax.swing.JTextField();
        jTcolor = new javax.swing.JTextField();
        jTmarca = new javax.swing.JTextField();
        jTnumChasis = new javax.swing.JTextField();
        jTnumMotor = new javax.swing.JTextField();
        jTnumPuertas = new javax.swing.JTextField();
        jTtamLlanta = new javax.swing.JTextField();
        jTnumCambios = new javax.swing.JTextField();
        jTnumCilindros = new javax.swing.JTextField();
        jTgalonesKilometro = new javax.swing.JTextField();
        jTtipoGasoliona = new javax.swing.JTextField();
        jBordenarMarca = new javax.swing.JButton();
        jComboBox_TipoBuseta = new javax.swing.JComboBox<>();
        jComboBox_TipoTransmision = new javax.swing.JComboBox<>();
        jLtitulo2 = new javax.swing.JLabel();
        jLinfoAdicional = new javax.swing.JLabel();
        jBcontinuar = new javax.swing.JButton();
        jBvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("CONTROLADOR BUSES");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel2.setText("Placa");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel3.setText("Color");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel5.setText("Número de chasis");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel6.setText("Número de motor");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel7.setText("Número de puertas");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel8.setText("Tamaño de llanta");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel9.setText("Tipo de transmisión");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel10.setText("Número de cambios");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel11.setText("Número de cilindros");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel12.setText("Galones por kilómetro");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel13.setText("Tipo de gasolina");

        jTablaBuses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Color", "Marca", "NúmChasis", "NúmMotor", "NúmPuertas", "TamLLanta", "TipoTransmision", "NúmCambios", "NúmCilindros", "Galones X km", "TipoGasolina", "TipoBuseta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablaBuses);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 51));
        jLabel14.setText("Registros almacenados");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel15.setText("Tipo de buseta");

        jBinsertar.setText("Insertar");
        jBinsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBinsertarMouseClicked(evt);
            }
        });
        jBinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinsertarActionPerformed(evt);
            }
        });

        jBconsultarUno.setText("Consultar uno");
        jBconsultarUno.setMaximumSize(new java.awt.Dimension(157, 22));
        jBconsultarUno.setMinimumSize(new java.awt.Dimension(157, 22));
        jBconsultarUno.setPreferredSize(new java.awt.Dimension(157, 22));

        jBborrar.setText("Borrar");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        jBordenarPlaca.setText("Ordenar por placa");
        jBordenarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBordenarPlacaActionPerformed(evt);
            }
        });

        jBconsultarTodos.setText("Consultar todos");

        jBordenarMotor.setText("Ordenar por NúmMotor");
        jBordenarMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBordenarMotorActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");

        jBordenarMarca.setText("Ordenar por marca");

        jComboBox_TipoBuseta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_TipoBuseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TipoBusetaActionPerformed(evt);
            }
        });

        jComboBox_TipoTransmision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLtitulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLtitulo2.setForeground(new java.awt.Color(102, 0, 51));
        jLtitulo2.setText("Otras opciones y Confirmación ");

        jLinfoAdicional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLinfoAdicional.setText("Mensaje informativo");

        jBcontinuar.setText("Continuar");
        jBcontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcontinuarActionPerformed(evt);
            }
        });

        jBvolver.setText("Volver");
        jBvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12)
                        .addComponent(jBinsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(jBborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBconsultarUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBordenarPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBordenarMotor)
                                .addGap(18, 18, 18)
                                .addComponent(jBordenarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBconsultarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTplaca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTcolor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTmarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnumChasis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnumMotor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnumPuertas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTtamLlanta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_TipoTransmision, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                            .addComponent(jTnumCambios, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_TipoBuseta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTnumCilindros, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTgalonesKilometro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTtipoGasoliona, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(442, 442, 442)
                                        .addComponent(jLtitulo2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(453, 453, 453)
                                        .addComponent(jBcontinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(336, 336, 336)
                                        .addComponent(jLinfoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(571, 571, 571))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLtitulo2)
                        .addGap(18, 18, 18)
                        .addComponent(jLinfoAdicional))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTnumChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTnumMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTnumPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTtamLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox_TipoTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTnumCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTnumCilindros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTgalonesKilometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTtipoGasoliona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jComboBox_TipoBuseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBcontinuar)
                            .addComponent(jBvolver))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBinsertar)
                    .addComponent(jBconsultarUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBconsultarTodos)
                    .addComponent(jBmodificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBborrar)
                    .addComponent(jBordenarPlaca)
                    .addComponent(jBordenarMotor)
                    .addComponent(jBordenarMarca))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBordenarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBordenarPlacaActionPerformed
        // TODO add your handling code here:
        contBusesYBusetas.Ordenar();
        tabla.setRowCount(0);
        llenarTabla();
    }//GEN-LAST:event_jBordenarPlacaActionPerformed

    private void jBinsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBinsertarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBinsertarMouseClicked

    private void jComboBox_TipoBusetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TipoBusetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_TipoBusetaActionPerformed

    private void jBordenarMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBordenarMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBordenarMotorActionPerformed

    private void jBinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinsertarActionPerformed
        // TODO add your handling code here:
        BusesYBusetas bus=new BusesYBusetas();
        bus.setId(jTplaca.getText());
        bus.setColor(jTcolor.getText());
        bus.setMarca(jTmarca.getText());
        bus.setNumeroChasis(Integer.parseInt(jTnumChasis.getText()));
        bus.setNumeroMotor(Integer.parseInt(jTnumMotor.getText()));
        bus.setNumeroPuertas(Integer.parseInt(jTnumPuertas.getText()));
        bus.setTamañoLLanta(Float.parseFloat(jTtamLlanta.getText()));
        
        bus.setTipoTransmision((String)jComboBox_TipoTransmision.getSelectedItem());
        bus.setNumeroCambios(Integer.parseInt(jTnumCambios.getText()));
        bus.setNumeroCilindros(Integer.parseInt(jTnumCilindros.getText()));
        bus.setTipoGasolina(jTtipoGasoliona.getText());
        bus.setTipoBuseta((String)jComboBox_TipoBuseta.getSelectedItem());
        if(contBusesYBusetas.insertar(bus)){
            datos[0]=bus.getId();
            datos[1]=bus.getColor();
            datos[2]=bus.getMarca();
            datos[3]=bus.getNumeroChasis();
            datos[4]=bus.getNumeroMotor();
            datos[5]=bus.getNumeroPuertas();
            datos[6]=bus.getTamañoLLanta();            
            datos[7]=bus.getTipoTransmision();
            datos[8]=bus.getNumeroCambios();
            datos[9]=bus.getNumeroCilindros();
            datos[10]=bus.getGalonesKilometro();
            datos[11]=bus.getTipoGasolina();
            datos[12]=bus.getTipoBuseta();
            tabla.addRow(datos);
            JOptionPane.showMessageDialog(this, "Bus insertado");
        }
        else{
           JOptionPane.showMessageDialog(this, "Bus no insertado"); 
        }
    }//GEN-LAST:event_jBinsertarActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        // TODO add your handling code here:
        jLinfoAdicional.setText("Ha seleccionado borrar un bus. Ingrese la placa del vehículo a borrar");
        deshabilitarCampos();
        deshabilitarBotonesPrincipales();
        mostrarOpciones();
    }//GEN-LAST:event_jBborrarActionPerformed

    private void jBcontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcontinuarActionPerformed
        // TODO add your handling code here:
        jLinfoAdicional.setText("");
        habilitarCampos();
        habilitarBotonesPrincipales();
        ocultarOpciones();
    }//GEN-LAST:event_jBcontinuarActionPerformed

    private void jBvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvolverActionPerformed
        // TODO add your handling code here:
        jLinfoAdicional.setText("");
        habilitarCampos();
        habilitarBotonesPrincipales();
        ocultarOpciones();
    }//GEN-LAST:event_jBvolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBuses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBconsultarTodos;
    private javax.swing.JButton jBconsultarUno;
    private javax.swing.JButton jBcontinuar;
    private javax.swing.JButton jBinsertar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBordenarMarca;
    private javax.swing.JButton jBordenarMotor;
    private javax.swing.JButton jBordenarPlaca;
    private javax.swing.JButton jBvolver;
    private javax.swing.JComboBox<String> jComboBox_TipoBuseta;
    private javax.swing.JComboBox<String> jComboBox_TipoTransmision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLinfoAdicional;
    private javax.swing.JLabel jLtitulo2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaBuses;
    private javax.swing.JTextField jTcolor;
    private javax.swing.JTextField jTgalonesKilometro;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTnumCambios;
    private javax.swing.JTextField jTnumChasis;
    private javax.swing.JTextField jTnumCilindros;
    private javax.swing.JTextField jTnumMotor;
    private javax.swing.JTextField jTnumPuertas;
    private javax.swing.JTextField jTplaca;
    private javax.swing.JTextField jTtamLlanta;
    private javax.swing.JTextField jTtipoGasoliona;
    // End of variables declaration//GEN-END:variables
}
