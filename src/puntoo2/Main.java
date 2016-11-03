
package puntoo2;


public class Main {
    //Empleado = Nombre código horasTrabajadas TarifaProduto CantidadRealizada
    static Empleado e1 = new Empleado("Camilo", "1234", 8, 50, 35, "baja");
    static Empleado e2 = new Empleado("Vargas", "4321", 6, 45, 55, "baja");
    static Empleado e3 = new Empleado("Franco", "2341", 9, 60, 10, "baja");
    
    HojaRegistro h = new HojaRegistro("1", "Supervisor", "junio", "1234", "jueves", "3", "11", "ningun problema", "0", e1.getHorasTrabajadas());
    HojaRegistro i = new HojaRegistro("1", "Supervisor", "junio", "1234", "jueves", "3", "11", "ningun problema", "0", e2.getHorasTrabajadas());
    HojaRegistro j = new HojaRegistro("1", "Supervisor", "junio", "1234", "jueves", "3", "11", "ningun problema", "0",e3.getHorasTrabajadas());
 
    HojaTiempo k = new HojaTiempo(e1.getNombre(), "Beechfield", "Junio", "92748", "1", "32423", e1.getHorasTrabajadas(), 1, "asdasd");
    HojaTiempo l = new HojaTiempo(e2.getNombre(), "Beechfield", "Junio", "17343", "2", "57493", e2.getHorasTrabajadas(), 0, "ward");
    HojaTiempo m = new HojaTiempo(e3.getNombre(), "Beechfield", "Junio", "27394", "3", "06893", e3.getHorasTrabajadas(), 0, "dhiap");
    
    
    public static void main(String[] args) {
        System.out.println("Los costes de la empresa con los empleados son:  " +
                (e1.getCantidadRealizada() * e1.getTarifaProducto() * e1.getHorasTrabajadas())*
        (e2.getCantidadRealizada()* e2.getTarifaProducto() + e3.getHorasTrabajadas())*
        (e2.getCantidadRealizada()* e2.getTarifaProducto() * e3.getHorasTrabajadas()));
           
    }
}
