package prototipo2;
import BadeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pagina4_GestionOpera extends javax.swing.JPanel {
 DefaultTableModel modelo;
    public Pagina4_GestionOpera() {
        initComponents();
        this.jPRegistroOperaciones.setVisible(false);
        this.jPPrenda.setVisible(false);
        this.jtxtidfase.setVisible(false);
        this.jtxtidmaquina.setVisible(false);
        this.jtxtidprenda.setVisible(false);
        listar_jcmbmaquina();
        listar_jcmbfase();
        listar_jcmbprenda();
        cargarTablaOperaciones("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPConsultarOperaciones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbloperaciones = new javax.swing.JTable();
        jTNuevaOperacion = new javax.swing.JTextField();
        jtxtmodificar = new javax.swing.JTextField();
        jTextEliminar = new javax.swing.JTextField();
        jtxtconsultarOperaciones = new javax.swing.JTextField();
        jPRegistroOperaciones = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jcmbprenda = new javax.swing.JComboBox();
        jtxtidprenda = new javax.swing.JTextField();
        jtxtnuevaprenda = new javax.swing.JTextField();
        jtxtnuevamaquina = new javax.swing.JTextField();
        jtxtoperacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtSam = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtidmaquina = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jcmbfase = new javax.swing.JComboBox();
        jtxtidfase = new javax.swing.JTextField();
        jtxtgenerarOperacion = new javax.swing.JTextField();
        jcmbmaquina = new javax.swing.JComboBox();
        jPPrenda = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTxtPrenda = new javax.swing.JTextField();
        jtxtregistronuevaprenda = new javax.swing.JTextField();
        jtxtcancelarprenda = new javax.swing.JTextField();
        jPmaquina = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jtxtNmaquina = new javax.swing.JTextField();
        jtxtregistromaquinanueva = new javax.swing.JTextField();
        jtxtcancelarmaquina = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Gestion de Operaciones ");

        jPConsultarOperaciones.setBackground(new java.awt.Color(255, 153, 0));
        jPConsultarOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Consultar: ");

        jtbloperaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtbloperaciones);

        jTNuevaOperacion.setEditable(false);
        jTNuevaOperacion.setBackground(new java.awt.Color(255, 102, 0));
        jTNuevaOperacion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTNuevaOperacion.setForeground(new java.awt.Color(255, 255, 255));
        jTNuevaOperacion.setText(" Nueva Operación ");
        jTNuevaOperacion.setBorder(null);
        jTNuevaOperacion.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTNuevaOperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNuevaOperacionMouseClicked(evt);
            }
        });

        jtxtmodificar.setEditable(false);
        jtxtmodificar.setBackground(new java.awt.Color(255, 102, 0));
        jtxtmodificar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtmodificar.setForeground(new java.awt.Color(255, 255, 255));
        jtxtmodificar.setText(" Modificar ");
        jtxtmodificar.setBorder(null);
        jtxtmodificar.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtmodificarMouseClicked(evt);
            }
        });

        jTextEliminar.setEditable(false);
        jTextEliminar.setBackground(new java.awt.Color(255, 102, 0));
        jTextEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jTextEliminar.setText("  Eliminar ");
        jTextEliminar.setBorder(null);
        jTextEliminar.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTextEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextEliminarMouseClicked(evt);
            }
        });

        jtxtconsultarOperaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtconsultarOperacionesKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPConsultarOperacionesLayout = new javax.swing.GroupLayout(jPConsultarOperaciones);
        jPConsultarOperaciones.setLayout(jPConsultarOperacionesLayout);
        jPConsultarOperacionesLayout.setHorizontalGroup(
            jPConsultarOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultarOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultarOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultarOperacionesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtconsultarOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsultarOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPConsultarOperacionesLayout.createSequentialGroup()
                            .addComponent(jTNuevaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConsultarOperacionesLayout.setVerticalGroup(
            jPConsultarOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultarOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultarOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtconsultarOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPConsultarOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNuevaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPRegistroOperaciones.setBackground(new java.awt.Color(255, 153, 0));
        jPRegistroOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" Prenda: ");

        jcmbprenda.setBackground(new java.awt.Color(255, 102, 0));
        jcmbprenda.setEditable(true);
        jcmbprenda.setToolTipText("Prenda");
        jcmbprenda.setBorder(null);
        jcmbprenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcmbprenda.setFocusable(false);
        jcmbprenda.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmbprendaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jtxtidprenda.setText(" ");

        jtxtnuevaprenda.setEditable(false);
        jtxtnuevaprenda.setBackground(new java.awt.Color(255, 102, 0));
        jtxtnuevaprenda.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtnuevaprenda.setForeground(new java.awt.Color(255, 255, 255));
        jtxtnuevaprenda.setText(" Nueva ");
        jtxtnuevaprenda.setBorder(null);
        jtxtnuevaprenda.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtnuevaprenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtnuevaprendaMouseClicked(evt);
            }
        });

        jtxtnuevamaquina.setEditable(false);
        jtxtnuevamaquina.setBackground(new java.awt.Color(255, 102, 0));
        jtxtnuevamaquina.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtnuevamaquina.setForeground(new java.awt.Color(255, 255, 255));
        jtxtnuevamaquina.setText(" Nueva ");
        jtxtnuevamaquina.setBorder(null);
        jtxtnuevamaquina.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtnuevamaquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtnuevamaquinaMouseClicked(evt);
            }
        });

        jtxtoperacion.setToolTipText("Nombre Operación");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Operacion: ");

        jtxtSam.setToolTipText("Tiempo SAM en 0.00");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Tiempo SAM: ");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Máquina: ");

        jtxtidmaquina.setText(" ");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Fase: ");

        jcmbfase.setBackground(new java.awt.Color(255, 102, 0));
        jcmbfase.setEditable(true);
        jcmbfase.setMaximumRowCount(3);
        jcmbfase.setToolTipText("Fase");
        jcmbfase.setBorder(null);
        jcmbfase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcmbfase.setFocusable(false);
        jcmbfase.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmbfasePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jtxtidfase.setText(" ");

        jtxtgenerarOperacion.setEditable(false);
        jtxtgenerarOperacion.setBackground(new java.awt.Color(255, 102, 0));
        jtxtgenerarOperacion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtgenerarOperacion.setForeground(new java.awt.Color(255, 255, 255));
        jtxtgenerarOperacion.setText(" Generar Operación ");
        jtxtgenerarOperacion.setBorder(null);
        jtxtgenerarOperacion.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtgenerarOperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtgenerarOperacionMouseClicked(evt);
            }
        });

        jcmbmaquina.setBackground(new java.awt.Color(255, 102, 0));
        jcmbmaquina.setEditable(true);
        jcmbmaquina.setMaximumRowCount(3);
        jcmbmaquina.setToolTipText("Máquina");
        jcmbmaquina.setBorder(null);
        jcmbmaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcmbmaquina.setFocusable(false);
        jcmbmaquina.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmbmaquinaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jPPrenda.setBackground(new java.awt.Color(255, 153, 0));
        jPPrenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prenda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Prenda: ");

        jTxtPrenda.setToolTipText("Nueva Prenda");

        jtxtregistronuevaprenda.setEditable(false);
        jtxtregistronuevaprenda.setBackground(new java.awt.Color(255, 102, 0));
        jtxtregistronuevaprenda.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtregistronuevaprenda.setForeground(new java.awt.Color(255, 255, 255));
        jtxtregistronuevaprenda.setText(" Guardar Prenda  ");
        jtxtregistronuevaprenda.setBorder(null);
        jtxtregistronuevaprenda.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtregistronuevaprenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtregistronuevaprendaMouseClicked(evt);
            }
        });

        jtxtcancelarprenda.setEditable(false);
        jtxtcancelarprenda.setBackground(new java.awt.Color(255, 102, 0));
        jtxtcancelarprenda.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtcancelarprenda.setForeground(new java.awt.Color(255, 255, 255));
        jtxtcancelarprenda.setText(" Cancelar ");
        jtxtcancelarprenda.setBorder(null);
        jtxtcancelarprenda.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtcancelarprenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtcancelarprendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPPrendaLayout = new javax.swing.GroupLayout(jPPrenda);
        jPPrenda.setLayout(jPPrendaLayout);
        jPPrendaLayout.setHorizontalGroup(
            jPPrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrendaLayout.createSequentialGroup()
                .addGroup(jPPrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrendaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPPrendaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtxtregistronuevaprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtcancelarprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPrendaLayout.setVerticalGroup(
            jPPrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrendaLayout.createSequentialGroup()
                .addGroup(jPPrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtregistronuevaprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtcancelarprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPmaquina.setBackground(new java.awt.Color(255, 153, 0));
        jPmaquina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Maquina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" N. Máquina: ");

        jtxtNmaquina.setToolTipText("Nueva Máquina");

        jtxtregistromaquinanueva.setEditable(false);
        jtxtregistromaquinanueva.setBackground(new java.awt.Color(255, 102, 0));
        jtxtregistromaquinanueva.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtregistromaquinanueva.setForeground(new java.awt.Color(255, 255, 255));
        jtxtregistromaquinanueva.setText(" Guardar Maquina ");
        jtxtregistromaquinanueva.setBorder(null);
        jtxtregistromaquinanueva.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtregistromaquinanueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtregistromaquinanuevaMouseClicked(evt);
            }
        });

        jtxtcancelarmaquina.setEditable(false);
        jtxtcancelarmaquina.setBackground(new java.awt.Color(255, 102, 0));
        jtxtcancelarmaquina.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtcancelarmaquina.setForeground(new java.awt.Color(255, 255, 255));
        jtxtcancelarmaquina.setText(" Cancelar ");
        jtxtcancelarmaquina.setBorder(null);
        jtxtcancelarmaquina.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtcancelarmaquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtcancelarmaquinaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPmaquinaLayout = new javax.swing.GroupLayout(jPmaquina);
        jPmaquina.setLayout(jPmaquinaLayout);
        jPmaquinaLayout.setHorizontalGroup(
            jPmaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmaquinaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPmaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPmaquinaLayout.createSequentialGroup()
                        .addComponent(jtxtregistromaquinanueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtcancelarmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPmaquinaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtNmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPmaquinaLayout.setVerticalGroup(
            jPmaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmaquinaLayout.createSequentialGroup()
                .addGroup(jPmaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPmaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtregistromaquinanueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtcancelarmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(255, 102, 0));
        jTextField25.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(255, 255, 255));
        jTextField25.setText(" Cancelar ");
        jTextField25.setBorder(null);
        jTextField25.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroOperacionesLayout = new javax.swing.GroupLayout(jPRegistroOperaciones);
        jPRegistroOperaciones.setLayout(jPRegistroOperacionesLayout);
        jPRegistroOperacionesLayout.setHorizontalGroup(
            jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                        .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(35, 35, 35)
                                .addComponent(jcmbprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jtxtidprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(14, 14, 14)
                                .addComponent(jtxtoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)
                                .addComponent(jtxtSam, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jtxtnuevaprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                        .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4)
                                .addComponent(jtxtidmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jcmbmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jtxtnuevamaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(19, 19, 19)
                                .addComponent(jtxtidfase, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jcmbfase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addComponent(jtxtgenerarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(jPmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPRegistroOperacionesLayout.setVerticalGroup(
            jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jcmbprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtxtidprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtxtoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtxtSam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jtxtnuevaprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jtxtidmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jcmbmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtnuevamaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtxtidfase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroOperacionesLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jcmbfase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPRegistroOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtgenerarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPConsultarOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPRegistroOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jPConsultarOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPRegistroOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public  void listar_jcmbmaquina(){
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String n="";
        String sSQL="";
        sSQL="select Nombre_Maquina from maquina";
        try {
               Statement st= cn.createStatement();
               ResultSet rs= st.executeQuery(sSQL);
       while(rs.next()){
               n=rs.getString("Nombre_Maquina");
               jcmbmaquina.addItem(n);
               }
                     
           } catch (SQLException ex)
           {
               JOptionPane.showMessageDialog(null, ex);
           }
       }
    
    public void limpiar_jcmb(){
        jcmbmaquina.removeAllItems();
        jcmbprenda.removeAllItems();
    }
      public  void listar_jcmbprenda() {
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String n="";
       String sSQL="";
       sSQL="select Nombre_Prenda from tipo_prenda";
       try {
               Statement st= cn.createStatement();
               ResultSet rs= st.executeQuery(sSQL);
               while(rs.next())
               {
                   n=rs.getString("Nombre_Prenda");
                   jcmbprenda.addItem(n);
               }
               } catch (SQLException ex)
           {
               JOptionPane.showMessageDialog(null, "No esta Guardando Nada ");
           }
       }
       public  void listar_jcmbfase() {
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String n="";
       String sSQL="";
       sSQL="select Nombre_Fase from fase";
              try {
               Statement st= cn.createStatement();
               ResultSet rs= st.executeQuery(sSQL);
               while(rs.next())
               {
                   n=rs.getString("Nombre_Fase");
                   jcmbfase.addItem(n);
               }
                     
           } catch (SQLException ex)
           {
               JOptionPane.showMessageDialog(null, "No esta Guardando Nada");
           }
       }
       public void insertaidjcmbmaquina() {
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String n="";
       String id="";
       String sSQL="";
       String pt=(String)jcmbmaquina.getSelectedItem();
       sSQL="select ID_Maquina from maquina where Nombre_maquina=?";
       try {
               PreparedStatement ps= cn.prepareStatement(sSQL);
               ps.setString(1, pt);
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                  String add=rs.getString("ID_Maquina");
                  jtxtidmaquina.setText(add);
               }
           }
            catch (SQLException ex)
             {
               JOptionPane.showMessageDialog(null, ex);
             
             }
       }
       
        public void insertaidjcmbprenda()
       {
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String n="";
       String id="";
       String sSQL="";
       String pt=(String)jcmbprenda.getSelectedItem();
       sSQL="select ID_TipoPrenda from tipo_prenda where Nombre_Prenda=?";
       try {
               PreparedStatement ps= cn.prepareStatement(sSQL);
               ps.setString(1, pt);
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                  String add=rs.getString("ID_TipoPrenda");
                  jtxtidprenda.setText(add);
               }
           }
            catch (SQLException ex)
             {
               JOptionPane.showMessageDialog(null, ex);
             
             }
       }
        public void insertaidjcmbfase()
       {
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String n="";
       String id="";
       String sSQL="";
       String pt=(String)jcmbfase.getSelectedItem();
       sSQL="select ID_Fase from fase where Nombre_Fase=?";
       try {
               PreparedStatement ps= cn.prepareStatement(sSQL);
               ps.setString(1, pt);
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                  String add=rs.getString("ID_Fase");
                  jtxtidfase.setText(add);
               }
           }
            catch (SQLException ex)
             {
               JOptionPane.showMessageDialog(null, ex);
             
             }
       }
   void cargarTablaOperaciones(String valor) {
     String[] titulos = {"Cod. Opera","Operación", "Sam", "Maquina", "Tipo Prenda", "Fase"};
     String[] registros = new String[6];
     String sSQL= "";
     modelo = new DefaultTableModel(null, titulos);
     ConexionMySQL mysql = new ConexionMySQL();
     Connection cn = mysql.Conectar();
     sSQL="SELECT  operacion.ID_Operacion, operacion.Nombre_Opera, operacion.Sam, maquina.Nombre_Maquina, tipo_prenda.Nombre_Prenda, fase.Nombre_Fase"
             + " FROM maquina, operacion, tipo_prenda, fase WHERE operacion.ID_Maquina = maquina.ID_Maquina "
             + " AND tipo_prenda.ID_TipoPrenda = operacion.ID_TipoPrenda AND operacion.ID_Fase = fase.ID_Fase AND CONCAT"
             + "(ID_Operacion,'',Nombre_Opera,'',Nombre_Maquina,'',Nombre_Prenda,'',Nombre_Fase)LIKE '%"+valor+"%'";
           
     try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           
           while(rs.next())
               {
               registros[0] = rs.getString("ID_Operacion");
               registros[1] = rs.getString("Nombre_Opera");
               registros[2] = rs.getString("Sam");
               registros[3] = rs.getString("Nombre_Maquina");
               registros[4] = rs.getString("Nombre_Prenda");
               registros[5] = rs.getString("Nombre_Fase");
               modelo.addRow(registros);
               
              }
           jtbloperaciones.setModel(modelo);
             }
     catch (SQLException ex)
     {
           JOptionPane.showMessageDialog(null, ex);
     }
   }
 
 String id_actualizar ="";
    void BuscarOperacionEditar(String ID){
        String sql = "SELECT * FROM operacion where ID_Operacion = " +ID;
        String ope= "", sam=""; 
          ConexionMySQL mysql = new ConexionMySQL();
          Connection cn = mysql.Conectar();
         try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            ope=rs.getString("Nombre_Opera");
            sam=rs.getString("Sam");
                                       
            }
             this.jtxtoperacion.setText(ope);
             this.jtxtSam.setText(sam);
             id_actualizar=ID;         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex) ;
        }
     }

    private void jTNuevaOperacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNuevaOperacionMouseClicked
   this.jPRegistroOperaciones.setVisible(true);
   this.jPConsultarOperaciones.setVisible(false);
   this.jPPrenda.setVisible(true);
   this.jPmaquina.setVisible(false);
   this.jPPrenda.setVisible(false);
   this.jtxtoperacion.setText("");
   this.jtxtSam.setText("");
   accion="Insertar";
    }//GEN-LAST:event_jTNuevaOperacionMouseClicked
 String accion="";
 String mensaje="";
    private void jtxtgenerarOperacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtgenerarOperacionMouseClicked
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();
        String sSQL="";
        String prenda, opera, sam, maquins, fase;
        prenda = jtxtidprenda.getText();
        opera = jtxtoperacion.getText();
        sam = jtxtSam.getText();
        maquins = jtxtidmaquina.getText();
        fase = jtxtidfase.getText();
      if (accion.equals("Insertar")){
        sSQL="Insert Into operacion(Nombre_Opera, Sam, ID_Maquina, ID_TipoPrenda, ID_Fase) Values(?,?,?,?,?)";
        mensaje="Se ha Guardado la Operación";
         }
       else{ if (accion.equals("Modificar")){
        sSQL ="UPDATE operacion SET Nombre_Opera= ? , "
                   +"Sam= ? , "
                   +"ID_Maquina= ? , "
                   +"ID_TipoPrenda= ? , "
                   +"ID_Fase= ? "      
                   +"WHERE ID_Operacion="+id_actualizar+"";
                   mensaje="Se ha modificado correctamente";
             }
      }
        try {
            PreparedStatement prs = cn.prepareStatement(sSQL);
            prs.setString(1,opera);
            prs.setString(2,sam);
            prs.setString(3,maquins);
            prs.setString(4,prenda);
            prs.setString(5,fase);
            int n = prs.executeUpdate();
            if(n > 0){
               
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar_jcmb();
            listar_jcmbmaquina();
            listar_jcmbprenda();
            jtxtoperacion.setText("");
            jtxtSam.setText("");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jtxtgenerarOperacionMouseClicked

    private void jtxtnuevaprendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtnuevaprendaMouseClicked
   this.jPRegistroOperaciones.setVisible(true);
   this.jPConsultarOperaciones.setVisible(false);
   this.jPmaquina.setVisible(false);
   this.jPPrenda.setVisible(true);
    }//GEN-LAST:event_jtxtnuevaprendaMouseClicked

    private void jtxtregistronuevaprendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtregistronuevaprendaMouseClicked
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
        String sSQL="", sql="";
        String prenda, mensaje;
        prenda = jTxtPrenda.getText();
        sSQL="Insert Into tipo_prenda(Nombre_Prenda) Values(?)";
        mensaje="Se ha Guardado la Prenda";
            try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, prenda);
            int n = pst.executeUpdate();
            if(n > 0){
            JOptionPane.showMessageDialog(null, mensaje);
            this.jPPrenda.setVisible(false);
            limpiar_jcmb();
            listar_jcmbprenda();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
    }//GEN-LAST:event_jtxtregistronuevaprendaMouseClicked

    private void jtxtnuevamaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtnuevamaquinaMouseClicked
     this.jPRegistroOperaciones.setVisible(true);
     this.jPConsultarOperaciones.setVisible(false);
     this.jPmaquina.setVisible(true);
     this.jPPrenda.setVisible(false);
     this.jtxtNmaquina.setText("");
    }//GEN-LAST:event_jtxtnuevamaquinaMouseClicked

    private void jtxtregistromaquinanuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtregistromaquinanuevaMouseClicked
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
        String sSQL="", sql="";
        String maquina, mensaje;
        maquina = jtxtNmaquina.getText();
        sSQL="Insert Into maquina(Nombre_Maquina) Values(?)";
        mensaje="Se ha Guardado la Maquina";

         try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, maquina);
            int n = pst.executeUpdate();
            if(n > 0){
            JOptionPane.showMessageDialog(null, mensaje);
            this.jPmaquina.setVisible(false);
            limpiar_jcmb();
            listar_jcmbmaquina();
            }
         }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya se Encuentra Registrado");
        }
    }//GEN-LAST:event_jtxtregistromaquinanuevaMouseClicked

    private void jcmbprendaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmbprendaPopupMenuWillBecomeInvisible
       this.insertaidjcmbprenda();
    }//GEN-LAST:event_jcmbprendaPopupMenuWillBecomeInvisible

    private void jcmbfasePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmbfasePopupMenuWillBecomeInvisible
        this.insertaidjcmbfase();
    }//GEN-LAST:event_jcmbfasePopupMenuWillBecomeInvisible

    private void jcmbmaquinaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmbmaquinaPopupMenuWillBecomeInvisible
       this.insertaidjcmbmaquina();
    }//GEN-LAST:event_jcmbmaquinaPopupMenuWillBecomeInvisible

    private void jTextEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextEliminarMouseClicked
        int filasel;
        String Nombre;
        filasel=this.jtbloperaciones.getSelectedRow();
        if (filasel==-1){
        JOptionPane.showMessageDialog(null,"Seleccione la Fila Deseada "); }
        else
        {
        modelo=(DefaultTableModel)this.jtbloperaciones.getModel();
        Nombre=(String)this.modelo.getValueAt(filasel,0);
        
        int conf=JOptionPane.showConfirmDialog(null,"Esta seguro de Eliminar a "+Nombre);
        if(conf==0){
         ConexionMySQL mysql = new ConexionMySQL();
      Connection cn = mysql.Conectar();
           String sSQL="DELETE  from Operacion WHERE ID_Operacion='" + Nombre + "'";
        try {
            PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL);
            int n=pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Datos Eliminados");
                cargarTablaOperaciones("");
              }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);   }
        }
        }
    }//GEN-LAST:event_jTextEliminarMouseClicked

    private void jTextField25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseClicked
   this.jPRegistroOperaciones.setVisible(false);
   this.jPConsultarOperaciones.setVisible(true);
   cargarTablaOperaciones("");
    
    }//GEN-LAST:event_jTextField25MouseClicked

    private void jtxtcancelarprendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtcancelarprendaMouseClicked
    this.jPPrenda.setVisible(false);
    }//GEN-LAST:event_jtxtcancelarprendaMouseClicked

    private void jtxtcancelarmaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtcancelarmaquinaMouseClicked
    this.jPmaquina.setVisible(false);
    }//GEN-LAST:event_jtxtcancelarmaquinaMouseClicked

    private void jtxtconsultarOperacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtconsultarOperacionesKeyReleased
      cargarTablaOperaciones(jtxtconsultarOperaciones.getText());
    }//GEN-LAST:event_jtxtconsultarOperacionesKeyReleased

    private void jtxtmodificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtmodificarMouseClicked
        int filasel;
        String ID;
        try {
          filasel=this.jtbloperaciones.getSelectedRow();
        if (filasel==-1){  
            JOptionPane.showMessageDialog(null,"No se ha Seleccionado ninguna Fila");
        }
        else{
            accion="Modificar";
            modelo= (DefaultTableModel)jtbloperaciones.getModel();
            ID=(String)modelo.getValueAt(filasel, 0);
            BuscarOperacionEditar(ID);
             this.jPRegistroOperaciones.setVisible(true);
             this.jPConsultarOperaciones.setVisible(false);
             this.jPPrenda.setVisible(false);
             this.jPmaquina.setVisible(false);
             this.jPPrenda.setVisible(false);
           
         }
          }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jtxtmodificarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPConsultarOperaciones;
    private javax.swing.JPanel jPPrenda;
    private javax.swing.JPanel jPRegistroOperaciones;
    private javax.swing.JPanel jPmaquina;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTNuevaOperacion;
    private javax.swing.JTextField jTextEliminar;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTxtPrenda;
    private javax.swing.JComboBox jcmbfase;
    private javax.swing.JComboBox jcmbmaquina;
    private javax.swing.JComboBox jcmbprenda;
    private javax.swing.JTable jtbloperaciones;
    private javax.swing.JTextField jtxtNmaquina;
    private javax.swing.JTextField jtxtSam;
    private javax.swing.JTextField jtxtcancelarmaquina;
    private javax.swing.JTextField jtxtcancelarprenda;
    private javax.swing.JTextField jtxtconsultarOperaciones;
    private javax.swing.JTextField jtxtgenerarOperacion;
    private javax.swing.JTextField jtxtidfase;
    private javax.swing.JTextField jtxtidmaquina;
    private javax.swing.JTextField jtxtidprenda;
    private javax.swing.JTextField jtxtmodificar;
    private javax.swing.JTextField jtxtnuevamaquina;
    private javax.swing.JTextField jtxtnuevaprenda;
    private javax.swing.JTextField jtxtoperacion;
    private javax.swing.JTextField jtxtregistromaquinanueva;
    private javax.swing.JTextField jtxtregistronuevaprenda;
    // End of variables declaration//GEN-END:variables
}
