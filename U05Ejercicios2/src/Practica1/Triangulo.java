/*
3. Desarrollar una clase llamada Triangulo que:

xTenga tres atributos prívate de tipo Punto.

xTenga un constructor con tres parámetros de tipo Punto que inicialice los
dos atributos.

xTenga un constructos por defecto (sin parámetros) que inicialice los tres
atributos al valor que se quiera.

xTenga un constructor con seis parámetros de tipo double que inicialice
los tres atributos.

xTenga un getvalor para cada uno de los atributos.

Tenga un método calcularDistanciaDesde que recibe un parámetro de
tipo Punto y que devuelve un doublé.

Tenga un método calcularArea que no recibe ningún parámetro y
devuelve un double.

Tenga un método calcularPerimetro que no recibe ningún parámetro y
devuelve un double.
 */
package Practica1;

public class Triangulo {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    
    public Triangulo(Punto punto1, Punto punto2, Punto punto3){
        this.punto1=punto1;
        this.punto2=punto2;
        this.punto3=punto3;
}
    public Triangulo(){
        this.punto1=new Punto();
        this.punto2=new Punto();
        this.punto3=new Punto();
    }
    public Triangulo(double x, double y, double x2, double y2, double x3, double y3){
        this.punto1.setX(x);
        this.punto1.setY(y);
        this.punto2.setX(x2);
        this.punto2.setY(y2);
        this.punto3.setX(x3);
        this.punto3.setY(y3);
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    public double distancia(Punto punto4){
        
        return punto1.distancia(punto4);
    }
    public double calcularArea(){
        double a=punto1.distancia(punto2);
        double b=punto2.distancia(punto3);
        double c=punto1.distancia(punto3);
        
        return Math.sqrt(((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4);  
    }
    public double calcularPerimetro(){
        double a=punto1.distancia(punto2);
        double b=punto2.distancia(punto3);
        double c=punto1.distancia(punto3);
        
        return a+b+c;
    }
}
