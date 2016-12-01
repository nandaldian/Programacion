/*
 3.
 Escribe  un  método  que,  dada  una  cadena  de  caracteres,  devuelve  la  mitad 
 inicial  de  la  cadena.  Escribe  un  programa  que  pruebe  el  método  con  las 
 cadenas “Hola que tal” y “Adiós”.
 */
package Strings;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la cadena");
        String cadena = scanner.nextLine();
        System.out.println(mitad(cadena));

    }

    public static String mitad(String cadena) {
        String mid;
        mid = cadena.substring(0, (cadena.length() / 2));
        return mid;
    }
}