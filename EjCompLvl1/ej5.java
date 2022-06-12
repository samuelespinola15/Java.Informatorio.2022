package EjCompLvl1;

import java.util.Scanner;

public class ej5 {
 static int numero1;
 static int numero2;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos valores enteros para luego sumarlo por sumas sucesivas");
        numero1 = scan.nextInt();
        numero2 = scan.nextInt();
        scan.close();

        suma(numero1,numero2);
    }

    public static void suma(int num1, int num2){
        int resultado = 0;
        for (int i = 1; i<=num2; i++){
            resultado = resultado + num1;
        }
        System.out.println("El resultado de la suma es : " + resultado);
    }
}
