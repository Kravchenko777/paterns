package behavior.observer;

public class ClientFirst implements Subscriber {

    @Override
    public void getNews(String news) {
        System.out.println("ClientFirst: "+news);
    }
}
