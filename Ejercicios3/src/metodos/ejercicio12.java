/*12. - Escribe  un  programa  en  Java  que,  dado  el  nomb
 re  de  una  persona  y  el 
 idioma de preferencia de esa persona, escriba en pa
 ntalla un saludo a esa 
 persona en el idioma elegido, con el estilo: ”Bueno
 s días Pepe Sánchez”. 
 Los idiomas disponibles serán 
 (a) Valenciano  
 (b) Castellano  
 Programación – DAM                                                                 U04 – Ejercicios1 
 2 
 (c) Inglés  
 El  saludo  se  mostrará  desde  un  procedimiento  al  que
 se  le  pasan  el 
 nombre y el código del idioma. Para el ejemplo ante
 rior, la llamada sería: 
 saludo (”Pepe Sánchez ”, ’b’)  */
package metodos;

import java.util.*;

public class ejercicio12 {

    public static void main(String[] args) {
        String nombre;
        char idioma;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("¿Qué idioma prefieres? Escribe la letra correspondiente \n(a)Castellano  \n(b)Valenciano \n(c)Inglés");
        idioma = scanner.next().charAt(0);
        hola(nombre, idioma);

    }

    public static void hola(String nombre, char idioma) {
        if (idioma == 'a') {
            System.out.println("Buenos días " + nombre);

        } else if (idioma == 'b') {
            System.out.println("Bon dia " + nombre);
        } else {
            System.out.println("Good morning " + nombre);
        }
    }
}
