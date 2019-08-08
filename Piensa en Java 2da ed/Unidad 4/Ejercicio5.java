/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Claudio
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        String[] array ;
        array = new String[5];      //Creo los objetos
        
        array[0] = "Hola, ";        //Inicializo los objetos
        array[1] = "vengo ";
        array[2] = "a ";
        array[3] = "conquistar ";
        array[4] = "el mundo!!";
        
        for(i=0;i<5;i++)
            System.out.print(array[i]);     //Imprimo los objetos
        System.out.println("");
        
    }
    
}
