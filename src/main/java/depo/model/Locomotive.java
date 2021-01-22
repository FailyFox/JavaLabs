package depo.model;

public class Locomotive {
    private int power;
    private int maxSpeed;
    private double fuelConsumption;

    public Locomotive(){};

    public Locomotive(int power, int maxSpeed, int fuelConsumption){
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "power: " + power +
                ", maxSpeed: " + maxSpeed +
                ", fuelConsumption: " + fuelConsumption +
                '}';
    }
}
