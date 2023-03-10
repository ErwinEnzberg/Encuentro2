/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercioextra_1;
import java.util.Scanner;
/**
 *
 * @author erwin
 */
public class EjercioExtra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
System.out.println("Porfavor ingrese 2 numeros enteros");
Scanner leer = new Scanner(System.in);
int num,num2,suma;
num = leer.nextInt();
num2 = leer.nextInt();
suma = num + num2;
        System.out.println("La suma de los numeros ingresados es:" + suma);
    }
}
