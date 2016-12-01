/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author mati
 */
public class PersonaApp {
    public static void main(String[] args) {
        persona persona1;
        persona1 = new persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();
    }
    
}
