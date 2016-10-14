//Escribe un programa que calcule la cuota que se debe abonar en el club de
//golf. La cuota es de 500 €. Tendrán un 50% de descuento las personas
//mayores de 65 años y un 25% los menores de 18 años si los padres no son
//socios y 35% si los padres son socios
package ejercicios2;

import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;

        System.out.println("Introduce tu edad");
        edad = scanner.nextInt();
        if (edad >= 65) {
            System.out.println("Tu cuota es " + 500 * 0.5 + "€");
        } else if (edad < 18) {

            System.out.println("¿Tus padres son socios?(True/False)");
            boolean socios = scanner.nextBoolean();
            if (socios) {
                System.out.println("La cuota a pagar es " + 500 * 0.75 + "€");
            } else {
                System.out.println("La cuota a pagar es " + 500 * 0.65 + "€");
            }
        } else {
            System.out.println("La cuota a pagar es 500€");
        }

    }

}
