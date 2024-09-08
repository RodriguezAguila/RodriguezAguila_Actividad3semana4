/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 *
 * @author ALIEN
 */
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
        int numero;
        String estacion="";
        Scanner lectura=new Scanner(System.in);
        
        //entrada de datos
        System.out.print("Ingresa un numero[1-12]:");
        numero=lectura.nextInt();
        //proceso de datos
        
        switch (numero) {
            case 1: 
            case 2:
            case 3:
                estacion="Verano";break;
            case 4:
            case 5:
            case 6:
                estacion="Otoño";break;
            case 7:
            case 8:
            case 9:
                estacion="Invierno";break;
            case 10:
            case 11:
            case 12:
                estacion="Primavera";break;
    }
        
    System.out.println("El nombre de la estacion del año es:" +estacion);
}
}