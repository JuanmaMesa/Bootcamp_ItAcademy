package tasca1_Patterns1.nivell3_Command;

import tasca1_Patterns1.nivell3_Command.Vehicle.Vehicle;

public class Start implements Command {

    private Vehicle vehicle;

    public Start(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.Start();

    }
}
