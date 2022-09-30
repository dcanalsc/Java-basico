package com.ejercicio;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Punto8 {
    public static void main(String[] args) {

        /*
        8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en
"fileOut".

         */

        System.out.println("Introduce fichero a copiar:");
        Scanner scanner = new Scanner(System.in);
        String origen = scanner.nextLine();

        System.out.println("Introduce fichero destino:");
        String destino = scanner.nextLine();

        copiar(origen, destino);
    }

    private static void copiar(String a, String b){

        try {
            InputStream fileIn = new FileInputStream(a);    //creamos fichero de entrada
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream(b);       //creamos fichero de salida
            fileOut.write(datos);
            fileOut.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());}
    }
}