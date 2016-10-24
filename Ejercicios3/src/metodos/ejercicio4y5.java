/*4. -  Escribe un método que devuelva el mayor de  tr
 es números 
 5. -  Diseña  un  método  que  devuelva  el  mayor  de  cuat
 ro  números  que  se  le 
 pasan como argumentos. */
package metodos;

import java.util.*;

public class ejercicio4y5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int mayor = 0;

        System.out.println("Escribe cuatro números");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        mayor = max(num1, num2, num3, num4, mayor);
        System.out.println("El número más grandes es " + mayor);
    }

    public static int max(int num1, int num2, int num3, int num4, int mayor) {
        mayor = num1;

        if (mayor < num2) {
            mayor = num2;
        }
        if (mayor < num3) {
            mayor = num3;
        }
        if (mayor < num4) {
            mayor = num4;
        }

        return mayor;

    }
}