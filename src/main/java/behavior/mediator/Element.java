package behavior.mediator;

public abstract class Element {
    private IMediator mediator;

    public Element(IMediator mediator){
        this.mediator = mediator;
    }

    public abstract void click();

    public abstract void sendKey(String keys);

}
