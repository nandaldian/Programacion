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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Dime tu edad");
        edad = tcl.nextInt();
        if (edad > 18)
        System.out.println("Felicidades! eres mayor de edad!");
        else 
            System.out.println("Jo! aun eres menor!");
        
    }

}
