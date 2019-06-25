/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio214;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mes;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entre 1 y 12: ");
        mes = in.nextInt();
        
        switch (mes) {
                case 1:
                    System.out.print("ENERO\n");
                    break;
                case 2:
                    System.out.print("FEBRERO\n");
                    break;
                case 3:
                    System.out.print("MARZO\n");
                    break;
                case 4:
                    System.out.print("ABRIL\n");
                    break;
                case 5:
                    System.out.print("MAYO\n");
                    break;
                case 6:
                    System.out.print("JUNIO\n");
                    break;
                case 7:
                    System.out.print("JULIO\n");
                    break;
                case 8:
                    System.out.print("AGOSTO\n");
                    break;
                case 9:
                    System.out.print("SEPTIEMBRE\n");
                    break;
                case 10:
                    System.out.print("OCTUBRE\n");
                    break;
                case 11:
                    System.out.print("NOVIEMBRE\n");
                    break;
                case 12:
                    System.out.print("DICIEMBRE\n");
                    break;
                default:
                    System.out.print("El numero ingresado es invalido\n");
                    
        
    }
    
}
}
