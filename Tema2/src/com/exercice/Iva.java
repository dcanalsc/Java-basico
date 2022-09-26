package com.exercice;

import java.util.Scanner;

import static java.lang.System.in;

public class Iva {
    public static void main(String[] args) {

        /*Enunciado del ejercicio:

Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

*/
        int iva=21;                                 //valor de iva

        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduce un precio: ");
        double variable = scanner.nextDouble();     //precio sin IVA
        double variable2;                           //precio con IVA
        variable2 = calcularIva(variable, iva);

        System.out.println("Precio con IVA: "+variable2);

    }
    private static double calcularIva(double variable, int valor) {
        double variable1;
        variable1 = variable + variable*valor/100;
        return variable1;
    }
}
