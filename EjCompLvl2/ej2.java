package EjCompLvl2;

import java.util.ArrayList;

public class ej2 {


    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(100);
        numeros.add(200);
        numeros.add(300);
        numeros.add(400);
        numeros.add(500);
        
        numeros.forEach((elemento) ->{
            System.out.println(elemento);
        });
        System.out.println("El tamaño de la lista es : " + numeros.size());

        numeros.add(0,10);
        numeros.add(4 , 40);
        System.out.println("Despues de agregar nuevos elementos:");
        numeros.forEach((elemento) ->{
            System.out.println(elemento);
        });
        System.out.println("El tamaño de la lista es : " + numeros.size());

    }

    
       // System.out.println("Longitud del arreglo :" + numeros.length);
    
}
