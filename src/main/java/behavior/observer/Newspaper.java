package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Newspaper {

    List<IClient> iClients = new ArrayList<>();
    List<String> newsList = new ArrayList<>();

    public void addClient(IClient iClient){
        iClients.add(iClient);
    }
    public void removeClient(IClient iClient) {
        iClients.remove(iClient);
    }

    public void sendNews(String news){
        newsList.add(news);
        for(IClient iClient:iClients){
            iClient.getNews(news);
        }
    }

    public String getLast(){
        return newsList.get(newsList.size()-1);
    }
}
