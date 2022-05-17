package structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    void adapterTest(){
       Assertions.assertEquals("100", new Adapter().getMessage());
    }
}
