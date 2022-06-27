package EjCompLvl3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1{

    static List<String> prueba = new ArrayList<>();
    

    public static void main(String[] args) {
        cargarValores();
        mostrarValores();
    }


    private static void mostrarValores() {
        System.out.println(prueba.stream().filter(pp -> pp!=null && pp!="" ).collect(Collectors.toList()));
        

    }


    private static void cargarValores(){
        prueba.add("Hola");
        prueba.add(null);
        prueba.add("Como estas?");
        prueba.add("");
    }
}