package creational.mfabric;

import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    private Fabric fabric;
    private Boolean step = false;

    @Test
    void test(){
        if(step){
            fabric = new FabricClass1();
        }else {
            fabric = new FabricClass2();
        }

        fabric.makeSomeWork();
    }
}
