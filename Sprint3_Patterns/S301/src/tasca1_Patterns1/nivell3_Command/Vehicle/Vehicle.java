package tasca1_Patterns1.nivell3_Command.Vehicle;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void Start();
    public  abstract void accelerate();
    public abstract void brake();

}
