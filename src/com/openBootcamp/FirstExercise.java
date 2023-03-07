package com.openBootcamp;

/**
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 *  -Crea un proyecto de Java desde 0
 *  -Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 *  -Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 */
public class FirstExercise {

    public static void main(String[] args) {
        // 1.Numbers

        // 1.2.Integers
        byte typeByte = 1;
        System.out.println("byte:"+typeByte);
        short typeShort = 10;
        System.out.println("short:"+typeShort);
        int typeInt = 100;
        System.out.println("int:"+typeInt);
        long typeLong = 1000;
        System.out.println("long:"+typeLong);

        // 1.3.Floating point
        float typeFloat = 1.5f;
        System.out.println("float:"+typeFloat);
        double typeDouble = 10.05d;
        System.out.println("double:"+typeDouble);



        // 2.Boolean
        boolean typeTrue = true;
        System.out.println("boolean:"+typeTrue);
        boolean typeFalse = false;
        System.out.println("boolean:"+typeFalse);

        // 3.Text
        char typeChar ='e';
        System.out.println("char:"+typeChar);
        String typeString = "Hello World";
        System.out.println("String:"+typeString);


    }
}
