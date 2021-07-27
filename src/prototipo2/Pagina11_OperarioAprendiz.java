package prototipo2;
import BadeDatos.ConexionMySQL;
import java.awt.Dialog;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Pagina11_OperarioAprendiz extends javax.swing.JPanel {
     DefaultTableModel modelo;
    public Pagina11_OperarioAprendiz() {
        initComponents();
        this.jPRegistroGrupo.setVisible(false);
        this.jPRegistroOperarioAprend.setVisible(false);
        this.jtxtidcurso.setVisible(false);
        this.jtxtidusuario.setVisible(false);
        jcmbjornada.addItem("Mañana");
        jcmbjornada.addItem("Tarde");
        jcmbtipodocu.addItem("C.C");
        jcmbtipodocu.addItem("T.I");
        jtxtmodificarficha.setVisible(false);
        listar_jcmbcurso();
        listar_jcmbusuarios();
        cargarTablafichas("");
        cargarTablaAprendices("");
        
           }
  
     public  void listar_jcmbcurso(){
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String n="";
        String sSQL="";
        sSQL="select Nom_Programa from programa";
        try {
               Statement st= cn.createStatement();
               ResultSet rs= st.executeQuery(sSQL);
       while(rs.next()){
               n=rs.getString("Nom_Programa");
               jcmbcurso.addItem(n);
               }
                     
           } catch (SQLException ex)
           {
               JOptionPane.showMessageDialog(null, ex);
           }
       }
      public void insertaidjcmbcurso() {
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String sSQL="";
       String pt=(String)jcmbcurso.getSelectedItem();
       sSQL="select ID_Programa from programa where Nom_Programa=?";
       try {
               PreparedStatement ps= cn.prepareStatement(sSQL);
               ps.setString(1, pt);
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                  String add=rs.getString("ID_Programa");
                  jtxtidcurso.setText(add);
               }
           }
            catch (SQLException ex)
             {
               JOptionPane.showMessageDialog(null, ex);
             
             }
       }
      
      public void listar_jcmbusuarios(){
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String n="";
       String sSQL="";
       sSQL="select concat(Primer_Nombre,' ', Primer_Apellido, ' ',"
                + " Segundo_Apellido) as Nombres from usuarios ";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ResultSet rs=ps.executeQuery();
               while(rs.next()){
               n=rs.getString("Nombres");
                jcmbusuario.addItem(n);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
         }
      
       public void insertaidjcmbusuario() {
       ConexionMySQL mysql = new ConexionMySQL();
       Connection cn = mysql.Conectar();
       String sSQL="";
       String pt=(String)jcmbusuario.getSelectedItem();
       sSQL="select * from usuarios where concat(Primer_Nombre,' ',Primer_Apellido,' ',Segundo_Apellido)=?";
       try {
               PreparedStatement ps= cn.prepareStatement(sSQL);
               ps.setString(1, pt);
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                  String add=rs.getString("ID_Usuario");
                  jtxtidusuario.setText(add);
               }
           }
            catch (SQLException ex)
             {
               JOptionPane.showMessageDialog(null, ex);
             
             }
       }
    void cargarTablafichas(String valor) {
     String[] titulos = {"Ficha","Fecha Inicial", "Fecha Final", "Jornada", "Titulacion", "Jf Grupo"};
     String[] registros = new String[6];
     String sSQL= "";
     modelo = new DefaultTableModel(null, titulos);
     ConexionMySQL mysql = new ConexionMySQL();
     Connection cn = mysql.Conectar();
     sSQL="SELECT  fichas.ID_Ficha, fichas.Fecha_Inicio, fichas.Fecha_Final,fichas.Jornada, programa.Nom_Programa,usuarios.ID_Usuario"
             + " FROM fichas, programa, usuarios WHERE fichas.ID_Usuario = usuarios.ID_Usuario "
             + " AND fichas.ID_Programa = programa.ID_Programa AND CONCAT(ID_Ficha,'',Jornada,'',Nom_Programa)LIKE '%"+valor+"%'";
           
     try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           
           while(rs.next())
               {
               registros[0] = rs.getString("ID_Ficha");
               registros[1] = rs.getString("Fecha_Inicio");
               registros[2] = rs.getString("Fecha_Final");
               registros[3] = rs.getString("Jornada");
               registros[4] = rs.getString("Nom_Programa");
               registros[5] = rs.getString("ID_Usuario");
               modelo.addRow(registros);
               
              }
           jtblfichas.setModel(modelo);
             }
     catch (SQLException ex)
     {
           JOptionPane.showMessageDialog(null, ex);
     }
   }
    
    void cargarTablaAprendices(String valor) {
        String[] titulos = {"Documento","Tipo","Nombre", "Pellido", "Direccion", "Telefono"};
     String[] registros = new String[6];
     String sSQL= "";
     modelo = new DefaultTableModel(null, titulos);
     ConexionMySQL mysql = new ConexionMySQL();
     Connection cn = mysql.Conectar();
     sSQL="SELECT  ID_Aprendiz, Tipo, Primer_Nombre, Primer_Apellido, Direccion,Telefono "
             + " FROM aprendiz WHERE ID_Ficha in (SELECT ID_Ficha from fichas where ID_Ficha='"+valor+"') ";
           
     try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           
           while(rs.next())
               {
               registros[0] = rs.getString("ID_Aprendiz");
               registros[1] = rs.getString("Tipo");
               registros[2] = rs.getString("Primer_Nombre");
               registros[3] = rs.getString("Primer_APellido");
               registros[4] = rs.getString("Direccion");
               registros[5] = rs.getString("Telefono");
               
               modelo.addRow(registros);
               
              }
           jtblaprendices.setModel(modelo);
             }
     catch (SQLException ex)
     {
           JOptionPane.showMessageDialog(null, ex);
     }
   }
     
    
    public void limpiar(){
        jtxtidoperario.setText("");
        jtxtpnombre.setText("");
        jtxtsnombre.setText("");
        jtxtpapellido.setText("");
        jtxtsapellido.setText("");
        jtxtfechanac.setText("");
        jtxtdirecc.setText("");
        jtxtcorreo.setText("");
        jtxtcel.setText("");
    }
    
    
    String id_fichas ="";
    void BuscarFichasEditar(String ID){
        String sSQL = "SELECT * FROM fichas where ID_Ficha = " +ID;
         String  fechaini="", fechafin="", ficha="", idusu="", idprogra=""; 
          ConexionMySQL mysql = new ConexionMySQL();
          Connection cn = mysql.Conectar();
         try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
            ficha=rs.getString("ID_Ficha");
            fechaini =rs.getString("Fecha_Inicio");   
            fechafin= rs.getString("Fecha_Final");
            idusu= rs.getString("ID_Usuario");
            idprogra=rs.getString("ID_Programa");
            
            }
             this.jtxtficha.setText(ficha);
             this.jtxtfechainicio.setText(fechaini);
             this.jtxtfechafinal.setText(fechafin);
             this.jtxtidusuario.setText(idusu);
             this.jtxtidcurso.setText(idprogra);
             this.jtxtficha.setEnabled(false);
              id_fichas=ID;  
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex) ;
        }
     }
    String id_operario="";
      void BuscarAprendizEditar(String ID){
        String sSQL = "SELECT * FROM aprendiz where ID_Aprendiz = " +ID;
          String id="", pnombre="",snombre="",papellido="",sapellido="",fechanac="",dire="",corre="",tel="",idfi="";
          ConexionMySQL mysql = new ConexionMySQL();
          Connection cn = mysql.Conectar();
         try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
            id =rs.getString("ID_Aprendiz");   
            pnombre= rs.getString("Primer_Nombre");
            snombre=rs.getString("Segundo_Nombre");
            papellido=rs.getString("Primer_Apellido");
            sapellido=rs.getString("Segundo_Apellido");
            fechanac=rs.getString("Fecha_Nac");
            dire=rs.getString("Direccion");
            corre=rs.getString("Correo");
            tel=rs.getString("Telefono");            
            }
             this.jtxtidoperario.setText(id);
             this.jtxtpnombre.setText(pnombre);
             this.jtxtsnombre.setText(snombre);
             this.jtxtpapellido.setText(papellido);
             this.jtxtsapellido.setText(sapellido);
             this.jtxtfechanac.setText(fechanac);
             this.jtxtdirecc.setText(dire);
             this.jtxtcorreo.setText(corre);
             this.jtxtcel.setText(tel);
             id_operario=ID;         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex) ;
        }
     }
      
      public void todo(String accion){
      ConexionMySQL mysql = new ConexionMySQL();
      Connection cn= mysql.Conectar();
      String sSQL="";
      String nombrecur, fechaini, fechafin, ficha, jornada, idusu;   
      ficha=jtxtficha.getText();
      fechaini=jtxtfechainicio.getText();
      fechafin=jtxtfechafinal.getText();
      jornada=jcmbjornada.getSelectedItem().toString();
      idusu=jtxtidusuario.getText();
      nombrecur=jtxtidcurso.getText();
      
      if (accion.equals("Insertar")){
      sSQL="Insert Into fichas(ID_Ficha, Fecha_Inicio, Fecha_Final, Jornada, ID_Usuario, ID_Programa)"
              + " Values(?,?,?,?,?,?)";
      mensaje="Se ha Guardado";
      }
       else{ if (accion.equals("Modificar")){
           sSQL = "UPDATE fichas SET ID_Ficha = ? , "
                   +"Fecha_Inicio = ? , "
                   +"Fecha_Final = ? , "
                   +"Jornada = ? , "
                   +"ID_Usuario= ? , "
                   +"ID_Programa = ?  "      
                   +"WHERE ID_Ficha= "+id_fichas+"";
                  mensaje="Se ha modificado correctamente";
           }
      }
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, ficha);
            pst.setString(2, fechaini);
            pst.setString(3, fechafin);
            pst.setString(4, jornada);
            pst.setString(5, idusu);
            pst.setString(6, nombrecur);
            int n = pst.executeUpdate();
            if(n > 0){
                JOptionPane.showMessageDialog(null, mensaje);
                 accion2="Insertar";
                 cargarTablaAprendices(jtxtficha.getText());
                 cargarTablafichas("");
                 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }   
      }
     
      public void limpiarfichas (){
          jtxtfechainicio.setText("");
          jtxtficha.setText("");
          jtxtfechafinal.setText("");
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPConsultaGrupo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtxtconsultarfichas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblfichas = new javax.swing.JTable();
        jtxtEliminarGrupo = new javax.swing.JTextField();
        jtxtmodificargrupo = new javax.swing.JTextField();
        jtxtNuevoGrupo = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPRegistroGrupo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblaprendices = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtficha = new javax.swing.JTextField();
        jtxtregistroaprendiz = new javax.swing.JTextField();
        jtxtfinalizaroperarioaprendiz = new javax.swing.JTextField();
        jtxtsalirregistro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtxtfechainicio = new javax.swing.JTextField();
        jtxtfechafinal = new javax.swing.JTextField();
        jtxtmodificaraprendiz = new javax.swing.JTextField();
        jcmbcurso = new javax.swing.JComboBox();
        jtxtidcurso = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jcmbjornada = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jcmbusuario = new javax.swing.JComboBox();
        jtxtidusuario = new javax.swing.JTextField();
        jtxteliminaraprendiz = new javax.swing.JTextField();
        jtxtmodificarficha = new javax.swing.JTextField();
        jPRegistroOperarioAprend = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtpnombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtsnombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxtfechanac = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jcmbtipodocu = new javax.swing.JComboBox();
        jtxtidoperario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtxtdirecc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxtcorreo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxtcel = new javax.swing.JTextField();
        jtxtxAñadirOperarioAprendiz = new javax.swing.JTextField();
        jtxtpapellido = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtxtsapellido = new javax.swing.JTextField();
        jTexCancelarRegistroOperario = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 153, 0));

        jPConsultaGrupo.setBackground(new java.awt.Color(255, 153, 0));
        jPConsultaGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Consultar:");

        jtxtconsultarfichas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtconsultarfichasKeyReleased(evt);
            }
        });

        jtblfichas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblfichas);

        jtxtEliminarGrupo.setEditable(false);
        jtxtEliminarGrupo.setBackground(new java.awt.Color(255, 102, 0));
        jtxtEliminarGrupo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtEliminarGrupo.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEliminarGrupo.setText(" Eliminar ");
        jtxtEliminarGrupo.setBorder(null);
        jtxtEliminarGrupo.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtEliminarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtEliminarGrupoMouseClicked(evt);
            }
        });

        jtxtmodificargrupo.setEditable(false);
        jtxtmodificargrupo.setBackground(new java.awt.Color(255, 102, 0));
        jtxtmodificargrupo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtmodificargrupo.setForeground(new java.awt.Color(255, 255, 255));
        jtxtmodificargrupo.setText(" Modificar ");
        jtxtmodificargrupo.setBorder(null);
        jtxtmodificargrupo.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtmodificargrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtmodificargrupoMouseClicked(evt);
            }
        });

        jtxtNuevoGrupo.setEditable(false);
        jtxtNuevoGrupo.setBackground(new java.awt.Color(255, 102, 0));
        jtxtNuevoGrupo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtNuevoGrupo.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNuevoGrupo.setText(" Nuevo Grupo ");
        jtxtNuevoGrupo.setBorder(null);
        jtxtNuevoGrupo.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtNuevoGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtNuevoGrupoMouseClicked(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 102, 0));
        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText(" Generar Reporte ");
        jTextField11.setBorder(null);
        jTextField11.setSelectionColor(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPConsultaGrupoLayout = new javax.swing.GroupLayout(jPConsultaGrupo);
        jPConsultaGrupo.setLayout(jPConsultaGrupoLayout);
        jPConsultaGrupoLayout.setHorizontalGroup(
            jPConsultaGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaGrupoLayout.createSequentialGroup()
                .addGroup(jPConsultaGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultaGrupoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtconsultarfichas, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsultaGrupoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtNuevoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtmodificargrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtEliminarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPConsultaGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConsultaGrupoLayout.setVerticalGroup(
            jPConsultaGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaGrupoLayout.createSequentialGroup()
                .addGroup(jPConsultaGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtconsultarfichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPConsultaGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNuevoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtEliminarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtmodificargrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Gestión Operario Aprendíz");

        jPRegistroGrupo.setBackground(new java.awt.Color(255, 153, 0));
        jPRegistroGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jtblaprendices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtblaprendices);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Nombre del Grupo: ");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Ficha del Grupo: ");

        jtxtregistroaprendiz.setEditable(false);
        jtxtregistroaprendiz.setBackground(new java.awt.Color(255, 102, 0));
        jtxtregistroaprendiz.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtregistroaprendiz.setForeground(new java.awt.Color(255, 255, 255));
        jtxtregistroaprendiz.setText(" Ingresar Aprendiz ");
        jtxtregistroaprendiz.setBorder(null);
        jtxtregistroaprendiz.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtregistroaprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtregistroaprendizMouseClicked(evt);
            }
        });

        jtxtfinalizaroperarioaprendiz.setEditable(false);
        jtxtfinalizaroperarioaprendiz.setBackground(new java.awt.Color(255, 102, 0));
        jtxtfinalizaroperarioaprendiz.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtfinalizaroperarioaprendiz.setForeground(new java.awt.Color(255, 255, 255));
        jtxtfinalizaroperarioaprendiz.setText(" Finalizar ");
        jtxtfinalizaroperarioaprendiz.setBorder(null);
        jtxtfinalizaroperarioaprendiz.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtfinalizaroperarioaprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtfinalizaroperarioaprendizMouseClicked(evt);
            }
        });

        jtxtsalirregistro.setEditable(false);
        jtxtsalirregistro.setBackground(new java.awt.Color(255, 102, 0));
        jtxtsalirregistro.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtsalirregistro.setForeground(new java.awt.Color(255, 255, 255));
        jtxtsalirregistro.setText(" Finalizar ");
        jtxtsalirregistro.setBorder(null);
        jtxtsalirregistro.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtsalirregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtsalirregistroMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(" Fecha de inicio: ");

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" Fecha final: ");

        jtxtfechainicio.setText(" ");

        jtxtfechafinal.setText(" ");

        jtxtmodificaraprendiz.setEditable(false);
        jtxtmodificaraprendiz.setBackground(new java.awt.Color(255, 102, 0));
        jtxtmodificaraprendiz.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtmodificaraprendiz.setForeground(new java.awt.Color(255, 255, 255));
        jtxtmodificaraprendiz.setText(" Modificar Aprendiz ");
        jtxtmodificaraprendiz.setBorder(null);
        jtxtmodificaraprendiz.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtmodificaraprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtmodificaraprendizMouseClicked(evt);
            }
        });

        jcmbcurso.setBackground(new java.awt.Color(255, 102, 0));
        jcmbcurso.setEditable(true);
        jcmbcurso.setBorder(null);
        jcmbcurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcmbcurso.setFocusable(false);
        jcmbcurso.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmbcursoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(" Jornada: ");

        jcmbjornada.setBackground(new java.awt.Color(255, 102, 0));
        jcmbjornada.setEditable(true);
        jcmbjornada.setBorder(null);
        jcmbjornada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcmbjornada.setFocusable(false);
        jcmbjornada.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmbjornadaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText(" Jf. Grupo: ");

        jcmbusuario.setBackground(new java.awt.Color(255, 102, 0));
        jcmbusuario.setEditable(true);
        jcmbusuario.setBorder(null);
        jcmbusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcmbusuario.setFocusable(false);
        jcmbusuario.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmbusuarioPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jtxteliminaraprendiz.setEditable(false);
        jtxteliminaraprendiz.setBackground(new java.awt.Color(255, 102, 0));
        jtxteliminaraprendiz.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxteliminaraprendiz.setForeground(new java.awt.Color(255, 255, 255));
        jtxteliminaraprendiz.setText(" Eliminar Aprendiz ");
        jtxteliminaraprendiz.setBorder(null);
        jtxteliminaraprendiz.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxteliminaraprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxteliminaraprendizMouseClicked(evt);
            }
        });

        jtxtmodificarficha.setEditable(false);
        jtxtmodificarficha.setBackground(new java.awt.Color(255, 102, 0));
        jtxtmodificarficha.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtmodificarficha.setForeground(new java.awt.Color(255, 255, 255));
        jtxtmodificarficha.setText(" Ingresar Aprendiz ");
        jtxtmodificarficha.setBorder(null);
        jtxtmodificarficha.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtmodificarficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtmodificarfichaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroGrupoLayout = new javax.swing.GroupLayout(jPRegistroGrupo);
        jPRegistroGrupo.setLayout(jPRegistroGrupoLayout);
        jPRegistroGrupoLayout.setHorizontalGroup(
            jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                        .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistroGrupoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbcurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistroGrupoLayout.createSequentialGroup()
                                .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroGrupoLayout.createSequentialGroup()
                                        .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtmodificarficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtregistroaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                                        .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                                                .addComponent(jtxtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtxtficha, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                                                .addComponent(jtxtfechafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jcmbjornada, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtidcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                        .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                                .addComponent(jtxtmodificaraprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxteliminaraprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtfinalizaroperarioaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtsalirregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPRegistroGrupoLayout.setVerticalGroup(
            jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcmbcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtidcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jtxtficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtfechafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jcmbjornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jcmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPRegistroGrupoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtmodificarficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtregistroaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtfinalizaroperarioaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsalirregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtmodificaraprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxteliminaraprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPRegistroOperarioAprend.setBackground(new java.awt.Color(255, 153, 0));
        jPRegistroOperarioAprend.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Operario Aprendiz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Registro Aprendíz");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Primer Nombre: ");

        jtxtpnombre.setToolTipText("Primer Nombre");
        jtxtpnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpnombreActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" Segundo Nombre: ");

        jtxtsnombre.setToolTipText("Segundo Nombre");
        jtxtsnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsnombreActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Fecha de Nacimiento: ");

        jtxtfechanac.setToolTipText("Fecha de Nacimiento Año/Mes/Dia");
        jtxtfechanac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfechanacActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" Documento: ");

        jcmbtipodocu.setBackground(new java.awt.Color(255, 102, 0));
        jcmbtipodocu.setEditable(true);
        jcmbtipodocu.setBorder(null);
        jcmbtipodocu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcmbtipodocu.setFocusable(false);

        jtxtidoperario.setToolTipText("Documento de Identidad");
        jtxtidoperario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtidoperarioActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" Direccion: ");

        jtxtdirecc.setToolTipText("Direccion");
        jtxtdirecc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdireccActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" Correo Electronico: ");

        jtxtcorreo.setToolTipText("Correo Electronico");
        jtxtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcorreoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" Telefono / Celular: ");

        jtxtcel.setToolTipText("Telefono / Celular");

        jtxtxAñadirOperarioAprendiz.setEditable(false);
        jtxtxAñadirOperarioAprendiz.setBackground(new java.awt.Color(255, 102, 0));
        jtxtxAñadirOperarioAprendiz.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jtxtxAñadirOperarioAprendiz.setForeground(new java.awt.Color(255, 255, 255));
        jtxtxAñadirOperarioAprendiz.setText(" Añadir ");
        jtxtxAñadirOperarioAprendiz.setBorder(null);
        jtxtxAñadirOperarioAprendiz.setSelectionColor(new java.awt.Color(255, 102, 0));
        jtxtxAñadirOperarioAprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtxAñadirOperarioAprendizMouseClicked(evt);
            }
        });

        jtxtpapellido.setToolTipText("Primer Apellido");
        jtxtpapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpapellidoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" Primer Apellido: ");

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" Segundo Apellido: ");

        jtxtsapellido.setToolTipText("Segundo Apellido");
        jtxtsapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsapellidoActionPerformed(evt);
            }
        });

        jTexCancelarRegistroOperario.setEditable(false);
        jTexCancelarRegistroOperario.setBackground(new java.awt.Color(255, 102, 0));
        jTexCancelarRegistroOperario.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTexCancelarRegistroOperario.setForeground(new java.awt.Color(255, 255, 255));
        jTexCancelarRegistroOperario.setText(" Salir ");
        jTexCancelarRegistroOperario.setBorder(null);
        jTexCancelarRegistroOperario.setSelectionColor(new java.awt.Color(255, 102, 0));
        jTexCancelarRegistroOperario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexCancelarRegistroOperarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroOperarioAprendLayout = new javax.swing.GroupLayout(jPRegistroOperarioAprend);
        jPRegistroOperarioAprend.setLayout(jPRegistroOperarioAprendLayout);
        jPRegistroOperarioAprendLayout.setHorizontalGroup(
            jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroOperarioAprendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPRegistroOperarioAprendLayout.createSequentialGroup()
                            .addComponent(jtxtxAñadirOperarioAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTexCancelarRegistroOperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPRegistroOperarioAprendLayout.createSequentialGroup()
                            .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addGroup(jPRegistroOperarioAprendLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jcmbtipodocu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20))
                            .addGap(18, 18, 18)
                            .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtxtcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(jtxtdirecc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtidoperario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtfechanac, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtsapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtpapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtsnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtpnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtcel)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPRegistroOperarioAprendLayout.setVerticalGroup(
            jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroOperarioAprendLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtxtidoperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbtipodocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtpnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxtsnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtxtpapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jtxtsapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtxtfechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtxtdirecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtxtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroOperarioAprendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtxAñadirOperarioAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexCancelarRegistroOperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPRegistroOperarioAprend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jPConsultaGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPRegistroGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPConsultaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPRegistroGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPRegistroOperarioAprend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void jtxtNuevoGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtNuevoGrupoMouseClicked
        this.jPConsultaGrupo.setVisible(false);
        this.jPRegistroOperarioAprend.setVisible(false);
        this.jPRegistroGrupo.setVisible(true);
        this.jtxtfechafinal.setText("");
        this.jtxtficha.setText("");
        this.jtxtficha.setEnabled(true);
        cargarTablaAprendices(jtxtficha.getText());
        this.jtxtfinalizaroperarioaprendiz.setVisible(false);
        this.jtxtsalirregistro.setVisible(true);
        limpiarfichas();
         
        
    }//GEN-LAST:event_jtxtNuevoGrupoMouseClicked
    private void jtxtregistroaprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtregistroaprendizMouseClicked
    todo("Insertar");
    this.jPConsultaGrupo.setVisible(false);
    this.jPRegistroGrupo.setVisible(false);
    this.jPRegistroOperarioAprend.setVisible(true);
            
    }//GEN-LAST:event_jtxtregistroaprendizMouseClicked
    private void jtxtfinalizaroperarioaprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtfinalizaroperarioaprendizMouseClicked
   this.jPConsultaGrupo.setVisible(true);
   this.jPRegistroOperarioAprend.setVisible(false);
   this.jPRegistroGrupo.setVisible(false); 
   cargarTablafichas("");
   todo("Modificar");
    }//GEN-LAST:event_jtxtfinalizaroperarioaprendizMouseClicked
    private void jtxtpnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpnombreActionPerformed
        jtxtpnombre.transferFocus();
    }//GEN-LAST:event_jtxtpnombreActionPerformed
    private void jtxtsnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsnombreActionPerformed
        jtxtsnombre.transferFocus();
    }//GEN-LAST:event_jtxtsnombreActionPerformed
    private void jtxtfechanacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfechanacActionPerformed
        jtxtfechanac.transferFocus();
    }//GEN-LAST:event_jtxtfechanacActionPerformed
    private void jtxtpapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpapellidoActionPerformed
        jtxtpapellido.transferFocus();
    }//GEN-LAST:event_jtxtpapellidoActionPerformed
    private void jtxtsapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsapellidoActionPerformed
        jtxtsapellido.transferFocus();
    }//GEN-LAST:event_jtxtsapellidoActionPerformed
    private void jTexCancelarRegistroOperarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexCancelarRegistroOperarioMouseClicked
      this.jPConsultaGrupo.setVisible(false);
      this.jPRegistroGrupo.setVisible(true);
      this.jPRegistroOperarioAprend.setVisible(false);
    }//GEN-LAST:event_jTexCancelarRegistroOperarioMouseClicked
    private void jtxtidoperarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtidoperarioActionPerformed
     this.jtxtidoperario.transferFocus();
    }//GEN-LAST:event_jtxtidoperarioActionPerformed
    private void jtxtdireccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdireccActionPerformed
     this.jtxtdirecc.transferFocus();
    }//GEN-LAST:event_jtxtdireccActionPerformed
    private void jtxtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcorreoActionPerformed
     this.jtxtcorreo.transferFocus();
    }//GEN-LAST:event_jtxtcorreoActionPerformed

    private void jtxtsalirregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtsalirregistroMouseClicked
       this.jPConsultaGrupo.setVisible(true);
       this.jPRegistroOperarioAprend.setVisible(false);
       this.jPRegistroGrupo.setVisible(false);
       cargarTablafichas("");
       
    }//GEN-LAST:event_jtxtsalirregistroMouseClicked
    String mensaje="";
    String accion2="";
  
    private void jtxtxAñadirOperarioAprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtxAñadirOperarioAprendizMouseClicked
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();
         String sSQL=""; 
         String id, tipo, pnombre,snombre,papellido,sapellido,fechanac,dire,corre,tel,idfi;
         id=jtxtidoperario.getText();
         tipo=jcmbtipodocu.getSelectedItem().toString();
         pnombre=jtxtpnombre.getText();
         snombre=jtxtsnombre.getText();
         papellido=jtxtpapellido.getText();
         sapellido=jtxtsapellido.getText();
         fechanac=jtxtfechanac.getText();
         dire=jtxtdirecc.getText();
         corre=jtxtcorreo.getText();
         tel=jtxtcel.getText();
         idfi=jtxtficha.getText();
         if (accion2.equals("Insertar")){
         sSQL="Insert Into aprendiz (ID_Aprendiz, Tipo,Primer_Nombre, Segundo_Nombre, Primer_Apellido,"
                 + "Segundo_Apellido,Fecha_Nac, Direccion, Correo,Telefono,ID_Ficha) Values(?,?,?,?,?,?,?,?,?,?,?)";
         mensaje="Se ha guardado Aprendiz";
           }
       else{ if (accion2.equals("Modificar")){
         sSQL = "UPDATE Aprendiz SET ID_Aprendiz= ? , "
                   +"Tipo = ? , "
                   +"Primer_Nombre = ? , "
                   +"Segundo_Nombre = ? , "
                   +"Primer_Apellido = ? , "
                   +"Segundo_Apellido = ? , "
                   +"Fecha_Nac = ? , "
                   +"Direccion = ?,  "
                   +"Correo = ? , "
                   +"Telefono = ? , "
                   +"ID_Ficha = ? "
                   +"WHERE ID_Aprendiz= '"+id_operario+"'";
                    mensaje="Se ha modificado correctamente";
             }
      }
         
         try {
            PreparedStatement pst =cn.prepareStatement(sSQL);
            pst.setString(1, id);
            pst.setString(2, tipo);
            pst.setString(3, pnombre);
            pst.setString(4, snombre);
            pst.setString(5, papellido);
            pst.setString(6, sapellido);
            pst.setString(7, fechanac);
            pst.setString(8, dire);
            pst.setString(9, corre);
            pst.setString(10, tel);
            pst.setString(11, idfi);
            int n = pst.executeUpdate();
            if(n > 0){
                JOptionPane.showMessageDialog(null, mensaje);
                cargarTablaAprendices(idfi);
                limpiar();
            }
                        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
        
    }//GEN-LAST:event_jtxtxAñadirOperarioAprendizMouseClicked

    private void jtxtmodificaraprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtmodificaraprendizMouseClicked
        int filasel;
        String ID;
        try {
          filasel=this.jtblaprendices.getSelectedRow();
        if (filasel==-1){  
            JOptionPane.showMessageDialog(null,"No se ha Seleccionado ninguna Fila");
        }
        else{
            accion2="Modificar";
            modelo= (DefaultTableModel)jtblaprendices.getModel();
            ID=(String)modelo.getValueAt(filasel, 0);
            BuscarAprendizEditar(ID);
            this.jPConsultaGrupo.setVisible(false);
            this.jPRegistroGrupo.setVisible(false);
            this.jPRegistroOperarioAprend.setVisible(true);
         }
          }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }            
    }//GEN-LAST:event_jtxtmodificaraprendizMouseClicked

    private void jcmbcursoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmbcursoPopupMenuWillBecomeInvisible
       this.insertaidjcmbcurso();
    }//GEN-LAST:event_jcmbcursoPopupMenuWillBecomeInvisible

    private void jcmbjornadaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmbjornadaPopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_jcmbjornadaPopupMenuWillBecomeInvisible

    private void jcmbusuarioPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmbusuarioPopupMenuWillBecomeInvisible
      this.insertaidjcmbusuario();
    }//GEN-LAST:event_jcmbusuarioPopupMenuWillBecomeInvisible

    private void jtxtEliminarGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtEliminarGrupoMouseClicked
        int filasel;
        String Nombre;
        filasel=this.jtblfichas.getSelectedRow();
        if (filasel==-1){
        JOptionPane.showMessageDialog(null,"Seleccione la Fila Deseada "); }
        else
        {
        modelo=(DefaultTableModel)this.jtblfichas.getModel();
        Nombre=(String)this.modelo.getValueAt(filasel,0);
        int conf=JOptionPane.showConfirmDialog(null,"Esta seguro de Eliminar a "+Nombre);
        if(conf==0){
         ConexionMySQL mysql = new ConexionMySQL();
         Connection cn = mysql.Conectar();
        String sql="Delete  from aprendiz   where ID_Ficha="+Nombre+"";
         String sSQL="Delete from  fichas where ID_Ficha="+Nombre+"";
        try {
            PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sql);
            PreparedStatement pst1 =(PreparedStatement)cn.prepareStatement(sSQL);
            int n=pst.executeUpdate();
            int m=pst1.executeUpdate();
            if((m>0)||(n>0)){
                JOptionPane.showMessageDialog(null,"Datos Eliminados");
                cargarTablafichas("");
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);   }
          }
        }
    }//GEN-LAST:event_jtxtEliminarGrupoMouseClicked

    private void jtxteliminaraprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxteliminaraprendizMouseClicked
        int filasel;
        String Nombre;
        filasel=this.jtblaprendices.getSelectedRow();
        if (filasel==-1){
        JOptionPane.showMessageDialog(null,"Seleccione la Fila Deseada "); }
        else
        {
        modelo=(DefaultTableModel)this.jtblaprendices.getModel();
        Nombre=(String)this.modelo.getValueAt(filasel,0);
        
        int conf=JOptionPane.showConfirmDialog(null,"Esta seguro de Eliminar a "+Nombre);
        if(conf==0){
         ConexionMySQL mysql = new ConexionMySQL();
      Connection cn = mysql.Conectar();
           String sSQL="DELETE  from aprendiz WHERE ID_Aprendiz='" + Nombre + "'";
        try {
            PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL);
            int n=pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Datos Eliminados");
                cargarTablaAprendices(Nombre);
              }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);   }
        }
        }
    }//GEN-LAST:event_jtxteliminaraprendizMouseClicked

    private void jtxtmodificargrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtmodificargrupoMouseClicked
        int filasel;
        String ID;
        try {
          filasel=this.jtblfichas.getSelectedRow();
        if (filasel==-1){  
            JOptionPane.showMessageDialog(null,"No se ha Seleccionado ninguna Fila");
        }
        else{
            modelo= (DefaultTableModel)jtblfichas.getModel();
            ID=(String)modelo.getValueAt(filasel, 0);
            BuscarFichasEditar(ID);
            this.jPConsultaGrupo.setVisible(false);
            this.jPRegistroOperarioAprend.setVisible(false);
            this.jPRegistroGrupo.setVisible(true);
            this.jtxtmodificarficha.setVisible(true);
            this.jtxtregistroaprendiz.setVisible(false);
           this.jtxtsalirregistro.setVisible(false);
           this.jtxtfinalizaroperarioaprendiz.setVisible(true);
           this.jtxtsalirregistro.setVisible(false);
         }
          }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jtxtmodificargrupoMouseClicked

    private void jtxtconsultarfichasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtconsultarfichasKeyReleased
         cargarTablafichas(jtxtconsultarfichas.getText());
    }//GEN-LAST:event_jtxtconsultarfichasKeyReleased

    private void jtxtmodificarfichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtmodificarfichaMouseClicked
    todo("Modificar");
    this.jPConsultaGrupo.setVisible(false);
    this.jPRegistroGrupo.setVisible(false);
    this.jPRegistroOperarioAprend.setVisible(true);
   
    }//GEN-LAST:event_jtxtmodificarfichaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPConsultaGrupo;
    private javax.swing.JPanel jPRegistroGrupo;
    private javax.swing.JPanel jPRegistroOperarioAprend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTexCancelarRegistroOperario;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JComboBox jcmbcurso;
    private javax.swing.JComboBox jcmbjornada;
    private javax.swing.JComboBox jcmbtipodocu;
    private javax.swing.JComboBox jcmbusuario;
    private javax.swing.JTable jtblaprendices;
    private javax.swing.JTable jtblfichas;
    private javax.swing.JTextField jtxtEliminarGrupo;
    private javax.swing.JTextField jtxtNuevoGrupo;
    private javax.swing.JTextField jtxtcel;
    private javax.swing.JTextField jtxtconsultarfichas;
    private javax.swing.JTextField jtxtcorreo;
    private javax.swing.JTextField jtxtdirecc;
    private javax.swing.JTextField jtxteliminaraprendiz;
    private javax.swing.JTextField jtxtfechafinal;
    private javax.swing.JTextField jtxtfechainicio;
    private javax.swing.JTextField jtxtfechanac;
    private javax.swing.JTextField jtxtficha;
    private javax.swing.JTextField jtxtfinalizaroperarioaprendiz;
    private javax.swing.JTextField jtxtidcurso;
    private javax.swing.JTextField jtxtidoperario;
    private javax.swing.JTextField jtxtidusuario;
    private javax.swing.JTextField jtxtmodificaraprendiz;
    private javax.swing.JTextField jtxtmodificarficha;
    private javax.swing.JTextField jtxtmodificargrupo;
    private javax.swing.JTextField jtxtpapellido;
    private javax.swing.JTextField jtxtpnombre;
    private javax.swing.JTextField jtxtregistroaprendiz;
    private javax.swing.JTextField jtxtsalirregistro;
    private javax.swing.JTextField jtxtsapellido;
    private javax.swing.JTextField jtxtsnombre;
    private javax.swing.JTextField jtxtxAñadirOperarioAprendiz;
    // End of variables declaration//GEN-END:variables
}
