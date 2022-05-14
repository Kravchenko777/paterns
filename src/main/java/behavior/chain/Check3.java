package behavior.chain;

public class Check3 extends ACheck {

    public Check3(ACheck next){
        super(next);
    }

    @Override
    public Boolean doCheck() {
        System.out.println("3");
        return nextCheck();
    }
}
