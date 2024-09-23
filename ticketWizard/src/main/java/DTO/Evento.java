package DTO;

import java.sql.Date;

/**
 * Clase con los metodos necesarios para manejar objetos tipo evento
 *
 * @author kevin
 */
public class Evento {

    private int idEvento;
    private String venue;
    private Date fecha;
    private String nombreEvento;
    private String ciudad;
    private String estado;
    private String descripcion;

    /**
     * constructor por omision
     */
    public Evento() {
    }

    /**
     * constructor que incializa el id del evento
     *
     * @param idEvento id del evento
     */
    public Evento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * Constructor de la clase Evento que inicializa todos los campos del
     * evento.
     *
     * @param idEvento id del evento
     * @param venue lugar donde se llevará a cabo el evento
     * @param fecha fecha del evento
     * @param nombreEvento nombre del evento
     * @param ciudad ciudad donde se realiza el evento
     * @param estado estado donde se realiza el evento
     * @param descripcion descripción del evento
     */
    public Evento(int idEvento, String venue, Date fecha, String nombreEvento, String ciudad, String estado, String descripcion) {
        this.idEvento = idEvento;
        this.venue = venue;
        this.fecha = fecha;
        this.nombreEvento = nombreEvento;
        this.ciudad = ciudad;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el id del evento.
     *
     * @return El id del evento
     */
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * Establece el identificador único del evento.
     *
     * @param idEvento El identificador único del evento
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * Obtiene el lugar donde se llevará a cabo el evento.
     *
     * @return El lugar donde se llevará a cabo el evento
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Establece el lugar donde se llevará a cabo el evento.
     *
     * @param venue El lugar donde se llevará a cabo el evento
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * Obtiene la fecha del evento.
     *
     * @return La fecha del evento
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del evento.
     *
     * @param fecha La fecha del evento
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el nombre del evento.
     *
     * @return El nombre del evento
     */
    public String getNombreEvento() {
        return nombreEvento;
    }

    /**
     * Establece el nombre del evento.
     *
     * @param nombreEvento El nombre del evento
     */
    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    /**
     * Obtiene la ciudad donde se realiza el evento.
     *
     * @return La ciudad donde se realiza el evento
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece la ciudad donde se realiza el evento.
     *
     * @param ciudad La ciudad donde se realiza el evento
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el estado donde se realiza el evento.
     *
     * @return El estado donde se realiza el evento
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado donde se realiza el evento.
     *
     * @param estado El estado donde se realiza el evento
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la descripción del evento.
     *
     * @return La descripción del evento
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del evento.
     *
     * @param descripcion La descripción del evento
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Representa el objeto Evento como una cadena de texto.
     *
     * @return La representación en cadena del objeto Evento
     */
    @Override
    public String toString() {
        return "Evento{" + "idEvento=" + idEvento + ", venue=" + venue + ", fecha=" + fecha + ", nombreEvento=" + nombreEvento + ", ciudad=" + ciudad + ", estado=" + estado + ", descripcion=" + descripcion + '}';
    }

}
