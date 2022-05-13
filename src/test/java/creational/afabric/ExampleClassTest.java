package creational.afabric;

import creational.afabric.FabricInter;
import creational.afabric.FabricInter2;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    private Boolean step = false;
    private Fabric fabric;

    @Test
    void afabictest(){
        if(step){
            fabric = new FabricInter();
        }else {
            fabric = new FabricInter2();
        }

        fabric.getInter();
        fabric.getInter2();
    }
}
