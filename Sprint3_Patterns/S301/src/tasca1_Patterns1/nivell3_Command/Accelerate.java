package tasca1_Patterns1.nivell3_Command;

import tasca1_Patterns1.nivell3_Command.Vehicle.Vehicle;

public class Accelerate  implements Command{

   private Vehicle vehicle;

   public Accelerate(Vehicle vehicle){
       this.vehicle = vehicle;
   }


    @Override
    public void execute() {
       vehicle.accelerate();

    }
}
