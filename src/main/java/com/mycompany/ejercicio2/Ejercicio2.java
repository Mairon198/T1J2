//Mairon Omar Licona Duarte
//201810010200
//Crear un programa que imprima en consola todas las operaciones aritméticas de dos números enteros (suma, resta, multiplicación, divición, mod)

package com.mycompany.ejercicio2;

/**
 *
 * @author Mairon
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Leer los datos
        Scanner scanner = new Scanner(System.in);

        // Ingreso de dos numeros
        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int mod = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Mod: " + mod);
        
    }
}