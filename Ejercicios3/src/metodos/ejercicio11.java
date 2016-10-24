/*
 11. - Escríbase  un  método  que  dados  4  números  enter
 os  pasados  como 
 parámetros, compruebe si dicha secuencia de números
 es capicúa. 
 */
package metodos;

import java.util.*;

public class ejercicio11 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el primer número");
        num1 = scanner.nextInt();
        System.out.println("Escribe el segundo número");
        num2 = scanner.nextInt();
        System.out.println("Escribe el tercero número");
        num3 = scanner.nextInt();
        System.out.println("Escribe el cuarto número");
        num4 = scanner.nextInt();
        if (num1 - 10 >= 0 && num2 - 10 >= 0 && num3 - 10 >= 0 && num4 - 10 >= 0) {
            System.out.println("Así no...");
        } else {
            capi(num1, num2, num3, num4);
        }

    }

    public static void capi(int num1, int num2, int num3, int num4) {
        if (num1 == num4 && num2 == num3) {
            System.out.println("Tu número es capicua");
        } else {
            System.out.println("Tu número no es capicua");
        }

    }
}
