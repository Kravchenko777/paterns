package behavior.chain;

public abstract class ACheck {

    private ACheck next;

    public ACheck(ACheck next){
        this.next = next;
    }

    public abstract Boolean doCheck();

    public Boolean nextCheck(){
        if(next!=null) return next.doCheck();
        else return true;
    }
}
