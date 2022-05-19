package creational.mfabric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MFabricTest {

    /*
        Паттерн Фабричный Метод определяет интерфейс создания
        объекта, но позволяет субклассам выбрать класс создаваемого экземпляра. Таким образом, Фабричный Метод делегирует
        операцию создания экземпляра субклассам.
     */
    @Test
    void testMFabric(){

        // Получение экземпляра фабрики
        ProductFabric productFabric = createProductFabric("wood");
        IProduct product = productFabric.createProduct();
        Assertions.assertEquals(200,product.getCost());
    }

    // Метод для получения экземпляра фабрики по типу
    private ProductFabric createProductFabric(String type){
        if(type.equals("wood")) return new WoodProductFabric();
        if(type.equals("metal")) return new MetalProductFabric();
        else {
            throw new RuntimeException("Не знаю что ты от меня хочешь");
        }
    }
}
