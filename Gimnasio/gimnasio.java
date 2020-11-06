package Gimnasio;

public class gimnasio {
    private String nombre;// Este define el nombre del gimnasio //
    private int cantidadDeInscripciones;// Esta define la cantidad de usuarios del gimnasio //
    private String musculoDelDia;// Este define el grupo muscular trabajado en la zona del gimnasio //
    private Boolean parqueaderoDisponible;// Este define si hay parqueadero disponible o no//
  
  //Estos son los atributos de composición y agregación//
    
    private Baño tipoDeBaño = null;
    private Maquinas maquinasDelGimnasio;
    
// Este es el constructor // 
    public gimnasio(
            String nombre, 
            int cantidadDeInscripciones, 
            String musculoDelDia, 
            Boolean ParqueaderoDisponible) {
        this.nombre = nombre;
        this.cantidadDeInscripciones = cantidadDeInscripciones;
        this.musculoDelDia = musculoDelDia;
        this.parqueaderoDisponible = ParqueaderoDisponible;
        this.tipoDeBaño = new Baño(" Hombres-Mujeres ",true);
    }    
    //Este metodo me permite conocer quien se inscribira al gimnasio
    public void usuario(){
        this.cantidadDeInscripciones = +120;
        this.parqueaderoDisponible = true;
    }
    //Este método permite saber la musculoDelDia del evento escogido por el cliente
    public void musculoDelDia(
            String pierna, 
            String brazos, 
            String pectorales, 
            String usuario){
        this.musculoDelDia = pierna;
        this.nombre = usuario;
    }
    //Aqui empieza el método get y set//
    public String getNombre() {
        return nombre;
    }

    public Baño getTipoDeBaño() {
        return tipoDeBaño;
    }

    public void setTipoDeBaño(Baño tipoDeBaño) {
        this.tipoDeBaño = tipoDeBaño;
    }

    public Maquinas getmaquinasDelGimnasio() {
        return maquinasDelGimnasio;
    }

    public void setmaquinasDelGimnasio(Maquinas maquinasDelGimnasio) {
        this.maquinasDelGimnasio = maquinasDelGimnasio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getcantidadDeInscripciones() {
        return cantidadDeInscripciones;
    }
    public void setcantidadDeInscripciones(int cantidadDeInscripciones) {
        this.cantidadDeInscripciones = cantidadDeInscripciones;
    }
  
    public String getGrupoMuscular() {
        return musculoDelDia;
    }
    public void setGrupoMuscular(String musculoDelDia) {
        this.musculoDelDia = musculoDelDia;
    }
    public Boolean getParqueaderoDisponible() {
        return parqueaderoDisponible;
    }
    public void setParqueaderoDisponible(Boolean ParqueaderoDisponible) {
        this.parqueaderoDisponible = ParqueaderoDisponible;
    }
    public static void main(String[] args) {
       gimnasio Gimnasio1 = new gimnasio(
               "Jonathan",
               95,
               "Pierna",
               true);
       
        Baño bañosDelGimnasio = new Baño(" Hombres-Mujeres ",true);
        
        Gimnasio1.setTipoDeBaño(bañosDelGimnasio);
        
        System.out.println("el baño es de:");
        System.out.println(Gimnasio1.getTipoDeBaño().getGenero());
        System.out.println("Ha sido limpiado");
        System.out.println(Gimnasio1.getTipoDeBaño().getocupadoOlibre());
    }
}
