package EjCompLvl3;

import java.util.List;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
        "Wonder Woman", "brainiac");

        System.out.println("La cantidad de palabras que comienzan con b o B es : " +palabras.stream().filter(elemento -> elemento.startsWith("b") || elemento.startsWith("B")).count());
    }
}
