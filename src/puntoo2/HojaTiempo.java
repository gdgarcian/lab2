
package puntoo2;


public class HojaTiempo {
    private String nombre;
    private String fabrica = "Beechfield";
    private String fecha;
    private String numeroNomina;
    private String lineaProduccion;
    private String numeroTrabajo;
    private int horasProducidas;
    private int tiempoInactividad;
    private String code;

    public HojaTiempo(String nombre, String fabrica, String fecha, String numeroNomina, String lineaProduccion, String numeroTrabajo, int horasProducidas, int tiempoInactividad, String code) {
        this.nombre = nombre;
        this.fabrica = fabrica;
        this.fecha = fecha;
        this.numeroNomina = numeroNomina;
        this.lineaProduccion = lineaProduccion;
        this.numeroTrabajo = numeroTrabajo;
        this.horasProducidas = horasProducidas;
        this.tiempoInactividad = tiempoInactividad;
        this.code = code;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getLineaProduccion() {
        return lineaProduccion;
    }

    public void setLineaProduccion(String lineaProduccion) {
        this.lineaProduccion = lineaProduccion;
    }

    public String getNumeroTrabajo() {
        return numeroTrabajo;
    }

    public void setNumeroTrabajo(String numeroTrabajo) {
        this.numeroTrabajo = numeroTrabajo;
    }

    public int getHorasProducidas() {
        return horasProducidas;
    }

    public void setHorasProducidas(int horasProducidas) {
        this.horasProducidas = horasProducidas;
    }

    public int getTiempoInactividad() {
        return tiempoInactividad;
    }

    public void setTiempoInactividad(int tiempoInactividad) {
        this.tiempoInactividad = tiempoInactividad;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
            
}
