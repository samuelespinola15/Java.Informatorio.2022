package EjCompLvl2;

import java.util.ArrayList;
import java.util.List;

public class ej4 {
    static ArrayList<String> alumnos = new ArrayList<String>();

    public static void main(String[] args){
        cargarNombres();
        dividirCursosYmostrar();

    }


    private static void dividirCursosYmostrar() {
         List<String> curso1 = alumnos.subList(0,4);
         List<String> curso2 = alumnos.subList(4,8);
         List<String> curso3 = alumnos.subList(8,12);

         System.out.println("Curso n1: " + curso1);
         System.out.println("Curso n2: " + curso2);
         System.out.println("Curso n3: " + curso3);
    }

    private static void cargarNombres() {
        alumnos.add("Samuel");
        alumnos.add("Santiago");
        alumnos.add("Matías");
        alumnos.add("Ángel");
        alumnos.add("Gabriel");
        alumnos.add("Simón");
        alumnos.add("Thiago");
        alumnos.add("Valentín");
        alumnos.add("Lucía");
        alumnos.add("Sofía");
        alumnos.add("Martina");
        alumnos.add("María");
    }
}
