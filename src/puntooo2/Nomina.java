
package puntooo2;


public class Nomina {
    
    Empleado empleado;
    double salario;
    
    public Nomina(Empleado e, HojaRegistro hojaR, HojaTiempo hojaT){
        
        this.empleado = empleado;
        salario = salarioEmpleado(hojaR, hojaT);
    }   
    
    private double salarioEmpleado(HojaRegistro hojaR, HojaTiempo hojaT) {
        if(hojaR.getLinea() == 1){
            salario += 15;
        }else if(hojaR.getLinea() == 2){
            salario+=5;
        }else if(hojaR.getLinea() == 3){
            salario+=10;
        }
        
        if(empleado.getCategoria() == "insecto"){
            salario += 5;
        }else if(empleado.getCategoria() == "baja"){
            salario += 10;
        }else if(empleado.getCategoria() == "saiyajin"){
            salario += 15;
        }
        
        salario = salario + hojaT.getHorasProducidas() -( hojaT.getTiempoInactividad() + hojaR.getTiempoProblema()) + 
                 hojaR.getInicioSerie() - hojaR.getFinalSerie() + hojaR.getCantidadProducida()*5;
        
        return salario;
    }
    
}