package com.exercice;

public class Tema4 {
    public static void main(String[] args) {
        /*
        Enunciado del ejercicio:

        En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
        Agregaréis atributos tal cual tendrían esos objetos en la realidad.
        Crear constructor vacío y con todos los parámetros para cada clase.
        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
         */
        SmartPhone smartPhone = new SmartPhone(128, 8, 2.5, 6, "Xiaomi", 4000, 6d, true, "Azul", "5G", "Android", "Wifi5", true);

        SmartWatch smartWatch = new SmartWatch(4, 2, 2.5, 2, "Samsung", 400, 2.1d, true, "blanco", false, true, true, 16, "WearOS", "4 dias");

        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());

    }
}
