package structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testVoid(){
        Message message = new BaseMessage();
        System.out.println(message.sendMessage());

        message = new PushMessage(message);
        System.out.println(message.sendMessage());

        message = new SMSMessage(message);
        System.out.println(message.sendMessage());

    }

}
