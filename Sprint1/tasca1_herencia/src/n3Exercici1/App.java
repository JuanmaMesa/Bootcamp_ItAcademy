package tasca1_herencia.n3Exercici1;

import tasca1_herencia.n3Exercici1.noticies.*;

import java.util.ArrayList;

public class App {
    public static final int REDACTOR = 1;
    public static final int ELIMINAR_REDACTOR = 2;
    public static final int INTR_NOTICIA = 3;
    public static final int ELIMINAR_NOTICIA = 4;
    public static final int TOTES_NOTICIES = 5;
    public static final int PUNTUACIO = 6;
    public static final int PREU = 7;
    public static final int FUTBOL = 1;
    public static final int BASQUET = 2;
    public static final int TENIS = 3;
    public static final int FORMULA1 = 4;
    public static final int SORTIR = 0;
    public static final String NOMBRE_REDACTOR = "Dime el nombre del redactor";


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
                    introducirNoticaRedactor(Input.readString(NOMBRE_REDACTOR));
                    break;
                case ELIMINAR_NOTICIA:
                    eliminarNoticia(Input.readString(NOMBRE_REDACTOR), Input.readInt("Numero noticia"));
                    break;
                case TOTES_NOTICIES:
                    verNoticiasRedactor(Input.readString(NOMBRE_REDACTOR));
                    break;
                case PUNTUACIO:
                    calcularPuntuacio(Input.readString(NOMBRE_REDACTOR), Input.readInt("Numero de noticia"));
                    break;
                case PREU:
                    calcularPrecio(Input.readString(NOMBRE_REDACTOR), Input.readInt("Numero de noticia"));
                    break;
                case SORTIR:
                    System.out.println("Saliendo de la app...");
                    break;
                default:
                    System.out.println("solo hay opciones del " + REDACTOR + "-" + PREU);
            }
        }
        while (opcionUsuario != 0);
        int numero = 1;
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

    public static Noticia crearNoticia() {
        String club = "";
        String competicio = "";
        String jugador = "";
        String escuderia = "";
        String menuNoticia = """
                  Menu noticias
                1. Futbol
                2. Basquet
                3. Tenis
                4. F1
                """;
        System.out.println(menuNoticia);
        int opcioUsuari = Input.readInt("Sobre que deporte es la noticia? 1-4");
        Input.limpiezaBuffer();
        String titular = Input.readString("titular?");
        if (opcioUsuari >= FUTBOL && opcioUsuari <= FORMULA1) {
            switch (opcioUsuari) {
                case FUTBOL:
                    competicio = Input.readString("competicio?");
                    club = Input.readString("club?");
                    jugador = Input.readString("jugador?");
                    return new Futbol(titular, competicio, club, jugador);
                case BASQUET:
                    competicio = Input.readString("competicio?");
                    club = Input.readString("club?");
                    return new Basket(titular, competicio, club);
                case TENIS:
                    competicio = Input.readString("competicio?");
                    jugador = Input.readString("jugador?");
                    return new Tenis(titular, competicio, jugador);
                case FORMULA1:
                    escuderia = Input.readString("Escuderia?");
                    return new F1(titular, escuderia);
                default:
                    return new ErrorNoticia();
            }
        } else {
            System.out.println("Opcion no valida");
            return new ErrorNoticia();
        }
    }

    public static Redactor buscarRedactor(String name) {
        for (Redactor redactor : redactoresList) {
            if (redactor.getName().equalsIgnoreCase(name)) {
                return redactor;
            }
        }
        return null;
    }


    public static void introducirNoticaRedactor(String name) {
        Redactor redactor = buscarRedactor(name);
        if (redactor == null) {
            System.out.println("No hay ningun redactor disponible");
        } else {
            Noticia noticia = crearNoticia();
            redactor.introducirNotia(noticia);
        }
    }

    public static void verNoticiasRedactor(String name) {
        Redactor redactor = buscarRedactor(name);
        if (redactor == null) {
            System.out.println("No hay ningun redactor disponible");
        } else {
            if (redactor.getBolsaNoticias().isEmpty()) {
                System.out.println("El redactor " + redactor.getName() + " no tiene ninguna noticia");
            } else {
                redactor.verNoticias();
            }
        }
    }

    public static void calcularPuntuacio(String name, int numeroNoticia) {
        Redactor redactor = buscarRedactor(name);
        if (redactor == null) {
            System.out.println("No hay ningun redactor disponible");
        } else {
            if (redactor.getBolsaNoticias().isEmpty()) {
                System.out.println("No tiene noticias para calcular");
            } else if (redactor.getBolsaNoticias().size() < numeroNoticia) {
                System.out.println("No tiene esa cantidad de noticias");
            } else {
                Noticia noticia = redactor.verUnaNoticia(numeroNoticia - 1);
                int puntuacioBase = noticia.getPuntuacio();
                noticia.calcularPuntuacio();
                System.out.println("Puntuacion base redactor " + puntuacioBase +
                        "\nPuntuacion base noticia: " + (noticia.getPuntuacio() - puntuacioBase) +
                        "\nPuntuacion total = " + noticia.getPuntuacio());
            }
        }
    }

    public static void calcularPrecio(String name, int numeroNoticia) {
        Redactor redactor = buscarRedactor(name);
        if (redactor == null) {
            System.out.println("No hay ningun redactor disponible");
        } else {
            if (redactor.getBolsaNoticias().isEmpty()) {
                System.out.println("No tiene noticias para calcular");
            } else if (redactor.getBolsaNoticias().size() < numeroNoticia) {
                System.out.println("No tiene esa cantidad de noticias");
            } else {
                Noticia noticia = redactor.verUnaNoticia(numeroNoticia - 1);
                int precioBase = noticia.getPreu();
                noticia.calcularPreuNoticia();
                System.out.println("Precio base redactor " + precioBase +
                        "\nPrecio base noticia: " + (noticia.getPreu() - precioBase) +
                        "\nPrecio total = " + noticia.getPreu());
            }
        }
    }

    public static void eliminarNoticia(String name, int numeroNoticia) {
        Redactor redactor = buscarRedactor(name);
        if (redactor == null) {
            System.out.println("No hay ningun redactor disponible");
        } else {
            if (redactor.getBolsaNoticias().isEmpty()) {
                System.out.println("No tiene noticias");
            } else if (redactor.getBolsaNoticias().size() < numeroNoticia) {
                System.out.println("No tiene esa cantidad de noticias");
            } else {
                redactor.getBolsaNoticias().remove(numeroNoticia - 1);
            }
        }
    }
}

