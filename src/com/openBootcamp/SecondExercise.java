package com.openBootcamp;

/**
 * Para este ejercicio tendréis que crear una función que reciba un precio
 * y devuelva el precio con el IVA incluido.
 */
public class SecondExercise {

    public static void main(String[] args) {

        float price = 47;
        System.out.println("El precio con el IVA incluido es: " +calculateIVA(price));


    }

    // Funcion que recibe un precio y devuelva el precio con el IVA incluido.
    static float calculateIVA (float price){

        float iva = 0.21f;
        float finalPrice =price + price * iva;

        return (finalPrice);
    }
}
