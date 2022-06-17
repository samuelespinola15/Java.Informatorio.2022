package EjCompLvl2;

import java.util.ArrayList;
import java.util.Scanner;

public class ej7 {

    static int valor1;
    static int valor2;
    static  ArrayList<String> resultado = new ArrayList<>();
    public static void main(String[] args) {
        
        ingresarValores();
        fizzBuzzFuncion(valor1, valor2);
        mostrarResultado();

    }

    private static void mostrarResultado() {
        System.out.print("[");
        resultado.forEach((elemento) -> {
            System.out.print(elemento + " ");
        });
        System.out.print("]");
    }

    private static ArrayList<String> fizzBuzzFuncion(int v1, int v2) {
        for (int i = 1; i< valor2; i++){
            if (Math.floorMod(i, 2) == 0 && Math.floorMod(i, 3)== 0){
                resultado.add("FizzBuzz");
            }
            else if (Math.floorMod(i, 2) == 0){
                resultado.add("Fizz");
            } else if (Math.floorMod(i, 3) == 0) {
                resultado.add("Buzz");
            } else {
                resultado.add(String.valueOf(i));
            }
            
        }
        
        return (resultado);
        
    }

    private static void ingresarValores(){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Ingrese dos valores numericos, el primer valor tiene que ser menor que el segundo por favor");
            valor1 = scan.nextInt();
            valor2 = scan.nextInt();  
        } while (valor1 > valor2 );        
        scan.close();
         
    }

    
}
