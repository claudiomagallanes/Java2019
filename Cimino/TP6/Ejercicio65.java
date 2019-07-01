/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio65;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class Ejercicio65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char decision,idioma;
        String teclado;
        int i,cont=0;
        
        int acum[];
        acum = new int [4];
        
        Scanner in = new Scanner(System.in);
        
        for(i=0;i<4;i++)
            acum[i] = 0;
        
        do {
        System.out.println("Ingrese el idioma que desea estudiar el alumno:\n"
                + "I: Ingles\n"
                + "F: Frances\n"
                + "P: Portugues\n"
                + "A: Aleman\n");
        teclado = in.next();
        
        idioma = teclado.charAt(0);
        
            switch (idioma) {
                case 'I':
                case 'i':
                    acum[0]++;
                    cont++;
                    break;
                case 'F':
                case 'f':
                    acum[1]++;
                    cont++;
                    break;
                case 'P':
                case 'p':
                    acum[2]++;
                    cont++;
                    break;
                case 'A':
                case 'a':
                    acum[3]++;
                    cont++;
                    break;
            
                default:
                System.out.println("La opcion seleccionada es incorrecta");
                break;
            }
            System.out.print("¿Desea seguir ingresando alumnos?");
            teclado = in.next();
            
            decision = teclado.charAt(0);
            
        }
        while(decision=='S'||decision=='s');
        
        System.out.println("El porcentaje de seleccion de idiomas es:\n"
                + "Ingles:"+100*((float)acum[0]/(float)cont)+"\n"
                + "Frances:"+100*((float)acum[1]/(float)cont)+"\n"
                + "Portugues:"+100*((float)acum[2]/(float)cont)+"\n"
                + "Aleman:"+100*((float)acum[3]/(float)cont)+"\n");
    }
    
}
