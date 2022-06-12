package EjCompLvl2;

import java.util.ArrayList;

public class ej5 {
    static ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
    static ArrayList<Integer> valorPorHora = new ArrayList<Integer>();
    static ArrayList<Integer> totales = new ArrayList<Integer>();
    

    public static void main(String[] args) {
        cargarHorasTrabajadas();
        cargarValorPorHora();
        calcularTotal();
    }


    private static void calcularTotal() {
        int total = 0;
        for (int i = 0; i<horasTrabajadas.size(); i++){      //podria usar longitud del arraylist de valorHora, o simplemente un int=5
            total = total + (horasTrabajadas.get(i) * valorPorHora.get(i));
        }
        System.out.println("Total Final: $" + total);
    }


    private static void cargarHorasTrabajadas() {
        horasTrabajadas.add (6);
        horasTrabajadas.add (7);
        horasTrabajadas.add (8);
        horasTrabajadas.add (4);
        horasTrabajadas.add (5);

    }


    private static void cargarValorPorHora() {
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);
    }


}
