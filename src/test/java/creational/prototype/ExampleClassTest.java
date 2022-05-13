package creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testPrototype(){
        ExampleClass prototype = new ExampleClass("str",true);
        ExampleClass exampleClass = new ExampleClass();
        exampleClass = prototype.cloneIt(exampleClass);
        Assertions.assertEquals(exampleClass.getStr(),prototype.getStr());
        //Assertions.assertEquals(exampleClass,prototype);
    }
}
