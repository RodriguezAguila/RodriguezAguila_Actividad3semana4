/*
 Crear un programa que permita ingresar un número (1-10) entero. Visualizar el número en romanos
 */
package programas;

import java.util.Scanner;
public class Propuesto02 {
    public static void main(String[] args) {
        int numero;
        String romano="";
        
        //Entrada de datos
        
        Scanner lectura=new  Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese un numero entero de [1-10]:");
        numero=lectura.nextInt();
        
        //proceso de datos
        
        switch (numero) {
            case 1: romano="I";break;
            case 2: romano="II";break;
            case 3: romano="III";break;
            case 4: romano="VI";break;
            case 5: romano="V";break;
            case 6: romano="VI";break;
            case 7: romano="VII";break;
            case 8: romano="VIII";break;
            case 9: romano="IX";break;
            case 10:romano="X";break;
                
               
        }
    
        System.out.println("el numero en Romano es:" +romano);
        
    }
    
}
