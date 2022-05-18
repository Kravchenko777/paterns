package behavior.action;

public class Open implements IAction{

    @Override
    public Boolean execute() {
        System.out.println("Open project");
        return true;
    }
}
