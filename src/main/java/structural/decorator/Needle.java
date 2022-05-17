package structural.decorator;

public class Needle extends Decorator {

    public Needle(IObject message) {
        super(message);
    }

    @Override
    public String getName() {
        return "Я игла";
    }

    @Override
    public Integer getSumm() {
        return wrapper.getSumm() + 1000;
    }
}
