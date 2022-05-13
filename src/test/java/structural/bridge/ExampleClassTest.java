package structural.bridge;

import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void test(){
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Form form = new Form(class1);
        form.doIt();
    }
}
