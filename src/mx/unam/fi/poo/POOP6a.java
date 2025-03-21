/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.unam.fi.poo;
import Pokemon.Pokemon;

/**
 *
 * @author Galba
 */
public class POOP6a {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("");
        
        Pokemon pokemon1= new Pokemon("Amarillo", "Charizard", "Fuego", 6, 50);
        
        pokemon1.atacar();
        pokemon1.setColor("Naranja");
    }
    
}
