/*7. Desarrollar una clase llamada Garaje que:

Tendrá tres atributos, un coche, un String con la avería asociada y el
número de coches que ha ido atendiendo.

El garaje solo podrá atender a un coche en cada momento. Controlar
esta premisa.

Tenga un método aceptarCoche que recibe un parámetro de tipo Coche
y la avería asociada. El garaje solo podrá atender a un coche en cada
momento. Si ya está atendiendo uno, que devuelva un false.

Tenga un método devolverCoche que dejará al garaje en estado de
aceptar un nuevo coche.
*/
package Practica3;

public class Garaje {
    Coche coche=new Coche("","");
    String averia;
    int atendidos;
    boolean vacio;
 
    public boolean aceptarCoche(Coche coche, String averia){
        if(vacio){
            atendidos++;
            this.averia=averia;
            this.coche=coche;
            return vacio=false;
            
        }
        else return vacio=false;
    

    }
    public void devolverCoche(){
        vacio=true;
    }
}
