package behavior.state;

public class State2 extends State{

    public State2(Player player) {
        super(player);
    }

    @Override
    public void makeWork() {
        System.out.println("State2");
        player.getStr();
    }
}
