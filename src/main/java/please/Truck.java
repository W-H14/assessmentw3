package please;

import interfaces.Driveable;

public class Truck extends Vehicle implements Driveable {
    public Truck(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printSpeed(Vehicle vehicle) {
        System.out.println("The Speed is: "+vehicle.getSpeed());
    }
}
