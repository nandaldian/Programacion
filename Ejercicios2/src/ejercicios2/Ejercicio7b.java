package ejercicios2;
import java.util.*;

public class Ejercicio7b {

    public static void main(String[] args) {

        double base;
        double exp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la base");

        base = scanner.nextDouble();

        System.out.println("Escribe el exponente al que está elevado la base");

        exp = scanner.nextDouble();

        System.out.println(Math.pow(base, exp));

    }
}
