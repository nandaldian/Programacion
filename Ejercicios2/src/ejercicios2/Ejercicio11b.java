package ejercicios2;
import java.util.*;

public class Ejercicio11b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nAdivinar = (int) (Math.random() * 100);
        nAdivinar++;
        int n = 0;
        int intentos = 0;
        do {
            System.out.print("Introduzca un numero(1-100): ");
            n = teclado.nextInt();
            intentos++;
            System.out.println("El numero introducido fue: " + n);

            if (n > nAdivinar) {
                System.out.println("El numero es menor. Intentalo otra vez,");
            }
            if (n < nAdivinar) {
                System.out.println("El numero es mayor.Intentalo otra vez,");
            }
        } while (n != nAdivinar);
        System.out.println("Enhorabuena. Lo ha adivinado. El numero era: " + nAdivinar);
        System.out.println("Lo ha conseguido en " + intentos + " intentos.");
    }
}
