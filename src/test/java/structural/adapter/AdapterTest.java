package structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
    Паттерн Адаптер Упаковывает группу объектов для упрощения их интерфейс
 */
public class AdapterTest {

    @Test
    void adapterTest(){
       Assertions.assertEquals("100", new Adapter().getMessage(new IntegerMessage()));
    }
}
