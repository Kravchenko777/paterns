package structural.bridge;

// Реализация платформы
public class SuperKey extends Key{

    public SuperKey(ICar car) {
        super(car);
    }

    @Override
    public void enableSignalCar() {
        System.out.println("Use super key");
        car.enableSignal();
    }
}
