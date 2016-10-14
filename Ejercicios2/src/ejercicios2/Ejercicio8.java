
import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;
        int mes;
        int año;
        int dianac;
        int mesnac;
        int añonac;
        double diasedad = 0;
        double edad;

        System.out.println("Escribe la fecha actual. (Día, mes y año)");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        año = scanner.nextInt();

        System.out.println("Escribe la fecha en la que naciste. (Día, mes y año)");
        dianac = scanner.nextInt();
        mesnac = scanner.nextInt();
        añonac = scanner.nextInt();

        while (añonac < año) {
            añonac++;
            diasedad = diasedad + 365;

        }
        if (mesnac > mes) {
            mesnac--;
            diasedad = diasedad - 30;

        } else if (mesnac < mes) {
            mesnac++;
            diasedad = diasedad + 30;

        }
        while (dianac < dia) {
            dianac++;
            diasedad++;

        }
        while (dianac > dia) {
            dianac--;
            diasedad--;
        }
        edad = diasedad / 360;
        edad = (int) edad;

        System.out.println("Tienes " + edad + " años.");
    }

}
