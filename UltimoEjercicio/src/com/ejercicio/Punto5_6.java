package com.ejercicio;

/*5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Punto5_6 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Introduce nombres de ciudades:");

        for (int i=0; i < 4; i++){
            Scanner scanner = new Scanner(System.in);
            lista.add(scanner.next());
        }
        LinkedList<String> enlazada = new LinkedList<>(lista);

        System.out.println("Elementos de la ArrayList");
        for (String elemento : lista){
            System.out.println(elemento);
        }
        System.out.println("Elementos de la LinkedList");
        for (String elemento : enlazada){
            System.out.println(elemento);
        }

        /*
        6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
A continuación, con otro bucle, recórrelo y elimina los números pares. Por último, vuelve a recorrerlo y
muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el
primer "for" de relleno.

         */

        ArrayList<Integer> lista2 =new ArrayList<>();
        int j=1;
        for (int i=0; i < 10; i++) {
            lista2.add(j);
            j++;
            }

        System.out.println(lista2);

        //quitamos los números pares

        for (int i=0; i< lista2.size(); i++){
            if( lista2.get(i) % 2 == 0 ){
                lista2.remove(i);
            }
        }
        System.out.println(lista2);

    }
}
