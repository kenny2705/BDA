/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.IConexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import presentacion.iniciarSesion;



/**
 *
 * @author jorge
 */
public class Conexion implements IConexion {
    
    private String cadena = "jdbc:mysql://127.0.0.1:3306/Ticketwizard";
    private String usuario = "root";
    private String pwd = "12345";

    @Override
    public Connection crearConexion() {
       try{
       Connection c = DriverManager.getConnection(cadena, usuario, pwd);
        }catch(SQLException e){
            System.out.println("Hubo un error de conexión");
        }
        return null;
    }
    
    
    
    


}
