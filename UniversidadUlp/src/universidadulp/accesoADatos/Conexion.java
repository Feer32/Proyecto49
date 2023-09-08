package universidadulp.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

   
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {

        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");

                String URL = "jdbc: mariadb://localhost:3306/";
                String DB = "universidadulp";
                String USUARIO = "root";
                String PASSWORD = "";

                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD );

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Debe agregar un driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");

            }
        }
        return connection;
    }
}
