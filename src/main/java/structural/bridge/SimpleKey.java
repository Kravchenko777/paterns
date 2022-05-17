package structural.bridge;

public class SimpleKey extends Key{

    public SimpleKey(ICar car) {
        super(car);
    }

    @Override
    public void enableSignalCar() {
        System.out.println("Use simple key");
        car.enableSignal();
    }
}
