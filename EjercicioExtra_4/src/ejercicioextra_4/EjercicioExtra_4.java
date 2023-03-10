/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_4;
import java.util.Scanner;
/**
 *
 * @author erwin
 */
public class EjercicioExtra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner leer = new Scanner(System.in);
        int grados;
        float fahrenheit;
        System.out.println("PorFavor ingrese la cantidad de grados que hace afuera:");
        grados = leer.nextInt();
        fahrenheit = 32 + (9*grados/5);
        System.out.println("Los grados en Fahrenheit son: °" + fahrenheit);
    }
}
