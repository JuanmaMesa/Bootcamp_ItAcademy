package tasca1_Patterns1.nivell3_Command.Vehicle;

import tasca1_Patterns1.nivell3_Command.Vehicle.Vehicle;

public class Car extends Vehicle {


    public Car(String name) {
        super("Coche");
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
