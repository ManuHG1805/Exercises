package com.openBootcamp;

import java.util.Scanner;

/**
 * Para este ejercicio tendréis que crear una función que reciba un precio
 * y devuelva el precio con el IVA incluido.
 */
public class SecondExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el precio: ");
        double price = scanner.nextDouble();
        System.out.println("El precio con el IVA incluido es: " +calculateIVA(price));


    }

    // Funcion que recibe un precio y devuelva el precio con el IVA incluido.
    static double calculateIVA (double price){

        double iva = price*0.21f;
        double finalPrice =price + iva;

        return (finalPrice);
    }
}
