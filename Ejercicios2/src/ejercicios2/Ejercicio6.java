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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double dinero;
        double monedas200 = 0;
        double monedas100 = 0;
        double monedas50 = 0;
        double monedas20 = 0;
        double monedas10 = 0;
        double monedas5 = 0;
        double monedas2 = 0;
        double monedas1 = 0;
        
        System.out.println("Introduce la cantidad de euros");
        dinero = tcl.nextDouble();
        
        dinero = (int)(dinero*100);
        
        while (dinero >=200){
            dinero = dinero -200;
            monedas200++;
        }
        while (dinero >=100){
            dinero = dinero -100;
            monedas100++;
        }
        while (dinero >=50){
            dinero = dinero -50;
            monedas50++;
        }
        while (dinero >=20){
            dinero = dinero -20;
            monedas20++;
        }
        while (dinero >=10){
            dinero = dinero -10;
            monedas10++;
        }
        while (dinero >=5){
            dinero = dinero -5;
            monedas200++;
        }
        while (dinero >=2){
            dinero = dinero -2;
            monedas2++;
        }
        while (dinero >=1){
            dinero = dinero -1;
            monedas200++;
        }
        
        System.out.println((int)monedas200+ " monedas de 2€ " + (int)monedas100+ " monedas de 1€ " + (int)monedas50 + " monedas de 50cent " + (int)monedas20 + " monedas de 20cent " + (int)monedas10 + " monedas de 10cent " + (int)monedas5 + " monedas de 5 cent " + (int)monedas2 + " monedas de 2 cent " +(int)monedas1 + " monedas de 1 cent ");
        
        
        
           }
    
}
