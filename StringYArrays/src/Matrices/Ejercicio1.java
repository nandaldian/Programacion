/*
 1.
 Introduce una matriz de 5 filas y 7 columnas y a continuación visualiza:
 Toda la matriz
 La fila cinco completa

 El elemento de la cuarta fila tercera columna y el elemento de la 
 quinta  fila  tercera  columna. 
 Intercambiarlos  el contenido  de estos dos elementos y visualizarlos de nuevo

 La primera  columna  y  la  cuarta 
 Intercambiar el contenido  de estas columnas y visualizar las  de nuevo
 */
package Matrices;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        Random rn = new Random();
        int[][] matriz = new int[5][7];
        int aux = 0;

        System.out.println("La matriz completa:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rn.nextInt(10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\n La fila cinco");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[4][i] + "\t");
        }
        System.out.println("");
        System.out.println("\nEl elemento de la cuarta fila tercera columna es " + matriz[3][2] + " y el elemento de la quinta  fila  tercera  columna es " + matriz[4][2]);
        aux = matriz[3][2];
        matriz[3][2] = matriz[4][2];
        matriz[4][2] = aux;
        System.out.println("Realizamos el cambio.");
        System.out.println("El elemento de la cuarta fila tercera columna es " + matriz[3][2] + " y el elemento de la quinta  fila  tercera  columna es " + matriz[4][2]);
        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[i][0];
            matriz[i][0] = matriz[i][3];
            matriz[i][3] = aux;
        }
        System.out.println("\nLa matriz intercambiando la columna 1 y la 4");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }
            
            System.out.println("");

        }
    }
}