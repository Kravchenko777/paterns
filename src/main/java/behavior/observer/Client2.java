package behavior.observer;

public class Client2 implements IClient{

    @Override
    public void getNews(String news) {
        System.out.println("Client 2: "+news);
    }
}
