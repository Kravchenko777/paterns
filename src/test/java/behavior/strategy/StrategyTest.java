package behavior.strategy;


import org.junit.jupiter.api.Test;

public class StrategyTest {

    private Boolean is = true;

    @Test
    void testStrategy(){
        RouteMap routeMap;

        if(is) routeMap = new RouteMap(new Strategy1());
        else routeMap = new RouteMap(new Strategy2());

        System.out.println(routeMap.getResult());

    }
}
