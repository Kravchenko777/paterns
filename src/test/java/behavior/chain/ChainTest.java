package behavior.chain;

import org.junit.jupiter.api.Test;

public class ChainTest {

    @Test
    void testChain(){
        String param = "Result";
        CheckFirst check1 = new CheckFirst(null);
        CheckSecond check2 = new CheckSecond(check1);
        CheckLast check3 = new CheckLast(check2);

        check3.doCheck(param);


    }
}
