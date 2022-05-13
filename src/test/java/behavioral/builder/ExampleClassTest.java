package behavioral.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testBuilder(){
        ExampleClassBuilder exampleClassBuilder = new ExampleClassBuilder();
        ExampleClass exampleClass = exampleClassBuilder.setAttrBoolean(false)
                .setAttrString("String")
                .setAttrLong(100l)
                .build();

        Assertions.assertNotNull(exampleClass);
    }
}
