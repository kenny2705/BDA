/*
 * Control.java
 */
package negocio;

import DTO.Perfil;
import dao.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Control extends Conexion {
    
     /**
     * Constructor de la clase `Control`. Crea una instancia de la clase y establece una conexión a la base de datos.
     */
    public Control() {
    }
    Conexion conex = new Conexion();
    
    
    /**
     * Autentica a un usuario utilizando su dirección de correo electrónico y contraseña.
     *
     * @param Correo La dirección de correo electrónico del usuario.
     * @param Contraseña La contraseña del usuario.
     * @return true si la autenticación es exitosa, false en caso contrario.
     */
         // Método para autenticar usuario
    public boolean autenticacion(String correo, String contraseña) {
        String query = "SELECT * FROM perfil WHERE correo = ? AND contraseña = ?";
        
        try (Connection con = new Conexion().crearConexion();
             PreparedStatement pst = con.prepareStatement(query)) {
            
            pst.setString(1, correo);
            pst.setString(2, contraseña);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                // Si existe una coincidencia, el usuario está autenticado
                return true;
            } else {
                // Si no hay coincidencias
                System.out.println("Correo o contraseña incorrectos");
                return false;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    
    
     /**
     * Registra un nuevo perfil en la base de datos.
     *
     * Este método inserta un nuevo registro en la tabla 'perfil', incluyendo el
     * nombre completo, contraseña, correo electrónico, domicilio, fecha de
     * nacimiento, edad calculada a partir de la fecha de nacimiento y un saldo
     * inicial de 0.
     *
     * @param Nombre_Completo El nombre completo del perfil a registrar.
     * @param Contraseña La contraseña del perfil a registrar.
     * @param Correo El correo electrónico del perfil a registrar.
     * @param Domicilio La dirección del perfil a registrar.
     * @param FechaN La fecha de nacimiento del perfil a registrar, utilizada
     * para calcular la edad.
     * @return true si el perfil se registró correctamente; false en caso
     * contrario.
     */
    public boolean registrar(String Nombre_Completo, String Contraseña, String Correo, String Domicilio, Date FechaN) {
        PreparedStatement pst = null;
        Connection conex = null; // Inicializa la conexión
        try {
            // Crear la conexión una sola vez
            conex = crearConexion();

            // Calcular la edad usando la función
            int edad = calcularEdad(FechaN); // Llama a la función para calcular la edad

            String consulta = "INSERT INTO perfil(nombre_completo, contraseña, correo, domicilio, fecha_nacimiento, edad, saldo) VALUES(?, ?, ?, ?, ?, ?, ?)";
            pst = conex.prepareStatement(consulta);

            // Asignar los valores
            pst.setString(1, Nombre_Completo);
            pst.setString(2, Contraseña);
            pst.setString(3, Correo);
            pst.setString(4, Domicilio);
            pst.setDate(5, FechaN);
            pst.setInt(6, edad); // Asigna la edad calculada
            pst.setFloat(7, 0); // Inicializa el saldo en 0

            // Ejecutar la consulta
            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error en " + e);
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conex != null) {
                    conex.close(); // Cerrar la conexión
                }
            } catch (Exception e) {
                System.out.println("Error en " + e);
            }
        }
        return false;
    }
    // Método para calcular la edad, usando la función de la base de datos o lógica en Java
    /**
     * Calcula la edad a partir de la fecha de nacimiento.
     *
     * Este metodo toma una fecha de nacimiento y calcula la edad en años con
     * base en la fecha actual. Se utiliza la clase LocalDate de Java para
     * obtener una representación de la fecha y calcular la diferencia en años.
     *
     * @param fechaNacimiento La fecha de nacimiento del perfil.
     * @return La edad en años calculada a partir de la fecha de nacimiento.
     */
    private int calcularEdad(Date fechaNacimiento) {
        // Implementa la lógica para calcular la edad si no se usa la función en la base de datos
        LocalDate fechaNac = fechaNacimiento.toLocalDate();
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNac, hoy).getYears();
    }
    
     /**
     * Metodo que actualiza los datos de un cliente de la base de datos. El
     * método utiliza el nombre y apellidos, así como la contraseña para validar
     * al cliente, una vez validado actualiza sus datos poniendo nuevos nombres
     * y apellidos, correo y contraseña.
     *
     * @param Nombre_ApellidoP_ApellidoM nombre y apellidos del cliente.
     * @param contraseña contraseña del cliente.
     * @param nuevoNombre_ApellidoP_ApellidoM nombre y apellidos que se cambiará
     * el clliente.
     * @param nuevoCorreoElectronico correo electronico al que se cambiará el
     * cliente.
     * @param nuevaContraseña nueva contraseña a la que actualizará el cliente.
     * @return TRUE: Actualizá los datos del cliente. FALSE: Despliega un
     * mensaje de advertencia, ya sea que el metodo haya fallado o que el
     * usuario haya añadido mal los datos necesarios para validar al cliente.
     */
    public boolean actualizar(String nuevoNombreC, String nuevoCorreo, String nuevaContraseña,String nuevoDomicilio,String nuevaFechaN) {
        PreparedStatement pst = null;

        try {
            String consulta = "UPDATE perfil SET nombre_completo=?, contraseña=?, correo=?, domicilio=?, fecha_nacimiento=?, edad=? "
                    + "WHERE nombre_completo=?, contraseña=?, correo=?, domicilio=?, fecha_nacimiento=?, edad=?";
            pst = crearConexion().prepareCall(consulta);
            pst.setString(1, nuevoNombreC); //nombre y apellidos actualizados.
            pst.setString(2, nuevaContraseña); //correo electronico actualizado.
            pst.setString(3, nuevoCorreo); //contraseña actualizada.
            pst.setString(4, nuevoDomicilio); //nombre y apellidos que se utilizaron para la verificación de usuario.
            pst.setString(5, nuevaFechaN); //contraseña que se utilizó para la verificación del usuario.


            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas == 1) {
                System.out.println("Se actualizó el  perfilcon exito");
                System.out.println("su nuevo usuario es:");
                System.out.println("nombre y apellido: " + nuevoNombreC);
                System.out.println("nuevo correo " + nuevoCorreo);
                System.out.println("nueva contraseña: " + nuevaContraseña);
                System.out.println("nuevo Domicilio: " + nuevoDomicilio);
                System.out.println("nueva fecha Nacmiento: " + nuevaFechaN);
                return true;
            } else {
                System.out.println("Hubo un error al actualizar el perfil");
                System.out.println("Verifique haber añadido de forma correcta sus datos de usuario (nombre, contraseña, correo, domicilio, fecha_nacimiento, edad)");
            }

        } catch (Exception e) {
            System.out.println("Error en " + e);
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error en " + e);
            }
        }

        return false;
    }
    
    
     // Método para agregar saldo
    public boolean agregarSaldo(String correo, double cantidad) {
        String query = "UPDATE perfil SET saldo = saldo + ? WHERE correo = ?";
        
        try (Connection con = new Conexion().crearConexion();
             PreparedStatement pstmt = con.prepareStatement(query)) {
             
            pstmt.setDouble(1, cantidad);
            pstmt.setString(2, correo);
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0; // Devuelve true si se actualizó el saldo
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de errores
            return false;
        }
    }
    
    
    
     // Método para consultar el saldo del usuario desde la base de datos
    public double consultarSaldo(String correo) {
        String query = "SELECT saldo FROM perfil WHERE correo = ?";
        double saldo = 0.0;

        try (Connection con = new Conexion().crearConexion();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, correo);  // Establecemos el correo en el PreparedStatement
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Obtenemos el saldo si el correo existe
                saldo = rs.getDouble("saldo");
            } else {
                System.out.println("Perfil no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return saldo;
    }
    
    // Método para consultar el saldo del usuario desde la base de datos
    public boolean consultarRol(String correo) {
        String query = "SELECT rol FROM perfil WHERE correo = ?";
        boolean rol = false;

        try (Connection con = new Conexion().crearConexion();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, correo);  // Establecemos el correo en el PreparedStatement
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Obtenemos el saldo si el correo existe
                rol = rs.getBoolean("rol");
            } else {
                System.out.println("Perfil no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rol;
    }
    
    
    
    
    
    
}
