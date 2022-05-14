package behavior.action;

public class Button {

    private IAction action;

    public Button(IAction action){
        this.action = action;
    }

    public void onClick(){
        action.doIt();
    }

    public void setAction(IAction action){
        this.action = action;
    }
}
