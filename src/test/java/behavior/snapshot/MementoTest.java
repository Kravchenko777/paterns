package behavior.snapshot;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    void test(){
        Redactor redactor = new Redactor();
        redactor.setAttrStr("value");
        redactor.makeSnapshot();
        redactor.setAttrStr("new");
        Assertions.assertNotEquals("value", redactor.getAttrStr());
        redactor.restore();
        Assertions.assertEquals("value", redactor.getAttrStr());

    }
}
