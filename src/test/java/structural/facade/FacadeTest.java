package structural.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
    Паттерн Фасад предоставляет унифицированный интерфейс
    к группе интерфейсов подсистемы. Фасад определяет
    высокоуровневый интерфейс, упрощающий работу с подсистемой.
 */
public class FacadeTest {

    @Test
    void testVoid(){
        Assertions.assertTrue(new Facade().makeProgram());
    }

}
