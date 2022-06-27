package EjCompLvl3;

import java.time.LocalDate;
import java.util.Calendar;

public class Alumnos {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;

    public Alumnos(String nombre, String apellido, LocalDate fechaNac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public String getApellido(){
        return apellido;
    }


    public String getNombre(){
        return nombre;
    }

    public String getfechaNac(){
        return getfechaNac();
    }
    
    public int calcularEdad(){
        int hoy = Calendar.getInstance().getWeekYear();
        int edad = hoy - this.fechaNac.getYear();
        return edad;
    }

}


