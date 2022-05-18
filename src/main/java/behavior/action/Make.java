package behavior.action;

public class Make implements IAction{

    @Override
    public Boolean execute() {
        System.out.println("Make project");
        return true;
    }
}
