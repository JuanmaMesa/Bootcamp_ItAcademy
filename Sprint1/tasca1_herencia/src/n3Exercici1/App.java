package tasca1_herencia.n3Exercici1;

import tasca1_herencia.n3Exercici1.noticies.Basket;
import tasca1_herencia.n3Exercici1.noticies.F1;
import tasca1_herencia.n3Exercici1.noticies.Futbol;
import tasca1_herencia.n3Exercici1.noticies.Tenis;

import java.util.ArrayList;

public class App {
    public static final int REDACTOR = 1;
    public static final int ELIMINAR_REDACTOR = 2;
    public static final int INTR_NOTICIA = 3;
    public static final int ELMINAR_NOTICIA = 4;
    public static final int TOTES_NOTICIES = 5;
    public static final int PUNTUACIO = 6;
    public static final int PREU = 7;
    public static final int FUTBOL = 1;
    public static final int BASQUET = 2;
    public static final int TENIS = 3;
    public static final int FORMULA1 = 4;


    private static ArrayList<Redactor> redactoresList = new ArrayList<Redactor>();


    public static void main(String[] args) {
        int opcionUsuario;
        do {

            String menu = """
                           MENU
                    1. Introduir Redactor
                    2. Eliminar Redactor
                    3. Introduir noticia a un redactor
                    4. Eliminar noticia
                    5. Mostrar totes les noticies per redactor
                    6. Calcular puntuació noticia
                    7. Calcular preu noticia
                    0. Sortir
                    """;

            System.out.println(menu);
            opcionUsuario = Input.readInt("Elige una opcion"); // si el usuario pone String saldra un -1
            Input.limpiezaBuffer();

            switch (opcionUsuario) {
                case REDACTOR:
                    Redactor redactor = new Redactor(Input.readString("Nombre"), Input.readString("DNI"));
                    redactoresList.add(redactor);
                    break;
                case ELIMINAR_REDACTOR:
                    eliminarRedactor(Input.readString("Que redactor quieres eliminar?"));
                    break;
                case INTR_NOTICIA:
                    break;
                case ELMINAR_NOTICIA:
                    break;
                case TOTES_NOTICIES:
                    break;
                case PUNTUACIO:
                    break;
                case PREU:
                    break;
                default:
                    System.out.println("solo hay opciones del " + REDACTOR + "-" + PREU);
            }
        }
        while (opcionUsuario != 0);
        int numero = 1;
        for (Redactor redactor : redactoresList) {
            System.out.println("Redactor " + numero + ": " + redactor.getName());
            numero++;
        }
    }

    // Metodos
    public static void eliminarRedactor(String nom) {
        for (int i = redactoresList.size() - 1; i >= 0; i--) {
            if (redactoresList.get(i).getName().equalsIgnoreCase(nom)) {
                String nombre = redactoresList.get(i).getName();
                redactoresList.remove(i);
                System.out.println("Redactor " + nombre + " eliminado con exito.");
            } else {
                System.out.println("No hay ningun redactor con ese nombre.");
            }
        }

    }

    public static void introduirNoticia(int opcioUsuari) {
        String menuNoticia = """
                  Menu noticias
                1. Futbol
                2. Basquet
                3. Tenis
                4. F1
                """;
        System.out.println(menuNoticia);
        String titular = Input.readString("titular?");
        switch (opcioUsuari) {
            case FUTBOL:
                String competicio = Input.readString("competicio?");
                String club = Input.readString("club?");
                String jugador = Input.readString("jugador?");
                Futbol futbolNoticia = new Futbol(titular, competicio, club,jugador);
                break;
            case BASQUET:
                String clubBasquet = Input.readString("club?");
                Basket basquetNoticia = new Basket(titular,clubBasquet);
                break;
            case TENIS:
                String competicioTenis = Input.readString("competicio?");
                String jugadorTenis = Input.readString("jugador?");
                Tenis tenisNoticia = new Tenis(titular,competicioTenis,jugadorTenis);
                break;
            case FORMULA1:
                String escuderia = Input.readString("Escuderia?");
                F1 f1 = new F1(titular,escuderia);
                break;
            default:
                System.out.println("Lo siento no hay esa opcion");



        }


    }

}
