package dao;

import interfaces.IConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que implementa la interfaz IConexion para manejar la conexión a la base
 * de datos MySQL.
 *
 * @author jorge
 */
public class Conexion implements IConexion {

    // Cadena de conexión a la base de datos
    private String cadena = "jdbc:mysql://127.0.0.1:3306/Ticketwizard";

    // Usuario de la base de datos
    private String usuario = "root";

    // Contraseña del usuario de la base de datos
    private String pwd = "12345";

    /**
     * Crea una conexión a la base de datos MySQL.
     *
     * @return La conexión a la base de datos, o null si ocurrió un error.
     */
    @Override
    public Connection crearConexion() {
        Connection c = null;
        try {
            c = DriverManager.getConnection(cadena, usuario, pwd);
        } catch (SQLException e) {
            System.out.println("Hubo un error de conexión: " + e.getMessage());
        }
        return c;
    }
}
