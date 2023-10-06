package please;

import interfaces.Driveable;
import interfaces.Flyable;

public class FlyingCar extends Vehicle implements Flyable, Driveable {
    public FlyingCar(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printSpeed(Vehicle vehicle) {
        System.out.println("The Speed is: "+vehicle.getSpeed());
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }
}
