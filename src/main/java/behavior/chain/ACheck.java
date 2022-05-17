package behavior.chain;

public abstract class ACheck {

    private ACheck next;


    public ACheck(ACheck next){
        this.next = next;
    }

    public abstract Boolean doCheck(String param);

    public Boolean nextCheck(String param){
        if(next!=null) return next.doCheck(param);
        else return true;
    }
}
