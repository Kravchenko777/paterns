package structural.decorator;

public class SMSMessage extends BaseDecorator{

    public SMSMessage(Message message) {
        super(message);
    }

    @Override
    public Boolean sendMessage() {
        return false;
    }
}
