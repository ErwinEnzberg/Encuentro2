/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_3;
import java.util.Scanner;
/**
 *
 * @author erwin
 */
public class EjercicioExtra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
     Scanner leer = new Scanner(System.in);
     String nombre;
        System.out.println("Porfavor ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Su nombre es: " + nombre.toUpperCase());
        System.out.println("Su nombre es: " + nombre.toLowerCase());
    }
}
