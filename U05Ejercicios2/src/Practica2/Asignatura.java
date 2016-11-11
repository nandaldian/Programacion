/*1. Desarrollar una clase llamada Asignatura que:

Tenga dos atributos prívate de tipo int (el identificador) y de tipo double
(la calificación).

Tenga un constructor con un parámetro de tipo int.

Tenga un getvalor para cada uno de los atributos.

Tenga un setvalor para la calificación.
*/
package Practica2;

public class Asignatura {
    private int id;
    private double nota;
    
    public Asignatura(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
