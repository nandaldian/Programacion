
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */

public class NotaMedia {
    public static void main(String[] args){
        Scanner tcl = new Scanner(System.in);
        float n1, n2, n3, media;
            System.out.println("Dame nota 1");
            n1 = tcl.nextFloat();
            System.out.println("Dame nota 2");
            n2 =  tcl.nextFloat();
            System.out.println("Dame nota 3");
            n3 = tcl.nextFloat();
            media = (n1+n2+n3)/3;
            
            System.out.println("La media es: "+media);
            
            
    }
    
    
}
