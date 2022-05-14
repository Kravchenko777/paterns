package behavior.mediator;

import behavior.iterator.BasicCollection;
import behavior.iterator.Iterator1;
import behavior.iterator.Iterator2;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testMediator(){
       IMediator mediator = new Mediator();
       Element element = new Element();
       element.doIt(mediator,"some");

    }
}
