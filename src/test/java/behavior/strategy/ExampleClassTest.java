package behavior.strategy;


import behavior.state.Player;
import behavior.state.State1;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    private Boolean is = true;

    @Test
    void testStrategy(){
        RouteMap routeMap;

        if(is) routeMap = new RouteMap(new Strategy1());
        else routeMap = new RouteMap(new Strategy2());

        System.out.println(routeMap.getResult());

    }
}
