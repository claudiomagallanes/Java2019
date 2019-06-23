/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio211;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b,c;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el primer lado; ");
        a = in.nextInt();
        System.out.print("Ingrese el segundo lado; ");
        b = in.nextInt();
        System.out.print("Ingrese el tercer lado; ");
        c = in.nextInt();
        
        if(a<b+c)
            if(b<a+c)
                if(c<a+b) {
                    System.out.print("Los datos ingresados corresponden a un triangulo\n");
                    if(a==b) 
                        if(b==c)
                            System.out.print("El triangulo es equilatero\n");
                        else 
                            System.out.print("El triangulo es isosceles\n");
                            
                    else 
                        if(b==c)
                                System.out.print("El triangulo es isosceles\n");
                        else 
                            if(a==c)
                                    System.out.print("El triangulo es isosceles\n");
                            else
                                System.out.print("El triangulo es escaleno\n");
                                               
                }
                else
                    System.out.print("Los datos ingresados no corresponden a un triangulo\n");
            else
                System.out.print("Los datos ingresados no corresponden a un triangulo\n");
        else
            System.out.print("Los datos ingresados no corresponden a un triangulo\n");
    }
    
}
