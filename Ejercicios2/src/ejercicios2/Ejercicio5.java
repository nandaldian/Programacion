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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota;
        
        System.out.println("Escribe tu nota del 0 al 10");
        nota = tcl.nextInt();
        
        if (nota <= 3)
            System.out.println("MD");
        else if (nota <5)
            System.out.println("INS");
        else if (nota <6)
            System.out.println("SUF");
        else if (nota <7)
            System.out.println("BIEN");
        else if (nota <9)
            System.out.println("NOT");
        else if (nota <=10)
            System.out.println("SOB");
        
        
        
        
        
    }
}
