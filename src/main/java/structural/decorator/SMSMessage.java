package structural.decorator;

public class SMSMessage extends BaseDecorator{

    public SMSMessage(Message message) {
        super(message);
    }

    @Override
    public Integer sendMessage() {
        return wrapper.sendMessage() + 500;
    }
}
