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
public class Ejercicio2 {
     public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Dime tu edad");
        edad = tcl.nextInt();
     
        if (edad >= 25)
             System.out.println("Felicidades tienes o eres mayor de 25 años ");
            else
               System.out.println("Vaya! tienes menos de 25 años...");
        
        
     }
}



    

