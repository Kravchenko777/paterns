package creational.afabric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
    Паттерн Абстрактная Фабрика предоставляет интерфейс
    создания семейств взаимосвязанных или взаимозависимых
    объектов без указания их конкретных классов
 */
public class AFabricTest {

    @Test
    void afabictest(){
        // Получение экземпляра класса фабрики
        SMSTeamFactory smsTeamFactory = new SMSTeamFactory();
        // Получение экземпляров классов объектов
        IDeveloper developer = smsTeamFactory.getDeveloper();
        IManager manager = smsTeamFactory.getManager();
        ITester tester = smsTeamFactory.getTester();

        Assertions.assertEquals(true,developer.write());
        Assertions.assertEquals(true,manager.manage());
        Assertions.assertEquals(true,tester.test());
    }
}
