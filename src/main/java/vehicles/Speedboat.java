package vehicles;

import products.IProduct;
public class Speedboat extends Vehicle implements IMotorised, IWaterVehicle {
    private String hullType;
    private IMotorised motor;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

    public void startEngine() {
        System.out.println("SpeedBoat Engine started");

    }

    public void stopEngine() {
        System.out.println("SpeedBoat Engine Stopped");

    }

    public int getHp() {
        return this.motor.getHp();

    }

    public void setHp(int hp) {
        this.motor.setHp(hp);

    }

    public int getFuel() {
        return this.motor.getFuel();
    }

    public void setFuel(int fuel) {
    };

     public String getHullType() {
        return this.hullType; // using this.hulltype directly accesses the instance variable
        // otherwise doing this.motor.hullType would imply that "hulltype is a field within motor
    }

    public String setHullType(String type) {
        return this.hullType = type;
    }

}

