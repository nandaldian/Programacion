package ejercicios2;
import java.util.*;

public class Ejercicio8b {

    public static void main(String args[]) {
        int n;
        boolean parar;
        parar = false;
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca un número");
        n = tec.nextInt();

        if (n == 0) {
            System.out.println("El número 0 no es primo");
        }
        if (n == 1) {
            System.out.println("El número 1 es primo");
        }
        for (int i = 2; parar == false; i++) {
            if (n % i == 0 && n != i) {
                System.out.println("El número " + n + " no es primo");
                parar = true;
            } else if (n % i == 0 && n == i) {
                System.out.println("El número " + n + " es primo");
                parar = true;
            }
        }
    }
}
