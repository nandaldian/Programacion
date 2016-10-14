/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ejercicio12 {
    public static void main(String[ ] args){
        double pi=3.14, diam=15.5, alt=42.4, AreaLateral;
        System.out.println("El cilindro tiene una altura de: " +alt);
        System.out.println("Un diametro de: "+diam);
        System.out.println("Su area lateral es: 2*pi*radio*altura -->" +2*pi*(diam/2)*alt);
        AreaLateral=2*pi*(diam/2)*alt;
        System.out.println("Por lo tanto su area total es : AreaLateral+2*pi*r² -->" +AreaLateral+2*pi*diam);
        
    }
    
}
