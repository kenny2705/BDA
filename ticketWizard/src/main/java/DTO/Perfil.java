package DTO;

import java.sql.Date;

/**
 * Esta clase contiene los metodos para manejar objetos de tipo perfil
 *
 * @author kevin
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

    /**
     * Constructor por omision
     */
    public Perfil() {
    }

    /**
     * Constructor que inicializa el id del perfil
     *
     * @param id id del perfil
     */
    public Perfil(int id) {
        this.id = id;
    }

    /**
     * Constructor que inicializa el perfil con todos sus atributos.
     *
     * @param id id único del perfil
     * @param nombreC Nombre completo del usuario
     * @param contra Contraseña del usuario
     * @param correo Correo electrónico del usuario
     * @param domicilio Domicilio del usuario
     * @param fechaN Fecha de nacimiento del usuario
     * @param edad Edad del usuario
     * @param saldo Saldo de la cuenta del usuario
     */
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

    /**
     * Obtiene el id del perfil.
     *
     * @return El id del perfil
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id del perfil.
     *
     * @param id El id del perfil
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre completo del usuario.
     *
     * @return El nombre completo del usuario
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Establece el nombre completo del usuario.
     *
     * @param nombreC El nombre completo del usuario
     */
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario
     */
    public String getContra() {
        return contra;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param contra La contraseña del usuario
     */
    public void setContra(String contra) {
        this.contra = contra;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return El correo electrónico del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario.
     *
     * @param correo El correo electrónico del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el domicilio del usuario.
     *
     * @return El domicilio del usuario
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el domicilio del usuario.
     *
     * @param domicilio El domicilio del usuario
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario.
     *
     * @return La fecha de nacimiento del usuario
     */
    public Date getFechaN() {
        return fechaN;
    }

    /**
     * Establece la fecha de nacimiento del usuario.
     *
     * @param fechaN La fecha de nacimiento del usuario
     */
    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    /**
     * Obtiene la edad del usuario.
     *
     * @return La edad del usuario
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del usuario.
     *
     * @param edad La edad del usuario
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el saldo de la cuenta del usuario.
     *
     * @return El saldo de la cuenta del usuario
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta del usuario.
     *
     * @param saldo El saldo de la cuenta del usuario
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Método hashCode basado en el identificador único del perfil.
     *
     * @return El valor hash del objeto
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        return hash;
    }

    /**
     * Método equals para comparar dos objetos Perfil.
     *
     * @param obj El objeto a comparar
     * @return true si los objetos son iguales, false en caso contrario
     */
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

    /**
     * Método toString para representar el objeto Perfil como una cadena de
     * texto.
     *
     * @return La representación en cadena del objeto Perfil
     */
    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", nombreC=" + nombreC + ", contra=" + contra + ", correo=" + correo + ", domicilio=" + domicilio + ", fechaN=" + fechaN + ", edad=" + edad + ", saldo=" + saldo + '}';
    }

}
