/*
 3.
 Escribe un programa que permita introducir un vector de 20 elementos 
 numéricos y visualizarlos de cuatro en cuatro.
 */
package Arrays;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();
        int[] num = new int[20];

        for (int i = 0; i < 20; i++) {
            // num[i]=scanner.nextInt(); Utilizaríamos un scanner de esta forma. 
            num[i] = rn.nextInt(5000);
            if (i % 4 == 0) {
                System.out.println("\nEl número " + (i + 1) + " es el " + num[i]);
            } else {
                System.out.println("El número " + (i + 1) + " es el " + num[i]);
            }

        }
    }
}