package tasca1_herencia.n3Exercici1.noticies;

public class F1 extends Noticia {
    private String escuderia;
    private static final int PUNTUACIO_ESCUDERIA = 2;
    private static final int PREU_ESCUDERIA = 50;
    {
        setPreu(100);
        setPuntuacio(4);
    }

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    @Override
    public void calcularPreuNoticia() {
        int preuNoticiaf1 = 0;

        if(escuderia.equalsIgnoreCase("mercedes") || escuderia.equalsIgnoreCase("Ferrari")){
            preuNoticiaf1 = PREU_ESCUDERIA;
        }
        setPreu(preuNoticiaf1 + getPreu());
    }

    @Override
    public void calcularPuntuacio() {
        int puntuacioF1 = 0;

        if(escuderia.equalsIgnoreCase("mercedes") || escuderia.equalsIgnoreCase("ferrari")){
            puntuacioF1 = PUNTUACIO_ESCUDERIA;
        }
        setPuntuacio(puntuacioF1+ getPuntuacio());
    }

    @Override
    public String toString() {
        return "F1{" +
                "escuderia='" + escuderia + '\'' +
                '}';
    }

}
