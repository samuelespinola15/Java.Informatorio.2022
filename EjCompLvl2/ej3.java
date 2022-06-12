package EjCompLvl2;

import java.util.ArrayList;
import java.util.Collections;

public class ej3 {
    static ArrayList<String> barajas = new ArrayList<String>();

    public static void main(String[] args){
        
        barajas.add("A");
        barajas.add("2");
        barajas.add("3");
        barajas.add("4");
        barajas.add("5");
        barajas.add("6");
        barajas.add("7");
        barajas.add("8");
        barajas.add("9");
        barajas.add("10");
        barajas.add("J");
        barajas.add("Q");
        barajas.add("K");

        System.out.println("Barajas: " + barajas);

        imprimirInverso();
        desordenarArray();

    }


    private static void imprimirInverso() {
        Collections.reverse(barajas);
        System.out.println("Barajas invertidas: " + barajas);

    }

    private static void desordenarArray() {
        Collections.shuffle(barajas);
        System.out.println("Barajas desordenadas: " + barajas);

    }

}
