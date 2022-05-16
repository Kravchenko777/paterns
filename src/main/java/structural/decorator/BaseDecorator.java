package structural.decorator;

public class BaseDecorator implements Message{

    protected Message wrapper;

    public BaseDecorator(Message message){
        this.wrapper = message;
    }

    @Override
    public Integer sendMessage() {
        return wrapper.sendMessage();
    }
}
