/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Ejercicio8 {
    public static void main(String[] args) {
 int edad;
 Scanner tcl = new Scanner(System.in);
 
 
 GregorianCalendar fecha= new GregorianCalendar();
 int diaHoy= fecha.get(GregorianCalendar.DAY_OF_MONTH);
 int mesHoy= fecha.get(GregorianCalendar.MONTH)+1;
 int anyoHoy=fecha.get(GregorianCalendar.YEAR) ;

 System.out.printf("%d/%d/%d \n\n" ,diaHoy,mesHoy,anyoHoy);
 
System.out.println("Introduce tu fecha de nacimiento");

        
 
 
 
    }
 
    
}
