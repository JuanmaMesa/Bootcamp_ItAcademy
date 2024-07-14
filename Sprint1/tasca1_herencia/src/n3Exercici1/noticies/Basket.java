package tasca1_herencia.n3Exercici1.noticies;

public class Basket  extends Noticia {
    private String competicio, club;

    public Basket(String titular, String club) {
        super(titular);
        this.club = club;
    }

    @Override
    public void calcularPreuNoticia() {

    }

    @Override
    public void calcularPuntuacio() {

    }
}
