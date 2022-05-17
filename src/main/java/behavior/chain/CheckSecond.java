package behavior.chain;

public class CheckSecond extends ACheck {


    public CheckSecond(ACheck next) {
        super(next);
    }

    @Override
    public Boolean doCheck(String param) {
        System.out.println(param+ "Second");
        return null;
    }
}
