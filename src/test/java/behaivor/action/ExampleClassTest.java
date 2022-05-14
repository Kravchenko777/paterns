package behaivor.action;


import behavior.action.Action1;
import behavior.action.Action2;
import behavior.action.Action3;
import behavior.action.Button;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testAction(){
        new Button(new Action1()).onClick();
        new Button(new Action2()).onClick();
        new Button(new Action3()).onClick();


    }
}
