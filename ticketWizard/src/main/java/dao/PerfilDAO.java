package dao;

import interfaces.IConexion;
import interfaces.IPerfilDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DTO.Perfil;

/**
 * Clase que implementa la interfaz IPerfilDAO para manejar las operaciones CRUD
 * de Perfil.
 *
 * @author jorge
 */
public class PerfilDAO implements IPerfilDAO {

    private IConexion conexion;

    /**
     * Constructor de PerfilDAO que recibe una implementación de IConexion.
     *
     * @param bd La implementación de IConexion que se utilizará para crear
     * conexiones a la base de datos.
     */
    public PerfilDAO(IConexion bd) {
        this.conexion = conexion;
    }

    /**
     * Registra un nuevo perfil en la base de datos.
     *
     * @param perfil El perfil que se va a registrar.
     * @return true si el registro fue exitoso, false en caso contrario.
     */
    public boolean registrar(Perfil perfil) {
        try {
            Connection bd = conexion.crearConexion();
            String insertar = "INSERT INTO perfil (nombre_completo,contraseña,correo,domicilio,fecha_nacimiento,edad) VALUES  (?,?,?,?,?,?)";
            PreparedStatement i = bd.prepareStatement(insertar);
            i.setString(1, perfil.getNombreC());
            i.setString(2, perfil.getContra());
            i.setString(3, perfil.getCorreo());
            i.setString(4, perfil.getDomicilio());
            i.setDate(5, perfil.getFechaN());
            i.setInt(6, perfil.getEdad());
            i.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


         
    
    
}
