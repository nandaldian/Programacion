/*8. -  Escribe una método que acepte dos argumentos: 
 el carácter que se desea 
 imprimir y el número de líneas que se imprimen en f
 orma triangular 
 a 
 aaa 
 aaaaa 
 aaaaaaa */
package metodos;

import java.util.*;

public class ejercicio8 {

    public static void main(String[] args) {
        char carac;
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el carácter a imprimir");
        carac = scanner.next().charAt(0);
        System.out.println("Introduce el número de líneas");
        num = scanner.nextInt();
        imprime(carac, num);

    }

    public static void imprime(char carac, int num) {
        for (int i = 0; i <= num; i++) {
            for (int esp = 0; esp <= num - i; esp++) {
                System.out.print(" ");
            }
            for (int caracrep = 0; caracrep < i * 2 - 1; caracrep++) {
                System.out.print(carac);
            }
            System.out.println();
        }
    }

}
