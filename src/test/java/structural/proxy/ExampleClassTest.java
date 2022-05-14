package structural.proxy;

import org.junit.jupiter.api.Test;
import structural.light.Basic;
import structural.light.BasicFactory;
import structural.light.BasicType;

public class ExampleClassTest {

    @Test
    void testProxy(){
       Proxy proxy = new Proxy();
       proxy.set();
       proxy.get();

    }

}
