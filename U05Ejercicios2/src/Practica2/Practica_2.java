/*4. Desarrollar una clase llamada Practica_2 que en su método main:

Cree e inicialice tres Asignaturas

Cree un Alumno con las tres Asignaturas.

Cree un Profesor que le ponga calificaciones al Alumno y muestre por
pantalla la media del Alumno.
*/
package Practica2;

public class Practica_2 {
    public static void main(String[]args){
    Asignatura asignatura1=new Asignatura(1);
    Asignatura asignatura2=new Asignatura(2);
    Asignatura asignatura3=new Asignatura(3);
    Alumno alumno=new Alumno(asignatura1,asignatura2,asignatura3);
    Profesor profe=new Profesor();
    profe.ponerNotas(alumno);
    profe.calcularMedia(alumno);
    
    
        System.out.println("La media del alumno es "+ profe.calcularMedia(alumno));
    }
   }