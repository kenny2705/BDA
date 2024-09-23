
package DTO;

/**
 * clase con los metodos necesarios para manejar objetos de tipo boleto
 *
 * @author kevin
 */
public class Boleto {

    private int idBoleto;
    private String numSerie;
    private String fila;
    private String asiento;
    private float precioOriginal;
    private float precioReventa;
    private boolean estadoVenta;
    private int idEvento;
    private int idPerfil;

    /**
     * contructor por omision
     */
    public Boleto() {
    }

    /**
     * constructor que inicializa el id del boleto
     *
     * @param idBoleto id del boleto
     */
    public Boleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    /**
     * Constructor que inicializa todos los campos del boleto.
     *
     * @param idBoleto El id del boleto
     * @param numSerie El número de serie único del boleto
     * @param fila La fila del asiento del boleto
     * @param asiento El asiento específico del boleto
     * @param precioOriginal El precio original del boleto
     * @param precioReventa El precio de reventa del boleto
     * @param estadoVenta El estado de venta del boleto (disponible o no)
     * @param idEvento El identificador del evento asociado al boleto
     * @param idPerfil El identificador del perfil del usuario asociado al
     * boleto
     */
    public Boleto(int idBoleto, String numSerie, String fila, String asiento, float precioOriginal, float precioReventa, boolean estadoVenta, int idEvento, int idPerfil) {
        this.idBoleto = idBoleto;
        this.numSerie = numSerie;
        this.fila = fila;
        this.asiento = asiento;
        this.precioOriginal = precioOriginal;
        this.precioReventa = precioReventa;
        this.estadoVenta = estadoVenta;
        this.idEvento = idEvento;
        this.idPerfil = idPerfil;
    }

    /**
     * Obtiene el identificador único del boleto.
     *
     * @return El identificador del boleto
     */
    public int getIdBoleto() {
        return idBoleto;
    }

    /**
     * Establece el identificador único del boleto.
     *
     * @param idBoleto El identificador del boleto
     */
    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    /**
     * Obtiene el número de serie único del boleto.
     *
     * @return El número de serie del boleto
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Establece el número de serie único del boleto.
     *
     * @param numSerie El número de serie del boleto
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Obtiene la fila del asiento del boleto.
     *
     * @return La fila del asiento
     */
    public String getFila() {
        return fila;
    }

    /**
     * Establece la fila del asiento del boleto.
     *
     * @param fila La fila del asiento
     */
    public void setFila(String fila) {
        this.fila = fila;
    }

    /**
     * Obtiene el asiento específico del boleto.
     *
     * @return El asiento del boleto
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * Establece el asiento específico del boleto.
     *
     * @param asiento El asiento del boleto
     */
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    /**
     * Obtiene el precio original del boleto.
     *
     * @return El precio original del boleto
     */
    public float getPrecioOriginal() {
        return precioOriginal;
    }

    /**
     * Establece el precio original del boleto.
     *
     * @param precioOriginal El precio original del boleto
     */
    public void setPrecioOriginal(float precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    /**
     * Obtiene el precio de reventa del boleto.
     *
     * @return El precio de reventa del boleto
     */
    public float getPrecioReventa() {
        return precioReventa;
    }

    /**
     * Establece el precio de reventa del boleto.
     *
     * @param precioReventa El precio de reventa del boleto
     */
    public void setPrecioReventa(float precioReventa) {
        this.precioReventa = precioReventa;
    }

    /**
     * Obtiene el estado de venta del boleto.
     *
     * @return El estado de venta del boleto
     */
    public boolean isEstadoVenta() {
        return estadoVenta;
    }

    /**
     * Establece el estado de venta del boleto.
     *
     * @param estadoVenta El estado de venta del boleto
     */
    public void setEstadoVenta(boolean estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    /**
     * Obtiene el identificador del evento asociado al boleto.
     *
     * @return El identificador del evento
     */
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * Establece el identificador del evento asociado al boleto.
     *
     * @param idEvento El identificador del evento
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * Obtiene el identificador del perfil del usuario asociado al boleto.
     *
     * @return El identificador del perfil
     */
    public int getIdPerfil() {
        return idPerfil;
    }

    /**
     * Establece el identificador del perfil del usuario asociado al boleto.
     *
     * @param idPerfil El identificador del perfil
     */
    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    /**
     * Retorna una representación en cadena de los detalles del boleto.
     *
     * @return Una cadena que representa los detalles del boleto
     */
    @Override
    public String toString() {
        return "Boleto{" + "idBoleto=" + idBoleto + ", numSerie=" + numSerie + ", fila=" + fila + ", asiento=" + asiento + ", precioOriginal=" + precioOriginal + ", precioReventa=" + precioReventa + ", estadoVenta=" + estadoVenta + ", idEvento=" + idEvento + ", idPerfil=" + idPerfil + '}';
    }

}
