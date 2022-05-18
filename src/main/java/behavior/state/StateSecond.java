package behavior.state;

public class StateSecond extends State{

    public StateSecond(Player player) {
        super(player);
    }

    @Override
    public void play() {
        System.out.println("StateSecond");
        player.getStr();
    }
}
