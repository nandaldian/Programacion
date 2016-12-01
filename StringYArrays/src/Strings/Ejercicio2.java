/*2.
 Escribe un método que, dado un String, devuelve otro objeto String en el que 
 se cambian todas las vocales minúsculas del original por la letra 'a'.
 Escribe un programa que permita comprobar el funcionamiento*/
package Strings;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        String cambiado = "0";
        System.out.println("Escribe la cadena que quieras");
        cadena = scanner.next();
        System.out.println(mayus(cadena, cambiado));
    }

    public static String mayus(String cadena, String cambiado) {

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (Character.isLowerCase(letra)) {
                cambiado = cadena.replace(letra, 'a');

            }

        }
        return cambiado;

    }
}