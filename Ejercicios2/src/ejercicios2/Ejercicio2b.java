package ejercicios2;
public class Ejercicio2b {

    public static void main(String[] args) {

        double num = 1;
        double suma = 0;
        double contador = 0;

        while (contador != 1000) {
            suma = suma + num;
            num++;
            contador++;

        }
        System.out.println(suma);


    }
}
