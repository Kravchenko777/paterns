package behavior.observer;

/*
    Паттерн Наблюдатель определяет отношение
    «один ко многим» между объектами таким образом,
    что при изменении состояния одного объекта происходит
    автоматическое оповещение и обновление всех зависимых объектов
 */
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void testObserver(){
        ClientFirst clientFirst = new ClientFirst();
        ClientSecond clientSecond = new ClientSecond();
        ClientThird clientThird = new ClientThird();
        Publisher server = new Publisher();
        server.addSubscriber(clientFirst);
        server.addSubscriber(clientSecond);
        server.addSubscriber(clientThird);

        server.sendNews("First news");
        server.sendNews("Second news");
        server.removeSubscriber(clientSecond);
        server.sendNews("Last news");

        clientThird.setNewspaper(server);
        clientThird.read();
    }
}
