package tasca1_herencia.n3Exercici1.noticies;

public class ErrorNoticia  extends  Noticia{
    public ErrorNoticia() {
        super("No noticia");
    }

    @Override
    public void calcularPreuNoticia() {

    }

    @Override
    public void calcularPuntuacio() {

    }

    @Override
    public String toString() {
        return "Noticia Vacia";
    }
}
