package behavior.sample;


import org.junit.jupiter.api.Test;

public class TemplateMethodTest {



    @Test
    void testSample(){
        new Sample2().makeWork();
        new Sample1().makeWork();

    }
}
