package com.dcanalsc;

public class ClaseMain {

    public static void main(String[] args) {
        /*
        Enunciado del ejercicio:
Para este primer ejercicio tendréis que realizar lo siguiente:
Crea un proyecto de Java desde 0
Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
         */

        //1. numericos
        //1.1 enteros
        byte variable1 = 1; //1 byte
        short variable2 = 20; //2 byte
        int variable3 = 300; //4 byte
        long variable4 = 444444; //8 byte

        System.out.println("Numéricos enteros: "+"\nbyte: "+variable1 + "\tshort: "+variable2+"\tint: "+variable3+"\tlong: "+variable4);

        //1.2 decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;

        System.out.println("Numéricos decimales: "+"\nfloat: "+variable5+"\tdouble: "+variable6);
        //2. booleano
        boolean variable7 = false;
        boolean variable8 = true;
        System.out.println("Booleanos:"+"\t"+variable7+" o "+variable8);

        //3. texto
        char variable9 = 'a';
        String variable10 ="hola";
        System.out.println("Tipo texto:"+"\nchar: "+variable9+"\tString: "+variable10);

    }
}
