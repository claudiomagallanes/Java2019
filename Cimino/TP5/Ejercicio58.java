/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio58;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio58 {

    public static String obtenerMesEnLetras(int a){
        
        switch (a) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "";
        }
        
    }
    
    
    public static void main(String[] args) {
        int m;
        String mes;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el numero del mes: ");
        m = in.nextInt();
        
        mes = obtenerMesEnLetras(m);
        
        System.out.println("El mes ingresado es "+mes);
    }
    
}
