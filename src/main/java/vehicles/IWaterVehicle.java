package vehicles;

public interface IWaterVehicle {
    String getHullType(); //forces anything that takes IWaterVehicle to use this
    String setHullType(String type);
}
