package tasca1_Patterns1.nivell3_Command;

import tasca1_Patterns1.nivell3_Command.Vehicle.Vehicle;

public class Brake implements Command{
    private Vehicle vehicle;
    public Brake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();

    }
}
