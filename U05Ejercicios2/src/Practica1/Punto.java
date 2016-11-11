
/*1. Desarrollar una clase llamada Punto que:
*xTenga dos atributos prívate de tipo double.
*xTenga un constructor con dos parámetros de tipo double que inicialice
*los dos atributos.
*xTenga un constructor por defecto (sin parámetros) que inicialice los dos
*atributos al valor que se quiera.
*xTenga un getvalor para cada uno de los atributos.
*Tenga un método calcularDistanciaDesde que recibe un parámetro de
*tipo Punto y que devuelve un double.*/
package Practica1;

public class Punto {
    private double x;
    private double y;
    
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
        
    }
    public Punto(){
        this.x=0;
        this.y=0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distancia(Punto punto2){
        
        
        double distancia=Math.sqrt(Math.pow(x-punto2.x, 2)+Math.pow(y-punto2.y, 2));
        return distancia;
    }
    
    
}

