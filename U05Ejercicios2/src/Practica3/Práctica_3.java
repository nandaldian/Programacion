/*8. Desarrollar una clase llamada Practica3 que en su método main:

Cree un garaje.

Cree 2 coches.

El garaje irá cogiendo los coches y devolviéndolos, acumulando un
importe aleatorio (Math.random()) de la avería tratada.

Si la avería del coche es “aceite” incrementar en 10 los litro de aceite.

Los coches entrarán al menos 2 veces en el garaje.

Mostrar la información de los coches al final de main.
*/
package Practica3;

public class Práctica_3 {
    public static void main(String[]args){
        Garaje garaje=new Garaje();
        Coche coche1=new Coche("Citroen","Picasso");
        Coche coche2=new Coche("Renault","Leon");
        double num=(double)((Math.random()*9999)+2);
        
        while(garaje.atendidos<num){
            garaje.aceptarCoche(coche1,"Aceite");
            coche1.acumularAveria(Math.random());
            garaje.devolverCoche();
            
            
            if("Aceite".equals(garaje.averia)){
               garaje.coche.getMotor().setLitros(coche1.getMotor().getLitros()+10);
                
            }
            
        }
        System.out.println("El coche "+ coche1.getMarca() +" "+ coche1.getModelo());
        System.out.println("Ha entrado " +garaje.atendidos+" veces");
        System.out.println("Le hemos sablado al pobre diablo "+ coche1.getAverias() +" €");
        System.out.println("El motor tiene "+coche1.getMotor().getLitros()+" litros de aceite");
        System.out.println("\n");
        garaje.atendidos=0;
        
        num=(double)((Math.random()*9999)+2);
        while(garaje.atendidos<num){
            garaje.aceptarCoche(coche2, null);
            coche2.acumularAveria(Math.random());
            garaje.devolverCoche();
            
            
            if("Aceite".equals(garaje.averia)){
               coche2.getMotor().setLitros(coche2.getMotor().getLitros()+10);
               
            }
        }
        System.out.println("El coche "+ coche2.getMarca() +" "+ coche2.getModelo());
        System.out.println("Ha entrado " +garaje.atendidos+" veces");
        System.out.println("Le hemos sablado al pobre diablo "+ coche2.getAverias()+" €");
        System.out.println("El motor tiene "+coche2.getMotor().getLitros()+" litros de aceite");
        
        
    }
    
    
}
