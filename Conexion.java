/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.EmpleadosDAL;

/**
 *
 * @author USER
 */

import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Conexion {

    /**
     * @param args the command line arguments
     * @param Statement
     */
    public static void main(String[] args, Statement Statement) {
String usuario = "root";
String pasword = "";
String url = "jdbc:mysql://localhots:3306/sistema/empleado";
Connection conexion;
Statement stateme;
ResultSet rs;
        
try {
            // TODO code application logic here
            Class.forName ("com.mysql.cj.jdbc.driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url,usuario,pasword);
            Statement = conexion.createStatement();
            Statement.executeUpdate("insert into Empleado(userName,userCorreo)values(´ABC´,´ABC123´");
            rs = Statement.executeQuery("selec from usuario");
            rs.next();
            do {
                 System.out.println(rs.getInt("userid")+":"+rs.getString("username"));
            }while (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }

    public ResultSet ConsultarRegistro(String selec__from_empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void ejecutarSentenciaSQL(MysqlxDatatypes.Scalar.String strSentenciaInsert) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
       
   
    
           

