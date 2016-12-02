/*
 4.Generar  en  cuadrado  Latino  de  orden  N.  
 (Un  cuadrado  Latino  de orden N es una matriz cuadrada 
 en la que la primera fila contiene los N 
 primeros  números  naturales,  en  orden,  y  cada  una  de 
 las  siguientes filas contiene la rotación de la fila anterior un lugar a la derecha.
 1  2  3  4  5
 5  1  2  3  4
 4  5  1  2  3
 3  4  5  1  2
 2  3  4  5  1
 */
package Matrices;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        Random rn = new Random();
        int n = rn.nextInt(5) + 5;
        int[][] mat = new int[n][n];
        int num = 1;

        for (int j = 0; j < mat.length; j++) {//Primera fila, los números naturales.
            mat[0][j] = num;
            num++;
            System.out.print(mat[0][j] + "\t");
        }
        System.out.println("");
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = mat[0][j];
                if (mat[i - 1][j] < n) {
                    mat[i][j] = mat[i - 1][j] - 1;
                }
                if (mat[i - 1][j] == 1) {
                    mat[i][j] = n;
                }
                if (mat[i - 1][j] == n) {
                    mat[i][j] = n - 1;
                }
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}