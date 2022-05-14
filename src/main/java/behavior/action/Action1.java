package behavior.action;

public class Action1 implements IAction{

    @Override
    public Boolean doIt() {
        System.out.println(1);
        return null;
    }
}
