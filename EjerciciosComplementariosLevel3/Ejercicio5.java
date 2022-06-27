package EjCompLvl3;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.Map;

public class Ejercicio5 {
    
    
    public static void main(String[] args) {
        Alumnos alum1 = new Alumnos("Gabriel", "Perez", LocalDate.of(1990,1,11));
        Alumnos alum2 = new Alumnos("Simon", "Roman", LocalDate.of(2000,2,2));
        Alumnos alum3 = new Alumnos("Gaston", "Lopez", LocalDate.of(2020,3,5));
        Alumnos alum4 = new Alumnos("Maria", "Romero", LocalDate.of(1980,5,12));
        Alumnos alum5 = new Alumnos("Lucia", "Soledad", LocalDate.of(1996,8,23));

        List<Alumnos> listAlum = List.of(alum1, alum2, alum3, alum4, alum5);
        
        Map<String, Integer> mapAlum = listAlum.stream()
        .collect(Collectors.toMap(elmto->elmto.getApellido() + " " + elmto.getNombre(), elmto2->elmto2.calcularEdad()));
        
        System.out.println(mapAlum);
    }   
}
