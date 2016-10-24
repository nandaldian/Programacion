/*10. - Escribe un método que acepte un entero y calc
 ule su factorial n! */
package metodos;

import java.util.*;

public class ejercicio10 {

    public static void main(String[] args) {
        double num;
        double factorial = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el número");
        num = scanner.nextDouble();
        factorial = factorial(num, factorial);
        System.out.println("El factorial de tu número es " + factorial);

    }

    public static double factorial(double num, double factorial) {
        while (num != 0) {
            factorial = factorial * num;
            num--;
        }
        return factorial;
    }
}
