package behavior.action;

public class RemoteControl {

    private IAction action;

    public RemoteControl(IAction action){
        this.action = action;
    }

    public void onClick(){
        action.execute();
    }

    public void setAction(IAction action){
        this.action = action;
    }
}
