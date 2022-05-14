package structural.decorator;

public class PushMessage extends BaseDecorator{

    public PushMessage(Message message) {
        super(message);
    }

    @Override
    public Boolean sendMessage() {
        return true;
    }
}
