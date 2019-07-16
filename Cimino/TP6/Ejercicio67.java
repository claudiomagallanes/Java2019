/*
Desarrollar un algoritmo que permita ingresar 5 números pertenecientes al
arreglo A (sin valores repetidos) y otros 5 números pertenecientes al arreglo B
(sin valores repetidos). La computadora muestra:
6.7 La unión entre A y B. Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6, muestra: 1 2 3 4 5 7 6.
*/

package ejercicio67;
import java.util.Scanner;
/**
 *
* @author Claudio
 */
public class Ejercicio67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int comp,i,j,num1[],num2[];
        num1 = new int [5];
        num2 = new int [5];
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el vector A:");
        for(i=0;i<5;i++) 
            num1[i]=in.nextInt();
        
        System.out.print("Ingrese el vector B:");
        for(i=0;i<5;i++) 
            num2[i]=in.nextInt();
        
         
        for(i=0;i<5;i++) {
            System.out.print(num1[i]);
            System.out.print(" ");
        }
        
        for(i=0;i<5;i++) {
            for(j=0,comp=0;j<5;j++) {
                if(num2[i]==num1[j])
                    comp = 1;
            }
            if(comp!=1) {
                System.out.print(num2[i]);
                System.out.print(" ");
            }
        }
        
                
        
        
    }
    
}
