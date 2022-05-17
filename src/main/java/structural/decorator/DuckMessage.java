package structural.decorator;

public class DuckMessage extends Decorator {

    public DuckMessage(IObject message) {
        super(message);
    }

    @Override
    public String getName() {
        return "Я утка";
    }
}
