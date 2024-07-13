package tasca1_herencia.n3Exercici1;

public class Redactor {
    private final String name;
    private final String dni;
    private static int salary = 1500;


    public Redactor (String name, String dni){
        this.name = name;
        this.dni = dni;

    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Redactor.salary = salary;
    }
}
