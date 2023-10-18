package vehicles;

public class Kayak implements IWaterVehicle {

    private String hullType;

    public Kayak(String hullType){
        this.hullType = hullType;
    }

    public String getHullType(){
        return this.hullType;
    }

    public String setHullType(String type){
        return this.hullType = type;
    }
}
