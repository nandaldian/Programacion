/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class persona {
    private String nombre;
    private int edad;
    
    public void inicializar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombre");
        nombre=scanner.next();
        System.out.println("Ingresa edad");
        edad=scanner.nextInt();
        }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Nombre: "+edad);
    }
    
    public void esMayorEdad() {
        if (edad>18){
            System.out.println(nombre + " es mayor de edad");
            } else {
            System.out.println(nombre + " es menor de edad");
        }
    }
    
}
