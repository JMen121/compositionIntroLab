package vehicles;

import products.IProduct;

public class Speedboat extends Vehicle implements IMotorised, IWaterVehicle{
    private String hullType;
    private IMotorised motor;
    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor){
        super(weight,maxSpeed,baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

    public void startEngine(){

    }
    public void stopEngine(){
        
    }
    public int getHp(){

    }
    public void setHp(int hp){

    }
    public int getFuel(){

    }
    public void setFuel(int fuel){
        this.fuel
    }

    String getHullType(){
        return this.hullType;
    }
    String setHullType(String type){
        this.hullType = type;
    }


}
