package tasca1_herencia.n3Exercici1.noticies;

public class Tenis  extends Noticia{
    private String competicio, nomTenistes;

    public Tenis(String titular, String competicio, String nomTenistes) {
        super(titular);
        this.competicio = competicio;
        this.nomTenistes = nomTenistes;
    }

    @Override
    public void calcularPreuNoticia() {


    }

    @Override
    public void calcularPuntuacio() {

    }
}
