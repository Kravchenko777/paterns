package behavior.chain;

import structural.facade.Class1;

public class Check1 extends ACheck {

    public Check1(ACheck next){
        super(next);
    }

    @Override
    public Boolean doCheck() {
        System.out.println("1");
        return nextCheck();
    }
}
