package structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.light.Basic;
import structural.light.BasicFactory;
import structural.light.BasicType;

public class ProxyTest {

    @Test
    void testProxy(){
        TeamLeader teamLeader = new TeamLeader();
        Assertions.assertTrue(teamLeader.write());

    }

}
