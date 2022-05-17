package structural.decorator;

public class EggMessage extends Decorator {

    public EggMessage(IObject message) {
        super(message);
    }

    @Override
    public String getName() {
        return "Я яйцо";
    }
}
