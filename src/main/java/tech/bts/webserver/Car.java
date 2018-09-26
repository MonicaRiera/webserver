package tech.bts.webserver;

public class Car {

    private String brand;
    private double maxSpeed;

    public Car(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return this.brand + ": " + this.maxSpeed + "km/h";
    }
}
