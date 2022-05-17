package structural.decorator;

public class EggMessage extends Decorator {

    public EggMessage(IObject message) {
        super(message);
    }

    @Override
    public String getName() {
        return "Я яйцо";
    }

    @Override
    public Integer getSumm() {
        return wrapper.getSumm() + 100;
    }
}
