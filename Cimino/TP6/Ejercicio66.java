/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio66;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[],i,j,comp;
        num = new int [8];
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese los 8 digitos: ");
        for(i=0;i<8;i++) {
            num[i]=in.nextInt();
        }
        
        for(i=0;i<8;i++) {
            for(j=0,comp=0;j<i;j++) {
                if(num[i]==num[j])
                    comp=1;
            }
            if(comp!=1) {
                System.out.print(num[i]);
                System.out.print(" ");
            }
            
        }
        
    }
    
}
