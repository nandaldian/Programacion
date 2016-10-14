package ejercicios2;
import java.util.*;

public class Ejercicio9b {

    public static void main(String[] args) {
        long numeroInicial, numero;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        numeroInicial = scan.nextLong();
        if (numeroInicial > 1) {
            int factor = 2;
            numero = numeroInicial;
            System.out.println(numero + " = ");
            while (numero > factor) {
                if (numero % factor == 0) {
                    numero /= factor;
                    System.out.println(factor + " * ");
                } else {
                    factor++;
                }
            }
            System.out.println(factor);
        }

    }

}
