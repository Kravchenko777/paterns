package behavior.mediator;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    void testMediator(){
       IMediator mediator = new Mediator();
       TextField textField = new TextField(mediator);

       mediator.notifyMe(textField,"click", null);

    }
}
