/*
 5.
 Tenemos dos matrices con la siguiente información.
 A(100,2) Nº de Producto      Precio
 B (50,2) Nº de Producto      Cantidad
 Tenemos que realizar el siguiente listado:

 Nº de Producto  Cantidad       Precio       Importe
 xxx              xx,xxx        xxx.xx      xx,xxx.xx
 xxx              xx,xxx        xxx.xx      xx,xxx.xx
 TOTAL
 ..........  xxx,xxx.xx
 Hay que localizar los productos de B en A y efectuar dicho listado.
 La matriz A no está ordenada
 */
package Matrices;

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        Random rn = new Random();
        double[][] a = new double[100][2];
        double[][] b = new double[50][2];
        double importe = 0;
        int contador = 0;
        double total = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = rn.nextInt(75) + 1;
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = rn.nextInt(50) + 1;
            }
        }
        System.out.println("Número del producto\tCantidad\tPrecio\t\tImporte");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i][0] == a[j][0]) {
                    importe = a[j][1] * b[i][1];
                    contador++;
                    System.out.println(contador + ". " + (int) b[i][0] + "\t" + "\t" + "\t" + (int) b[i][1] + "\t" + "\t" + a[j][1] + "\t" + "\t" + importe);
                    total = total + importe;
                    j = a.length;
                }
            }
            importe = 0;
        }
        System.out.println("Total -------------------------------------------------" + total);
    }
}