/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio52;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int num;
       int valor;
       
       Scanner in = new Scanner(System.in);
       
       System.out.print("Ingrese el numero maximo: ");
       valor = in.nextInt();
        
       num = (int)(Math.random()*(valor-1))+1;
        System.out.println(num);
       
    }
    
}
