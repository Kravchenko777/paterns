package behavior.observer;

public class Client implements IClient{
    @Override
    public void getMessage() {
        System.out.println("Client");
    }
}
