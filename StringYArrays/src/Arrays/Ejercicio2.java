/*
 2. Escribe un programa que permita introducir un vector de diez
 elementos alfanuméricos y luego visualizar los que ocupen la posición
 par.
 Repetir para los de posición impar.
 */
package Arrays;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        String[] vec = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escríbeme diez elementos alfanuméricos");

        for (int i = 0; i < 10; i++) {
            vec[i] = scanner.next();
        }

        for (int i = 0; i < vec.length; i++) { //Suponemos que 0 es par. 
            if (i % 2 == 0) {
                System.out.println("El carácter(" + vec[i] + ") de la posición " + i + " es par.");
            } else {
                System.out.println("El carácter(" + vec[i] + ") de la posición " + i + " es impar.");
            }

        }

    }

}