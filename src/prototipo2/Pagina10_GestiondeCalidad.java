package prototipo2;
public class Pagina10_GestiondeCalidad extends javax.swing.JPanel {
    public Pagina10_GestiondeCalidad() {
        initComponents();
        this.jPInspeccionCalidad.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPConsultarGrupoCalidad = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTModificar = new javax.swing.JTextField();
        jTInspeccionCalidad = new javax.swing.JTextField();
        jTEliminar = new javax.swing.JTextField();
        jTexGenerarReporteCalidad = new javax.swing.JTextField();
        jTexGraficosdeControl = new javax.swing.JTextField();
        jPInspeccionCalidad = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTGuardarInspeccion = new javax.swing.JTextField();
        jTCancelarInspeccion = new javax.swing.JTextField();
        jTexTipodePrenda = new javax.swing.JTextField();
        jTexFecha = new javax.swing.JTextField();
        jTexNºOrdenConfeccion = new javax.swing.JTextField();
        jTexUnidadesNoConformes = new javax.swing.JTextField();
        jTexUnidadesChequeadas = new javax.swing.JTextField();
        jTexNoConformidad = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 102, 0));
        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText(" Inspección de Calidad ");
        jTextField6.setBorder(null);
        jTextField6.setSelectionColor(new java.awt.Color(255, 102, 0));

        setBackground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Gestión de Calidad ");

        jPConsultarGrupoCalidad.setBackground(new java.awt.Color(255, 153, 0));
        jPConsultarGrupoCalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Consultar:");

        jTModificar.setEditable(false);
        jTModificar.setBackground(new java.awt.Color(255, 102, 0));
        jTModificar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTModificar.setForeground(new java.awt.Color(255, 255, 255));
        jTModificar.setText(" Modificar ");
        jTModificar.setBorder(null);
        jTModificar.setSelectionColor(new java.awt.Color(255, 102, 0));

        jTInspeccionCalidad.setEditable(false);
        jTInspeccionCalidad.setBackground(new java.awt.Color(255, 102, 0));
        jTInspeccionCalidad.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTInspeccionCalidad.setForeground(new java.awt.Color(255, 255, 255));
        jTInspeccionCalidad.setText(" Inspección de Calidad ");
        jTInspeccionCalidad.setBorder(null);
        jTInspeccionCalidad.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTInspeccionCalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTInspeccionCalidadMouseClicked(evt);
            }
        });

        jTEliminar.setEditable(false);
        jTEliminar.setBackground(new java.awt.Color(255, 102, 0));
        jTEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jTEliminar.setText(" Eliminar ");
        jTEliminar.setBorder(null);
        jTEliminar.setSelectionColor(new java.awt.Color(255, 102, 0));

        jTexGenerarReporteCalidad.setEditable(false);
        jTexGenerarReporteCalidad.setBackground(new java.awt.Color(255, 102, 0));
        jTexGenerarReporteCalidad.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexGenerarReporteCalidad.setForeground(new java.awt.Color(255, 255, 255));
        jTexGenerarReporteCalidad.setText(" Generar Reporte ");
        jTexGenerarReporteCalidad.setBorder(null);
        jTexGenerarReporteCalidad.setSelectionColor(new java.awt.Color(255, 102, 0));

        jTexGraficosdeControl.setEditable(false);
        jTexGraficosdeControl.setBackground(new java.awt.Color(255, 102, 0));
        jTexGraficosdeControl.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexGraficosdeControl.setForeground(new java.awt.Color(255, 255, 255));
        jTexGraficosdeControl.setText(" Graficos de Control ");
        jTexGraficosdeControl.setBorder(null);
        jTexGraficosdeControl.setSelectionColor(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPConsultarGrupoCalidadLayout = new javax.swing.GroupLayout(jPConsultarGrupoCalidad);
        jPConsultarGrupoCalidad.setLayout(jPConsultarGrupoCalidadLayout);
        jPConsultarGrupoCalidadLayout.setHorizontalGroup(
            jPConsultarGrupoCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultarGrupoCalidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultarGrupoCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultarGrupoCalidadLayout.createSequentialGroup()
                        .addComponent(jTInspeccionCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTexGraficosdeControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsultarGrupoCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPConsultarGrupoCalidadLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTexGenerarReporteCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPConsultarGrupoCalidadLayout.setVerticalGroup(
            jPConsultarGrupoCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultarGrupoCalidadLayout.createSequentialGroup()
                .addGroup(jPConsultarGrupoCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexGenerarReporteCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConsultarGrupoCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTInspeccionCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexGraficosdeControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPInspeccionCalidad.setBackground(new java.awt.Color(255, 153, 0));
        jPInspeccionCalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inspección de Calidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" T. de Prenda: ");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Fecha: ");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Nº Orden de Confección: ");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Unidades No Conformes: ");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Unidades Chequeadas: ");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Operación: ");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" No Conformidad: ");

        jTGuardarInspeccion.setEditable(false);
        jTGuardarInspeccion.setBackground(new java.awt.Color(255, 102, 0));
        jTGuardarInspeccion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTGuardarInspeccion.setForeground(new java.awt.Color(255, 255, 255));
        jTGuardarInspeccion.setText(" Guardar ");
        jTGuardarInspeccion.setBorder(null);
        jTGuardarInspeccion.setSelectionColor(new java.awt.Color(255, 102, 0));

        jTCancelarInspeccion.setEditable(false);
        jTCancelarInspeccion.setBackground(new java.awt.Color(255, 102, 0));
        jTCancelarInspeccion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTCancelarInspeccion.setForeground(new java.awt.Color(255, 255, 255));
        jTCancelarInspeccion.setText(" Cancelar ");
        jTCancelarInspeccion.setBorder(null);
        jTCancelarInspeccion.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTCancelarInspeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCancelarInspeccionMouseClicked(evt);
            }
        });

        jTexTipodePrenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexTipodePrendaActionPerformed(evt);
            }
        });

        jTexFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexFechaActionPerformed(evt);
            }
        });

        jTexNºOrdenConfeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexNºOrdenConfeccionActionPerformed(evt);
            }
        });

        jTexUnidadesNoConformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexUnidadesNoConformesActionPerformed(evt);
            }
        });

        jTexUnidadesChequeadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexUnidadesChequeadasActionPerformed(evt);
            }
        });

        jTexNoConformidad.setText(" ");

        jComboBox1.setBackground(new java.awt.Color(255, 102, 0));
        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID de Conformidad", "1", "2", "3", "4" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.setFocusable(false);

        jComboBox2.setBackground(new java.awt.Color(255, 102, 0));
        jComboBox2.setEditable(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID de Conformidad", "1", "2", "3", "4" }));
        jComboBox2.setBorder(null);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" Operación: ");

        jComboBox3.setBackground(new java.awt.Color(255, 102, 0));
        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID de Conformidad", "1", "2", "3", "4" }));
        jComboBox3.setBorder(null);
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox3.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Operación: ");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" Operación: ");

        jComboBox4.setBackground(new java.awt.Color(255, 102, 0));
        jComboBox4.setEditable(true);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID de Conformidad", "1", "2", "3", "4" }));
        jComboBox4.setBorder(null);
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox4.setFocusable(false);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" Operación: ");

        jComboBox5.setBackground(new java.awt.Color(255, 102, 0));
        jComboBox5.setEditable(true);
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID de Conformidad", "1", "2", "3", "4" }));
        jComboBox5.setBorder(null);
        jComboBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox5.setFocusable(false);

        javax.swing.GroupLayout jPInspeccionCalidadLayout = new javax.swing.GroupLayout(jPInspeccionCalidad);
        jPInspeccionCalidad.setLayout(jPInspeccionCalidadLayout);
        jPInspeccionCalidadLayout.setHorizontalGroup(
            jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInspeccionCalidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPInspeccionCalidadLayout.createSequentialGroup()
                        .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTGuardarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTexTipodePrenda)
                                .addComponent(jTexFecha)
                                .addComponent(jTexUnidadesNoConformes)
                                .addComponent(jTexNºOrdenConfeccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTexUnidadesChequeadas, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTCancelarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTexNoConformidad, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPInspeccionCalidadLayout.setVerticalGroup(
            jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInspeccionCalidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexTipodePrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexNºOrdenConfeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexUnidadesNoConformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexUnidadesChequeadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexNoConformidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPInspeccionCalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTGuardarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCancelarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPConsultarGrupoCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPInspeccionCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jPInspeccionCalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPConsultarGrupoCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTInspeccionCalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTInspeccionCalidadMouseClicked
        this.jPInspeccionCalidad.setVisible(true);
        this.jPConsultarGrupoCalidad.setVisible(false);
    }//GEN-LAST:event_jTInspeccionCalidadMouseClicked
    private void jTCancelarInspeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCancelarInspeccionMouseClicked
       this.jPInspeccionCalidad.setVisible(false);
       this.jPConsultarGrupoCalidad.setVisible(true);
    }//GEN-LAST:event_jTCancelarInspeccionMouseClicked
    //Transferir Cursor
    private void jTexTipodePrendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexTipodePrendaActionPerformed
        this.jTexTipodePrenda.transferFocus();
    }//GEN-LAST:event_jTexTipodePrendaActionPerformed
    private void jTexFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexFechaActionPerformed
      this.jTexFecha.transferFocus();
    }//GEN-LAST:event_jTexFechaActionPerformed
    private void jTexNºOrdenConfeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexNºOrdenConfeccionActionPerformed
      this.jTexNºOrdenConfeccion.transferFocus();
    }//GEN-LAST:event_jTexNºOrdenConfeccionActionPerformed
    private void jTexUnidadesNoConformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexUnidadesNoConformesActionPerformed
      this.jTexUnidadesNoConformes.transferFocus();
    }//GEN-LAST:event_jTexUnidadesNoConformesActionPerformed
    private void jTexUnidadesChequeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexUnidadesChequeadasActionPerformed
     this.jTexUnidadesChequeadas.transferFocus();
    }//GEN-LAST:event_jTexUnidadesChequeadasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPConsultarGrupoCalidad;
    private javax.swing.JPanel jPInspeccionCalidad;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTCancelarInspeccion;
    private javax.swing.JTextField jTEliminar;
    private javax.swing.JTextField jTGuardarInspeccion;
    private javax.swing.JTextField jTInspeccionCalidad;
    private javax.swing.JTextField jTModificar;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTexFecha;
    private javax.swing.JTextField jTexGenerarReporteCalidad;
    private javax.swing.JTextField jTexGraficosdeControl;
    private javax.swing.JTextField jTexNoConformidad;
    private javax.swing.JTextField jTexNºOrdenConfeccion;
    private javax.swing.JTextField jTexTipodePrenda;
    private javax.swing.JTextField jTexUnidadesChequeadas;
    private javax.swing.JTextField jTexUnidadesNoConformes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
