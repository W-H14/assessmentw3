package please;

import interfaces.Driveable;

public class Boat extends Vehicle implements Driveable {
    private boolean hasGPS;

    public Boat(String name, int speed, float price, Engine engine, boolean hasGPS) {
        super(name, speed, price, engine);
        this.hasGPS = hasGPS;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public void printGPSInfo(Boat boat){
        System.out.println(boat.isHasGPS());
    }

    @Override
    public void printSpeed(Vehicle vehicle) {
        System.out.println("The Speed is: "+vehicle.getSpeed());
    }
}
