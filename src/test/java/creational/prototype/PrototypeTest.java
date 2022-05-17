package creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    void testPrototype(){
        PrototypeClass prototype = new PrototypeClass("Кравченко М.",34l,true);
        prototype.setFio("Кравченко М.А.");

        PrototypeClass prototypeClone = (PrototypeClass) prototype.cloneIt(prototype);
        Assertions.assertEquals(prototypeClone.getFio(), prototypeClone.getFio());
        Assertions.assertNotEquals(prototype,prototypeClone);
    }

    @Test
    void testPrototypeFabric(){
        PrototypeClass prototype = new PrototypeClass("Кравченко М.",34l,true);
        prototype.setFio("Кравченко М.А.");
        FabricPrototype fabricPrototype = new FabricPrototype(prototype);

        PrototypeClass prototypeClone = (PrototypeClass) fabricPrototype.clone(prototype);
        Assertions.assertEquals(prototypeClone.getFio(), prototypeClone.getFio());
        Assertions.assertNotEquals(prototype,prototypeClone);
    }
}
