package com.ejercicio;

import java.util.Scanner;

public class Punto7 {

    /*
    7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de códig
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();
        try{
            divide(numeroA, numeroB);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }
    }
    public static void divide(int numeroA, int numeroB) throws ArithmeticException{

        int resultado = numeroA / numeroB;
        System.out.println(resultado);

    }
}
