package behavior.snapshot;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testSnapshot(){
        Redactor redactor = new Redactor();
        redactor.setAttrStr("1");
        Snapshot snapshot = redactor.makeSnapshot();
        redactor.setAttrStr("2");
        snapshot.restore();
        redactor.makeSnapshot();

        Assertions.assertEquals("1", redactor.getAttrStr());

    }
}
