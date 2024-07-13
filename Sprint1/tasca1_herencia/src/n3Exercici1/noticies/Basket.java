package tasca1_herencia.n3Exercici1.noticies;

public class Basket  extends Noticia {
    private String competicio, club;

    public Basket(int puntuacio, int preu, String titular, String club) {
        super(puntuacio, titular);
        this.club = club;
    }

    @Override
    public void calcularPreuNoticia() {

    }

    @Override
    public void calcularPuntuacio() {

    }
}
