package conexionSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
private static Connection conn;
private static final String driver = "com.mysql.cj.jdbc.Driver";
private static final String user = "root";
private static final String password = "";
private static final String url = "jdbc:mysql://localhost:3306/escuela";
public Conexion(){
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null) {
            System.out.println("Conexion establecida ..");
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("> ERROR AL CONECTAR " + e);
            }
}
// Este metodo retorna la coneccion
public Connection getConnection(){
    return conn;
}
// Este metodo desconecta la Base de datos
public void desconectar(){
    conn = null;
    if(conn==null){
    System.out.println("Conexión Terminada ..!!");
        }
    }
}