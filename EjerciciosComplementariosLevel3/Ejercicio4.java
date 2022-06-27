package EjCompLvl3;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        List<Long> listaNueva = numeros.stream()
        .distinct()
        .map(lis -> LongStream.rangeClosed(1,lis)
        .reduce(1,(long a,long b) -> a * b))
        .collect(Collectors.toList());
    
        System.out.println(listaNueva);
    }
}
