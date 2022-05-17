package structural.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    void testVoid(){
        Assertions.assertTrue(new Facade().makeProgram());
    }

}
