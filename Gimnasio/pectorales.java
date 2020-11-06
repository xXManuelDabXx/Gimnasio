package Gimnasio;

public class pectorales extends gimnasio{
    
    private String pectoralMayor;
    private String pectoralMenor;

    public pectorales(
            String nombre, 
            int cantidadDeInscripciones,
            String musculoDelDia,
            Boolean parqueaderoDisponible,
            String pectoralMayor,
            String pectoralMenor ) {
        super(
             nombre,
             cantidadDeInscripciones,
             musculoDelDia,
             parqueaderoDisponible );
             
        this.pectoralMayor = pectoralMayor;
        this.pectoralMenor = pectoralMenor;
               
    }

    public String getpectoralMayor() {
        return pectoralMayor;
    }

    public void setpectoralMayor(String pectoralMayor) {
        this.pectoralMayor = pectoralMayor;
    }

    public String getpectoralMenor() {
        return pectoralMenor;
    }

    public void setpectoralMenor(String pectoralMenor) {
        this.pectoralMenor = pectoralMenor;
    }
    
}
