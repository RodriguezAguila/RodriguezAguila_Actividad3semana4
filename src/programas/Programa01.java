/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/* 

 */
import java.util.Scanner;
public class Programa01 {
    public static void main(String[]args){
        //declarar variables
        int n1,n2,r,opc;
        r=0;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar numero 1:");
        n1=lectura.nextInt();
        System.out.print("Ingresar numero 2:");
        n2=lectura.nextInt();
        System.out.print("Operación a realizar[1(+),2(-),3(*),4(/)]");
        opc=lectura.nextInt();
        //proceso de datos
        switch (opc) {
            case 1:
                r=n1+n2;
                break;
            case 2:
                r=n1-n2;
                break;
            case 3:
                r=n1*n2;
                break;
            case 4:
                r=n1/n2;
                        
                break;
                
            default:
                throw new AssertionError();
        }
        //salida de datos
        System.out.println("Resultado");
        System.out.println("El resultado de la operacion es:"+r);
        
                
    }
            
    
}
