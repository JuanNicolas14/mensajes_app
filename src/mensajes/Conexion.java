package mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            if (conection != null){
                System.out.println("Conexion exitosa, Conectado a la DB");
            }else{
                System.out.println("No se ha podido conectar a la DB. :(");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
}
