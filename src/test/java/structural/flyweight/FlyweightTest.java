package structural.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Date;

/*
    Используйте паттерн Приспособленец, если один экземпляр класса
    может предоставлять много «виртуальных экземпляров».
 */

public class FlyweightTest {

    @Test
    void testVoid(){
        // Создаем экземпляр фабрики
       FlyweightFactory flyweightFactory = new FlyweightFactory();

       // Получаем объект
       Message message = flyweightFactory.getMessage("sms");
       message.sendText("Мой текст", new Date());

    }

}
