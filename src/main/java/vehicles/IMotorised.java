package vehicles;

public interface IMotorised {
    void startEngine(); //we don't want these to be hard coded we want this interface class to be used for others
    void stopEngine();
    int getHp();
    void setHp(int hp);
    int getFuel();
    void setFuel(int fuel);
}
