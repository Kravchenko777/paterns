package behavior.state;

public class Player {

    private State state;
    private String str="OOO";

    public Player(State state){
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void makeWork(){
        state.makeWork();
    }

    public String getStr() {
        return str;
    }
}
