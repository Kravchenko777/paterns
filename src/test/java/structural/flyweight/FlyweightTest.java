package structural.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class FlyweightTest {

    @Test
    void testVoid(){
       FlyweightFactory flyweightFactory = new FlyweightFactory();
       Message message = flyweightFactory.getMessage("sms");
       message.sendText("Мой текст", new Date());

    }

}
