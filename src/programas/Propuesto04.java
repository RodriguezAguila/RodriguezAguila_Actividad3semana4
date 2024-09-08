
package programas;

import java.util.Scanner;
public class Propuesto04 {
    public static void main(String[] args) {
        int numero;
        String periodo="";
        
        //Entrada de datos
        
        Scanner lectura=new  Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese un numero entero [1,2,3,4,6,12]:");
        numero=lectura.nextInt();
        
        //proceso de datos
        
        switch (numero) {
            case 1: periodo="ANUAL";break;
            case 2: periodo="SEMESTRAL";break;
            case 3: periodo="CUATRIMESTRAL";break;
            case 4: periodo="TRIMESTRAL";break;
            case 6: periodo="BIMESTRAL";break;
            case 12: periodo="MENSUAL";break;
            
                
               
        }
    
        System.out.println("El periodo Anual es:" +periodo);
        
    }
    
}
