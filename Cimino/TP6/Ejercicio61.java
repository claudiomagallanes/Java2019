/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio61;
/**
 *
 * @author Claudio
 */
public class Ejercicio61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num[],i;
        num = new int [4];
        
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        
        for(i=0;i<4;i++) {
            System.out.print( (float)num[i]/2.0+" ");
            }
        System.out.println("");
        
    }
    
}
