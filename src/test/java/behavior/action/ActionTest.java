package behavior.action;


import org.junit.jupiter.api.Test;

public class ActionTest {

    @Test
    void testAction(){
        new RemoteControl(new Open()).onClick();
        new RemoteControl(new Make()).onClick();
        new RemoteControl(new Close()).onClick();


    }
}
