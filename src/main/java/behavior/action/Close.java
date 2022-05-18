package behavior.action;

public class Close implements IAction{

    @Override
    public Boolean execute() {
        System.out.println("Close project");
        return true;
    }
}
