package please;

import interfaces.Driveable;

public class Car extends Vehicle implements Driveable {
    private int numberOfDoors;
    private float extraTax = 0.5F;

    public Car(String name, int speed, float price, Engine engine, int numberOfDoors, float extraTax) {
        super(name, speed, price, engine);
        this.numberOfDoors = numberOfDoors;
        this.extraTax = extraTax;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getExtraTax() {
        return extraTax;
    }

    public void setExtraTax(float extraTax) {
        this.extraTax = extraTax;
    }

    public void printNumberOfDoors(Car car){
        System.out.println(car.getNumberOfDoors());
    }


    @Override
    public void printSpeed(Vehicle vehicle) {
        System.out.println("The Speed is: "+vehicle.getSpeed());
    }
    @Override
    public float getPriceAfterTax(Vehicle vehicle){
        float price = vehicle.getPrice();
        float taxRate = vehicle.getTAX_AMT() + extraTax;
        float priceAfterTax = price * (1 + taxRate);
        return priceAfterTax;
    }
}
