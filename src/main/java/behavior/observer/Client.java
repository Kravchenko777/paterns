package behavior.observer;

public class Client implements IClient{

    @Override
    public void getNews(String news) {
        System.out.println("Client 1: "+news);
    }
}
