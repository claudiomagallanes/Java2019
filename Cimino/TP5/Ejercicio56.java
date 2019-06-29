/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio56;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio56 {

    
    public static boolean esVocal(char ch) {
        
        switch (ch) {
            case 'a':
            case 'A':
                return true;
            case 'e':
            case 'E':
                return true;
            case 'i':
            case 'I':
                return true;
            case 'o':
            case 'O':
                return true;
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }
    
    public static void main(String[] args) {
        
        char a;
        String b;
        boolean vocal;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un caracter: ");
        b = in.next();
        
        a = b.charAt(0);
        
        vocal = esVocal(a);
        
        if(vocal)
            System.out.println("El caracter es vocal\n");
        else
            System.out.println("El caracter no es vocal\n");
        }
        
        
    }
    

