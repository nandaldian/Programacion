
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 * 
 * Es un ejercicio inventado, con ejercicios anteriores reflejados.
 */
public class EjercicioNumTres {
    public static void main(String[ ] args) {
        Scanner tcl = new Scanner(System.in); int año;
        System.out.println("¿En que año naciste?");
        año=tcl.nextInt();
        System.out.println("Tienes: "+(2016-año));
            año=2016-año;
        System.out.println("Te quedan : "+(50-año)+" para llegar a los 50!");
        
    }
            
    
}
