package behavior.state;

public class StateFirst extends State{

    public StateFirst(Player player) {
        super(player);
    }

    @Override
    public void play() {
        System.out.println("StateFirst");
        player.getStr();
    }
}
