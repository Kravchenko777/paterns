package structural.light;

import org.junit.jupiter.api.Test;
import structural.facade.Facade;

public class ExampleClassTest {

    @Test
    void testVoid(){
        BasicFactory basicFactory = new BasicFactory();
        BasicType basicType = basicFactory.getBasicType();
        Basic basic = new Basic(true,true,basicType);

        basic.doIt();

    }

}
