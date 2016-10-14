
import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;
        int mes;
        int año;
        boolean bisiesto;
        System.out.println("Escribe el día, el mes, y el año de tu fecha a comprobar.");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        año = scanner.nextInt();

        if (mes > 0 && mes < 12) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia > 0 && dia < 32) {
                        System.out.println("Tu fecha es correcta");

                    } else {
                        System.out.println("Tu fecha es incorrecta");
                    }
                    break;
                case 2:
                    bisiesto = año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
                    if (bisiesto == true) {
                        if (dia > 0 && dia < 30) {
                            System.out.println("Tu fecha es correcta");
                        } else {
                            System.out.println("Tu fecha es incorrecta");
                        }
                    } else if (dia > 0 && dia < 29) {
                        System.out.println("Tu fecha es correcta");
                    } else {
                        System.out.println("Tu fecha es incorrecta");
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia > 0 && dia < 31) {
                        System.out.println("Tu fecha es correcta");
                    } else {
                        System.out.println("Tu fecha es incorrecta");
                        break;

                    }

            }

        } else {
            System.out.println("Tu fecha es incorrecta");
        }
    }
}
