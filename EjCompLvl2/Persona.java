package EjCompLvl2;

public class Persona {
        
        private String nomYAp;
        private Integer dni;
        private Integer horasTrabajadas;
        private Integer valorPorHora;

    public Persona(String nombreYapellido, int dniEmpl, int horasT, int valorH) {
        this.nomYAp = nombreYapellido;
        this.dni = dniEmpl;
        this.horasTrabajadas = horasT;
        this.valorPorHora = valorH;

    }

    public String getNombre(){
        return nomYAp;
    }

    public Integer getdni(){
        return dni;
    }

    public Integer gethorasTrabajadas(){
        return horasTrabajadas;
    }

    public Integer getValorPorHora(){
        return valorPorHora;
    }

    
}