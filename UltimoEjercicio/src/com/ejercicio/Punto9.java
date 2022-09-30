package com.ejercicio;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Punto9 {

    @SuppressWarnings({ "Uncheked" })
    public static void main(String[] args) {

        ArrayList<Alumno> clase = new ArrayList<>();
        String masAlumnos;

        //AQUI LEE EL FICHERO PARA OBTENER LOS DATOS DE LA CLASE Y LOS PASA A UNA ARRAYLIST
        try {
            System.out.print("Leyendo clase del fichero clase.dat.. ");
            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("clase.dat"));
            clase = (ArrayList<Alumno>) leyendoFichero.readObject();
            leyendoFichero.close();
            System.out.println("ok!");
            System.out.println("Datos leídos del fichero:");

        } catch (Exception e) {
            System.out.println("No hay alumno\n" +e.getMessage());
        }

        //-------------BUCLE PARA AÑADIR ALUMNOS A LA CLASE

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Añadir alumno?: (s)i o (n)o:");
            masAlumnos = scanner.nextLine();

            if (masAlumnos.startsWith("s") || masAlumnos.startsWith("S")) {
                Alumno alumno = new Alumno();
                System.out.println("Introduce nombre del alumno:\n");
                alumno.nombre = scanner.nextLine();
                System.out.println("Introduce las notas:\n");
                ponerNotas(alumno, scanner);
                clase.add(alumno);

            } else {
                System.out.println("No hay mas alumnos");
            }
        } while (masAlumnos.startsWith("s") || masAlumnos.startsWith("S"));

    //AQUI MUESTRA LOS VALORES QUE SE VAN A GUARDAR
        for (Alumno valor : clase) {
            System.out.println(valor.nombre);
            for (HashMap.Entry<String, Double> elemento : valor.notas.entrySet()) {
                System.out.println(elemento.getKey() + " : " + elemento.getValue());
            }
        }
    //AQUI GUARDA CLASE EN FICHERO
        guardarFichero(clase);
    }

    // FUNCION QUE PONE LAS NOTAS A LOS ALUMNOS **MEJORABLE
    private static void ponerNotas(Alumno alumno, Scanner scanner) {
        try {
            System.out.println("Matematicas:");
            double nota = scanner.nextDouble();
            alumno.notas.put("Matematicas", nota);
            System.out.println("Ciencias:");
            nota = scanner.nextDouble();
            alumno.notas.put("Ciencias", nota);
            System.out.println("Lengua:");
            nota = scanner.nextDouble();
            alumno.notas.put("Lengua", nota);
            System.out.println("Ingles:");
            nota = scanner.nextDouble();
            alumno.notas.put("Ingles", nota);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Error, vuelve a introducir alumno!");
        }
    }
// FUNCION QUE GUARDA LOS DATOS EN ARCHIVO: clase.dat
    private static void guardarFichero(ArrayList<Alumno> clase) {
        try {
            System.out.print("Guardando clase en el fichero objetos.dat.. ");

            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("clase.dat"));
            escribiendoFichero.writeObject(clase);
            escribiendoFichero.close();
            System.out.println("ok!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Alumno implements Serializable{
    String nombre;
    HashMap<String, Double> notas = new HashMap<>();
    public Alumno() {
        }
}