
package puntooo2;
import java.util.*;

public class Beechfield {
    
    private LineaProduccion linea_uno;
    private LineaProduccion linea_dos;
    private LineaProduccion linea_tres;   
    private ArrayList<Nomina> nomina = new ArrayList<Nomina>();
    
    public Beechfield(){        
        //Supervisor s1 = new Supervisor("Pedro", "3840834");
        this.linea_uno = new LineaProduccion(8, "papas", 50, null, null);
        this.linea_dos = new LineaProduccion(8, "sevoyas", 55, null, null);
        this.linea_tres = new LineaProduccion(8, "hortalizas", 45, null, null);
        this.test();
    }    
    
    
    public void test(){
        ArrayList<Empleado> emp1 = new ArrayList<Empleado>();
        
         Empleado e1 = new Empleado("Camilo", "1234", 9, 50, "baja");
         Empleado e2 = new Empleado("Vargas", "4321", 6, 45, "baja");
         Empleado e3 = new Empleado("Franco", "2341", 9, 60, "baja");
         emp1.add(e1);
         emp1.add(e2);
         emp1.add(e3);
         
         ArrayList<Empleado> emp2 = new ArrayList<Empleado>();
        
         Empleado ee1 = new Empleado("Zlatan", "0987", 5, 49, "baja");
         Empleado ee2 = new Empleado("Gabriel", "8709", 9, 51, "baja");
         Empleado ee3 = new Empleado("Ibrahimovic", "8777", 7, 70, "baja");
         emp1.add(ee1);
         emp1.add(ee2);
         emp1.add(ee3);
         
         ArrayList<Empleado> emp3 = new ArrayList<Empleado>();
        
         Empleado eee1 = new Empleado("Ã�lvaro", "0000", 7, 30, "baja");
         Empleado eee2 = new Empleado("Uribe", "1111", 10, 25, "baja");
         Empleado eee3 = new Empleado("VÃ©lez", "2222", 9, 100, "baja");
         emp1.add(eee1);
         emp1.add(eee2);
         emp1.add(eee3);
         
         Supervisor s1 = new Supervisor("AL QA EDA", "2345");
         Supervisor s2 = new Supervisor("HAMAS", "7654");
         Supervisor s3 = new Supervisor("ISIS", "2534");
         
         linea_uno.setEmpleados(emp1);
         linea_dos.setEmpleados(emp2);
         linea_tres.setEmpleados(emp3);
         
         linea_uno.setSupervisor(s1);
         linea_dos.setSupervisor(s2);
         linea_tres.setSupervisor(s3);
         
         
         HojaRegistro hoja1 = new HojaRegistro(linea_uno.getSerie(), linea_uno.getProducto(), s1, "01/02/03", "12", "jueves", 0, 8, "Ningun problema", 0, 51);
         HojaRegistro hoja2 = new HojaRegistro(linea_dos.getSerie(), linea_dos.getProducto(), s2, "01/02/03", "12", "jueves", 3, 11, "Ningun problema", 0, 78);
         HojaRegistro hoja3 = new HojaRegistro(linea_tres.getSerie(), linea_tres.getProducto(), s3, "01/02/03", "12", "jueves", 5, 13, "Ningun problema", 0, 34);
         
         
         ArrayList<HojaTiempo> registrosTiempo1 = new ArrayList<HojaTiempo>();
         
         HojaTiempo h1 = new HojaTiempo(e1.getNombre(),"Beechfield", "01/02/03", "2143", linea_uno.getProducto(),   "1", 15,  0, "kuy67");
         HojaTiempo h2 = new HojaTiempo(e2.getNombre(),"Beechfield", "01/02/03", "9876", linea_dos.getProducto(),   "2", 13,  0, "mkl89");
         HojaTiempo h3 = new HojaTiempo(e3.getNombre(),"Beechfield", "01/02/03", "0457", linea_tres.getProducto(),   "3", 12,  0, "txt576");
        
         registrosTiempo1.add(h1);
         registrosTiempo1.add(h2);
         registrosTiempo1.add(h3);
         
         ArrayList<HojaTiempo> registrosTiempo2 = new ArrayList<HojaTiempo>();
         
         HojaTiempo hj1 = new HojaTiempo(ee1.getNombre(),"Beechfield", "01/02/03", "1243", linea_uno.getProducto(),   "1", 16,  0, "ef2ji");
         HojaTiempo hj2 = new HojaTiempo(ee2.getNombre(),"Beechfield", "01/02/03", "4984", linea_dos.getProducto(),   "2", 17,  0, "jdh9w");
         HojaTiempo hj3 = new HojaTiempo(ee3.getNombre(),"Beechfield", "01/02/03", "3827", linea_tres.getProducto(),   "3", 82,  0, "iehw8");
         
         registrosTiempo1.add(hj3);
         registrosTiempo1.add(hj3);
         registrosTiempo1.add(hj3);
         
         ArrayList<HojaTiempo> registrosTiempo3 = new ArrayList<HojaTiempo>();
         
         HojaTiempo hk1 = new HojaTiempo(eee1.getNombre(),"Beechfield", "01/02/03", "1038", linea_uno.getProducto(),   "1", 12,  0, "jbbw9");
         HojaTiempo hk2 = new HojaTiempo(eee2.getNombre(),"Beechfield", "01/02/03", "1739", linea_dos.getProducto(),   "2", 11,  0, "jw89");
         HojaTiempo hk3 = new HojaTiempo(eee3.getNombre(),"Beechfield", "01/02/03", "1038", linea_tres.getProducto(),   "3", 22,  0, "kwnie9");
         
         registrosTiempo1.add(hj3);
         registrosTiempo1.add(hj3);
         registrosTiempo1.add(hj3);
         
        s1.setHojaTiempos(registrosTiempo1);
        s1.setHojaTiempos(registrosTiempo2);
        s1.setHojaTiempos(registrosTiempo3);
        
        
    }
    
    public void mostrarEmp(){
        
    }
           
}