package interfaces;

import java.sql.Connection;

/**
 * Interfaz para la creación de conexiones a la base de datos.
 * 
 * @author jorge
 */
public interface IConexion {

    /**
     * Método para crear una conexión a la base de datos.
     * 
     * @return Una conexión a la base de datos.
     */
    public Connection crearConexion();
}
