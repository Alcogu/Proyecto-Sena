package prototipo2;

import BadeDatos.ConexionMySQL;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pagina3_PerfilUsuario extends javax.swing.JPanel {

    DefaultTableModel modelo;

    public Pagina3_PerfilUsuario(boolean admin) {
        initComponents();
        CargarTablaUsuarios("");
        jPConsultarUsuario.setVisible(false);
        jPRegistrousuario.setVisible(false);
        this.admin = admin;
        if (this.admin) {
            jTexAdministrarUsuarios.setVisible(true);
        } else {
            jTexAdministrarUsuarios.setVisible(false);
        }
    }

    void CargarTablaUsuarios(String valor) {
        String[] Titulos = {"ID Usuario", "Primer Nombre", "Segundo Nombre", "Primer Apellido", "Segundo Apellido", "Contraseña", "Correo", "Tipo de Usuario"};
        String[] registro = new String[8];
        modelo = new DefaultTableModel(null, Titulos);
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();
        String sSQL = "SELECT * FROM usuarios WHERE CONCAT(Primer_Nombre,'',Segundo_Nombre,'',Primer_Apellido,'',Segundo_Apellido)  LIKE '%" + valor + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("ID_Usuario");
                registro[1] = rs.getString("Primer_Nombre");
                registro[2] = rs.getString("Segundo_Nombre");
                registro[3] = rs.getString("Primer_Apellido");
                registro[4] = rs.getString("Segundo_Apellido");
                registro[5] = rs.getString("Contrasena");
                registro[6] = rs.getString("Correo");
                registro[7] = rs.getString("Tipo_Usuario");
                modelo.addRow(registro);
            }
            ConsultarUsuarios.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    String id_actualizar = "";

    void BuscarEmpleadoEditar(String ID) {
        String sql = "SELECT * FROM usuarios where ID_Usuario = " + ID;
        String id = "", nom1 = "", nom2 = "", ap1 = "", ap2 = "", cont1 = "", corre = "", tipousu;
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                id = rs.getString("ID_Usuario");
                nom1 = rs.getString("Primer_Nombre");
                nom2 = rs.getString("Segundo_Nombre");
                ap1 = rs.getString("Primer_Apellido");
                ap2 = rs.getString("Segundo_Apellido");
                cont1 = rs.getString("Contrasena");
                corre = rs.getString("Correo");
                tipousu = rs.getString("Tipo_Usuario");

            }
            this.jTexId.setText(id);
            this.jTexPrimerNombre.setText(nom1);
            this.jTexSegundoNombre.setText(nom2);
            this.jTexPrimerAPellido.setText(ap1);
            this.jTexSegundoApellido.setText(ap2);
            this.Contraseña.setText(cont1);
            this.RepetirContraseña.setText(cont1);
            this.jTexCorreoElect.setText(corre);
            id_actualizar = ID;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPerfilUsuario = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTexAdministrarUsuarios = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPConsultarUsuario = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ConsultarUsuarios = new javax.swing.JTable();
        jTexRegistroUsuario = new javax.swing.JTextField();
        jTexModificar = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTexConsultatabla = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jPRegistrousuario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RepetirContraseña = new javax.swing.JPasswordField();
        jTexCorreoElect = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTexGuardarUsuario = new javax.swing.JTextField();
        jTexCancelarRegistroUsuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        jTexSegundoNombre = new javax.swing.JTextField();
        jTexPrimerAPellido = new javax.swing.JTextField();
        jTexSegundoApellido = new javax.swing.JTextField();
        jTexPrimerNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTexId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 153, 0));

        jPPerfilUsuario.setBackground(new java.awt.Color(255, 153, 0));
        jPPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PerfilUsuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTexAdministrarUsuarios.setEditable(false);
        jTexAdministrarUsuarios.setBackground(new java.awt.Color(255, 102, 0));
        jTexAdministrarUsuarios.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexAdministrarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jTexAdministrarUsuarios.setText(" Administrar Usuarios ");
        jTexAdministrarUsuarios.setBorder(null);
        jTexAdministrarUsuarios.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexAdministrarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexAdministrarUsuariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPPerfilUsuarioLayout = new javax.swing.GroupLayout(jPPerfilUsuario);
        jPPerfilUsuario.setLayout(jPPerfilUsuarioLayout);
        jPPerfilUsuarioLayout.setHorizontalGroup(
            jPPerfilUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPerfilUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPerfilUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPerfilUsuarioLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jTexAdministrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPerfilUsuarioLayout.setVerticalGroup(
            jPPerfilUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPerfilUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPPerfilUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPerfilUsuarioLayout.createSequentialGroup()
                        .addComponent(jTexAdministrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        jPConsultarUsuario.setBackground(new java.awt.Color(255, 153, 0));
        jPConsultarUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPConsultarUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Consultar:");

        ConsultarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(ConsultarUsuarios);

        jTexRegistroUsuario.setEditable(false);
        jTexRegistroUsuario.setBackground(new java.awt.Color(255, 102, 0));
        jTexRegistroUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTexRegistroUsuario.setText(" Ingresar ");
        jTexRegistroUsuario.setBorder(null);
        jTexRegistroUsuario.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexRegistroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexRegistroUsuarioMouseClicked(evt);
            }
        });

        jTexModificar.setEditable(false);
        jTexModificar.setBackground(new java.awt.Color(255, 102, 0));
        jTexModificar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexModificar.setForeground(new java.awt.Color(255, 255, 255));
        jTexModificar.setText(" Modificar ");
        jTexModificar.setBorder(null);
        jTexModificar.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexModificarMouseClicked(evt);
            }
        });

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(255, 102, 0));
        jTextField27.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(255, 255, 255));
        jTextField27.setText(" Generar Reporte ");
        jTextField27.setBorder(null);
        jTextField27.setSelectionColor(new java.awt.Color(255, 102, 0));

        jTextField28.setEditable(false);
        jTextField28.setBackground(new java.awt.Color(255, 102, 0));
        jTextField28.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(255, 255, 255));
        jTextField28.setText("  Atras ");
        jTextField28.setBorder(null);
        jTextField28.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTextField28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField28MouseClicked(evt);
            }
        });

        jTexConsultatabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexConsultatablaKeyReleased(evt);
            }
        });

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(255, 102, 0));
        jTextField24.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(255, 255, 255));
        jTextField24.setText(" Eliminar ");
        jTextField24.setBorder(null);
        jTextField24.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPConsultarUsuarioLayout = new javax.swing.GroupLayout(jPConsultarUsuario);
        jPConsultarUsuario.setLayout(jPConsultarUsuarioLayout);
        jPConsultarUsuarioLayout.setHorizontalGroup(
            jPConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultarUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTexConsultatabla, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsultarUsuarioLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTexModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTexRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConsultarUsuarioLayout.setVerticalGroup(
            jPConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultarUsuarioLayout.createSequentialGroup()
                .addGroup(jPConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTexConsultatabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPRegistrousuario.setBackground(new java.awt.Color(255, 153, 0));
        jPRegistrousuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Nombres:");

        RepetirContraseña.setText("jPasswordField2");
        RepetirContraseña.setToolTipText("Repetir Contraseña");
        RepetirContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepetirContraseñaActionPerformed(evt);
            }
        });

        jTexCorreoElect.setToolTipText("E-Mail");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Correo Electronico:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Repetir contraseña:");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Contraseña:");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Apellidos:");

        jTexGuardarUsuario.setEditable(false);
        jTexGuardarUsuario.setBackground(new java.awt.Color(255, 102, 0));
        jTexGuardarUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexGuardarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTexGuardarUsuario.setText(" Guardar ");
        jTexGuardarUsuario.setBorder(null);
        jTexGuardarUsuario.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexGuardarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexGuardarUsuarioMouseClicked(evt);
            }
        });

        jTexCancelarRegistroUsuario.setEditable(false);
        jTexCancelarRegistroUsuario.setBackground(new java.awt.Color(255, 102, 0));
        jTexCancelarRegistroUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexCancelarRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTexCancelarRegistroUsuario.setText(" Cancelar ");
        jTexCancelarRegistroUsuario.setBorder(null);
        jTexCancelarRegistroUsuario.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexCancelarRegistroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexCancelarRegistroUsuarioMouseClicked(evt);
            }
        });

        Contraseña.setText("jPasswordField2");
        Contraseña.setToolTipText("Contraseña");
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });

        jTexSegundoNombre.setText(" ");
        jTexSegundoNombre.setToolTipText("Segundo Nombre");
        jTexSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexSegundoNombreActionPerformed(evt);
            }
        });

        jTexPrimerAPellido.setToolTipText("Primer Apellido");
        jTexPrimerAPellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexPrimerAPellidoActionPerformed(evt);
            }
        });

        jTexSegundoApellido.setText(" ");
        jTexSegundoApellido.setToolTipText("Segundo Apellido");
        jTexSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexSegundoApellidoActionPerformed(evt);
            }
        });

        jTexPrimerNombre.setText(" ");
        jTexPrimerNombre.setToolTipText("Primer Nombre");
        jTexPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexPrimerNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Documento: ");

        jTexId.setText(" ");
        jTexId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPRegistrousuarioLayout = new javax.swing.GroupLayout(jPRegistrousuario);
        jPRegistrousuario.setLayout(jPRegistrousuarioLayout);
        jPRegistrousuarioLayout.setHorizontalGroup(
            jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrousuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistrousuarioLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTexCorreoElect, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistrousuarioLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistrousuarioLayout.createSequentialGroup()
                        .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistrousuarioLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistrousuarioLayout.createSequentialGroup()
                                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTexPrimerAPellido, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jTexPrimerNombre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistrousuarioLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTexId)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTexSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPRegistrousuarioLayout.createSequentialGroup()
                        .addComponent(jTexGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTexCancelarRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPRegistrousuarioLayout.setVerticalGroup(
            jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrousuarioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTexId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTexSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexPrimerAPellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(RepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTexCorreoElect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegistrousuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexCancelarRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPRegistrousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPRegistrousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTexRegistroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexRegistroUsuarioMouseClicked
        this.jPRegistrousuario.setVisible(true);
        this.jPConsultarUsuario.setVisible(false);
        this.jPPerfilUsuario.setVisible(false);
        this.jTexId.setEnabled(true);

        this.jTexId.setText("");
        this.jTexPrimerNombre.setText("");
        this.jTexSegundoNombre.setText("");
        this.jTexPrimerAPellido.setText("");
        this.jTexSegundoApellido.setText("");
        this.Contraseña.setText("");
        this.RepetirContraseña.setText("");
        this.jTexCorreoElect.setText("");
        accion = "Insertar";
    }//GEN-LAST:event_jTexRegistroUsuarioMouseClicked
    private void jTexCancelarRegistroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexCancelarRegistroUsuarioMouseClicked
        this.jPRegistrousuario.setVisible(false);
        this.jPConsultarUsuario.setVisible(true);
        this.jPPerfilUsuario.setVisible(false);
    }//GEN-LAST:event_jTexCancelarRegistroUsuarioMouseClicked
    private void jTextField28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseClicked
        this.jPRegistrousuario.setVisible(false);
        this.jPConsultarUsuario.setVisible(false);
        this.jPPerfilUsuario.setVisible(true);
    }//GEN-LAST:event_jTextField28MouseClicked
    private void jTexAdministrarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexAdministrarUsuariosMouseClicked
        this.jPRegistrousuario.setVisible(false);
        this.jPConsultarUsuario.setVisible(true);
        this.jPPerfilUsuario.setVisible(false);
    }//GEN-LAST:event_jTexAdministrarUsuariosMouseClicked
    //Trasferencia de Cursor
    private void jTexPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexPrimerNombreActionPerformed
        this.jTexPrimerNombre.transferFocus();
    }//GEN-LAST:event_jTexPrimerNombreActionPerformed
    private void jTexSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexSegundoNombreActionPerformed
        this.jTexSegundoNombre.transferFocus();
    }//GEN-LAST:event_jTexSegundoNombreActionPerformed
    private void jTexPrimerAPellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexPrimerAPellidoActionPerformed
        this.jTexPrimerAPellido.transferFocus();
    }//GEN-LAST:event_jTexPrimerAPellidoActionPerformed
    private void jTexSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexSegundoApellidoActionPerformed
        this.jTexSegundoApellido.transferFocus();
    }//GEN-LAST:event_jTexSegundoApellidoActionPerformed
    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        this.Contraseña.transferFocus();
    }//GEN-LAST:event_ContraseñaActionPerformed
    private void RepetirContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepetirContraseñaActionPerformed
        this.RepetirContraseña.transferFocus();
    }//GEN-LAST:event_RepetirContraseñaActionPerformed
    String accion = "";
    String mensaje = "";
    private void jTexGuardarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexGuardarUsuarioMouseClicked
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();
        String sSQL = "";
        String id, nom1, nom2, ap1, ap2, cont1, cont2, corre, tipousu;
        id = jTexId.getText();
        nom1 = jTexPrimerNombre.getText();
        nom2 = jTexSegundoNombre.getText();
        ap1 = jTexPrimerAPellido.getText();
        ap2 = jTexSegundoApellido.getText();
        cont1 = Contraseña.getText();
        cont2 = RepetirContraseña.getText();
        corre = jTexCorreoElect.getText();
        tipousu = "Instructor";


        char[] contra = this.Contraseña.getPassword();
        char[] contra2 = this.RepetirContraseña.getPassword();
        if (Arrays.equals(contra, contra2)) {
            if (accion.equals("Insertar")) {
                sSQL = "INSERT INTO usuarios(ID_Usuario,Primer_Nombre,Segundo_Nombre,"
                        + "Primer_Apellido,Segundo_Apellido,Contrasena,Correo,Tipo_Usuario )"
                        + "values (?,?,?,?,?,?,?,?)";
                mensaje = "Se ha guardado correctamente";
            } else {
                if (accion.equals("Modificar")) {

                    sSQL = "UPDATE usuarios SET ID_Usuario = ? , "
                            + "Primer_Nombre = ? , "
                            + "Segundo_Nombre = ? , "
                            + "Primer_Apellido = ? , "
                            + "Segundo_Apellido = ? , "
                            + "Contrasena = ? , "
                            + "Correo = ? ,"
                            + "Tipo_Usuario = ? "
                            + "WHERE ID_Usuario = '" + id_actualizar + "'";
                    mensaje = "Se ha modificado correctamente";

                }
            }
            try {
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.setString(1, id);
                pst.setString(2, nom1);
                pst.setString(3, nom2);
                pst.setString(4, ap1);
                pst.setString(5, ap2);
                pst.setString(6, cont1);
                pst.setString(7, corre);
                pst.setString(8, tipousu);
                int n = pst.executeUpdate();
                if (n > 0) {

                    JOptionPane.showMessageDialog(null, mensaje);
                    CargarTablaUsuarios("");
                    this.jPConsultarUsuario.setVisible(true);
                    this.jPRegistrousuario.setVisible(false);
                    this.jPPerfilUsuario.setVisible(false);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);


            }

        } else {
            JOptionPane.showMessageDialog(null, "Las Contraseñas no son iguales");
        }
    }//GEN-LAST:event_jTexGuardarUsuarioMouseClicked

    private void jTexIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexIdActionPerformed
        this.jTexId.transferFocus();
    }//GEN-LAST:event_jTexIdActionPerformed

    private void jTexConsultatablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexConsultatablaKeyReleased
        CargarTablaUsuarios(jTexConsultatabla.getText());
    }//GEN-LAST:event_jTexConsultatablaKeyReleased

    private void jTexModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexModificarMouseClicked
        int filasel;
        String ID;
        try {
            filasel = this.ConsultarUsuarios.getSelectedRow();
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "No se ha Seleccionado ninguna Fila");
            } else {
                accion = "Modificar";
                modelo = (DefaultTableModel) ConsultarUsuarios.getModel();
                ID = (String) modelo.getValueAt(filasel, 0);
                BuscarEmpleadoEditar(ID);
                this.jPRegistrousuario.setVisible(true);
                this.jPConsultarUsuario.setVisible(false);
                this.jPPerfilUsuario.setVisible(false);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jTexModificarMouseClicked

    private void jTextField24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseClicked
        int filasel;
        String Nombre;
        filasel = this.ConsultarUsuarios.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione la Fila Deseada ");
        } else {
            modelo = (DefaultTableModel) this.ConsultarUsuarios.getModel();
            Nombre = (String) this.modelo.getValueAt(filasel, 0);

            int conf = JOptionPane.showConfirmDialog(null, "Esta seguro de Eliminar a " + Nombre);
            if (conf == 0) {
                ConexionMySQL mysql = new ConexionMySQL();
                Connection cn = mysql.Conectar();
                String sSQL = "DELETE  from usuarios WHERE ID_Usuario='" + Nombre + "'";
                try {
                    PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sSQL);
                    int n = pst.executeUpdate();
                    if (n > 0) {
                        JOptionPane.showMessageDialog(null, "Datos Eliminados");
                        CargarTablaUsuarios("");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTextField24MouseClicked
    private boolean admin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ConsultarUsuarios;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JPasswordField RepetirContraseña;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPConsultarUsuario;
    private javax.swing.JPanel jPPerfilUsuario;
    private javax.swing.JPanel jPRegistrousuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTexAdministrarUsuarios;
    private javax.swing.JTextField jTexCancelarRegistroUsuario;
    private javax.swing.JTextField jTexConsultatabla;
    private javax.swing.JTextField jTexCorreoElect;
    private javax.swing.JTextField jTexGuardarUsuario;
    private javax.swing.JTextField jTexId;
    private javax.swing.JTextField jTexModificar;
    private javax.swing.JTextField jTexPrimerAPellido;
    private javax.swing.JTextField jTexPrimerNombre;
    private javax.swing.JTextField jTexRegistroUsuario;
    private javax.swing.JTextField jTexSegundoApellido;
    private javax.swing.JTextField jTexSegundoNombre;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    // End of variables declaration//GEN-END:variables
}
