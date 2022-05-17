package behavior.chain;

public class CheckFirst extends ACheck {


    public CheckFirst(ACheck next) {
        super(next);
    }

    @Override
    public Boolean doCheck(String param) {
        System.out.println(param+ "First");
        return null;
    }
}
