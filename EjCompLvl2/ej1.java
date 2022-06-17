package EjCompLvl2;

import java.util.ArrayList;

public class ej1 {
    
    public static void main(String[] args){
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Mendoza");
        ciudades.add("Cordoba");
        ciudades.add("San Luis");
        ciudades.add("Fontana");
        ciudades.add("Rio Negro");
        
        System.out.println("#1 - "+ ciudades.get(0));
        System.out.println("#1 - "+ ciudades.get(1));
        System.out.println("#1 - "+ ciudades.get(2));
        System.out.println("#1 - "+ ciudades.get(3));
        System.out.println("#1 - "+ ciudades.get(4));
    }
}
