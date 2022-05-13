package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testSingleton(){
        ExampleClass exampleClass1 = ExampleClass.getInstance();
        ExampleClass exampleClass2 = ExampleClass.getInstance();

        Assertions.assertEquals(exampleClass1,exampleClass2);

    }
}
