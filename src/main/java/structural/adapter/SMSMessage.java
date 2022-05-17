package structural.adapter;

public class SMSMessage implements IMessage{
    @Override
    public String getMessage() {
        return "100";
    }
}
