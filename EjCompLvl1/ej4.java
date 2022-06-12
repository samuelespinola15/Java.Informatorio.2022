package EjCompLvl1;

import java.util.Scanner;

public class ej4 {
    static int numero;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un valor para calcular su factorial");
        numero = scan.nextInt();
        scan.close();

        procesoDatos(numero);
        
    }

    public static void procesoDatos(int resultado){
        resultado = numero;
        for (int i = 1; i<numero; i++){
            resultado = resultado * i;
        }
        System.out.println(resultado);
    }
}
