/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class EjercicioBanco {
    public static void main(String[ ] args){
       double resultado;
       System.out.println("Dinero puesto a plazo fijo: 2000€");
       System.out.println("Interes de un: 2.75%");
       System.out.println("Al cabo de 6 años deberias tener: "+(2000+(2000*0.0275)));
       System.out.println("Pero hacienda se queda un 18%");
       resultado=2000-(2000*0.0275);
       System.out.println("Asi que te quedas con un: "+(resultado-(2000*0.18)));
    }
    
}