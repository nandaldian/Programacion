/*13. - Escribe un programa que solicite  un número  
 y visualizar en pantalla si es 
 o no un número perfecto.                                       
 Un  número  se  considera  perfecto  cuando  la  suma  de  s
 us  divisores, 
 excepto el mismo, es igual al propio número. */
package metodos;

import java.util.*;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;

        System.out.println("Escribe el número que quieras comprobar");
        num = scanner.nextDouble();
        perfecto(num);

    }

    public static void perfecto(double num) {
        double divisor = num - 1;
        double suma = 0;
        while (divisor != 0) {
            if (num % divisor == 0) {
                suma = suma + divisor;
            }
            divisor--;
        }
        if (num == suma) {
            System.out.println("Tu número es perfecto");
        } else {
            System.out.println("Tu número no es perfecto");
        }
    }
}
