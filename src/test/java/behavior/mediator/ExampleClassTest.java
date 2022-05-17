package behavior.mediator;

import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testMediator(){
       IMediator mediator = new Mediator();
       Element element = new Element();
       element.doIt(mediator,"some");

    }
}
