package tasca1_herencia.n3Exercici1.noticies;

public class Tenis  extends Noticia{
    private String competicio, jugador;
    private static final int PUNTUACIO_JUGADOR = 3;
    private static final int PREU_JUGADOR = 100;

    {
        setPreu(150);
        setPuntuacio(4);
    }

    public Tenis(String titular, String competicio, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.jugador = jugador;
    }

    @Override
    public void calcularPreuNoticia() {
        int preuNoticiaTenis = 0;

        if(jugador.equalsIgnoreCase("nadal") || jugador.equalsIgnoreCase("Alcaraz")){
            preuNoticiaTenis+= PREU_JUGADOR;
        }
        setPreu(preuNoticiaTenis + getPreu());
    }

    @Override
    public void calcularPuntuacio() {
        int puntuacioTenis = 0;

        if(jugador.equalsIgnoreCase("nadal") || jugador.equalsIgnoreCase("Djokovic")){
            puntuacioTenis = PUNTUACIO_JUGADOR;
        }
        setPuntuacio(puntuacioTenis+ getPuntuacio());
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "competicio='" + competicio + '\'' +
                ", jugador='" + jugador + '\'' +
                '}';
    }
}
