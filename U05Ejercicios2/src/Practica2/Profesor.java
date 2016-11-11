/*3. Desarrollar una clase llamada Profesor que:

Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y
que no devuelve nada. Pondrá una calificación aleatoria a cada una de
las asignaturas del alumno.

Tenga un método calcularMedia que recibe un parámetro de tipo Alumno
y devuelve un double.
*/
package Practica2;
    
public class Profesor {
    
    
    public void ponerNotas(Alumno alumno){
        
        alumno.getasignatura1().setNota((double)(Math.random()*11));
        alumno.getasignatura2().setNota((double)(Math.random()*11));
        alumno.getasignatura3().setNota((double)(Math.random()*11));
}
    public double calcularMedia(Alumno alumno){
        double nota1=alumno.getasignatura1().getNota();
        double nota2=alumno.getasignatura2().getNota();
        double nota3=alumno.getasignatura3().getNota();
        return (nota1+nota2+nota3)/3;
    }
    
}
