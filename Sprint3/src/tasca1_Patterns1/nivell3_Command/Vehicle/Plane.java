package tasca1_Patterns1.nivell3_Command.Vehicle;

public class Plane extends Vehicle{


    public Plane(String name) {

        super("Avion");
    }

    @Override
    public void Start() {
        System.out.println( getName()+" esta arrancando");

    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " esta acelerando");

    }

    @Override
    public void brake() {
        System.out.println(getName()+ " esta frenando");

    }
}


