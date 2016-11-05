
package puntooo2;


public class HojaRegistro {
    
    private int linea;
    private String producto;
    private Supervisor supervisor;
    private String fecha;
    private String numeroTrabajo;
    private String diaSemana;
    private int inicioSerie;
    private int finalSerie;
    private String informeProblema;
    private int tiempoProblema;
    private int cantidadProducida;

    public HojaRegistro(int linea, String producto, Supervisor supervisor, String fecha, String numeroTrabajo, String diaSemana, int inicioSerie, int finalSerie, String informeProblema, int tiempoProblema, int cantidadProducida) {
        this.linea = linea;
        this.producto = producto;
        this.supervisor = supervisor;
        this.fecha = fecha;
        this.numeroTrabajo = numeroTrabajo;
        this.diaSemana = diaSemana;
        this.inicioSerie = inicioSerie;
        this.finalSerie = finalSerie;
        this.informeProblema = informeProblema;
        this.tiempoProblema = tiempoProblema;
        this.cantidadProducida = cantidadProducida;
    }    

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroTrabajo() {
        return numeroTrabajo;
    }

    public void setNumeroTrabajo(String numeroTrabajo) {
        this.numeroTrabajo = numeroTrabajo;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getInicioSerie() {
        return inicioSerie;
    }

    public void setInicioSerie(int inicioSerie) {
        this.inicioSerie = inicioSerie;
    }

    public int getFinalSerie() {
        return finalSerie;
    }

    public void setFinalSerie(int finalSerie) {
        this.finalSerie = finalSerie;
    }

    public String getInformeProblema() {
        return informeProblema;
    }

    public void setInformeProblema(String informeProblema) {
        this.informeProblema = informeProblema;
    }

    public int getTiempoProblema() {
        return tiempoProblema;
    }

    public void setTiempoProblema(int tiempoProblema) {
        this.tiempoProblema = tiempoProblema;
    }

    public int getCantidadProducida() {
        return cantidadProducida;
    }

    public void setCantidadProducida(int cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }
    
    
}