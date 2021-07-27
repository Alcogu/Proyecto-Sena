package BadeDatos;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionMySQL {
public String db="textil";
public String url="jdbc:mysql://localhost/"+db;
public String user="root";
public String pass="";

public Connection Conectar(){
Connection link =null;
try{
    Class.forName("com.mysql.jdbc.Driver");
     link=DriverManager.getConnection(this.url,this.user,this.pass);
    }
    catch(ClassNotFoundException|SQLException e){
        JOptionPane.showMessageDialog(null,"");
    }
    return link;
    
}
}
