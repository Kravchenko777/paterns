package behavior.chain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testChain(){
        Check1 check1 = new Check1(null);
        Check2 check2 = new Check2(check1);
        Check3 check3 = new Check3(check2);

        check3.doCheck();


    }
}
