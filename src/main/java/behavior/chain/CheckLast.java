package behavior.chain;

public class CheckLast extends ACheck {


    public CheckLast(ACheck next) {
        super(next);
    }

    @Override
    public Boolean doCheck(String param) {
        System.out.println(param + "Last");
        return null;
    }
}
