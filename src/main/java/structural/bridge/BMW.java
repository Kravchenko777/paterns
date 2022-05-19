package structural.bridge;

// Реализация
public class BMW implements ICar{
    @Override
    public void enableSignal() {
        System.out.println("BMW signal on");
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
