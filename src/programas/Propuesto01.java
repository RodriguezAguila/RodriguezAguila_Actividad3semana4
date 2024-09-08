
package programas;


import java.util.Scanner;
public class Propuesto01 {
    public static void main(String[] args){
        int numero;
        String numpalabra="";
        Scanner lectura=new Scanner(System.in);
        
        //entrada de datos
        System.out.print("Ingresa un numero[1-5]:");
        numero=lectura.nextInt();
        //proceso de datos
        
        switch (numero) {
            case 1:numpalabra="uno";break; 
            case 2:numpalabra="dos";break;
            case 3:numpalabra="tres";break;
            case 4:numpalabra="cuatro";break;
            case 5:numpalabra="cinco";break;
            
            
                
        
        }
        //Salida de datos
        
        System.out.print("El numero en palabra es:"+numpalabra);
    }
    
}
