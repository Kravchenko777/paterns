package creational.afabric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AFabricTest {

    @Test
    void afabictest(){
        SMSTeamFactory smsTeamFactory = new SMSTeamFactory();
        IDeveloper developer = smsTeamFactory.getDeveloper();
        IManager manager = smsTeamFactory.getManager();
        ITester tester = smsTeamFactory.getTester();

        Assertions.assertEquals(true,developer.write());
        Assertions.assertEquals(true,manager.manage());
        Assertions.assertEquals(true,tester.test());
    }
}
