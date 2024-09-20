/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.IConexion;
import interfaces.IPerfilDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DTO.Perfil;

/**
 *
 * @author jorge
 */
public class PerfilDAO implements IPerfilDAO{
    
    private IConexion conexion;
    
    public PerfilDAO(IConexion bd){
        this.conexion=conexion;
    }
    
    public boolean registrar (Perfil perfil){
        try{
            Connection bd = conexion.crearConexion();
            String insertar = "INSERT INTO perfil (nombre_completo,contraseña,correo,domicilio,fecha_nacimiento,edad) VALUES  (?,?,?,?,?,?)";
            PreparedStatement  i= bd.prepareStatement(insertar);
            i.setString(1, perfil.getNombreC());
            i.setString(2, perfil.getContra());
            i.setString(3, perfil.getCorreo());
            i.setString(4, perfil.getDomicilio());
            i.setDate(5, perfil.getFechaN());
            i.setInt(6, perfil.getEdad());
            i.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    
   
         
    
    
}
