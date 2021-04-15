package bd;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conecta {
   public Connection conn = null;
   private final String DRIVER = "com.mysql.jdbc.Driver";
   private final String DBNAME = "bomba";
   private final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
   private final String LOGIN = "root";
   private final String SENHA= "Willi@m123";
   
   public boolean conectarBD(){
       try{
           //utilizando o drive do mysql para fazer a conexão
           Class.forName(DRIVER);
           conn = (Connection) DriverManager.getConnection(URL, LOGIN, SENHA);
           return true;
       }catch(ClassNotFoundException erro){
           JOptionPane.showMessageDialog(null, "Driver não encontrado: \n" + erro);
           return false;
       }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Problemas na conexão: \n" + erro);
           return false;
       } 
   }
   public void fecharBD(){
       try{
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconectou");
        }catch(SQLException erro){}
   }
}
