/*9. -  Se  llama  media  armónica  de  dos  números  el  resu
 ltado  obtenido    al 
 calcular los inversos de los números, calcular la m
 edia y calcular el inverso 
 del  resultado.  Escribe  un  método  que  acepte    dos  ar
 gumentos  double  i 
 devuelva la media armónica de los números. */
package metodos;

import java.util.*;

public class ejercicio9 {

    public static void main(String[] args) {

        //el ejercicio nos pide la media armonica
        //se define la media armonica como: para n números, siendo estos
        //x1,x2,x3...etc como:  n/((1/x1)+(1/x2)...)
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0;

        System.out.println("Escribe el primer número para la M.A");
        num1 = scanner.nextDouble();
        System.out.println("Escribe el segundo número para la M.A");
        num2 = scanner.nextDouble();
        result = armonica(num1, num2, result);
        System.out.println("El resutlado es " + result);

    }

    public static double armonica(double num1, double num2, double result) {
        result = (2 / ((1 / num1) + (1 / num2)));

        return result;
    }
}
