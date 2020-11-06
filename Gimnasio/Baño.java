package Gimnasio;

class Baño {
    private String sexo;
    private Boolean ocupadoOlibre;

    public Baño(String sexo, Boolean ocupadoOlibre) {
        this.sexo = sexo;
        this.ocupadoOlibre = ocupadoOlibre;
    }

    public String getGenero() {
        return sexo;
    }

    public void setGenero(String sexo) {
        this.sexo = sexo;
    }

    public boolean getocupadOlibre() {
        return ocupadoOlibre;
    }

    public void setocupadOlibre(Boolean ocupadoOlibre) {
        this.ocupadoOlibre = ocupadoOlibre;
    }

    boolean getocupadoOlibre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
