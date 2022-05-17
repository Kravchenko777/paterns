package creational.mfabric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MFabricTest {


    @Test
    void testMFabric(){
        ProductFabric productFabric = createProductFabric("wood");
        IProduct product = productFabric.createProduct();
        Assertions.assertEquals(200,product.getCost());
    }

    private ProductFabric createProductFabric(String type){
        if(type.equals("wood")) return new WoodProductFabric();
        if(type.equals("metal")) return new MetalProductFabric();
        else {
            throw new RuntimeException("Не знаю что ты от меня хочешь");
        }
    }
}
