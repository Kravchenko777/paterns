package behavior.observer;


import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void testSnapshot(){
        Client client = new Client();
        Client2 client2 = new Client2();
        Client3 client3 = new Client3();
        Newspaper server = new Newspaper();
        server.addClient(client);
        server.addClient(client2);
        server.addClient(client3);

        server.sendNews("First news");
        server.sendNews("Second news");
        server.sendNews("Last news");

        client3.setNewspaper(server);
        client3.read();
    }
}
