/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author mati
 */
public class Punto {
    private int x, y;
    public void setCoordenadas(int a, int b){
        x = a;
        y = b;
    }
public void setCoordenadaX (int a) {
    x = a;
}
public void setCoordenadaY (int b){
    y = b;
}
public int getCoordenadaX() { 
    return x;
}
public int getCoordenadaY() {
    return y;
    
}

void imprimirCuadrante(){
    if (x > 0 && y > 0) {
        System.out.println("Se encuentra en el primer cuadrante");
        
    } else {
        if (x < 0 && y > 0){
            System.out.println("Se encuentra en el segundo cuadrante");
        }
        else {
        if (x < 0 && y < 0){
            System.out.println("Se encuentra en el tercer cuadrante");
        }
        else {
        if (x > 0 && y < 0){
            System.out.println("Se encuentra en el cuarto cuadrante");
        }
    }
}
    }}}


       
