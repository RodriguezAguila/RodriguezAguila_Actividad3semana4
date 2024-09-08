
package programas;

/**
 *
 * @author ALIEN
 */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        int numero;
        String diasem="";
        Scanner lectura=new Scanner(System.in);
        
        //entrada de datos
        System.out.print("Ingresa un numero[1-7]:");
        numero=lectura.nextInt();
        //proceso de datos
        
        switch (numero) {
            case 1:diasem="lunes";break; 
            case 2:diasem="Martes";break;
            case 3:diasem="Miercoles";break;
            case 4:diasem="Jueves";break;
            case 5:diasem="Viernes";break;
            case 6:diasem="Sabado";break;
            case 7:diasem="Domingo";break;
            
                
        
        }
        //Salida de datos
        
        System.out.print("El nombre del dia de la semana es:"+diasem);
    }
    
}
