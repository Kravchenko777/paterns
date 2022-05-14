package behavior.mediator;

public interface IElement {

    default public void doIt(IMediator mediator, String event){
        mediator.notifyMe(this,event);
    }
}
