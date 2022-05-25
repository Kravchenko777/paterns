package behavior.observer;

public class ClientSecond implements Subscriber {

    @Override
    public void getNews(String news) {
        System.out.println("ClientSecond: "+news);
    }
}
