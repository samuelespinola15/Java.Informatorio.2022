package EjCompLvl2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ej6 {
    static HashSet<Persona> empleados = new HashSet<>();
    
    public static void main(String[] args) {
       cargarEmpleados();
       cargarMap();

    }
    

    private static void cargarEmpleados(){
       Persona empleado1 = new Persona("Samuel" , 306541 , 50 , 2000);
       Persona empleado2 = new Persona("Marcos H." , 3105646 , 40 , 1500);
       Persona empleado3 = new Persona("Lucas A." , 29123911 , 30 , 2000);
       Persona empleado4 = new Persona("Ana M." , 2011210 , 40 , 2000);
       Persona empleado5 = new Persona("Maria A." , 3311210 , 45 , 2400);
       Persona empleado6 = new Persona("Lucia M." , 3411210 , 40 , 2000);
       Persona empleado7 = new Persona("Daiana B." , 2211210 , 45 , 2000);
       
       empleados.add(empleado1);
       empleados.add(empleado2);
       empleados.add(empleado3);
       empleados.add(empleado4);
       empleados.add(empleado5);
       empleados.add(empleado6);
       empleados.add(empleado7);   

       System.out.println(empleados.size());
    }

    private static void cargarMap(){
        Map<Integer,Integer> sueldo = new HashMap<>();
        //Persona.horasTrabajadas * valorPorHora = sueldo
        //int sueldo1 = empleados.getdni() * getValorPorHora();
        //sueldo.put(empleados.getdni(), empleados.getValorPorHora()); 
    }
}
