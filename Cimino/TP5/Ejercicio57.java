/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio57;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio57 {

    public static int cantDivisores(int a) {
        int i,cont=0;
        
        for(i=1;i<=a;i++) {
            if(a%i==0)
                cont++;
        }
        return cont;
    }
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num = in.nextInt();
        
        System.out.printf("La cantidad de divisores es %d\n", cantDivisores(num));
    }
    
}
