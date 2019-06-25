/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio216;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dia, mes;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el dia: ");
        dia = in.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = in.nextInt();
        
        if(dia<1||dia>31)
            System.out.print("La fecha ingresada no es valida\n");
        else { 
            switch (mes) {
                case 1:
                    if(dia<20)
                        System.out.print("CAPRICORNIO\n");
                    else
                        System.out.print("ACUARIO\n");
                    break;
                case 2:
                    if(dia<=18)
                        System.out.print("ACUARIO\n");
                    else
                        System.out.print("PISCIS\n");
                    break;
                case 3:
                    if(dia<=20)
                        System.out.print("PISCIS\n");
                    else
                        System.out.print("ARIES\n");
                    break;
                case 4:
                    if(dia<=20)
                        System.out.print("ARIES\n");
                    else
                        System.out.print("TAURO\n");
                    break;
                case 5:
                    if(dia<=20)
                        System.out.print("TAURO\n");
                    else
                        System.out.print("GEMINIS\n");
                    break;
                case 6:
                    if(dia<=20)
                        System.out.print("GEMINIS\n");
                    else
                        System.out.print("CANCER\n");
                    break;
                case 7:
                    if(dia<=22)
                        System.out.print("CANCER\n");
                    else
                        System.out.print("LEO\n");
                    break;
                case 8:
                    if(dia<=23)
                        System.out.print("LEO\n");
                    else
                        System.out.print("VIRGO\n");
                    break;
                case 9:
                    if(dia<=23)
                        System.out.print("VIRGO\n");
                    else
                        System.out.print("LIBRA\n");
                    break;
                case 10:
                    if(dia<=22)
                        System.out.print("LIBRA\n");
                    else
                        System.out.print("ESCORPIO\n");
                    break;
                case 11:
                    if(dia<=22)
                        System.out.print("LIBRA\n");
                    else
                        System.out.print("ESCORPIO\n");
                    break;
                case 12:
                    if(dia<=21)
                        System.out.print("ESCORPIO\n");
                    else
                        System.out.print("CAPRICORNIO\n");
                    break;
                default:
                    System.out.print("La fecha ingresada no es valida\n");
        }
        
    }
    
}
}

