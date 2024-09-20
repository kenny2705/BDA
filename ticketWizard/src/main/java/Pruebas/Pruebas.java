/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        String password = "12345";
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
    }
    
}
