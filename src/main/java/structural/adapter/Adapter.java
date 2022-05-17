package structural.adapter;

public class Adapter implements IMessage {

    @Override
    public String getMessage() {
        return String.valueOf(new IntegerMessage().getMessage());
    }
}
