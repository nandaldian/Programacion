package ejercicios2;

import java.util.*;

public class Ejercicio4b {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        long contador = 0;
        System.out.println("Escribe dos números enteros en orden ascendente");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("fuck off, bitch");
        }

        while (num1 < num2) {
            System.out.print(num1 + " ");

            if (num1 % 2 == 0) {
                contador++;
            }
            num1++;
        }

        System.out.println(num2);
        System.out.println("Hay " + contador + " números pares entre tus dos números");
    }

}
