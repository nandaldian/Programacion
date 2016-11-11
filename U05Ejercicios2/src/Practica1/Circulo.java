/*
2 Desarrollar una clase llamada Circulo que:

xTenga dos atributos prívate de tipo Punto y double.

xTenga un constructor con dos parámetros de tipo Punto y double que
inicialice los dos atributos.

xTenga un constructor por defecto (sin parámetros) que inicialice los dos
atributos al valor que se quiera.

xTenga un constructor con tres parámetros de tipo double que inicialice
los dos atributos.

xTenga un getvalor para cada uno de los atributos.

xTenga un método calcularDistanciaDesde que recibe un parámetro de
tipo Punto y que devuelve un double.

xTenga un método calcularArea que no recibe ningún parámetro y
devuelve un double.

xTenga un método calcularPerímetro que no recibe ningún parámetro y
devuelve un double.
*/
package Practica1;
public class Circulo {
    private Punto punto;
    private double radio;
    
    public Circulo(Punto punto, double radio){
        this.punto=punto;
        this.radio=radio;
    }
    public Circulo(){
        this.punto=new Punto();
        this.radio=0;
    }
    public Circulo(double x, double y, double radio){
        this.punto.setX(x);
        this.punto.setY(y);
        this.radio=radio;
    }

    public Punto getPunto() {
        return punto;
    }

    public double getRadio() {
        return radio;
    }
    public double distancia(Punto punto2){
        return punto.distancia(punto2);
    }
    public double calcularArea(){
        return (this.radio*Math.pow(Math.PI, 2));
    }
    public double calcularPerimetro(){
        
        return 2*Math.PI*this.radio;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
