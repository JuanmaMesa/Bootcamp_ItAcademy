package tasca1_herencia.n3Exercici1;

import tasca1_herencia.n3Exercici1.noticies.Futbol;

import java.util.Scanner;

public class App {
    public static final  int REDACTOR = 1;
    public static final  int ELIMINAR_REDACTOR = 2;
    public static final  int INTR_NOTICIA = 3;
    public static final  int ELMINAR_NOTICIA = 4;
    public static final  int TOTES_NOTICIES = 5;
    public static final  int PUNTUACIO = 6;
    public static final  int PREU = 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Futbol noticia1 = new Futbol(25, "Barça", "liga", "barça", "pedri22");
        noticia1.calcularPreuNoticia();
        noticia1.calcularPuntuacio();
        System.out.println("Puntuacio; " + noticia1.getPuntuacio());

        System.out.println(noticia1.toString());

        String menu = """
                       MENU
                1. Introduir Redactor
                2. Eliminar Redactor
                3. Introduir noticia a un redactor
                4. Eliminar noticia
                5. Mostrar totes les noticies per redactor
                6. Calcular puntuació noticia
                7. Calcular preu noticia
                """;

        System.out.println(menu);
        int opcionUsuario = input.nextInt();

        switch (opcionUsuario){
            case REDACTOR:
                break;
            case ELIMINAR_REDACTOR:
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
        }



    }

}
