package behavior.action;


import org.junit.jupiter.api.Test;

public class ActionTest {

    @Test
    void testAction(){
        new Button(new Open()).onClick();
        new Button(new Make()).onClick();
        new Button(new Close()).onClick();


    }
}
