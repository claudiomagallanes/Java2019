/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29;
import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String a;
        int i=0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese un caracter: ");
        a = in.next();
        
        if("a".equalsIgnoreCase(a)) 
            i=1;
        if("e".equalsIgnoreCase(a)) 
            i=1;
        if("i".equalsIgnoreCase(a)) 
            i=1;
        if("o".equalsIgnoreCase(a)) 
            i=1;
        if("u".equalsIgnoreCase(a)) 
            i=1;
        
        if(i==1)
            System.out.print("Es una vocal\n");
        else System.out.print("Es una consonante\n");
    
}
}
