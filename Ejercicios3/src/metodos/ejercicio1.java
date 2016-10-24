/*1. -  Escribe un método que devuelva la suma de dos 
 enteros */

package metodos;

import java.util.*;

public class ejercicio1 {

    public static void main(String[] args) {
    int num1;
    int num2;
    int resultado;
    Scanner tcl = new Scanner(System.in);        
    
        System.out.println("Escribe 2 numeros enteros");
        num1=tcl.nextInt();
        num2=tcl.nextInt();
        resultado = suma(num1, num2);
        System.out.println(resultado);
    }
    
     public static int suma (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
         
     }

}