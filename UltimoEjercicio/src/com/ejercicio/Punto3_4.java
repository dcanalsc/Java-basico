package com.ejercicio;

import java.util.Scanner;
import java.util.Vector;

public class Punto3_4 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        System.out.println("Introduce 5 nombres:");

        for (int i=0; i<5; i++){
            Scanner scanner = new Scanner(System.in);
            vector.add(scanner.next());

        }
        vector.remove(1); //quitamos el segundo elemento (0,1,2,3,4)
        vector.remove(1); //quitamos el tercer elemento, que ahora es el segundo

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor en la posicion " + i + " del vector: " + vector.get(i));
        }

    }
}
/*Los vectores tienen una capacidad definida por defecto de 10, si queremos añadir 1000 elementos,
deberemos ampliar 100 veces, por lo que estaremos realizando operaciones de crear y copiar arrays 100 veces.
Si sabemos la capacidad que vamos a necesitar se puede especificar al comienzo con
Vector<>(initialCapacity, capacityIncrement)
*/