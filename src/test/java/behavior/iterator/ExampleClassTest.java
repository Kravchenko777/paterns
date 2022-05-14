package behavior.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testSingleton(){
        BasicCollection basicCollection = new BasicCollection();
        Iterator1 iterator1 = new Iterator1();
        iterator1.goTo(basicCollection);

        Iterator2 iterator2 = new Iterator2();
        iterator2.goTo(basicCollection);

    }
}
