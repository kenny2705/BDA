
package Pruebas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jorge
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/Ticketwizard";
        String user = "root";
        String password = "27052002";
        String i = "INSERT INTO perfil (nombre_completo,contraseña,correo,domicilio,fecha_nacimiento,edad,saldo) VALUES  (?,?,?,?,?,?,?)";
        String  buscarPerfil = "SELECT * FROM perfil WHERE edad < ? ";
    
        try{
        Connection c = DriverManager.getConnection(cadenaConexion, user, password);
        PreparedStatement insert = c.prepareStatement(i,Statement.RETURN_GENERATED_KEYS);
        Date fechaN = new Date (2003,06,17);
   
        insert.setString(1, "Jorge Enriquez");
         insert.setString(2, "jorgem13");
        insert.setString(3, "jorge@gmail.com");
        insert.setString(4, "El rodeo 1708");
        insert.setDate(5,fechaN);
        insert.setInt(6, 21);
        insert.setFloat(7, (float)2500.00);
        
        insert.executeUpdate();
        
        PreparedStatement busqueda = c.prepareStatement(buscarPerfil);
        busqueda.setFloat(1, 100);
        
        ResultSet resultados = busqueda.executeQuery();
        
        if(resultados.next()){
           String nombre = resultados.getString("nombre_completo");
           float saldo = resultados.getFloat("saldo");
           String correo = resultados.getString("correo");
           
            System.out.println(nombre+"$"+saldo);
            System.out.println(correo);
        }
        
        }catch (SQLException e){
            e.printStackTrace();
        }
        // PRUEBA PARA ACTUALIZAR
        String nuevoNombre = "Daniel";
        String nuevaContra = "nueva123";
        String nuevoCorreo = "daniel@gmail.com";
        String nuevoDomicilio = "Nuevo Domicilio 123";
        Date nuevaFechaN = new Date(2005, 05, 27);
        int nuevaEdad = 19;
        float nuevoSaldo = 10000.00f;
        String nuevoRol = "user";
        String nombreActual = "Nuevo Nombre";
        String correoActual = "nuevo_correo@gmail.com";

        try {
            Connection c = DriverManager.getConnection(cadenaConexion, user, password);
            String consulta = "UPDATE perfil SET nombre_completo=?, contraseña=?, correo=?, domicilio=?, fecha_nacimiento=?, edad=?, saldo=?, rol=? "
                    + "WHERE nombre_completo=? AND correo=?";

            PreparedStatement pst = c.prepareStatement(consulta);

            pst.setString(1, nuevoNombre);
            pst.setString(2, nuevaContra);
            pst.setString(3, nuevoCorreo);
            pst.setString(4, nuevoDomicilio);
            pst.setDate(5, nuevaFechaN);
            pst.setInt(6, nuevaEdad);
            pst.setFloat(7, nuevoSaldo);
            pst.setString(8, nuevoRol);
            pst.setString(9, nombreActual);
            pst.setString(10, correoActual);

            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas == 1) {
                System.out.println("Se actualizó al cliente con éxito");
                System.out.println("Su nuevo usuario es:");
                System.out.println("Nombre y apellido: " + nuevoNombre);
                System.out.println("Nuevo correo: " + nuevoCorreo);
                System.out.println("Nueva contraseña: " + nuevaContra);
            } else {
                System.out.println("Hubo un error al actualizar al cliente");
                System.out.println("Verifique haber añadido de forma correcta sus datos de usuario (nombre, apellido y correo)");
            }

        } catch (SQLException e) {
            System.out.println("Error en " + e);
        }
        
    }
    
}
