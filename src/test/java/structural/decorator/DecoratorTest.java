package structural.decorator;

import org.junit.jupiter.api.Test;
/*
    Паттерн Декоратор динамически наделяет объект новыми
    возможностями и является гибкой альтернативой
    субклассированию в области расширения функциональности.
 */
public class DecoratorTest {

    @Test
    void testVoid(){

        IObject message = new DuckMessage(null);
        System.out.println(message.getName());

        message = new EggMessage(message);
        System.out.println(message.getName());

        message = new Needle(message);
        System.out.println(message.getName());

        message.getSumm();

    }

}
