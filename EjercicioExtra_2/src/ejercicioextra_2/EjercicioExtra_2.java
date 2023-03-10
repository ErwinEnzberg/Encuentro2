/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_2;
import java.util.Scanner;
/**
 *
 * @author erwin
 */
public class EjercicioExtra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
     Scanner leer = new Scanner(System.in);
     String nombre;
        System.out.println("Porfavor ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Su nombre es: " + nombre);
    }
    
}
