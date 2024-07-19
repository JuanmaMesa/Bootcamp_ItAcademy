package tasca1_herencia.n3Exercici1;

import tasca1_herencia.n3Exercici1.noticies.Noticia;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private final String name;
    private final String dni;
    private static int salary = 1500;
    private List<Noticia> bolsaNoticias;


    public Redactor (String name, String dni){
        this.name = name;
        this.dni = dni;
        bolsaNoticias = new ArrayList<>();


    }

    @Override
    public String toString() {
        return "Redactor{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public  int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Redactor.salary = salary;
    }

    public void verNoticias(){
        for(Noticia noticia : bolsaNoticias){
            System.out.println(noticia.toString());
        }
    }

    public void introducirNotia(Noticia notica){
        bolsaNoticias.add(notica);
    }

    public List<Noticia> getBolsaNoticias() {
        return bolsaNoticias;
    }
    public Noticia verUnaNoticia(int nummero){
        return bolsaNoticias.get(nummero);
    }
}
