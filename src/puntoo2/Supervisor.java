
package puntoo2;


public class Supervisor {
    private String nombre;
    private String id;

    public Supervisor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public void crearHojaRegistro(HojaRegistro r){
        HojaRegistro h = new HojaRegistro("1", "Supervisor", "junio", "1234", "jueves", "3", "11", "ningun problema", "0", 50);
        HojaRegistro i = new HojaRegistro("1", "Supervisor", "junio", "1234", "jueves", "3", "11", "ningun problema", "0", 50);
        HojaRegistro j = new HojaRegistro("1", "Supervisor", "junio", "1234", "jueves", "3", "11", "ningun problema", "0", 50);
    }
    
    public void crearHojaTiempo(HojaTiempo t){
        HojaTiempo h = new HojaTiempo("Aurelio", "Beechfield", "wdqwdqw", "12314", "1", "32423", 8, 1, "asdasd");
        HojaTiempo j = new HojaTiempo("Aurelio", "Beechfield", "wdqwdqw", "12314", "2", "32423", 8, 1, "asdasd");
        HojaTiempo k = new HojaTiempo("Aurelio", "Beechfield", "wdqwdqw", "12314", "3", "32423", 8, 1, "asdasd");
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
    
    
}
