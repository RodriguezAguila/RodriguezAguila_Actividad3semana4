/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;
public class Propuesto03 {
    public static void main(String[] args) {
        int numero;
        String ingles="";       
        
        Scanner lectura=new Scanner(System.in);
        
        //entrada de datos
        System.out.print("Ingresa un numero[1-6]:");
        numero=lectura.nextInt();
        
        //proceso de datos
        
        switch (numero) {
            case 1: ingles="ONE";break;
            case 2: ingles="TWO";break;
            case 3: ingles="THREE";break;
            case 4: ingles="FOUR";break;
            case 5: ingles="FIVE";break;
            case 6: ingles="SIX";break;
            
               
        }
        //SALIDA DE DATOS
        
        System.out.println("El numero en Inglés es:" +ingles);
     
    }
    
    
}
