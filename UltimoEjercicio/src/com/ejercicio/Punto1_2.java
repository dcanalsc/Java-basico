package com.ejercicio;

public class Punto1_2 {
    public static void main(String[] args) {

        //array unidimensional

        String []array1 = {"Ejemplo1", "Ejemplo2", "Ejemplo3", "Ejemplo4", "Ejemplo5"};
        for (String array : array1){
        System.out.println(array);
        }

        //array bidimensional

        int [][]array2 = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 10, 20, 30, 40, 50, 60, 70, 80, 90},
                {0, 100, 200, 300, 400, 500, 600, 700, 800, 900}
        };
        for (int i=0; i < array2.length; i++){
            for (int j=0; j < array2[i].length; j++){
                System.out.println("El valor para la fila "+ (i+1) +" y la columna "+ (j+1) +" es: "+ array2[i][j]);
            }
        }

    }

}



