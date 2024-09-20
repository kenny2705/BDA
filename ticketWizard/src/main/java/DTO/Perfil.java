/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author jorge
 */
public class Perfil {
    
    private int id;
    private String nombreC;
    private String contra;
    private String correo;
    private String domicilio;
     private Date fechaN;
    private int edad;
    private float saldo;

    public Perfil() {
    }

    public Perfil(int id) {
        this.id = id;
    }
    

    public Perfil(int id, String nombreC, String contra, String correo, String domicilio, Date fechaN, int edad, float saldo) {
        this.id = id;
        this.nombreC = nombreC;
        this.contra = contra;
        this.correo = correo;
        this.domicilio = domicilio;
        this.fechaN = fechaN;
        this.edad = edad;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perfil other = (Perfil) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", nombreC=" + nombreC + ", contra=" + contra + ", correo=" + correo + ", domicilio=" + domicilio + ", fechaN=" + fechaN + ", edad=" + edad + ", saldo=" + saldo + '}';
    }

    
    
    
    
    
}
