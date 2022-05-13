package structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void adapterTest(){
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Adapter adapter = new Adapter();

        Assertions.assertDoesNotThrow(()-> adapter.doIt(class1,class2));
    }
}
