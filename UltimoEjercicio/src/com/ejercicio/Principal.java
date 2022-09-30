package com.ejercicio;

public class Principal {

    public static void main(String[] args) {

        String resultado = reverse("Hola mundo");
        System.out.println(resultado);

    }

    //funcion que devuelve una cadena al revés
    public static String reverse(String texto) {

        int contador = texto.length()-1;
        String fraseReverse = "";

        for (int i = 0; i < texto.length(); i++) {

            fraseReverse = fraseReverse.concat(Character.toString(texto.charAt(contador)));
            contador--;
        }
        return fraseReverse;
    }
}
