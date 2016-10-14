/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
            System.out.println("Escribe un numero");
            num = tcl.nextInt();
            if (num % 2 == 0 ){
                System.out.println("El numero indicado es par");
            } else
                    System.out.println("El numero es impar");
            
                
        
    }
    
}
