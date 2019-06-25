/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio213;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float a;
        float b;
        String ch;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        a = in.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        b = in.nextFloat();
        
        System.out.printf("SUMA: +\nRESTA: -\nMULTIPLICACION:*\nDIVISION: /\n");
        System.out.print("Ingrese el simbolo de la operacion que desea realizar: ");
        
        ch = in.next();
        
        switch(ch) {
            
            case "+":
                System.out.printf("La suma es %.2f\n", (a+b));
                break;
            case "-":
                System.out.printf("La resta es %.2f\n", (a-b));
                break;
            case "*":
                System.out.printf("La multiplicacion es %.2f\n", (a*b));
                break;
            case "/":
                if(b==0)
                    System.out.print("No se puede dividir ningun numero por 0\n");
                else
                    System.out.printf("La division es %.2f\n", (a/b));
                break;
            
            
        }
    }
    
}
