package please;

import interfaces.Flyable;

public class Plane extends Vehicle implements Flyable {
    public Plane(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public boolean transportsPassengers() {
        return true;
    }
}
