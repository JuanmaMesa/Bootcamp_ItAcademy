package tasca1_herencia.n3Exercici1.noticies;

public class Basket  extends Noticia {
    private String competicio, club;
    private static final int PREU_EUROLLIGA = 100;
    private static final int PREU_EQUIP = 75;
    private static final int PUNTUACIO_EUROLLIGA = 3;
    private static final int PUNTUACIO_ACB = 2;
    private static final int PUNTUACIO_EQUIP = 1;

    {
        setPreu(250);
        setPuntuacio(4);
    }

    public Basket(String titular, String competicio ,String club) {
        super(titular);
        this.club = club;
        this.competicio = competicio;
    }

    @Override
    public void calcularPreuNoticia() {
        int preuNoticiaBasquet = 0;

        if(competicio.equalsIgnoreCase("euroLiga")){
            preuNoticiaBasquet = PREU_EUROLLIGA;
        }
        if(club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){
            preuNoticiaBasquet += PREU_EQUIP;
        }
        setPreu(preuNoticiaBasquet + getPreu());
    }

    @Override
    public void calcularPuntuacio() {
        int puntuacioBasquet = 0;

        if(competicio.equalsIgnoreCase("acb")){
            puntuacioBasquet = PUNTUACIO_ACB;
        }
        if(competicio.equalsIgnoreCase("EuroLiga")){
            puntuacioBasquet +=  PUNTUACIO_EUROLLIGA;
        }
        if(club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){
            puntuacioBasquet+= PUNTUACIO_EQUIP;
        }
        setPuntuacio(puntuacioBasquet+ getPuntuacio());
    }

    @Override
    public String toString() {
        return "Basket{" +
                "competicio='" + competicio + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
