package structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
    Паттерн Заместитель предоставляет суррогатный объект, управляющий доступом к другому
    объекту
 */
public class ProxyTest {

    @Test
    void testProxy(){
        // Получение экземпляра Заместителя
        TeamLeader teamLeader = new TeamLeader();
        Assertions.assertTrue(teamLeader.write());

    }

}
