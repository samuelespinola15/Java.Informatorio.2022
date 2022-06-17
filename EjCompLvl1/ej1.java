package EjCompLvl1;
import java.util.Scanner;

public class ej1 {
    static String nombre;
    public static void main (String[] args){
        pedirUser();
        mostrarUser();
    }


    private static void mostrarUser() {
        System.out.println("HOLA " + nombre + "!!!");
    }

    private static void pedirUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario por favor");
        nombre = scan.nextLine();
        scan.close();
    }

}
