package structural.bridge;

// Реализация
public class VAZ  implements ICar{
    @Override
    public void enableSignal() {
        System.out.println("VAZ signal on");
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
