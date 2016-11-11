/*
4. Desarrollar una clase llamada Practica_1 que en su método main:
Cree e inicialice dos objetos de la clase Punto y muestre la distancia
entre ambos.

Cree un objeto de la clase Circulo y muestre su área, perímetro y
distancia a uno de los dos puntos creados al comienzo.

Cree un objeto de la clase Triangulo y muestre su área, perímetro y
distancia a un nuevo punto.
 */
package Practica1;

public class Practica_1 {
    public static void main(String[]args){
    Punto punto=new Punto(8,9);
    Punto punto2=new Punto(5,20);

    System.out.println("Distancia entre los puntos " + punto.distancia(punto2));
        System.out.println("\nCírculo");
    Circulo circulo= new Circulo(new Punto(6,9),5);
    System.out.println("El área es " +circulo.calcularArea());
    System.out.println("El perímetro es " +circulo.calcularPerimetro());
    System.out.println("La distancia de un punto al círculo " +circulo.distancia(punto));
        System.out.println("\nTriangulo");
    Triangulo triangulo=new Triangulo(new Punto(10,9),new Punto(5,2),new Punto(4,69));
        System.out.println("El área es " +triangulo.calcularArea());
        System.out.println("El perímetro es " +triangulo.calcularPerimetro());
        System.out.println("La distancia de un punto al triangulo " +triangulo.distancia(punto));
    }
}
    
            
    

  