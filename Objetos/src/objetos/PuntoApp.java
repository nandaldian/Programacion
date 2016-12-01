/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class PuntoApp {
    public static void main(String[] args) {
        int coorX, coorY;
        Punto punto1;
        punto1=new Punto();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa coordenada X :");
        coorX=teclado.nextInt();
        
        System.out.println("Ingresa coordenada Y :");
        coorY=teclado.nextInt();
        punto1.setCoordenadas(coorX, coorY);
       
        System.out.println("Hablamos del punto (" +punto1.getCoordenadaX()+" , "+punto1.getCoordenadaY()+" ) ");
        punto1.imprimirCuadrante();
        
    }
}
