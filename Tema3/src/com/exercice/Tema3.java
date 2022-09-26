package com.exercice;

public class Tema3 {
    public static void main(String[] args) {
        /*
        Enunciado del ejercicio:

En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
String[] nombres = {"", "", "", ""}
         */
        String[] nombres = new String[]{"Daniel","JuanLu","Ocete","Bauti","Cotelo"};

        for (int i = 0; i < nombres.length; i++){

            System.out.println(nombres[i]);
        }
    }
}
