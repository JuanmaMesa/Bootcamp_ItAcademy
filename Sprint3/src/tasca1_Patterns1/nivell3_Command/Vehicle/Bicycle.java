package tasca1_Patterns1.nivell3_Command.Vehicle;

import tasca1_Patterns1.nivell3_Command.Vehicle.Vehicle;

public class Bicycle extends Vehicle {

    public Bicycle(String name) {
        super("Bicicleta");
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
