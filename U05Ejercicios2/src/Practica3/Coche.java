/*6. Desarrollar una clase llamada Coche que:

Tenga un atributo prívate de tipo Motor, un atributo de tipo String
(marca), otro de tipo String (modelo) y otro de tipo double con el precio
acumulado con las averías.

Tenga un constructor con dos parámetros de tipo String que inicialice la
marca y el modelo.

Tenga un getvalor para cada uno de los atributos.

Un método acumularAveria que incrementará el importe gastado en
averías
*/
package Practica3;

public class Coche {
    private Motor motor=new Motor(5);
    private String Marca;
    private String Modelo;
    private double averias;
    
    public Coche(String Marca, String Modelo){
        this.Marca=Marca;
        this.Modelo=Modelo;
    }
    public void acumularAveria(double averia){
        this.averias+=averia;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public double getAverias() {
        return averias;
    }
    
}
