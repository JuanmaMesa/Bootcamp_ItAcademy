package tasca1_herencia.n3Exercici1.noticies;

public abstract class Noticia {
    private String titular, text;
    private int puntuacio, preu;

    public Noticia(String titular) {
        text = "";
        puntuacio = 0;
        preu = 0;
        this.titular = titular;
    }

    public abstract void calcularPreuNoticia();
    public abstract void calcularPuntuacio();

    public int getPreu(){
        return preu;
    }

    public String getTitular() {
        return titular;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
