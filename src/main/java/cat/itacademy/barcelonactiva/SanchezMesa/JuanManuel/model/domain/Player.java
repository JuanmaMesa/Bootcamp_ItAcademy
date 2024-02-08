package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "score")
    private int score;

    @Column (name = "date")
    private int date;

    public Player(){

    }

    public Player(Integer id, String name, int score, int date) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
