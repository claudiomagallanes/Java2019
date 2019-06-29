/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio53;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio53 {

    public static int obtenerResto(int num1,int num2) {
        
        if(num2!=0)
            return (num1%num2);
        else {
            System.out.println("ERROR");
            return -1;
        }
        
}
    public static void main(String[] args) {
        
        int a,b,resto;
        
        Scanner in = new Scanner(System.in);
     
        System.out.print("Ingrese el primer numero: ");
        a = in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = in.nextInt();
        
        resto = obtenerResto(a,b);
        System.out.println("El resto es " + resto);
        
    }
    
}
