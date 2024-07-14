package tasca1_herencia.n3Exercici1.noticies;

public class F1 extends Noticia {
    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    @Override
    public void calcularPreuNoticia() {
    }

    @Override
    public void calcularPuntuacio() {

    }
}
