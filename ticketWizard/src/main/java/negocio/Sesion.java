/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author jorge
 */
public class Sesion {
    
     private static String correoUsuario;

    // Método para guardar el correo del usuario
    public static void setCorreoUsuario(String correo) {
        correoUsuario = correo;
    }

    // Método para obtener el correo del usuario
    public static String getCorreoUsuario() {
        return correoUsuario;
    }
    
}
