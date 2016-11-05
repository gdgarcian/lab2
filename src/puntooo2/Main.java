
package puntooo2;

import java.util.Scanner;

public class Main { 
    
    public void menu(){
              System.out.println("1) Ver empleados");
              System.out.println("2) Ver costos empresa");
              System.out.println("3) Costo total de la empresa");
              System.out.println("4) Ver produccion");
              System.out.println("5) Registrar tiempos");
    }    
    
    public static void main(String[] args) {
        
            while(true){
                
                Scanner entrada = new Scanner(System.in);                
                int seleccion = entrada.nextInt();
                switch(seleccion){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
                
            }
        }       
}
