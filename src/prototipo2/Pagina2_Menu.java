package prototipo2;
import java.awt.Component;
import java.awt.event.ActionEvent;

public class Pagina2_Menu extends javax.swing.JFrame {

    public Pagina2_Menu(boolean admin) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu");
        Enblanco obje = new  Enblanco();
        this.Contenedor.add("Blanco", obje);
        jPSubMenuPlanillaD.setVisible(false);
        jPSubMenuOrdenConfeccion.setVisible(false);
        this.admin=admin;
        }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Contenedor = new javax.swing.JTabbedPane();
        jTexCerrarSesion = new javax.swing.JTextField();
        jTexPerfil = new javax.swing.JTextField();
        jTexGestionOperaciones = new javax.swing.JTextField();
        jTexOrdendeConfeccion = new javax.swing.JTextField();
        jTexHistoricoAprendiz = new javax.swing.JTextField();
        jPSubMenuOrdenConfeccion = new javax.swing.JPanel();
        jPNuevaOrden = new javax.swing.JTextField();
        jP2 = new javax.swing.JTextField();
        jPSubMenuPlanillaD = new javax.swing.JPanel();
        jPAsistencia = new javax.swing.JTextField();
        jPPlanilladiaria = new javax.swing.JTextField();
        jPReportedeTiemposMuertos = new javax.swing.JTextField();
        jTexGestiondeCalidad = new javax.swing.JTextField();
        jTextOpeAprendiz = new javax.swing.JTextField();
        jPPlanilladeProduccionDiaria = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 153, 255));
        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText(" Preparacion ");
        jTextField5.setBorder(null);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(0, 153, 255));
        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("  Ensamble");
        jTextField6.setBorder(null);

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(0, 153, 255));
        jTextField9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setText(" Terminacion ");
        jTextField9.setBorder(null);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(0, 153, 255));
        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText(" Volver ");
        jTextField10.setBorder(null);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(0, 153, 255));
        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText(" Cerrar Sesion ");
        jTextField11.setBorder(null);

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(0, 153, 255));
        jTextField12.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setText(" Perfil ");
        jTextField12.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Centro de Diseño e Innovacion Tecnologica Industrial Sena Dosquebradas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" ");

        jLabel5.setBackground(new java.awt.Color(0, 102, 204));
        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Centro de Diseño e Innovación Tecnologica Industrial ");

        jLabel6.setBackground(new java.awt.Color(0, 102, 204));
        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Sena Dosquebradas ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_sena (2).png"))); // NOI18N

        Contenedor.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jTexCerrarSesion.setEditable(false);
        jTexCerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        jTexCerrarSesion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jTexCerrarSesion.setText(" Cerrar Sesion ");
        jTexCerrarSesion.setBorder(null);
        jTexCerrarSesion.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexCerrarSesionMouseClicked(evt);
            }
        });

        jTexPerfil.setEditable(false);
        jTexPerfil.setBackground(new java.awt.Color(255, 102, 0));
        jTexPerfil.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jTexPerfil.setText(" Perfil ");
        jTexPerfil.setBorder(null);
        jTexPerfil.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexPerfilMouseClicked(evt);
            }
        });

        jTexGestionOperaciones.setEditable(false);
        jTexGestionOperaciones.setBackground(new java.awt.Color(255, 102, 0));
        jTexGestionOperaciones.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexGestionOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        jTexGestionOperaciones.setText(" Gestion de Operaciones ");
        jTexGestionOperaciones.setBorder(null);
        jTexGestionOperaciones.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexGestionOperaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexGestionOperacionesMouseClicked(evt);
            }
        });

        jTexOrdendeConfeccion.setEditable(false);
        jTexOrdendeConfeccion.setBackground(new java.awt.Color(255, 102, 0));
        jTexOrdendeConfeccion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexOrdendeConfeccion.setForeground(new java.awt.Color(255, 255, 255));
        jTexOrdendeConfeccion.setText(" Orden de Confección ");
        jTexOrdendeConfeccion.setBorder(null);
        jTexOrdendeConfeccion.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexOrdendeConfeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexOrdendeConfeccionMouseClicked(evt);
            }
        });

        jTexHistoricoAprendiz.setEditable(false);
        jTexHistoricoAprendiz.setBackground(new java.awt.Color(255, 102, 0));
        jTexHistoricoAprendiz.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexHistoricoAprendiz.setForeground(new java.awt.Color(255, 255, 255));
        jTexHistoricoAprendiz.setText(" Historico Aprendíz ");
        jTexHistoricoAprendiz.setBorder(null);
        jTexHistoricoAprendiz.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexHistoricoAprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexHistoricoAprendizMouseClicked(evt);
            }
        });

        jPSubMenuOrdenConfeccion.setBackground(new java.awt.Color(255, 153, 0));

        jPNuevaOrden.setEditable(false);
        jPNuevaOrden.setBackground(new java.awt.Color(255, 153, 0));
        jPNuevaOrden.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPNuevaOrden.setForeground(new java.awt.Color(255, 255, 255));
        jPNuevaOrden.setText(" Nueva Orden de Confección ");
        jPNuevaOrden.setBorder(null);
        jPNuevaOrden.setSelectionColor(new java.awt.Color(255, 153, 0));
        jPNuevaOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPNuevaOrdenMouseClicked(evt);
            }
        });

        jP2.setEditable(false);
        jP2.setBackground(new java.awt.Color(255, 153, 0));
        jP2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jP2.setForeground(new java.awt.Color(255, 255, 255));
        jP2.setText(" Balanceo ");
        jP2.setBorder(null);
        jP2.setSelectionColor(new java.awt.Color(255, 153, 0));
        jP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPSubMenuOrdenConfeccionLayout = new javax.swing.GroupLayout(jPSubMenuOrdenConfeccion);
        jPSubMenuOrdenConfeccion.setLayout(jPSubMenuOrdenConfeccionLayout);
        jPSubMenuOrdenConfeccionLayout.setHorizontalGroup(
            jPSubMenuOrdenConfeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSubMenuOrdenConfeccionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPSubMenuOrdenConfeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPNuevaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPSubMenuOrdenConfeccionLayout.setVerticalGroup(
            jPSubMenuOrdenConfeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSubMenuOrdenConfeccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPNuevaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPSubMenuPlanillaD.setBackground(new java.awt.Color(255, 153, 0));

        jPAsistencia.setEditable(false);
        jPAsistencia.setBackground(new java.awt.Color(255, 153, 0));
        jPAsistencia.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        jPAsistencia.setText(" Asistencia ");
        jPAsistencia.setBorder(null);
        jPAsistencia.setSelectionColor(new java.awt.Color(255, 153, 0));
        jPAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPAsistenciaMouseClicked(evt);
            }
        });

        jPPlanilladiaria.setEditable(false);
        jPPlanilladiaria.setBackground(new java.awt.Color(255, 153, 0));
        jPPlanilladiaria.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPPlanilladiaria.setForeground(new java.awt.Color(255, 255, 255));
        jPPlanilladiaria.setText(" Planilla Diaria Individual ");
        jPPlanilladiaria.setBorder(null);
        jPPlanilladiaria.setSelectionColor(new java.awt.Color(255, 153, 0));
        jPPlanilladiaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPPlanilladiariaMouseClicked(evt);
            }
        });

        jPReportedeTiemposMuertos.setEditable(false);
        jPReportedeTiemposMuertos.setBackground(new java.awt.Color(255, 153, 0));
        jPReportedeTiemposMuertos.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPReportedeTiemposMuertos.setForeground(new java.awt.Color(255, 255, 255));
        jPReportedeTiemposMuertos.setText(" Reporte de Tiempos Muertos ");
        jPReportedeTiemposMuertos.setBorder(null);
        jPReportedeTiemposMuertos.setSelectionColor(new java.awt.Color(255, 153, 0));
        jPReportedeTiemposMuertos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPReportedeTiemposMuertosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPSubMenuPlanillaDLayout = new javax.swing.GroupLayout(jPSubMenuPlanillaD);
        jPSubMenuPlanillaD.setLayout(jPSubMenuPlanillaDLayout);
        jPSubMenuPlanillaDLayout.setHorizontalGroup(
            jPSubMenuPlanillaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSubMenuPlanillaDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPSubMenuPlanillaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPPlanilladiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSubMenuPlanillaDLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPReportedeTiemposMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPSubMenuPlanillaDLayout.setVerticalGroup(
            jPSubMenuPlanillaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSubMenuPlanillaDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPPlanilladiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPReportedeTiemposMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTexGestiondeCalidad.setEditable(false);
        jTexGestiondeCalidad.setBackground(new java.awt.Color(255, 102, 0));
        jTexGestiondeCalidad.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexGestiondeCalidad.setForeground(new java.awt.Color(255, 255, 255));
        jTexGestiondeCalidad.setText(" Gestion de Calidad ");
        jTexGestiondeCalidad.setBorder(null);
        jTexGestiondeCalidad.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexGestiondeCalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexGestiondeCalidadMouseClicked(evt);
            }
        });

        jTextOpeAprendiz.setEditable(false);
        jTextOpeAprendiz.setBackground(new java.awt.Color(255, 102, 0));
        jTextOpeAprendiz.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextOpeAprendiz.setForeground(new java.awt.Color(255, 255, 255));
        jTextOpeAprendiz.setText(" Gestion  Operario Aprendiz ");
        jTextOpeAprendiz.setBorder(null);
        jTextOpeAprendiz.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTextOpeAprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextOpeAprendizMouseClicked(evt);
            }
        });

        jPPlanilladeProduccionDiaria.setEditable(false);
        jPPlanilladeProduccionDiaria.setBackground(new java.awt.Color(255, 102, 0));
        jPPlanilladeProduccionDiaria.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPPlanilladeProduccionDiaria.setForeground(new java.awt.Color(255, 255, 255));
        jPPlanilladeProduccionDiaria.setText(" Planilla de Produccion Diaria ");
        jPPlanilladeProduccionDiaria.setBorder(null);
        jPPlanilladeProduccionDiaria.setSelectionColor(new java.awt.Color(255, 102, 0));
        jPPlanilladeProduccionDiaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPPlanilladeProduccionDiariaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTexGestionOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPSubMenuPlanillaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPSubMenuOrdenConfeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexOrdendeConfeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextOpeAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexGestiondeCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexHistoricoAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPPlanilladeProduccionDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(457, 457, 457)
                                .addComponent(jTexPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTexCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTexGestionOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPPlanilladeProduccionDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPSubMenuPlanillaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTexOrdendeConfeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPSubMenuOrdenConfeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextOpeAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTexGestiondeCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTexHistoricoAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jTexPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexPerfilMouseClicked
       this.Contenedor.removeTabAt(0x00);
       jPSubMenuPlanillaD.setVisible(false);
       jPSubMenuOrdenConfeccion.setVisible(false);
       Pagina3_PerfilUsuario obje = new Pagina3_PerfilUsuario(this.admin);
       this.Contenedor.add("Perfil", obje);
       
    }//GEN-LAST:event_jTexPerfilMouseClicked
    private void jTexCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexCerrarSesionMouseClicked
        this.dispose();
        Pagina1_Inicio obje = new Pagina1_Inicio();
        obje.setVisible(true);
    }//GEN-LAST:event_jTexCerrarSesionMouseClicked
    private void jTexGestionOperacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexGestionOperacionesMouseClicked
        this.Contenedor.removeTabAt(0x00);
         jPSubMenuPlanillaD.setVisible(false);
         jPSubMenuOrdenConfeccion.setVisible(false);
        Pagina4_GestionOpera obje = new Pagina4_GestionOpera();
        this.Contenedor.add("Gestion de Operaciones", obje);
    }//GEN-LAST:event_jTexGestionOperacionesMouseClicked
    private void jTextOpeAprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextOpeAprendizMouseClicked
        this.Contenedor.removeTabAt(0x00);
         jPSubMenuPlanillaD.setVisible(false);
         jPSubMenuOrdenConfeccion.setVisible(false);
        Pagina11_OperarioAprendiz obje = new Pagina11_OperarioAprendiz();
        this.Contenedor.add("Operario Aprendiz", obje);
    }//GEN-LAST:event_jTextOpeAprendizMouseClicked
    private void jTexGestiondeCalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexGestiondeCalidadMouseClicked
        this.Contenedor.removeTabAt(0x00);
         jPSubMenuPlanillaD.setVisible(false);
         jPSubMenuOrdenConfeccion.setVisible(false);
        Pagina10_GestiondeCalidad obje = new Pagina10_GestiondeCalidad();
        this.Contenedor.add("Gestion de Calidad", obje);
    }//GEN-LAST:event_jTexGestiondeCalidadMouseClicked
    private void jTexHistoricoAprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexHistoricoAprendizMouseClicked
       this.Contenedor.removeTabAt(0x00);
        jPSubMenuPlanillaD.setVisible(false);
        jPSubMenuOrdenConfeccion.setVisible(false);
       Pagina12_HistoricoAprendiz obje = new Pagina12_HistoricoAprendiz();
       this.Contenedor.add("Historico Aprendiz", obje);
    }//GEN-LAST:event_jTexHistoricoAprendizMouseClicked
    private void jPPlanilladeProduccionDiariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPlanilladeProduccionDiariaMouseClicked
       jPSubMenuPlanillaD.setVisible(true);
       jPSubMenuOrdenConfeccion.setVisible(false);
    }//GEN-LAST:event_jPPlanilladeProduccionDiariaMouseClicked
    private void jTexOrdendeConfeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOrdendeConfeccionMouseClicked
      jPSubMenuOrdenConfeccion.setVisible(true);
      jPSubMenuPlanillaD.setVisible(false);
    }//GEN-LAST:event_jTexOrdendeConfeccionMouseClicked
//Sub Menu de Planilla Diaria Individual - Orden de Confeccion
    private void jPAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAsistenciaMouseClicked
      this.Contenedor.removeTabAt(0x00);
      Pagina5_Asistencia obje = new Pagina5_Asistencia();
      this.Contenedor.add("Asistencia", obje);
    }//GEN-LAST:event_jPAsistenciaMouseClicked
    private void jPPlanilladiariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPlanilladiariaMouseClicked
      this.Contenedor.removeTabAt(0x00);
      Pagina6_PlanillaIndivid obje = new Pagina6_PlanillaIndivid();
      this.Contenedor.add("Planilla Diaria Individual", obje);
    }//GEN-LAST:event_jPPlanilladiariaMouseClicked
    private void jPReportedeTiemposMuertosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPReportedeTiemposMuertosMouseClicked
       this.Contenedor.removeTabAt(0x00);
       Pagina7_ReporteTiempoM obje = new Pagina7_ReporteTiempoM();
       this.Contenedor.add("", obje);
   
    }//GEN-LAST:event_jPReportedeTiemposMuertosMouseClicked
    private void jPNuevaOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPNuevaOrdenMouseClicked
       this.Contenedor.removeTabAt(0x00);
       Pagina8_IngresoConsultaOrden obje = new Pagina8_IngresoConsultaOrden();
       this.Contenedor.add("Nueva Orden",obje);
       
    }//GEN-LAST:event_jPNuevaOrdenMouseClicked
    private void jP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2MouseClicked
        this.Contenedor.removeTabAt(0x00);
        Pagina9_Balanceo obje = new Pagina9_Balanceo();
        this.Contenedor.add("Balanceo", obje);
    }//GEN-LAST:event_jP2MouseClicked
      private boolean admin;                                             
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jP2;
    private javax.swing.JTextField jPAsistencia;
    private javax.swing.JTextField jPNuevaOrden;
    private javax.swing.JTextField jPPlanilladeProduccionDiaria;
    private javax.swing.JTextField jPPlanilladiaria;
    private javax.swing.JTextField jPReportedeTiemposMuertos;
    private javax.swing.JPanel jPSubMenuOrdenConfeccion;
    private javax.swing.JPanel jPSubMenuPlanillaD;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTexCerrarSesion;
    private javax.swing.JTextField jTexGestionOperaciones;
    private javax.swing.JTextField jTexGestiondeCalidad;
    private javax.swing.JTextField jTexHistoricoAprendiz;
    private javax.swing.JTextField jTexOrdendeConfeccion;
    private javax.swing.JTextField jTexPerfil;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextOpeAprendiz;
    // End of variables declaration//GEN-END:variables
}
