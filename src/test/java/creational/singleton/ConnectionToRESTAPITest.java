package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConnectionToRESTAPITest {

    @Test
    void testSingleton(){
        ConnectionToRESTAPI connectionFirst = ConnectionToRESTAPI.getInstance();
        ConnectionToRESTAPI connectionSecond = ConnectionToRESTAPI.getInstance();

        Assertions.assertEquals(connectionFirst,connectionSecond);

        Assertions.assertEquals("2jkdf8934jdfu83hnf",ConnectionToRESTAPIEnum.apiToken.getValue());
    }
}