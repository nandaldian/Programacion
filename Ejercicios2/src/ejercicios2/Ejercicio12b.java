package ejercicios2;
public class Ejercicio12b {

    public static void main(String[] args) {
        double valorAleatorio;
        int valorDado;
        int numTiradas = 1000000;
        int[] tiradas = new int[6];

        for (int i = 0; i < numTiradas; i++) {
            valorAleatorio = Math.random() * 6;
            valorDado = (int) (valorAleatorio + 1);

            tiradas[valorDado - 1]++;
        }
        for (int i = 0; i < tiradas.length; i++) {
            System.out.printf("El valor %d lo que representan %.2f%%.\n",
                    i + 1, tiradas[i], (tiradas[i] / (double) numTiradas) * 100);
        }
    }

}
