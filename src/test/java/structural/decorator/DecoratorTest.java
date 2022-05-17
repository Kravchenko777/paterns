package structural.decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    void testVoid(){

        IObject message = new DuckMessage(null);
        System.out.println(message.getName());

        message = new EggMessage(message);
        System.out.println(message.getName());

        message = new Needle(message);
        System.out.println(message.getName());

    }

}
