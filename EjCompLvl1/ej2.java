package EjCompLvl1;
import java.util.Scanner;

public class ej2 {
    static int numero, numero2;

    public static void main(String[] args){
        ingresoNumeros();
        mostrarResultados();
    }

    private static void ingresoNumeros() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer y segundo valor para luego procesarlo");
        numero = scan.nextInt();
        numero2 = scan.nextInt();
        scan.close();
    }

    private static void mostrarResultados(){
        System.out.println("Suma: " + (numero + numero2));
        System.out.println("Resta: " + (numero - numero2));
        System.out.println("Multiplicacion: " + (numero * numero2));
        System.out.println("Division: " + (numero / numero2));

    }
}
