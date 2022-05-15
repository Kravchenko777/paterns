package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Server {

    List<IClient> iClients = new ArrayList<>();

    public void addClient(IClient iClient){
        iClients.add(iClient);
    }

    public void sendMessage(){
        for(IClient iClient:iClients){
            iClient.getMessage();
        }
    }
}
