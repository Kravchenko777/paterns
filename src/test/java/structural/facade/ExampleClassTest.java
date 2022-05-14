package structural.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testVoid(){
        Facade facade = new Facade();
        facade.doIt();

    }

}
