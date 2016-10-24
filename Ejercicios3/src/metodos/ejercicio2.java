//Escribe un programa que calcule el área y la longitud de una
//circunferencia en función del radio (leído desde teclado). Se ha de escribir
//un método para calcular el área y otro para la longitud. Las fórmulas del
//área y la longitud de una circunferencia: A=π * r2
// y L=2*π * r 
package metodos;

import java.util.*;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radio;
        double resultadoA;
        double resultadoL;

        System.out.println("Escribe el radio de la circunferencia");
        radio = scanner.nextDouble();
        resultadoA = area(radio);
        System.out.println("El área es " + resultadoA);
        resultadoL = longitud(radio);
        System.out.println("La longitud es " + resultadoL);
    }

    public static double area(double radio) {
        double resultadoA;
        double pi = java.lang.Math.PI;

        resultadoA = (pi * java.lang.Math.pow(radio, 2));
        return resultadoA;

    }

    public static double longitud(double radio) {
        double resultadoL;
        double pi = java.lang.Math.PI;

        resultadoL = (2 * pi * radio);
        return resultadoL;
    }
}
        
    
    

