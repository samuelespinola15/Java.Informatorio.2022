package EjCompLvl1;
import java.util.Scanner;

public class ej8 {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre y apellido");
        String nomYAp = scan.nextLine();

        System.out.println("Ingrese su edad");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese su direccion");
        String dir = scan.nextLine();
        
        System.out.println("Ingrese su ciudad");
        String ciudad = scan.nextLine();
        
        scan.close();


        System.out.println(ciudad + " - " + dir + " - " + edad + " - " + nomYAp);

        


    }
}
