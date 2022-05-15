package behavior.state;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testState(){
        Player player = new Player(null);
        State1 state1 = new State1(player);
        State1 state2 = new State1(player);
        player.setState(state1);
        player.makeWork();
        player.setState(state2);
        player.makeWork();

    }
}
