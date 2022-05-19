package creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
    Паттерн Прототип используется в тех случаях, когда создание экземпляра класса
    требует больших затрат ресурсов или занимает много времени.
 */
public class PrototypeTest {

    @Test
    void testPrototype(){
        // Инициализируем класс
        PrototypeClass prototype = new PrototypeClass("Кравченко М.",34l,true);
        prototype.setFio("Кравченко М.А.");

        // Клонируем объект и получаем новый экземпляр
        PrototypeClass prototypeClone = (PrototypeClass) prototype.cloneIt(prototype);
        Assertions.assertEquals(prototypeClone.getFio(), prototypeClone.getFio());
        Assertions.assertNotEquals(prototype,prototypeClone);
    }

    // Пример с использованием Фабрики
    @Test
    void testPrototypeFabric(){
        // Инициализируем класс
        PrototypeClass prototype = new PrototypeClass("Кравченко М.",34l,true);
        prototype.setFio("Кравченко М.А.");

        // Создаем класс фабрики
        FabricPrototype fabricPrototype = new FabricPrototype(prototype);

        // Клонируем объект и получаем новый экземпляр
        PrototypeClass prototypeClone = (PrototypeClass) fabricPrototype.clone(prototype);
        Assertions.assertEquals(prototypeClone.getFio(), prototypeClone.getFio());
        Assertions.assertNotEquals(prototype,prototypeClone);
    }
}
