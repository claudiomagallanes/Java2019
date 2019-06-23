/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28;
import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b,c,aux,i;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        a = in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = in.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        c = in.nextInt();
        
        for(i=0;i<3;i++) {
            if(a>b){
                aux = a;
                a = b;
                b = aux;
            }
            if(b>c){
                aux = b;
                b = c;
                c = aux;
            }
        }
        
        System.out.printf("Los numeros ordenados son %d %d %d\n\n", a,b,c);
    
}
}
