package creational.singleton;

/*
    Целевой класс
 */
public class ConnectionToRESTAPI {

    private static String url;
    private static String apiToken;

    // Хранение ссылки this
    // volatile гарантирует что при многопоточности, потоки будут верно работать с экземпляром
    private volatile static ConnectionToRESTAPI connection;

    // Объект может быть создан заранее
    //private volatile static ConnectionToRESTAPI connection = new ConnectionToRESTAPI();

    // Приватный конструктор
    private ConnectionToRESTAPI(){
        initConnectionValue();
    }

    // Метод получения экземпляра
    public static ConnectionToRESTAPI getInstance(){
        if(connection == null) {
            // Синхронизация для решения задачи в рамках многопоточности
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
