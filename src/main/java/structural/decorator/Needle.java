package structural.decorator;

public class Needle extends Decorator {

    public Needle(IObject message) {
        super(message);
    }

    @Override
    public String getName() {
        return "Я игла";
    }
}
