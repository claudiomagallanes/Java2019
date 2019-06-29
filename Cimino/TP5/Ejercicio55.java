/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio55;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio55 {

    public static int fibo(int a) {
        int i,valor=0,aux1=0,aux2=0;
        
        for(i=1;i<a;i++) {
            valor = aux2+aux1;
            aux2= aux1;
            aux1 = valor;
            
            if(i==1)
                aux1=1;
        }
                
        return valor;
    }
    
    public static void main(String[] args) {
        
        int num,term;
        
        Scanner in = new Scanner(System.in);
        
        num = in.nextInt();
        term = fibo(num);
        
        System.out.println("El numero "+num+" de la serie es "+term);
        
    }
    
}
