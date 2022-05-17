package structural.bridge;

public abstract class Key {

    protected ICar car;

    public Key(ICar car){
        this.car = car;
    }

    public abstract void enableSignalCar();

    public void openCar(){
        car.open();
    }

    public void closeCar(){
        car.close();
    }
}
