package Gimnasio;

public class pierna extends gimnasio {
    
    private String cuadriceps;
    private String pantorillas;

    public pierna(
            String nombre, 
            int cantidadDeInscripciones,
            String musculoDelDia,
            Boolean parqueaderoDisponible,
            String cuadriceps,
            String pantorillas ) {
        super(
             nombre,
             cantidadDeInscripciones,
             musculoDelDia,
             parqueaderoDisponible );
             
        this.cuadriceps = cuadriceps;
        this.pantorillas = pantorillas;
               
    }

    public String getcuadriceps() {
        return cuadriceps;
    }

    public void setcuadriceps(String cuadriceps) {
        this.cuadriceps = cuadriceps;
    }

    public String getpantorillas() {
        return pantorillas;
    }

    public void setpantorillas(String pantorillas) {
        this.pantorillas = pantorillas;
    }
    
}
