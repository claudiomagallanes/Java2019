/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo_3;

/**
 *
 * @author Español
 */
public class Tipo_3 {

    private int dato_int = 0;
    private char dato_char = 0;
    
    public Tipo_3() {           //Constructor que no recibe parametros
        dato_int = 0;
        dato_char = 0;
        
        System.out.println("El constructor se llamo sin parametros");
    }
    
    
    public Tipo_3(String a) {       //Constructor que recibe un String
        dato_int = 0;
        dato_char = 0;
        
        System.out.println("El constructor se llamo con parametros(el parametro es " + a + ")");
    }
    
    
    public Tipo_3(int a) {          //Constructor que recibe un int
        dato_int = 0;
        dato_char = 0;
        System.out.println("Constructor numero " + (a+1));
    }
    
    public static void main(String[] args) {
        int i;
        //Ejercicio1
        Tipo_3 a = new Tipo_3();
        //Ejercicio2
        Tipo_3 b = new Tipo_3("Hola");
        //Ejercicio 3
        Tipo_3[] c = new Tipo_3[8];
        //Ejercicio4
        
        for(i=0;i<8;i++)
            c[i] = new Tipo_3(i);
    }
    
}
