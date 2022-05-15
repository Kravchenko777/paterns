package behavior.observer;


import behavior.snapshot.Redactor;
import behavior.snapshot.Snapshot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testSnapshot(){
        Client client = new Client();
        Client2 client2 = new Client2();
        Client3 client3 = new Client3();
        Server server = new Server();
        server.addClient(client);
        server.addClient(client2);
        server.addClient(client3);

        server.sendMessage();

    }
}
