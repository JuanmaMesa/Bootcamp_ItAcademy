package tasca1_Patterns1.nivell3_Command;

import tasca1_Patterns1.nivell3_Command.Vehicle.Bicycle;
import tasca1_Patterns1.nivell3_Command.Vehicle.Boat;
import tasca1_Patterns1.nivell3_Command.Vehicle.Car;
import tasca1_Patterns1.nivell3_Command.Vehicle.Plane;

public class Main {
    public static void main(String[] args) {

        Bicycle bici = new Bicycle("turbo");
        Start start = new Start(bici);
        Accelerate accelerateBicycle = new Accelerate(bici);
        Brake brakeBicycle = new Brake(bici);
        start.execute();
        accelerateBicycle.execute();
        brakeBicycle.execute();



        Boat boart = new Boat("Bb");
        Start startBoat = new Start(boart);
        Accelerate acceleratBoat = new Accelerate(boart);
        Brake brakeBoat = new Brake(boart);
        startBoat.execute();
        acceleratBoat.execute();
        brakeBoat.execute();


        Car car = new Car("turbo22");
        Start startCar = new Start(car);
        Accelerate acceleratCar = new Accelerate(car);
        Brake brakeCar = new Brake(car);
        startCar.execute();
        acceleratCar.execute();
        brakeCar.execute();

        Plane plane = new Plane("turboAero");
        Start startPlane = new Start(plane);
        Accelerate accelerPlane = new Accelerate(plane);
        Brake brakePlane = new Brake(plane);
        startPlane.execute();
        accelerPlane.execute();
        brakePlane.execute();




    }


}
