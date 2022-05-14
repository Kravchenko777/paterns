package behavior.chain;

public class Check2 extends ACheck {

    public Check2(ACheck next){
        super(next);
    }

    @Override
    public Boolean doCheck() {
        System.out.println("2");
        return nextCheck();
    }
}
