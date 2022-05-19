package creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
    Паттерн Builder инкапсулирует создание объекта и позволяет разделить его на этапы
 */
public class BuilderTest {

    @Test
    void testBuilder(){

        // Создание экземпляра класса Builder
        PersonCardClassBuilder personCardClassBuilder = new PersonCardClassBuilder();
        // Формирование объекта
        PersonCardClass personCardClass = personCardClassBuilder.setAge(24l)
                .setFio("Кравченко М.")
                .setSex(true)
                .build();

        Assertions.assertNotNull(personCardClass);
    }
}
