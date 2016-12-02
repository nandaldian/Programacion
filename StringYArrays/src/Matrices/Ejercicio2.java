/*
 2.
 Introduce
 una  matriz de 7 x 5  y visualízala
 A continuación:

 Crea una nueva matriz de 7 x 7 en donde las cinco primeras 
 columnas sean las de la matriz origen

 Guarda en la columna sexta la suma de las cinco anteriores

 Guarda en la columna séptima la media de las cinco primeras
 */
package Matrices;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Random rn = new Random();
        double[][] mat1 = new double[7][5];
        double[][] mat2 = new double[7][7];
        int suma = 0;
        double contador = 0;

        System.out.println("La matriz completa. Matriz1:");//CREAMOS LA MATRIZ1
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] = rn.nextInt(100);
                System.out.print((int) mat1[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("La nueva matriz. Matriz2.");
        for (int i = 0; i < mat1.length; i++) {//COPIAMOS LA MATRIZ1 EN LA 2
            for (int j = 0; j < mat1[0].length; j++) {
                mat2[i][j] = mat1[i][j];
            }
        }
        for (int i = 0; i < mat1[0].length; i++) {//SUMA DE LOS ELEMENTOS DE CADA COLUMNA EN LA NUEVA COLUMNA
            for (int j = 0; j < mat1.length; j++) {
                suma = suma + (int) mat1[j][i];
            }
            mat2[i][5] = suma;
            suma = 0;
        }
        for (int i = 0; i < mat1[0].length; i++) {//MEDIA DE LOS ELEMENTOS DE CADA COLUMNA EN LA NUEVA COLUMNA
            for (int j = 0; j < mat1.length; j++) {
                suma = suma + (int) mat1[j][i];
                contador = (double) suma / 7;
            }
            mat2[i][6] = contador;
            suma = 0;
            contador = 0;
        }
       

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    System.out.print(mat2[i][j] + "\t");
                } else {
                    System.out.print((int) mat2[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }
}
