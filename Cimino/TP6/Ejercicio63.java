/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio63;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int T,M,i;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de posiciones: ");
        T = teclado.nextInt();
        System.out.print("Ingrese los multiplos de que numero quiere mostrar: ");
        M = teclado.nextInt();
        
        for(i=0;i<T;i++)
            System.out.print(i*M + " ");
        System.out.println("");
    }
    
}
