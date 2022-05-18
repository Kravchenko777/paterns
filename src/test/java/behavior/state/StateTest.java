package behavior.state;


import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    void testState(){
        Player player = new Player(null);
        StateFirst state1 = new StateFirst(player);
        StateFirst state2 = new StateFirst(player);
        player.setState(state1);
        player.playGame();
        player.setState(state2);
        player.playGame();

    }
}
