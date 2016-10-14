/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ejercicio13 {
    public static void main(String[ ] args){
       double resultado, interes=0.0275, retencion=0.18, dinero=2000;
       System.out.println("Dinero puesto a plazo fijo: "+dinero+"€");
       System.out.println("Interes de un: "+interes+"%");
       System.out.println("Al cabo de 6 años deberias tener: "+(dinero+(dinero*interes)));
       System.out.println("Pero hacienda se queda un :"+retencion+"%");
       resultado=dinero-(dinero*interes);
       System.out.println("Asi que te quedas con un: "+(resultado-(dinero*retencion)));
    }
    
}    
    
