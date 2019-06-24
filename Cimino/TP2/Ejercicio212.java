/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio212;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num,mil,cen,dec,u;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el numero entre 2 y 4 digitos: ");
        num = in.nextInt();
        
        if(num<10000&&num>=10) {
            if(num>999) {
                mil = num/1000;
                num = num%1000;
            }
            else mil = 0;
            
            if(mil==0&&num<100)
                cen = 0;
            else {
                cen = num/100;
                num = num%100;
            }
            dec = num/10;
            num = num%10;
            
            if(mil>0) {
                if(mil==num)
                    System.out.print("El numero es capicua\n");
                else
                    System.out.print("El numero no es capicua\n");
            }
            else
                if(cen>0&&cen == num)
                    System.out.print("El numero es capicua\n");
                else
                    if(dec==num)
                        System.out.print("El numero es capicua\n");
                    else
                        System.out.print("El numero no es capicua\n");
        }
        else
            System.out.print("El numero ingresado no esta dentro del rango especificado\n");
    }
    
}
