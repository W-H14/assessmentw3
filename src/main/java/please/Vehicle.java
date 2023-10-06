package please;

public abstract class Vehicle extends Product {
    private int speed;
    private float price;
    private Engine engine;
    protected final float TAX_AMT = .10F;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getTAX_AMT() {
        return TAX_AMT;
    }

    public Vehicle(String name, int speed, float price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }
        public static void printVehicleType(Vehicle vehicle) {
            System.out.println(vehicle.getClass());


        }
        public float getPriceAfterTax(Vehicle vehicle){
            float price = vehicle.getPrice();
            float taxRate = vehicle.getTAX_AMT();
            float priceAfterTax = price * (1 + taxRate);
            return priceAfterTax;
        }



}
