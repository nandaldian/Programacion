package ejercicios2;

public class Ejercicio5b {

    public static void main(String[] args) {
        int sumapares = 0;
        int sumaimpares = 0;
        int cantidadpares = 0;
        int cantidadimpares = 0;
        int numero;
        int cantidadmult4 = 0;
        int sumamult4 = 0;
        int cantidadmult7 = 0;
        int sumamult7 = 0;

        for (int i = 1; i < 100; i++) {
            System.out.print(i + " ");
            numero = i;
            if (i % 2 == 0) {
                cantidadpares++;
                sumapares = sumapares + numero;
            } else {
                cantidadimpares++;
                sumaimpares = sumaimpares + numero;

            }
            if (i % 4 == 0) {
                cantidadmult4++;
                sumamult4 = sumamult4 + numero;

            }
            if (i % 7 == 0) {
                cantidadmult7++;
                sumamult7 = sumamult7 + numero;

            }

        }
        System.out.println("\nHay " + cantidadpares + " números pares. Y su suma es " + sumapares);
        System.out.println("Hay " + cantidadimpares + " números impares. Y su suma es " + sumaimpares);
        System.out.println("Hay " + cantidadmult4 + " múltiplos de 4. Y su suma es " + sumamult4);
        System.out.println("Hay " + cantidadmult7 + " múltiplos de 7. Y su suma es " + sumamult7);
    }
}
