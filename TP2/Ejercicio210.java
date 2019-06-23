/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio210;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b,aux;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        a = in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = in.nextInt();
        
        if(a<b) {
            aux = a;
            a = b;
            b = aux;
        }
        
        if((a%b)==0)
            System.out.print("El numero " + a + " es divisible por " + b+"\n");
        else 
            System.out.printf("El numero %d no es divisible por %d\n",a,b);
            
            
    }
    
}
