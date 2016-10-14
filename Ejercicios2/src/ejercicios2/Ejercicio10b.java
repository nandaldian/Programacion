package ejercicios2;

public class Ejercicio10b {

    public static void main(String[] args) {
        int veces = 1000000;
        int caras = 0;

        for (int i = 0; i < veces; i++) {
            if (Math.random() * 2 < 1) {
                caras++;
            }
        }
        System.out.printf("Caras %.2f%%\n", caras * 100.0 / veces);
        System.out.printf("Cruces %.2f%%\n", (veces - caras) * 100.0 / veces);
    }

}
