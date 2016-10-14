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
public class SwitchCase {
    public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);
    int dia;
    
    System.out.println("Introduce un numero de dia");
    dia = tcl.nextInt();
    
    switch (dia){
        case 1:
            System.out.println("lunes");
            break;
        case 2:
            System.out.println("martes");
            break;
        case 3:
            System.out.println("miercoles");
            break;
        case 4:
            System.out.println("jueves");
            break;
        case 5:
            System.out.println("viernes");
            break;
        case 6:
            System.out.println("sabado");
        case 7:
            System.out.println("domingo");
            
    } 
        
        
        
        
        
    }
}
