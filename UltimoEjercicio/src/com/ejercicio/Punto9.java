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

        clase = leerFichero(clase);

        //-------------BUCLE PARA AÑADIR ALUMNOS A LA CLASE

        boolean guardar = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Añadir alumno?: (s)i o (n)o:");
            masAlumnos = scanner.nextLine();

            if (masAlumnos.startsWith("s") || masAlumnos.startsWith("S")) {
                Alumno alumno = new Alumno();
                System.out.println("Introduce nombre del alumno:\n");
                alumno.nombre = scanner.nextLine();

                int j= clase.size();
                for (int i=0; i<j; i++){
                    if(alumno.nombre.equals(clase.get(i).nombre)){
                        System.out.println("El alumno ya existe, se actualizará.");
                        clase.remove(i);
                        j--;i--;
                    }
                }
                System.out.println("Introduce las notas:\n");
                ponerNotas(alumno, scanner);
                clase.add(alumno);
                guardar = true;
            }
        } while (masAlumnos.startsWith("s") || masAlumnos.startsWith("S"));

    //AQUÍ MUESTRA LOS VALORES QUE SE VAN A GUARDAR

        for (Alumno valor : clase) {
            System.out.println(valor.nombre);
            for (HashMap.Entry<String, Double> elemento : valor.notas.entrySet()) {
                System.out.println(elemento.getKey() + " : " + elemento.getValue());
            }
        }
    //AQUÍ GUARDA CLASE EN FICHERO SI SE HA MODIFICADO
        if(guardar) guardarFichero(clase);
    }

    //FUNCIÓN PARA LEER ARCHIVO CLASE
    private static ArrayList<Alumno> leerFichero(ArrayList<Alumno> clase) {
        try {
            System.out.print("Leyendo clase del fichero... ");
            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("clase.dat"));
            clase = (ArrayList<Alumno>) leyendoFichero.readObject();
            leyendoFichero.close();
            System.out.println("ok!");
            System.out.println("Datos leídos del fichero:");

        } catch (Exception e) {
            System.out.println("Clase vacia\n" +e.getMessage());
        }
        return clase;
    }

    // FUNCIÓN QUE PONE LAS NOTAS A LOS ALUMNOS
    private static void ponerNotas(Alumno alumno, Scanner scanner) {
        String []asignaturas = {"Matemáticas", "Ciencias", "Lengua", "Ingles", "Filosofía"};
        try {
            for (String valor : asignaturas){
                System.out.println(valor);
                double nota = scanner.nextDouble();
                alumno.notas.put(valor, nota);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Error, vuelve a introducir datos!");
        }
    }
// FUNCION QUE GUARDA LOS DATOS EN ARCHIVO: clase.dat
    private static void guardarFichero(ArrayList<Alumno> clase) {
        try {
            System.out.print("Guardando clase en el fichero... ");
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