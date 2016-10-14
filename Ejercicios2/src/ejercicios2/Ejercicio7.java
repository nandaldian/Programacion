//Escribe un programa que calcule la cuota que se debe abonar en el club de
//golf. La cuota es de 500 €. Tendrán un 50% de descuento las personas
//mayores de 65 años y un 25% los menores de 18 años si los padres no son
//socios y 35% si los padres son socios
package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner tcl =  new Scanner(System.in);
        int edad;
        String resp;
        
        System.out.println("Introduce tu edad: ");
        edad = tcl.nextInt();
        tcl.nextLine();
        
           if (edad >= 65){
               System.out.println("Dispone de un descuento del 50%, a pagar un total de : " +(500-(500*0.5)));
           }
                if (edad < 18){
                    System.out.println("Son tus padres socios? S/N");
                    resp = tcl.next();
                                   
                    if (resp.toLowerCase().charAt(0) == 's')
                         System.out.println("Tu descuento es de 35%, a pagar: "+(500-(500*0.35)));
                    else
                         System.out.println("Tu descuento es de 25%, a pagar: "+(500-(500*0.25)));
                
                }        
    }
    
}
