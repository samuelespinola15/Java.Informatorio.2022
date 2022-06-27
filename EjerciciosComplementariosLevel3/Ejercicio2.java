package EjCompLvl3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    
    static List<Integer> numeros = List.of(1,2,3,4,5);

    public static void main(String[] args) {
        mostrar();
        
    }

    private static void mostrar() {
        List<Integer> potencia2 = numeros.stream().map(num ->num * num).collect(Collectors.toList());
        System.out.println(potencia2);
    }

}
