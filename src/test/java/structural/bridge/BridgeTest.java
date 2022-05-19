package structural.bridge;

import org.junit.jupiter.api.Test;
/*
    Используйте паттерн Мост, если изменяться может не только реализация, но и абстракции.
 */
public class BridgeTest {

    @Test
    void test(){

        Key[] keys = {
                new SuperKey(new BMW()),
                new SimpleKey(new VAZ())
        };

        for(Key key:keys){
            key.enableSignalCar();
        }

    }
}
