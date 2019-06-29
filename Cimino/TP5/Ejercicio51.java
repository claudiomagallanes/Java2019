/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio51;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio51 {

    public static void ImprimirSimbolo(int cant, char simbolo) {
        
        int i;
        
        for(i=0;i<=cant;i++) {
            System.out.print(simbolo);
        }
        System.out.println("");
        }
    
    public static void main(String[] args) {
        
        int n,veces;
        char L;
        String a;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de veces que desea imprimir: ");
        n = in.nextInt();
        
        System.out.print("Ingrese un caracter: ");
        a = in.next();
        
        L = a.charAt(0);
        
        ImprimirSimbolo(n,L);
        
        
        
        
        }
        
        
    }
    

