/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_5;
import java.util.Scanner;
/**
 *
 * @author erwin
 */
public class EjercicioExtra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /* Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
      el triple y la raíz cuadrada de ese número. 
      Nota: investigar la función Math.sqrt().*/
   Scanner leer = new Scanner(System.in);
        System.out.println("Porfavor ingrese un numero entero");
        int numero,numero_doble,numero_triple;
        
        numero = leer.nextInt();
        numero_doble = numero * 2;
        numero_triple = numero * 3;
          System.out.println("El doble de " + numero + " = " + numero_doble);
          System.out.println("El triple de " + numero + " = " + numero_triple); 
          System.out.println("la raiz cuadrada es: " + Math.sqrt(numero)); 
          
    }
    
}

