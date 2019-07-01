/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio62;

/**
 *
 * @author Claudio
 */
public class Ejercicio62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char num[];
        int i;
        num = new char [4];
        
        num[0] = 'A';
        num[1] = 'V';
        num[2] = 'A';
        num[3] = 'J';
        
        for(i=3;i>=0;i--)
            System.out.print(num[i] + " ");
        System.out.println("");
    }
    
    
}
