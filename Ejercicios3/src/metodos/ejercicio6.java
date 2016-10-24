/*6. -  Escribe un método que acepte dos argumentos: e
 l carácter que se desea 
 imprimir y el número de veces que se imprime */
package metodos;

import java.util.*;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char letra;
        double vueltas;

        System.out.println("Escribe la letra que quieras imprimir en pantalla");
        letra = scanner.next().charAt(0);
        System.out.println("Escribe la cantidad de veces que quieres que se imprima");
        vueltas = scanner.nextDouble();

        while (vueltas > 0) {
            System.out.print(letra);
            vueltas--;
        }
        System.out.println();

    }
}
