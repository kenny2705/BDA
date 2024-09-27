package dao;

import interfaces.IConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion implements IConexion {
    
    private final String cadena = "jdbc:mysql://127.0.0.1:3306/Ticketwizard";
    private final String usuario = "root";
    private final String pwd = "27052002";
    
    @Override
    public Connection crearConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(cadena, usuario, pwd);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al conectar a la base de datos", e);
        }
        return conexion;
    }
}
