package structural.decorator;

public class BaseMessage implements Message{

    @Override
    public Integer sendMessage() {
        return 100;
    }
}
