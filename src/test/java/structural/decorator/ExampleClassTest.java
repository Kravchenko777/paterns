package structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testVoid(){
        Message message = new BaseMessage();
        Assertions.assertNull(message.sendMessage());

        message = new PushMessage(message);
        Assertions.assertTrue(message.sendMessage());

        message = new SMSMessage(message);
        Assertions.assertFalse(message.sendMessage());

    }

}
