package structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    void testProxy(){
        TeamLeader teamLeader = new TeamLeader();
        Assertions.assertTrue(teamLeader.write());

    }

}
