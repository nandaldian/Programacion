/*3. -  Escribe un método que devuelva el mayor de dos
 números */
package metodos;

import java.util.*;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        System.out.println("Escribe dos números");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = max(num1, num2);
        System.out.println("El número más grandes es " + result);
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }
}
