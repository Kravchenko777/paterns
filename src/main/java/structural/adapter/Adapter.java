package structural.adapter;

// Класс адаптера
public class Adapter implements IMessage {

    @Override
    public String getMessage(IntegerMessage integerMessage) {
        return String.valueOf(integerMessage.getMessageInt());
    }
}
