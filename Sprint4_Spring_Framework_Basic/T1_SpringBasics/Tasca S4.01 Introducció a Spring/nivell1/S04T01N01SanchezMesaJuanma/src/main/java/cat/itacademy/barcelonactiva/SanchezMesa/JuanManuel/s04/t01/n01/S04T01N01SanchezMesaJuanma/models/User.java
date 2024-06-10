package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t01.n01.S04T01N01SanchezMesaJuanma.models;

public class User {
    private String name;
    private String lastname;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
