package tasca1_herencia.n3Exercici1.noticies;

public class Futbol extends Noticia{
    private String competicio, club, jugador;
    private static final int PREU_LLIGA = 100;
    private static final int PREU_EQUIP = 100;
    private static final int PREU_JUGADOR = 50;
    private static final int PUNTUACIO_CHAMPIONS = 3;
    private static final int PUNTUACIO_LLIGA = 2;
    private static final int PUNTUACIO_EQUIP = 1;
    private static final int PUNTUACIO_JUGADOR = 1;
    private static final String[] NOM_JUGADORS = {"pedri","gavi","carvajal","rodrygo"};

    // bloque inicializacion
    {
        setPreu(300);
        setPuntuacio(5);
    }

    public Futbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public  void calcularPreuNoticia() {
        int preuNoticiaFutbol = 0;

        if(competicio.equalsIgnoreCase("liga")){
            preuNoticiaFutbol = PREU_LLIGA;
        }
        if(club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){
            preuNoticiaFutbol += PREU_EQUIP;
        }
        // listamos nombres de los jugadores
        for(String jugador:NOM_JUGADORS){
            if(jugador.equalsIgnoreCase(this.jugador)){
                preuNoticiaFutbol+= PREU_JUGADOR;
            }
        }
        setPreu(preuNoticiaFutbol + getPreu());
    }

    @Override
    public void calcularPuntuacio() {
        int puntuacioFutbol = 0;

        if(competicio.equalsIgnoreCase("liga")){
            puntuacioFutbol = PUNTUACIO_LLIGA;
        }
        if(competicio.equalsIgnoreCase("CHAMPIONS")){
            puntuacioFutbol +=  PUNTUACIO_CHAMPIONS;
        }
        if(club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){
            puntuacioFutbol+= PUNTUACIO_EQUIP;
        }
        if(jugador.equalsIgnoreCase("Pedri")){
            puntuacioFutbol+= PUNTUACIO_JUGADOR;

        }
        setPuntuacio(puntuacioFutbol+ getPuntuacio());
    }

    @Override
    public String toString() {
        return "Futbol{" +
                "competicio='" + competicio + '\'' +
                ", club='" + club + '\'' +
                ", jugador='" + jugador + '\'' +
                ", preuNoticiaFutbol=" + getPreu()+
                '}';
    }
}
