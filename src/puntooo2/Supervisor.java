
package puntooo2;

import java.util.ArrayList;


public class Supervisor {
    private String nombre;
    private String id;
    private HojaRegistro hojaRegistro;
    private ArrayList<HojaTiempo> hojaTiempos = new ArrayList<HojaTiempo>();

    public Supervisor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }    
    
    public void crearHojaRegistro(HojaRegistro r){
    }
    
    public void crearHojaTiempo(HojaTiempo t){
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<HojaTiempo> getHojaTiempos() {
        return hojaTiempos;
    }

    public void setHojaTiempos(ArrayList<HojaTiempo> hojaTiempos) {
        this.hojaTiempos = hojaTiempos;
    }
    
    
    
    
}