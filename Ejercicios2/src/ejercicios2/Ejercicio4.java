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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduce un numero real");
        num1 = tcl.nextInt();
        System.out.println("Intruduce un 2º numero real");
        num2 = tcl.nextInt();
        
        if (num1>num2){
            System.out.println("De menor a mayor seria : "+num2+ " y"+ num1);
        } else if (num1<num2)
            System.out.println("De mayor a menos seria : " +num1+ " y"+ num2);
         else 
            System.out.println("Los numeros" +num1+ " y"+ num2+ "son iguales");
            
        
       
        
        
        
    }
    
}
