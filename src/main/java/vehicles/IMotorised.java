package vehicles;

public interface IMotorised {
    void startEngine();   //this is called a method signature
    void stopEngine();
    int getHp();
    void setHp(int hp);
    int getFuel();
    void setFuel(int fuel);
}
//we don't want these to be hard coded we want this interface class to be used for others