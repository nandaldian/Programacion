/*7. -  Escribe un método que acepte tres argumentos: 
 un carácter y dos enteros.  
 El  carácter  se  debe  imprimir.  El  primer  entero  indi
 ca  el  número  de  veces 
 que  se  imprimirá  el  carácter  en  la  línea  y  el  segun
 do  entero  indica  el 
 número de líneas que deben imprimir-se. */
package metodos;

import java.util.*;

public class ejercicio7 {

    public static void main(String[] args) {
        char carac;
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácterer a imprimir");
        carac = scanner.next().charAt(0);
        System.out.println("Introduce un número entero. (Carácteres por linea)");
        num1 = scanner.nextInt();
        System.out.println("Introduce un número entero.(Número de lineas)");
        num2 = scanner.nextInt();
        imprime(carac, num1, num2);

    }

    public static void imprime(char carac, int num1, int num2) {
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print(carac);
            }
            System.out.println();
        }
    }
}
