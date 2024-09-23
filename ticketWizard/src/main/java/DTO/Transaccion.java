package DTO;

import java.sql.Date;

/**
 * Clase que contiene los metodos para manejar objetos tipo Transaccion
 *
 * @author kevin
 */
public class Transaccion {

    private int idTransaccion;
    private Date fechaAdquisicion;
    private String tipoTransaccion;
    private float total;
    private int idPerfilComprador;
    private int idPerfilVendedor;
    private int idBoleto;

    /**
     * Constructor por omision
     */
    public Transaccion() {
    }

    /**
     * Constructor que inicializa el id de la transaccion
     *
     * @param idTransaccion id de la transaccion
     */
    public Transaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    /**
     * Constructor que inicializa sus atributos al valor de sus parametros
     *
     * @param idTransaccion id de la transaccion
     * @param fechaAdquisicion fecha en la que se realiza la transaccion
     * @param tipoTransaccion tipo de transaccion
     * @param total total a pagar de la tansaccion
     * @param idPerfilComprador id del perfil del comprador
     * @param idPerfilVendedor id del perfil del vendedor
     * @param idBoleto id del boleto
     */
    public Transaccion(int idTransaccion, Date fechaAdquisicion, String tipoTransaccion, float total, int idPerfilComprador, int idPerfilVendedor, int idBoleto) {
        this.idTransaccion = idTransaccion;
        this.fechaAdquisicion = fechaAdquisicion;
        this.tipoTransaccion = tipoTransaccion;
        this.total = total;
        this.idPerfilComprador = idPerfilComprador;
        this.idPerfilVendedor = idPerfilVendedor;
        this.idBoleto = idBoleto;
    }

    /**
     * regresa el id de la transaccion
     *
     * @return id de la transaccion
     */
    public int getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * inicializa el id de la transaccion
     *
     * @param idTransaccion id de la transaccion
     */
    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    /**
     * regresa la fecha de adquisicion
     *
     * @return fecha de adquisicion
     */
    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    /**
     * inicializa la fecha de adquisicion
     *
     * @param fechaAdquisicion fecha de adquisicion
     */
    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    /**
     * regresa el tipo de transaccion
     *
     * @return tipo de transaccion
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * inicializa el tipo de transaccion
     *
     * @param tipoTransaccion tipo de transaccion
     */
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    /**
     * regresa el total a pagar de la transaccion
     *
     * @return total a pagar de la transaccion
     */
    public float getTotal() {
        return total;
    }

    /**
     * inicializa el total a pagar de la transaccion
     *
     * @param total total a pagar de la transaccion
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * regresa el id del perfil del comprador
     *
     * @return id del perfil del comprador
     */
    public int getIdPerfilComprador() {
        return idPerfilComprador;
    }

    /**
     * inicializa el id del perfil del comprador
     *
     * @param idPerfilComprador id del perfil del comprador
     */
    public void setIdPerfilComprador(int idPerfilComprador) {
        this.idPerfilComprador = idPerfilComprador;
    }

    /**
     * Regresa el id del perfil del vendedor
     *
     * @return id del perfil del vendedor
     */
    public int getIdPerfilVendedor() {
        return idPerfilVendedor;
    }

    /**
     * Inicializa el id del perfil del vendedor
     *
     * @param idPerfilVendedor id del perfil del vendedor
     */
    public void setIdPerfilVendedor(int idPerfilVendedor) {
        this.idPerfilVendedor = idPerfilVendedor;
    }

    /**
     * Regresa el id del boleto
     *
     * @return id del boleto
     */
    public int getIdBoleto() {
        return idBoleto;
    }

    /**
     * inicializa el id del boleto
     *
     * @param idBoleto id del boleto
     */
    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    /**
     * Regresa una cadena de texto con la informacion de la transaccion
     *
     * @return cadena de texto con la informacion de la transaccion
     */
    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", fechaAdquisicion=" + fechaAdquisicion + ", tipoTransaccion=" + tipoTransaccion + ", total=" + total + ", idPerfilComprador=" + idPerfilComprador + ", idPerfilVendedor=" + idPerfilVendedor + ", idBoleto=" + idBoleto + '}';
    }

}
