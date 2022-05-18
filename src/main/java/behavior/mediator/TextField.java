package behavior.mediator;

public class TextField extends Element{

    public TextField(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void click() {
        System.out.println("click");
    }

    @Override
    public void sendKey(String keys) {
        System.out.println(keys);
    }
}
