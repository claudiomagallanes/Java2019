/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio54;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio54 {

    public static boolean esPrimo(int a) {
        int i,cont=0;
        
        for(i=1;i<=a;i++) {
            if(a%i==0)
                cont++;
        }
        if (cont==2) 
            return true;
        else return false;
    }
    
    public static void main(String[] args) {
        
        int num;
        boolean condicion;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");        
        
        num = in.nextInt();
        
        condicion = esPrimo(num);
        
        if (condicion) 
            System.out.println("El numero es primo\n");
        else 
            System.out.println("El numero no es primo\n");
    }
    
}
