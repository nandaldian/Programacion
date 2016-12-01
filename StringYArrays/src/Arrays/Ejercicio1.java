/*
 1. Escribe un programa que permita introducir los valores de un vector de
 diez elementos numéricos y luego imprimirlos.
 */
package Arrays;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escríbeme diez números");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1));
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print("[" + num[i] + "], ");
        }
    }

}