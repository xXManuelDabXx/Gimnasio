package Gimnasio;

class Maquinas {
    private String tipoDeMaquina;
    private int creacionDeLaMaquina;

    public Maquinas(String tipoDeMaquina, int creacionDeLaMaquina) {
        this.tipoDeMaquina = tipoDeMaquina; 
        this.creacionDeLaMaquina = creacionDeLaMaquina;
    }

    public String getTipoDeMaquina() {
        return tipoDeMaquina;
    }

    public void setTipoDeMaquina(String tipoDeMaquina) {
        this.tipoDeMaquina = tipoDeMaquina;
    }

    public int getCreacionDeLaMaquina() {
        return creacionDeLaMaquina;
    }

    public void setCreacionDeLaMaquina(int creacionDeLaMaquina) {
        this.creacionDeLaMaquina = creacionDeLaMaquina;
    }

    
    
}