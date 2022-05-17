package creational.singleton;

public class ConnectionToRESTAPI {

    private static String url;
    private static String apiToken;
    private volatile static ConnectionToRESTAPI connection;

    private ConnectionToRESTAPI(){
        initConnectionValue();
    }

    public static ConnectionToRESTAPI getInstance(){
        if(connection == null) {
            synchronized (ConnectionToRESTAPI.class){
                if(connection == null) {
                    connection = new ConnectionToRESTAPI();
                }
            }
        }
        return connection;
    }

    private void initConnectionValue(){
        url = "https://url.net";
        apiToken = "2jkdf8934jdfu83hnf";
    }
}
