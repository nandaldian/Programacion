/*
 4.
 Escribe  un  programa  que  permita introducir  vector  numérico  de  diez elementos, 
 visualizarlo y luego visualizar los elementos cuyo contenido sea par, indicando su posición.
 Repetir para impar
 */
package Arrays;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Escríbeme diez enúmeros");

        for (int i = 0; i < 10; i++) {
            num[i]=scanner.nextInt();
            //num[i] = rn.nextInt(500); Utilizar esto para random
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("El carácter(" + num[i] + ") de la posición " + (i + 1) + " es par.");
            } else {
                System.out.println("El carácter(" + num[i] + ") de la posición " + (i + 1) + " es impar.");
            }

        }

    }

}