
package puntooo2;

import java.util.ArrayList;


public class LineaProduccion {
    private int serie;
    private String producto;
    private int costeLinProd;
    private Supervisor supervisor;
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public LineaProduccion(int serie, String producto, int costeLinProd, Supervisor supervisor, ArrayList<Empleado> empleados) {
        this.serie = serie;
        this.producto = producto;
        this.costeLinProd = costeLinProd;
        this.supervisor = supervisor;
        this.empleados = empleados;
    }
    
    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCosteLinProd() {
        return costeLinProd;
    }

    public void setCosteLinProd(int costeLinProd) {
        this.costeLinProd = costeLinProd;
    }
    
    

   
}