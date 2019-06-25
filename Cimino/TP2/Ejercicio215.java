/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio215;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String letra;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese un digito de numeros romanos: ");
        letra = in.next();
        
        switch(letra) {
            case "I":
            case "i":
                System.out.print("1\n");
                break;
            case "V":
            case "v":
                System.out.print("5\n");
                break;
            case "X":
            case "x":
                System.out.print("10\n");
                break;
            case "L":
            case "l":
                System.out.print("50\n");
                break;
            case "C":
            case "c":
                System.out.print("100\n");  
                break;
            case "D":
            case "d":
                System.out.print("500\n");
                break;
            case "M":
            case "m":
                System.out.print("1000\n");               
                break;
            default:
                System.out.print("El digito ingresado no existe\n");
                
        }
    }
    
}
