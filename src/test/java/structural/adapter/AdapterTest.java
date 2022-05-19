package structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
    Паттерн Адаптер преобразует интерфейс класса к другому интерфейсу,
    на который рассчитан клиент. Адаптер обеспечивает
    совместную работу классов, невозможную в обычных условиях
    из-за несовместимости интерфейсов.
 */
public class AdapterTest {

    @Test
    void adapterTest(){
       Assertions.assertEquals("100", new Adapter().getMessage(new IntegerMessage()));
    }
}
