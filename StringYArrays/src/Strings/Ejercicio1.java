/*1.
 Escribe  un  programa  que solicite  tres cadenas  de  caracteres,  una  llamada nombre, otra  llamada 
 primerApellido  y  segundoApellido.  El  programa  debe crear una cadena con el nombre completo y después mostrar por pantalla:

 el nombre completo con todos los caracteres en minúsculas y luego en mayúsculas y su longitud

 los  dos  primeros  caracteres  de  la  cadena  (solo  en  el  caso  de  que  la longitud de esta sea de dos o más caracteres)

 los  dos  últimos  caracteres  de  la  cadena  (solo  en  el  caso  de  que  la  longitud de esta sea de dos o más caracteres)

 el número de ocurrencias en la cadena del último carácter

 la cadena con todas las ocurrencias del primer carácter en mayúsculas

 la cadena con tres asteriscos por delante  y por detrás

 la cadena invertida*/
package Strings;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nom;
        String ape1;
        String ape2;
        
        System.out.println("Escribe tu nombre");
        nom=scanner.nextLine();
        System.out.println("Escribe tu primer apellido");
        ape1=scanner.nextLine();
        System.out.println("Escribe tu segundo apellido");
        ape2=scanner.nextLine();
        
        String nombre = nom +" " + ape1 + " " + ape2;
        System.out.println("Hola, " + nombre);
        System.out.println("Este es tu nombre en minusculas: "+ nombre.toLowerCase());
        System.out.println("Este es tu nombre en mayusculas: "+ nombre.toUpperCase());
        System.out.println("Esta es la longitud de tu nombre: " + nombre.length());
        
        if (nombre.length() > 2){
            System.out.println("Los 2 primeros caracteres de tu nombre:");
            System.out.println(nombre.substring(0,2));
            System.out.println("Los 2 ultimos caracteres de tu nombre:");
            System.out.println(nombre.substring(nombre.length()-2));
        }
        else{
            System.out.println("Tu nombre es muy corto!!!!");
        }
        
        int contador = 0;

        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == (nombre.charAt(nombre.length() - 1))) {
                contador++;
            }
        }
        System.out.println("La última letra de tu nombre se repite " + contador + " veces");
    
        char primera = nombre.charAt(0);
        char primeraMayus;
        primeraMayus = Character.toUpperCase(primera);
        System.out.println("Tu nombre con la primera letra(en todas sus apariciones) en mayúsculas. " + nombre.replace(primera, primeraMayus));
        
        System.out.println("*** "+ nombre + " ***");
        
        
        
        System.out.println("Tu nombre al revés. " + new StringBuilder(nombre).reverse().toString());
        
}        
}
    
    
    
    
    
    
    
    
    
    
    


