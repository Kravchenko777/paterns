package behavior.state;

public class State1 extends State{

    public State1(Player player) {
        super(player);
    }

    @Override
    public void makeWork() {
        System.out.println("State1");
        player.getStr();
    }
}
