/*2. Desarrollar una clase llamada Alumno que:

Tenga tres atributos prívate de tipo Asignatura.

Tenga un constructor con tres parámetros de tipo Asignatura que
inicialice los tres atributos.

Tenga un constructor con tres parámetros de tipo int que inicialice los
tres atributos.

Tenga un getvalor para cada uno de los atributos.
*/
package Practica2;

public class Alumno {
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;
    
    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.asignatura1=asignatura1;
        this.asignatura2=asignatura2;
        this.asignatura3=asignatura3;


    }
    public Alumno(int notaasignatura1, int notaasignatura2, int notaasignatura3){
        this.asignatura1.setNota(notaasignatura1);
        this.asignatura2.setNota(notaasignatura2);
        this.asignatura3.setNota(notaasignatura3);
    }

    public Asignatura getasignatura1() {
        return asignatura1;
    }

    public Asignatura getasignatura2() {
        return asignatura2;
    }

    public Asignatura getasignatura3() {
        return asignatura3;
    }
    
}
