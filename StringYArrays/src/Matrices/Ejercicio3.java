/*
3. Crea un vector V numérico de 50 elementos y otro P de 20 elementos.
Genera luego M(50,20) de tal forma que M(I,J) es igual a V(I) * P(J)
 */
package Matrices;

import java.util.Random;

/**
 *
 * @author mati
 */
public class Ejercicio3 {
        public static void main(String[] args) {
        Random rn = new Random();
        int[] v = new int[50];
        int[] p = new int[20];
        int[][] m = new int[50][20];

        System.out.println("Generamos P y V");
        System.out.println("Vector V");
        for (int i = 0; i < 50; i++) {
            v[i] = rn.nextInt(10) + 1;
            System.out.print(v[i] + "\t");
        }
        System.out.println("\nVector P");
        for (int i = 0; i < 20; i++) {
            p[i] = rn.nextInt(10) + 1;
            System.out.print(p[i] + "\t");
        }

        //Genera luego M(50,20) de tal forma que M(I,J) es igual a V(I) * P(J)
        System.out.println("\nVector M restante ( M[i][j] donde V[i]*P[j]");
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 20; j++) {
                m[i][j] = (v[i] * p[j]);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
