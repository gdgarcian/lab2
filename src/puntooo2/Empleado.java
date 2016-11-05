
package puntooo2;


public class Empleado {
    private String nombre;
    private String id;
    private int horasTrabajadas;
    private int tarifaProducto;
    private String categoria;

    public Empleado(String nombre, String id, int horasTrabajadas, int tarifaProducto, String categoria) {
        this.nombre = nombre;
        this.id = id;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaProducto = tarifaProducto;
        this.categoria = categoria;
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

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getTarifaProducto() {
        return tarifaProducto;
    }

    public void setTarifaProducto(int tarifaProducto) {
        this.tarifaProducto = tarifaProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}