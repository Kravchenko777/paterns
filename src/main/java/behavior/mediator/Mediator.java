package behavior.mediator;

public class Mediator implements IMediator{


    @Override
    public void notifyMe(Element element, String event, String text) {
        if(element !=null && event!=null){
            switch (event){
                case ("click"):
                    element.click();
                    break;
                case("sendKey"):
                    element.sendKey(text);
                    break;
            }
        }
    }
}
