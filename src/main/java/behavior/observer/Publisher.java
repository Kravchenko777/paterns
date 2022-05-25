package behavior.observer;

//Интерфейс издателя
import java.util.ArrayList;
import java.util.List;

public class Publisher {

    List<Subscriber> subscribers = new ArrayList<>();
    List<String> newsList = new ArrayList<>();

    //метод подписки
    public void addSubscriber(Subscriber iClient){
        subscribers.add(iClient);
    }

    //метод отказа от подписки
    public void removeSubscriber(Subscriber iClient) {
        subscribers.remove(iClient);
    }

    //Передача сообщения подписчикам
    public void sendNews(String news){
        newsList.add(news);
        for(Subscriber subscriber: subscribers){
            subscriber.getNews(news);
        }
    }

    public String getLast(){
        return newsList.get(newsList.size()-1);
    }
}
