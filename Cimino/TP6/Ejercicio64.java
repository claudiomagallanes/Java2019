/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio64;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1[],num2[],num3[],i,aux;
        
        num1 = new int [5];
        num2 = new int [5];
        num3 = new int [5];
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los valores del primer arreglo:");
        
        for(i=0;i<5;i++) {
            System.out.print("Ingrese el numero de la posicion "+i+":");
            num1[i] = teclado.nextInt();
        }
        
        System.out.println("Ingrese los valores del segundo arreglo:");
        
        for(i=0;i<5;i++) {
            System.out.print("Ingrese el numero de la posicion "+i+":");
            num2[i] = teclado.nextInt();
        }
        
        
        for(i=0;i<5;i++) {
            num3[i] = num1[i]+num2[i];
            System.out.print(num3[i] +" ");
        }
        
    }
    
}
