
package puntoo2;


public class HojaRegistro {
    
    private String lineaProduccion;
    private String supervisor;
    private String fecha;
    private String numeroTrabajo;
    private String diaSemana;
    private String inicioSerie;
    private String finalSerie;
    private String informeProblema;
    private String tiempoProblema;
    private int cantidadProducida;

    public HojaRegistro(String lineaProduccion, String supervisor, String fecha, String numeroTrabajo, String diaSemana, String inicioSerie, String finalSerie, String informeProblema, String tiempoProblema, int cantidadProducida) {
        this.lineaProduccion = lineaProduccion;
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
    
    
    public String getLineaProduccion() {
        return lineaProduccion;
    }

    public void setLineaProduccion(String lineaProduccion) {
        this.lineaProduccion = lineaProduccion;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
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

    public String getInicioSerie() {
        return inicioSerie;
    }

    public void setInicioSerie(String inicioSerie) {
        this.inicioSerie = inicioSerie;
    }

    public String getFinalSerie() {
        return finalSerie;
    }

    public void setFinalSerie(String finalSerie) {
        this.finalSerie = finalSerie;
    }

    public String getInformeProblema() {
        return informeProblema;
    }

    public void setInformeProblema(String informeProblema) {
        this.informeProblema = informeProblema;
    }

    public String getTiempoProblema() {
        return tiempoProblema;
    }

    public void setTiempoProblema(String tiempoProblema) {
        this.tiempoProblema = tiempoProblema;
    }

    public int getCantidadProducida() {
        return cantidadProducida;
    }

    public void setCantidadProducida(int cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }
    
    
}
