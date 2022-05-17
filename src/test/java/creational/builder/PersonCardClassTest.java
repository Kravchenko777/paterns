package creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonCardClassTest {

    @Test
    void testBuilder(){
        PersonCardClassBuilder personCardClassBuilder = new PersonCardClassBuilder();
        PersonCardClass personCardClass = personCardClassBuilder.setAge(24l)
                .setFio("Кравченко М.")
                .setSex(true)
                .build();

        Assertions.assertNotNull(personCardClass);
    }
}
